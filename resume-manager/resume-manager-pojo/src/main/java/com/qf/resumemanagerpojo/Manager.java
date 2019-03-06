package com.qf.resumemanagerpojo;

import java.util.Date;

public class Manager {
    private int id;
    private Date cretime;
    private Date uptime;
    private String name;
    private String pwd;
    private String sex;
    private int age;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCretime() {
        return cretime;
    }

    public void setCretime(Date cretime) {
        this.cretime = cretime;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", cretime=" + cretime +
                ", uptime=" + uptime +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Manager() {
    }

    public Manager(int id, Date cretime, Date uptime, String name, String pwd, String sex, int age, String phone) {
        this.id = id;
        this.cretime = cretime;
        this.uptime = uptime;
        this.name = name;
        this.pwd = pwd;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
    }
}
