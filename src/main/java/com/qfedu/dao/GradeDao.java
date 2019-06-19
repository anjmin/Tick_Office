package com.qfedu.dao;

import com.qfedu.pojo.Grade;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
public interface GradeDao {
    //查询所有班级
    List<Grade> gradeAll();
}
