package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StudentDao;
import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired(required = false)
    private StudentDao studentDao;

    //分页展示学生信息
    @Override
    public Map<String, Object> findstudentByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Student> list = studentDao.findAll();
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


    //批量导入
    @Override
    public void addStus(List<Student> studentsList) {
        studentDao.addStus(studentsList);
    }

    //删除学生信息
    @Override
    public void deleteStuByNo(String no) {
        studentDao.deleteStuByNo(no);
    }

    //新增学员信息
    @Override
    public void studentAdd(Student student) {
        studentDao.studentAdd(student);
    }
}
