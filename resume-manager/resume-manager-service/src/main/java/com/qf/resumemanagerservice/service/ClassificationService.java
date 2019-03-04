package com.qf.resumemanagerservice.service;

import com.qf.resumemanagerpojo.Classification;

import java.util.List;

public interface ClassificationService {
    /*
        查询所有的简历模板分类
    */
    List<Classification> getAllClassification();

    /*
        添加某一条简历模板分类
     */
    Integer insertClassification(Classification classification);

    /*
        根据id修改某条简历模板分类信息
     */
    Integer deleteClassificationById(Integer id);

    /*
        根据id修改某条简历模板分类
     */
    Integer updateClassificationById(Classification classification);
}
