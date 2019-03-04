package com.qf.resumemanagerpojo;

import lombok.Data;

import java.util.Date;
@Data
public class Classification {
    private Integer id;
    private Date create;
    private Date update;
    private String name;
}
