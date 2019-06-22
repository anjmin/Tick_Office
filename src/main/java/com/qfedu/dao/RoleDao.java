package com.qfedu.dao;

import com.qfedu.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19.
 */
public interface RoleDao {

    //根据条件查询
    List<Role> findAllByName(@Param("info") String info);

    //删除
    void deleteById(Integer id);

    void deleteRoleAById(Integer id);

    void insertRoleA(@Param("id") Integer id, @Param("aids") Integer[] aids);
}
