package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired(required = false)
    private DepartDao departDao;
    @Override
    public List<Depart> findDepart() {
        //调用该方法进行分页查询
        //第一个参数：页码；第二个参数：每页显示的记录数
        //startPage语句后，一定要紧跟着查询的相关方法
        PageHelper.startPage(1,5);
        List<Depart> departs = departDao.departInfo();
        //获取总记录数 强转
        long total = ((Page) departs).getTotal();

        return departs;
    }
    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Depart> list = departDao.departInfo();
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
    public void delDepById(Integer id) {
        departDao.delDepById(id);
    }

    @Override
    public void addDep(Depart dep) {
        dep.setCreatetime(new Date());
        if (dep.getFlag()==null){
            //1 有效 2 无效
            dep.setFlag(1);
        }
        departDao.addDep(dep);
    }

    @Override
    public void updateDep(Depart dep) {
        departDao.updateDep(dep);

    }
}
