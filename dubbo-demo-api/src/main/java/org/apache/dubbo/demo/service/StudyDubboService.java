package org.apache.dubbo.demo.service;

import org.apache.dubbo.demo.model.Scholar;

/**
 * @author jingping.liu
 * @date 2021-07-02
 * @description 学习 Dubbo 接口
 */
public interface StudyDubboService {

    /**
     * 学习 Dubbo
     *
     * @param scholar 学者
     * @return 学习结果
     */
    String studyDubbo(Scholar scholar);
}
