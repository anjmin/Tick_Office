package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public interface UserDao {
    List<String> findRolesByName(String name);

    List<String> findPermsByName(String name);

    // 根据用户名查找用户
    User findByName(String no);


    List<User> findAllByNoAndFg(@Param("no") String no, @Param("flag") Integer flag);
}
