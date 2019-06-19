package com.qfedu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Depart {
    //部门编号
    private Integer id;
    //部门名称
    private String name;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    //部门状态
    private Integer flag;

    //一对多
    private List<Staff> listSta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public List<Staff> getListSta() {
        return listSta;
    }

    public void setListSta(List<Staff> listSta) {
        this.listSta = listSta;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", flag=" + flag +
                '}';
    }
}
