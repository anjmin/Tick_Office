package com.qfedu.dao;

import com.qfedu.pojo.Depart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartDao {

    //查询所有部门
    public List<Depart> departInfo();
    // 分页  index 表示开始索引，size表示每页显示的记录个数
    // 如果传递多个参数，可以使用@Param修饰，内部会将数据封装到map结构中，key和@Param的参数保持一致
    public List<Depart> findByIndexAndSize(@Param("index") Integer index, @Param("size") Integer size);
    //删除部门
    public void delDepById(Integer id);
    //添加
    public void addDep(Depart dep);
    //编辑 更新
    public void updateDep(Depart dep);
}
