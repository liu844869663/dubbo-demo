package org.apache.dubbo.demon.generic;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.MethodConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.rpc.service.EchoService;
import org.apache.dubbo.rpc.service.GenericService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author jingping.liu
 * @date 2021-07-16
 * @description 泛化调用
 */
public class GenericServiceInvoke {
    public static void main(String[] args) {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("demo-consumer");
        application.setQosEnable(false);

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");

        List<MethodConfig> methods = new ArrayList<>();
        MethodConfig method = new MethodConfig();
        method.setName("researchDubbo");
        method.setTimeout(500);
        method.setRetries(0);
        methods.add(method);

        ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
        reference.setRegistry(registry);
        reference.setGeneric("true");
        reference.setCheck(false);
        reference.setProtocol("dubbo");
        reference.setInterface("org.apache.dubbo.demo.service.StudyService");
        reference.setVersion("1.0.0");
        reference.setApplication(application);
        reference.setMethods(methods);

        GenericService genericService = reference.get();
        HashMap<String, Object> param = new HashMap<>();
        param.put("name", "generic");
        Object result = genericService.$invoke("researchDubbo", new String[]{"org.apache.dubbo.demo.model.Scholar"}, new Object[]{param});
        System.out.println("得到的结果：" + result);
    }
}
