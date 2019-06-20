package com.qfedu.controller;

import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
public class CourseController {

    @Autowired(required = false)
    private CourseService courseService;


    //分页展示学科信息
    @RequestMapping("/coursepage.do")
    @ResponseBody
    public Map<String, Object> findCourseByPage(Integer page, Integer limit){
        Map<String, Object> map = courseService.findCourseByPage(page, limit);
        System.out.println("展示学员信息"+map);
        return map;
    }


    //删除学科
    @RequestMapping("/coursedelete.do")
    @ResponseBody
    public JsonBean courseDeleteById(Integer id){
        System.out.println("删除学生的学号:"+id);
        courseService.courseDeleteById(id);
        return new JsonBean(1,null);
    }

    //新增学科
    @RequestMapping("/courseadd.do")
    public String courseAdd(Course course){
        System.out.println("新增学科信息："+course);
        courseService.courseAdd(course);
        return "redirect:/courselist.html";

    }

    //修改学科
    @RequestMapping("/courseupdate.do")
    public String courseUpdate(Course course){
        System.out.println("修改学员信息："+course);
        courseService.courseUpdate(course);
        return "redirect:/courselist.html";
    }


    //查询所有学科

    @RequestMapping("/courseall.do")
    @ResponseBody
    public List<Course> gradeall() {
        List<Course> list = courseService.gradeAll();
        System.out.println("查出来的班级："+list);
        return list;
    }

}
