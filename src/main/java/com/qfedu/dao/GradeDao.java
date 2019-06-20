package com.qfedu.dao;

import com.qfedu.pojo.Grade;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
public interface GradeDao {

    //查询所有班级分页
    List<Grade> findAll();
    //删除班级
    void gradeDeleteById(Integer id);
    //新增班级
    void gradeAdd(Grade grade);
    //修改班级
    void gradeUpdate(Grade grade);
}
