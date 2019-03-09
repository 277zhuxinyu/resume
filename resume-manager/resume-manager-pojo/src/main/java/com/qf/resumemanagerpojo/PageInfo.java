package com.qf.resumemanagerpojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class PageInfo<T> implements Serializable {
    private int draw;
    private int recordsTotal;//数据总条数
    private int recordsFiltered;//过滤后的数据总条数
    private List<T> data;//分页显示的数据
    private String error;

}
