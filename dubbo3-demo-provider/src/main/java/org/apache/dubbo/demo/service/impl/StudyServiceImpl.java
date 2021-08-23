package org.apache.dubbo.demo.service.impl;

import org.apache.dubbo.demo.model.ResearchResult;
import org.apache.dubbo.demo.model.Scholar;
import org.apache.dubbo.demo.service.StudyService;

/**
 * @author jingping.liu
 * @date 2021-08-23
 * @description 研究过程
 */
public class StudyServiceImpl implements StudyService {

    public ResearchResult researchDubbo(Scholar scholar) {
        System.out.println(scholar.toString());
        System.out.println("开始研究 Dubbo 3");
        ResearchResult result = new ResearchResult();
        result.setTime("1 天");
        result.setProgress("准备开始");
        return result;
    }

    @Override
    public ResearchResult researchSpring(Scholar scholar) {
        System.out.println(scholar.toString());
        System.out.println("开始研究 Spring");
        ResearchResult result = new ResearchResult();
        result.setTime("10 天");
        result.setProgress("已完成");
        return result;
    }
}
