package org.apache.dubbo.springboot.demo.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.demo.model.ResearchResult;
import org.apache.dubbo.demo.model.Scholar;
import org.apache.dubbo.demo.service.StudyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingping.liu
 * @date 2021-07-09
 * @description
 */
@RestController
@RequestMapping("/study")
public class StudyController {

    @DubboReference(version = "2.0.0")
    StudyService studyService;

    @GetMapping("/dubbo")
    public String studyDubbo(@RequestBody Scholar scholar){
        ResearchResult result = studyService.researchDubbo(scholar);
        if (result != null) {
            System.out.println("学习结果：" + result.toString());
        } else {
            System.out.println("学习失败");
        }
        return "study...";
    }
}
