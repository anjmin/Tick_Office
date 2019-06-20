package com.qfedu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public class Grade {

    //id
    private Integer id;
    //班级名字
    private String name;
    //标记位
    private Integer flag;
    //周期
    private int week;
    //开班日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    //位置
    private String location;
    //学科编号
    private int cid;

    /*//嵌套学科
    private Course course;

    //嵌套学生
    private List<Student> studentList;*/

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
                ", name='" + name + '\'' +
                ", flag=" + flag +
                ", week=" + week +
                ", createdate=" + createdate +
                ", location='" + location + '\'' +
                ", cid=" + cid +
                '}';
    }
}
