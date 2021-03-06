package com.alm.note.mapper;

import com.alm.note.po.Note;
import com.alm.note.po.NoteExample;
import java.util.List;

import com.alm.note.vo.NoteSimple;
import org.apache.ibatis.annotations.Param;

public interface NoteMapper {

    List<NoteSimple> selectNoteSimpleByExample(NoteExample example);

    long countByExample(NoteExample example);

    int deleteByExample(NoteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Note record);

    int insertSelective(Note record);

    List<Note> selectByExample(NoteExample example);

    Note selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByExample(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);
}