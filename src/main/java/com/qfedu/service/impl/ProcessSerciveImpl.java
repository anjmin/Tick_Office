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
    @Autowired(required = false)
    private ProcesDao procesDao;


    @Override
    public List<Process> selectAllInfo(String startno) {
        PageHelper.startPage(1,5);
        List<Process> pro = procesDao.selectAllInfo(startno);
        //获取总记录数 强转
        long total = ((Page) pro).getTotal();

        return pro;
    }

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit,String startno) {
        PageHelper.startPage(page,limit);
        List<Process> list = procesDao.selectAllInfo(startno);
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

    @Override
    public void Undo(Integer id) {
        procesDao.Undo(id);

    }

    @Override
    public void addInfo(Process pro) {
        procesDao.addInfo(pro);

    }

    @Override
    public List<Process> selectByPid(String  pid) {
        List<Process> list = procesDao.selectByPid(pid);
        return list;
    }

    @Override
    public Map<String, Object> processupdate(Map map) {
        procesDao.processupdate(map);
        Map<String,Object> mapPro=new HashMap<>();
        mapPro.put("code",1);
        return mapPro;
    }

    @Override
    public Map<String, Object> processnolist(Integer page, Integer limit, Integer ManageId) {
        PageHelper.startPage(page, limit);
        List<Process> list = procesDao.processnolist(ManageId);
        // 获取总记录数
        long total = ((Page) list).getTotal();


        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);

        return map;
    }
}
