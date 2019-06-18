package com.qfedu.pojo;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public class Authority {

    //权限的id
    private  Integer id;

    //图标
    private  String aicon;

    //权限  绑定数据跳转用的
    private String aurl;

    //菜单
    private String title;

    //子菜单
    private List<Authority> childs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAicon() {
        return aicon;
    }

    public void setAicon(String aicon) {
        this.aicon = aicon;
    }

    public String getAurl() {
        return aurl;
    }

    public void setAurl(String aurl) {
        this.aurl = aurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Authority> getChilds() {
        return childs;
    }

    public void setChilds(List<Authority> childs) {
        this.childs = childs;
    }


    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", aicon='" + aicon + '\'' +
                ", aurl='" + aurl + '\'' +
                ", title='" + title + '\'' +
                ", childs=" + childs +
                '}';
    }
}
