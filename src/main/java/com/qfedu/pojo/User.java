package com.qfedu.pojo;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public class User {

    //用户序号
    private  Integer id;
    //用户工号
    private  String no;
    //用户密码
    private String password;
    //用户名字
    private  String name;
    //用户状态
    private Integer flag;
    //用户头像
    private  String headphoto;

    //用户角色
    private List<String> role;
    //用户角色ID
    private List<Integer> rids;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public List<Integer> getRids() {
        return rids;
    }

    public void setRids(List<Integer> rids) {
        this.rids = rids;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                ", headphoto='" + headphoto + '\'' +
                ", role=" + role +
                ", rids=" + rids +
                '}';
    }
}
