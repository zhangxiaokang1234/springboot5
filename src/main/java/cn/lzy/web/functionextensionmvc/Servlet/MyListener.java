package cn.lzy.web.functionextensionmvc.Servlet;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Component
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized...");
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed...");
    }

    @Bean
    public ServletListenerRegistrationBean getServletListener(MyListener myListener) {
        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean(myListener);
        return registrationBean;
    }
}
