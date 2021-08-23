package org.apache.dubbo.demon.generic;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.demo.service.StudyDubboService;
import org.apache.dubbo.demo.service.impl.StudyDubboServiceImpl;

import java.io.IOException;

/**
 * @author jingping.liu
 * @date 2021-07-16
 * @description 服务暴露
 */
public class GenericServiceExport {
    public static void main(String[] args) throws IOException {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("demo-provider");
        application.setQosEnable(false);

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");

        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(20081);

        ServiceConfig<StudyDubboService> service = new ServiceConfig<>();
        service.setApplication(application);
        service.setRegistry(registry);
        service.setProtocol(protocol);
        service.setInterface(StudyDubboService.class);
        StudyDubboServiceImpl serviceImpl = new StudyDubboServiceImpl();
        service.setRef(serviceImpl);
        service.setVersion("1.0.1");

        service.export();
        System.in.read();
    }
}
