package com.houtai.pojo;

import java.io.Serializable;

public class Position implements Serializable {
    /*
    pid      NUMBER(2) not null,
    pname    VARCHAR2(50),
    priority CHAR(3),
    remark   VARCHAR2(50),
    ptype    VARCHAR2(50),
    psal     NUMBER(5)
    */
    private int pid;
    private String pname;
    private char priority; //���ȼ���1.�� 2.��  3.��
    private String remark; //��ע
    private String ptype; //ְλ����
    private double psal; // ��������

    public Position() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public char getPriority() {
        return priority;
    }

    public void setPriority(char priority) {
        this.priority = priority;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public double getPsal() {
        return psal;
    }

    public void setPsal(double psal) {
        this.psal = psal;
    }

    @Override
    public String toString() {
        return "Position{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", priority=" + priority +
                ", remark='" + remark + '\'' +
                ", ptype='" + ptype + '\'' +
                ", psal=" + psal +
                '}';
    }
}
