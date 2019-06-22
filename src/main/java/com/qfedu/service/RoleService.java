package com.qfedu.service;

import com.qfedu.pojo.Authority;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */
public interface RoleService {

    Map<String,Object> rolepage(String info);

    void deleteById(Integer id);

    List<Authority> findAllAuthority();

    void userRoleEdit(Integer id, Integer[] aids);
}
