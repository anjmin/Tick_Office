package com.qfedu.controller;

import com.qfedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
@Controller
public class StudentController {

    @Autowired(required = false)
    private StudentService studentService;

    //分页展示学生信息
    @RequestMapping("/studentpage.do")
    @ResponseBody
    public Map<String, Object> findstudentByPage(Integer page, Integer limit){
        Map<String, Object> map = studentService.findstudentByPage(page, limit);
        System.out.println("展示学员信息"+map);
        return map;
    }
}
