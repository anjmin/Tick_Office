package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public class StudentVo extends Student {

    private  String gname;

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Override
    public String toString() {
        return "StudentVo{" +
                "gname='" + gname + '\'' +
                '}';
    }
}
