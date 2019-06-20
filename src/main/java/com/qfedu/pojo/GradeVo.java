package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public class GradeVo extends Grade {

    private int count;
    private  String cname;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    @Override
    public String toString() {
        return "GradeVo{" +
                "count=" + count +
                ", cname='" + cname + '\'' +
                '}';
    }
}
