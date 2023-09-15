package cn.lzy.web.functionextensionmvc.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.Servlet;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean getServlet(MyServlet myServlet) {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(myServlet,"/myServlet");
        return registrationBean;
    }
}
