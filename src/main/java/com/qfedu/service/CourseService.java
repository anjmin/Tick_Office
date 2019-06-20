package com.qfedu.service;

import com.qfedu.pojo.Course;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public interface CourseService {

    Map<String,Object> findCourseByPage(Integer page, Integer limit);

    void courseDeleteById(Integer id);

    void courseAdd(Course course);

    void courseUpdate(Course course);
}
