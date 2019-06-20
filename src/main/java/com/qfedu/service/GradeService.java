package com.qfedu.service;

import com.qfedu.pojo.Grade;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
public interface GradeService {

    List<Grade> gradeAll();

    Map<String,Object> findGradeByPage(Integer page, Integer limit);

    void gradeDeleteById(Integer id);

    void gradeAdd(Grade grade);

    void gradeUpdate(Grade grade);
}
