package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CourseDao;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/20 0020.
 */

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired(required = false)
    private CourseDao courseDao;

    //分页展示学科
    @Override
    public Map<String, Object> findCourseByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Course> list = courseDao.findCourseAll();
        System.out.println(list);
        //获取总记录数
        long total = ((Page) list).getTotal();
        // 获取总页数
        int pages = ((Page) list).getPages();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    //根据ID删除学科
    @Override
    public void courseDeleteById(Integer id) {
        courseDao.courseDeleteById(id);
    }

    //新增学科
    @Override
    public void courseAdd(Course course) {
        courseDao.courseAdd(course);
    }
    //修改学科
    @Override
    public void courseUpdate(Course course) {
        courseDao.courseUpdate(course);

    }
    //查询所有学科
    @Override
    public List<Course> gradeAll() {
        List<Course> list = courseDao.findCourseAll();
        return list;
    }
}
