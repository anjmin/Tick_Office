package com.qfedu.service;

import com.qfedu.pojo.Staff;

import java.util.List;
import java.util.Map;

public interface StaffService {
    //批量添加
    public void  addEmps(List<Staff> list);

    //查询所有员工
    public List<Staff> findAll();
    //分页
    public Map<String,Object> findByPage(Integer page,Integer limit);
    // 删除员工信息
    public void delStaffById(String no);

}
