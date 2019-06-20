package com.qfedu.dao;

import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19.
 */
public interface RoleDao {
    List<Role> findUserRoleAll();

    List<Role> findRoleAll();
}
