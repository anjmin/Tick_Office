package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.ProcesDao;
import com.qfedu.pojo.Process;
import com.qfedu.service.ProcessSercive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProcessSerciveImpl implements ProcessSercive {
    @Autowired
    private ProcesDao procesDao;


    @Override
    public List<Process> selectAllInfo() {
        //调用该方法进行分页查询
        //第一个参数：页码；第二个参数：每页显示的记录数
        //startPage语句后，一定要紧跟着查询的相关方法
        PageHelper.startPage(1,5);
        List<Process> list = procesDao.selectAllInfo();
        //获取总记录数 强转
        long total = ((Page) list).getTotal();

        return list;
    }

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Process> list = procesDao.selectAllInfo();
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
