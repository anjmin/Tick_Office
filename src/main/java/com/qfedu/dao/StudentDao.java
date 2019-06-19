package com.qfedu.dao;

import com.qfedu.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface StudentDao {

    //分页展示学生信息
    List<Student> findAll();
}
