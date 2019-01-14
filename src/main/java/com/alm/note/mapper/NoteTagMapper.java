package com.alm.note.mapper;

import com.alm.note.po.NoteTag;
import com.alm.note.po.NoteTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoteTagMapper {
    long countByExample(NoteTagExample example);

    int deleteByExample(NoteTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoteTag record);

    int insertSelective(NoteTag record);

    List<NoteTag> selectByExample(NoteTagExample example);

    NoteTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoteTag record, @Param("example") NoteTagExample example);

    int updateByExample(@Param("record") NoteTag record, @Param("example") NoteTagExample example);

    int updateByPrimaryKeySelective(NoteTag record);

    int updateByPrimaryKey(NoteTag record);
}