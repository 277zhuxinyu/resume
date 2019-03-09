package com.qf.resumemanagerserviceimpl.serviceimlp;

import com.qf.resumemanagerdao.dao.ClassificationMapper;
import com.qf.resumemanagerpojo.Classification;
import com.qf.resumemanagerservice.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationServiceImpl implements ClassificationService {

    @Autowired
    private ClassificationMapper classificationMapper;

    /*
        查询所有的简历模板分类
    */
    @Override
    public List<Classification> getAllClassification() {
        List<Classification> classifications=classificationMapper.getAllClassification();
        return classifications;
    }

    /*
       添加某一条简历模板分类
    */
    @Override
    public Integer insertClassification(Classification classification) {
        classificationMapper.insertClassification(classification);
        return 1;
    }

    /*
        根据id删除某条简历模板分类
     */
    @Override
    public Integer deleteClassificationById(Integer id) {
        classificationMapper.deleteClassificationById(id);
        classificationMapper.deleteResumeClassificationByClassificationId(id);
        return 1;
    }

    /*
        根据id修改某条简历模板分类
     */
    @Override
    public Integer updateClassificationById(Classification classification) {
        classificationMapper.updateClassificationById(classification);
        return 1;
    }

    /*
      根据id查询某条简历模板分类
     */
    @Override
    public Classification getClassificationById(Integer id) {
        Classification classification=classificationMapper.getClassificationById(id);
        return classification;
    }
}
