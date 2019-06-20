package com.qfedu.service;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */
public interface RoleService {
    Map<String, Object> findUserRoleAll();

    Map<String,Object> findRoleAll();
}
