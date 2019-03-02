package com.qf.resumemanagerpojo;


public class User {

    private Integer uid;

    private String uname;

    public void setUid(Integer uid) {
        this.uid = uid;
    }



    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUid() {

        return uid;
    }

    public String getUname() {
        return uname;
    }

    public User() {

    }
    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                '}';
    }
}
