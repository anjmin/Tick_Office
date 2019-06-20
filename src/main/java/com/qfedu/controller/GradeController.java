package com.qfedu.controller;

import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

    //分页查询班级学科
    @RequestMapping("/gradepage.do")
    @ResponseBody
    public Map<String, Object> findGradeByPage(Integer page, Integer limit){
        Map<String, Object> map = gradeService.findGradeByPage(page, limit);
        System.out.println("展示学员信息"+map);
        return map;
    }

    //删除班级
    @RequestMapping("/gradedelete.do")
    @ResponseBody
    public JsonBean gradeDeleteById(Integer id){
        System.out.println("删除班级序号:"+id);
        gradeService.gradeDeleteById(id);
        return new JsonBean(1,null);
    }

    //新增班级
    @RequestMapping("/gradeadd.do")
    public String gradeAdd(Grade grade){
        System.out.println("新增班级信息："+grade);
        gradeService.gradeAdd(grade);
        return "redirect:/gradelist.html";

    }

    //修改班级
    @RequestMapping("/gradeupdate.do")
    public String gradeUpdate(Grade grade){
        System.out.println("修改班级信息："+grade);
        gradeService.gradeUpdate(grade);
        return "redirect:/gradelist.html";
    }

}
