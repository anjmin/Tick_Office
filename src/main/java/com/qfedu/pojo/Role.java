package com.qfedu.pojo;

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
                '}';
    }
}
