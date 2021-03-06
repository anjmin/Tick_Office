package com.qfedu.pojo;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public class Authority {

    //权限的id
    private  Integer id;

    //图标
    private  String icon;

    //权限  绑定数据跳转用的
    private String aurl;

    //菜单
    private String title;

    //子菜单
    private List<Authority> childs;

    //父id
    private Integer parentId;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
                ", icon='" + icon + '\'' +
                ", aurl='" + aurl + '\'' +
                ", title='" + title + '\'' +
                ", childs=" + childs +
                ", parentId=" + parentId +
                '}';
    }
}
