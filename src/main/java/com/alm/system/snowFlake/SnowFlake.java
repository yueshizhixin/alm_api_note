package com.alm.system.snowFlake;

import com.alm.util.PropSnowFlakeUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-28 21:04</p>
 * <p>desc: SnowFlake工具类</p>
 * Twitter_Snowflake<br>
 * SnowFlake结构如下(每部分用-分开)<br>
 * 0 - 0000000000 0000000000 0000000000 0000000000 0 - 00000 - 00000 - 000000000000 <br>
 * 1位标识 最高位是符号位<br>
 * 41位时间戳(毫秒级) 注意 41位时间戳是差值（当前时间戳 - 开始使用时间戳)<br>
 * 41位的时间戳 可以使用69年 (1L << 41) / (1000L * 60 * 60 * 24 * 365) = 69<br>
 * 10位的数据机器位，可以部署在1024个节点，包括5位dataCenterId和5位workerId<br>
 * 12位序列 毫秒内的计数 12位的计数顺序号支持每个节点每毫秒(同一机器 同一时间戳)产生4096个ID<br>
 * 加起来刚好64位 为Long型<br>
 * SnowFlake的优点 整体上按照时间自增排序 并且整个分布式系统内不会产生ID碰撞(由数据中心ID和机器ID作区分)
 */
public class SnowFlake {
    /**
     * 开始时间戳 (2018-12-29) 1546088700092
     */
    private final long startTimeStamp = 1546088700092L;

    /**
     * 机器id所占的位数
     */
    private final long workerIdLength = 5L;

    /**
     * 数据标识id所占的位数
     */
    private final long datacenterIdLength = 5L;

    /**
     * 支持的最大机器id 31
     */
    private final long maxWorkerId = ~(-1L << workerIdLength);

    /**
     * 支持的最大数据标识id 31
     */
    private final long maxDatacenterId = ~(-1L << datacenterIdLength);

    /**
     * 序列在id中占的位数
     */
    private final long sequenceBits = 12L;

    /**
     * 机器ID向左移12位
     */
    private final long workerIdShift = sequenceBits;

    /**
     * 数据标识id向左移17位(12+5)
     */
    private final long datacenterIdShift = sequenceBits + workerIdLength;

    /**
     * 时间戳向左移22位(5+5+12)
     */
    private final long timestampLeftShift = sequenceBits + workerIdLength + datacenterIdLength;

    /**
     * 生成序列的掩码，这里为4095 (0b111111111111=0xfff=4095)
     */
    private final long sequenceMask = ~(-1L << sequenceBits);

    /**
     * 工作机器ID(0~31)
     */
    private long workerId;

    /**
     * 数据中心ID(0~31)
     */
    private long datacenterId;

    /**
     * 毫秒内序列(0~4095)
     */
    private long sequence = 0L;

    /**
     * 上次生成ID的时间戳
     */
    private long lastTimestamp = -1L;

    private SnowFlake() {

        Integer _centerId = PropSnowFlakeUtil.getCenterId();
        Integer _workerId = PropSnowFlakeUtil.getWorkerId();

        if (_centerId == null || _centerId > maxDatacenterId || _centerId < 0
                || _workerId == null || _workerId > maxWorkerId || _workerId < 0
        ) {
            Logger logger = LogManager.getLogger(SnowFlake.class);
            logger.error("===严重错误=========");
            logger.error("===snowFlake配置错误");
            logger.error("===================");
            System.exit(-1);
        }

        this.workerId = _workerId;
        this.datacenterId = _centerId;
    }

    private static SnowFlake snowFlake=new SnowFlake();

    public static SnowFlake instance(){
        return snowFlake;
    }

    /**
     * 获得下一个ID (该方法是线程安全的)
     *
     * @return SnowflakeId
     */
    public synchronized long newId() {
        long timestamp = timeGen();

        //如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(
                    String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }

        //如果是同一时间生成的，则进行毫秒内序列
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            //毫秒内序列溢出
            if (sequence == 0) {
                //阻塞到下一个毫秒,获得新的时间戳
                timestamp = tilNextMillis(lastTimestamp);
            }
        }
        //时间戳改变，毫秒内序列重置
        else {
            sequence = 0L;
        }

        //上次生成ID的时间戳
        lastTimestamp = timestamp;

        return ((timestamp - startTimeStamp) << timestampLeftShift) | (datacenterId << datacenterIdShift) | (workerId << workerIdShift) | sequence;
    }

    /**
     * 阻塞到下一个毫秒，直到获得新的时间戳
     *
     * @param lastTimestamp 上次生成ID的时间戳
     * @return 当前时间戳
     */
    private long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    /**
     * 返回以毫秒为单位的当前时间
     *
     * @return 当前时间(毫秒)
     */
    private long timeGen() {
        return System.currentTimeMillis();
    }

}
