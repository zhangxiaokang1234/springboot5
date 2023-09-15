package cn.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication  //用注解标识的类作为springboot的入口类(启动类)
//@ImportResource("classpath:xmlProperties.xml")  //加载自定义xml配置文件位置
public class ChapterApplication {//启动类

    public static void main(String[] args) {
        SpringApplication.run(ChapterApplication.class,args);
    }
}
