package com.qfedu.pojo;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17.
 */
public class Role {

    //角色id
    private Integer id;
    //角色中文名
    private String info;
    //角色英文名
    private String name;

    //二级角色
    private List<Role> rolelist;

    //一个角色对应一个或多个用户
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Role> getRolelist() {
        return rolelist;
    }

    public void setRolelist(List<Role> rolelist) {
        this.rolelist = rolelist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", name='" + name + '\'' +
                ", rolelist=" + rolelist +
                ", user=" + user +
                '}';
    }
}
