package cn.lzy.profileconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestDBConnector implements DBConnector{

    @Override
    public String config() {
        return "这个是测试环境";
    }
}
