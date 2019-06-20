package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired(required = false)
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

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Staff> list = staffDao.findAll();
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
//    删除员工信息
    @Override
    public void delStaffById(String no) {
        staffDao.delStaff(no);
    }
    //添加员工
    @Override
    public void addStaff(Staff sta) {
        sta.setCreatedate(new Date());
        if (sta.getFlag()==null){
            //1 有效 2 无效
            sta.setFlag(1);
        }
        staffDao.addStaff(sta);


    }
    //更新员工
    @Override
    public void updateStaff(Staff staInfo) {
        staInfo.setCreatedate(new Date());
        staffDao.updateStaff(staInfo);

    }




}
