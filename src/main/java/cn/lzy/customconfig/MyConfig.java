package cn.lzy.customconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //注解标识当前类就是自定义配置类
public class MyConfig {

    @Bean("MyProperties")
    public MyProperties getMyProperties() {
        return new MyProperties();
    }
}
