package org.apache.dubbo.demo.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.demo.model.ResearchResult;
import org.apache.dubbo.demo.model.Scholar;
import org.apache.dubbo.demo.service.StudyDubboService;
import org.apache.dubbo.demo.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jingping.liu
 * @date 2021-07-02
 * @description
 */
@DubboService(version = "1.0.0")
public class StudyDubboServiceImpl implements StudyDubboService {

    /**
     * 直接通过 {@link DubboReference} 注解注入远程服务（消费）
     * 如果这里使用 {@link org.springframework.beans.factory.annotation.Autowired} 注解，
     * 则需要在配置文件里面通过 `<dubbo:reference />` 进行配置
     */
    //@DubboReference(version = "1.0.0")
    @Autowired
    StudyService studyService;

    @Override
    public String studyDubbo(Scholar scholar) {
        ResearchResult result = studyService.researchDubbo(scholar);
        if (result != null) {
            System.out.println("学习结果：" + result.toString());
        } else {
            System.out.println("学习失败");
        }
        return "study...";
    }
}
