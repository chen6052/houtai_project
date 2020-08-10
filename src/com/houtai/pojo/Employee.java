package com.houtai.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable {
    /*
    empid     NUMBER(2) not null,
    pid       NUMBER(2),
    mgrid     NUMBER(2),
    ename     VARCHAR2(50),
    password  VARCHAR2(50),
    emptype   VARCHAR2(50),
    idcard    NUMBER(17),
    sex       CHAR(3),
    age       NUMBER(2),
    birthday  DATE,
    phone     NUMBER(11),
    address   VARCHAR2(50),
    bonus     NUMBER(5),
    hiredate  DATE,
    elsemoney NUMBER(5)
    */
    private int empid;
    private int pid;
    private int mgrid;
    private String ename;
    private String password;
    private String emptype;
    private int idcard;
    private char sex;
    private int age;
    private Date birthday;
    private int phone;
    private String address;
    private double bonus; //奖金
    private Date hiredate;
    private double elsemoney; //其他补助金

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmptype() {
        return emptype;
    }

    public void setEmptype(String emptype) {
        this.emptype = emptype;
    }

    public int getIdcard() {
        return idcard;
    }

    public void setIdcard(int idcard) {
        this.idcard = idcard;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public double getElsemoney() {
        return elsemoney;
    }

    public void setElsemoney(double elsemoney) {
        this.elsemoney = elsemoney;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", pid=" + pid +
                ", mgrid=" + mgrid +
                ", ename='" + ename + '\'' +
                ", password='" + password + '\'' +
                ", emptype='" + emptype + '\'' +
                ", idcard=" + idcard +
                ", sex=" + sex +
                ", age=" + age +
                ", birthday=" + birthday +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", bonus=" + bonus +
                ", hiredate=" + hiredate +
                ", elsemoney=" + elsemoney +
                '}';
    }
}
