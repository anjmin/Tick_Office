package com.qfedu.dao;

import com.qfedu.pojo.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffDao {
    //批量插入
    public  void addBatch(List<Staff> list);
    //查询所有员工
    public List<Staff> findAll();
    // 分页  index 表示开始索引，size表示每页显示的记录个数
    // 如果传递多个参数，可以使用@Param修饰，内部会将数据封装到map结构中，key和@Param的参数保持一致
    public List<Staff> findByIndexAndSize(@Param("index") Integer index, @Param("size") Integer size);
    // 获取总记录数
    public int count();
    //删除员工信息
    public void delStaff(String no);
    //添加员工
    public void addStaff(Staff sta);
    // 更新员工
    public void updateStaff(Staff sta);
//    查编号
//    Staff  findDate(String no);
}
