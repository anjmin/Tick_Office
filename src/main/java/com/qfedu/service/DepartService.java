package com.qfedu.service;

import com.qfedu.pojo.Depart;

import java.util.List;
import java.util.Map;

public interface DepartService {
    //查询所有部门
    public List<Depart> findDepart();
    //分页
    public Map<String,Object> findByPage(Integer page, Integer limit);
    //删除部门信息
    public void delDepById(Integer id);
    //添加
    public void addDep(Depart dep);
    //编辑 更新
    public void updateDep(Depart dep);
}
