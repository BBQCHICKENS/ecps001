package com.lbj.ecps.service;

import com.lbj.ecps.model.Student;

/**
 * Created by gqq on 2018/1/13.
 */
public interface StudentService {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
