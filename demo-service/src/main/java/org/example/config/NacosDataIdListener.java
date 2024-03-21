package org.example.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NacosDataIdListener {

    @NacosConfigListener(dataId = "demo-service")
    public void refresh(String msg) {

        System.out.println("-----------------------------------");
        System.out.println("配置变动："+msg);
        System.out.println("-----------------------------------");
    }
}
