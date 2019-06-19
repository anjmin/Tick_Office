package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public class Grade {

    //id
    private Integer id;
    //班级名字
    private String gname;
    //标记位
    private Integer flag;
    //周期
    private int week;
    //开班日期
    private Date createdate;
    //位置
    private String location;
    //学科编号
    private int cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gname='" + gname + '\'' +
                ", flag=" + flag +
                ", week=" + week +
                ", createdate=" + createdate +
                ", location='" + location + '\'' +
                ", cid=" + cid +
                '}';
    }
}
