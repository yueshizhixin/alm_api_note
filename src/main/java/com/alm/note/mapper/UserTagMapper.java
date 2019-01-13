package com.alm.note.mapper;

import com.alm.note.po.UserTag;
import com.alm.note.po.UserTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTagMapper {
    long countByExample(UserTagExample example);

    int deleteByExample(UserTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTag record);

    int insertSelective(UserTag record);

    List<UserTag> selectByExample(UserTagExample example);

    UserTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTag record, @Param("example") UserTagExample example);

    int updateByExample(@Param("record") UserTag record, @Param("example") UserTagExample example);

    int updateByPrimaryKeySelective(UserTag record);

    int updateByPrimaryKey(UserTag record);
}