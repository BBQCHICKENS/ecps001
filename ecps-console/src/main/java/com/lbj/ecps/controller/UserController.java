package com.lbj.ecps.controller;

import com.lbj.ecps.model.Student;
import com.lbj.ecps.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gqq on 2018/1/13.
 */
@Controller
@RequestMapping(value = "/student")
public class UserController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "getStudent.do",method = RequestMethod.GET)
    public void getStudent(Integer id){
        Student student = this.studentService.selectByPrimaryKey(id);
        System.out.println(student);
    }


}
