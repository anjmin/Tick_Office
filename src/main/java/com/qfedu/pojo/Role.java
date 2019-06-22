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

    private List<Integer> aids;
    private List<String> titles;

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

    public List<Integer> getAids() {
        return aids;
    }

    public void setAids(List<Integer> aids) {
        this.aids = aids;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", name='" + name + '\'' +
                ", aids=" + aids +
                ", titles=" + titles +
                '}';
    }
}
