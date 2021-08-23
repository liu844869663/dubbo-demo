package org.apache.dubbo.demo;

/**
 * @author jingping.liu
 * @date 2021-07-02
 * @description 启动类
 */
public class DemoConsumerApplication {

    public static void main(String[] args) {
        // 默认 使用 SpringContainer 容器，内部是对 Spring 的 ClassPathXmlApplicationContext 封装
        // 会将 `META-INF/spring` 下面的文件作为 Spring 应用上下文的配置文件
        org.apache.dubbo.container.Main.main(args);
    }
}
