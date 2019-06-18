package com.qfedu.dao;

import com.qfedu.pojo.Staff;

import java.util.List;

public interface StaffDao {
    //批量插入
    public  void addBatch(List<Staff> list);
    //查询所有员工
    public List<Staff> findAll();
}
