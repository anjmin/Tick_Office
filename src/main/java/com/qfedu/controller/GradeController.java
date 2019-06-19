package com.qfedu.controller;

import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19 0019.
 */

@Controller
public class GradeController {

    @Autowired(required = false)
    private GradeService gradeService;

    //查找所有的班级
    @RequestMapping("/gradeall.do")
    @ResponseBody
    public List<Grade> gradeall() {
        List<Grade> list = gradeService.gradeAll();
        System.out.println("查出来的班级："+list);
        return list;
    }
}
