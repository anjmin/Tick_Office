package com.qfedu.service;

import com.qfedu.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface StudentService {

    Map<String,Object> findstudentByPage(Integer page, Integer limit);

    //新增学生信息
    void addStus(List<Student> studentsList);

    //删除学生信息
    void deleteStuByNo(String no);

    //新增学员信息
    void studentAdd(Student student);
}
