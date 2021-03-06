package com.qfedu.dao;

import com.qfedu.pojo.Process;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface ProcesDao {
    //展示信息
    public List<Process> selectAllInfo(String startno);
    // 分页  index 表示开始索引，size表示每页显示的记录个数
    // 如果传递多个参数，可以使用@Param修饰，内部会将数据封装到map结构中，key和@Param的参数保持一致
    public List<Process> findByIndexAndSize(@Param("index") Integer index, @Param("size") Integer size);
    // 获取总记录数
    public int count();
    //取消操作
    public void Undo(Integer id);
    //添加
    public void addInfo(Process pro);

    List<Process> selectByPid(String  pid);

    void processupdate(Map map);

    List<Process> processnolist(Integer manageId);

    List<Process> selectByPid2(Integer pid);
}
