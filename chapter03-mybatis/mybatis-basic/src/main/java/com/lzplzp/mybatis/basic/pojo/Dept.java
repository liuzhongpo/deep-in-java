package com.lzplzp.mybatis.basic.pojo;

import java.util.List;

/**
 * @author lzplzp
 * @create 2022-11-30 15:09
 */
public class Dept {
    private int did;

    private String deptName;

    private List<Emp> emps;

    public Dept() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
