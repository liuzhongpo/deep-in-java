package com.lzplzp.mybatis.basic.pojo;

/**
 * @author lzplzp
 * @create 2022-11-30 15:08
 */
public class Emp {
    private int eid;
    private String empName;
    private int age;

    private int did;

    private Dept dept;

    public Emp() {
    }

    public Emp( String empName, int age, int did) {
        this.empName = empName;
        this.age = age;
        this.did = did;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                '}';
    }
}
