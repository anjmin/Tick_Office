package com.qfedu.service.impl;

import com.qfedu.dao.GradeDao;
import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired(required = false)
    private GradeDao gradeDao;

    //查询所有班级
    @Override
    public List<Grade> gradeAll() {
        List<Grade> list=gradeDao.gradeAll();
        return list;
    }
}
