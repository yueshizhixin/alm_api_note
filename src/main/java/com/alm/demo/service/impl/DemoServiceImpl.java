package com.alm.demo.service.impl;

import com.alm.demo.service.DemoService;
import com.alm.note.mapper.NoteMapper;
import com.alm.note.po.Note;
import com.alm.note.po.NoteExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-23 20:14</p>
 * <p>desc: </p>
 */
@Service
public class DemoServiceImpl  implements DemoService {

    private final NoteMapper noteMapper;

    private NoteExample example;
    private NoteExample.Criteria criteria;

    @Autowired
    public DemoServiceImpl(NoteMapper noteMapper) {
        this.noteMapper = noteMapper;
    }

    @Override
    public List<Note> selectAll() {

        example=new NoteExample();
        criteria=example.createCriteria();
        criteria.andIdGreaterThan(3);
        PageHelper.startPage(0, 5);
        List<Note> list=noteMapper.selectByExample(example);
//        PageInfo page = new PageInfo(list);
//        System.out.println("page.getEndRow() = " + page.getEndRow());
//        System.out.println("page.getNavigateFirstPage() = " + page.getNavigateFirstPage());
//        System.out.println("page.getPageNum() = " + page.getPageNum());
//
//        System.out.println("page.getSize() = " + page.getSize());
//        System.out.println("page.getTotal() = " + page.getTotal());
        example=new NoteExample();
        PageHelper.startPage(1, 5);
        noteMapper.selectByExample(example);
        /**
         * pageHelper不能写到外边
         */
//        List<Country> list;
//        if(param1 != null){
//            PageHelper.startPage(1, 10);
//            list = countryMapper.selectIf(param1);
//        } else {
//            list = new ArrayList<Country>();
//        }

        return null;
    }
}
