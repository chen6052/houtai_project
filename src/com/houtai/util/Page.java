package com.houtai.util;

import com.houtai.pojo.Employee;

import java.util.List;

/**
 * 这是一个工具类，用来处理分页
 */
public class Page {
    private List<Employee> emps;
    private long total;
    private long pageNum;

    public Page() {
    }

    public Page(List<Employee> emps, long total, long pageNum) {
        this.emps = emps;
        this.total = total;
        this.pageNum = pageNum;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPageNum() {
        return pageNum;
    }

    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "Page{" +
                "emps=" + emps +
                ", total=" + total +
                ", pageNum=" + pageNum +
                '}';
    }
}
