package com.qfedu.dao;

import com.qfedu.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface StudentDao {

    //分页展示学生信息
    List<Student> findAll();
    //导入学生信息
    void addStus(List<Student> studentsList);
    //删除学生信息
    void deleteStuByNo(String no);
    //新增学员信息
    void studentAdd(Student student);
}
