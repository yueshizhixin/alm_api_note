package com.alm.system.enume;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-09 20:49</p>
 * <p>desc: 验证码枚举</p>
 */
public class CaptchaEnum {
    public enum type {
        IMG(1, "CAPTCHA/IMG"),
        TEL(2, "CAPTCHA/TEL"),
        EMAIL(3, "CAPTCHA/EMAIL"),
        ;

        private int id;
        private String value;

        type(int id, String value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }
    }

}
