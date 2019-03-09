package com.qf.resumemanagerdao.dao;

import com.qf.resumemanagerpojo.Classification;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassificationMapper {

    /*
        查询所有的简历模板分类
     */
    List<Classification> getAllClassification();

    /*
        添加某一条简历模板分类
     */
    void insertClassification(Classification classification);

    /*
        根据id删除某条简历模板分类---------1
     */
    void deleteClassificationById(Integer id);
    /*
        根据的简历模板分类删除相应的 简历模板分类关联表--------2
     */
    void deleteResumeClassificationByClassificationId(Integer classificationId);

    /*
        根据id修改某条简历模板分类信息
     */
    void updateClassificationById(Classification classification);


    /*
      根据id查询某条简历模板分类
     */
    Classification getClassificationById(Integer id);
}
