package com.qfedu.dao;

import com.qfedu.pojo.Course;

import java.util.List;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public interface CourseDao {
    //分页查询所有
    List<Course> findCourseAll();

    //根据id删除
    void courseDeleteById(Integer id);

    //新增学科
    void courseAdd(Course course);
    //修改学科
    void courseUpdate(Course course);
}
