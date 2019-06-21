package com.qfedu.service;

import com.qfedu.pojo.Process;

import java.util.List;
import java.util.Map;

public interface ProcessSercive {
    //展示我的记录
    public List<Process> selectAllInfo(String startno);
    //分页
    public Map<String,Object> findByPage(Integer page, Integer limit,String startno);
    //取消操作
    public void Undo(Integer id);
    //添加
    public void addInfo(Process pro);

    List<Process> selectByPid(String  pid);

    Map<String, Object> processupdate(Map map);
    //展示待办事项
    Map<String, Object> processnolist(Integer page, Integer limit, Integer ManageId);



}
