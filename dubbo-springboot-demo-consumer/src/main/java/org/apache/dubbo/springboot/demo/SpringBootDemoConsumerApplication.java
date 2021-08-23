package org.apache.dubbo.springboot.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author jingping.liu
 * @date 2021-07-02
 * @description Spring Boot 启动类
 */
@SpringBootApplication
public class SpringBootDemoConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootDemoConsumerApplication.class).run(args);
    }
}
