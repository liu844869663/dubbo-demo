package org.apache.dubbo.demo.service;

import org.apache.dubbo.demo.model.ResearchResult;
import org.apache.dubbo.demo.model.Scholar;

/**
 * @author jingping.liu
 * @date 2021-07-02
 * @description 学习接口
 */
public interface StudyService {

    /**
     * 研究 Dubbo
     *
     * @param scholar 学者
     * @return 研究结果
     */
    ResearchResult researchDubbo(Scholar scholar);

    /**
     * 研究 Spring
     *
     * @param scholar 学者
     * @return 研究结果
     */
    ResearchResult researchSpring(Scholar scholar);
}
