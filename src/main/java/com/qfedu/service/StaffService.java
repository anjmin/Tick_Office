package com.qfedu.service;

import com.qfedu.pojo.Staff;

import java.util.List;

public interface StaffService {
    //批量添加
    public void  addEmps(List<Staff> list);

    //查询所有员工
    public List<Staff> findAll();
}
