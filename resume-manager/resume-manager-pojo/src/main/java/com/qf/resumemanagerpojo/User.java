package com.qf.resumemanagerpojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;
    private String name;
    private String email;
    private String address;
    private Integer age;
    private Date created;
    private Date updated;

}
