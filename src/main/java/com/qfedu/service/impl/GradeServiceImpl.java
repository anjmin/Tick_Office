package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao;
import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Grade> list=gradeDao.findAll();
        return list;
    }

    //查询所有班级分页
    @Override
    public Map<String, Object> findGradeByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Grade> list = gradeDao.findAll();
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
}
