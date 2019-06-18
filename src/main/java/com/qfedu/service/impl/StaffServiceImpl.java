package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;


    @Override
    //批量插入
    public void addEmps(List<Staff> list) {
        staffDao.addBatch(list);
    }

    @Override
    //查询所有
    public List<Staff> findAll() {
        //调用该方法进行分页查询
        //第一个参数：页码；第二个参数：每页显示的记录数
        //startPage语句后，一定要紧跟着查询的相关方法
        PageHelper.startPage(1,5);
        List<Staff> staff = staffDao.findAll();
        //获取总记录数 强转
        long total = ((Page) staff).getTotal();

        return staff;
    }
}
