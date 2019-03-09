package com.qf.resumemanagerpojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BaseResult<T> implements Serializable {
    private Integer status;
    private String message;
    private List<T> data;
}
