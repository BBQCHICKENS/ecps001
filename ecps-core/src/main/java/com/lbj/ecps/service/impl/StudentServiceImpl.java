package com.lbj.ecps.service.impl;

import com.lbj.ecps.dao.StudentMapper;
import com.lbj.ecps.model.Student;
import com.lbj.ecps.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by gqq on 2018/1/13.
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private  StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return 0;
    }
}
