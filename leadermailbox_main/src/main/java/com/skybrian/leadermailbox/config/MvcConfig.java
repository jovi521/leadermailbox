package com.skybrian.leadermailbox.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jovi
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * @author jovi
     * @apiNote 除了首页index页面之外，其余剩下的请求，一律做处理来到登陆页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("mailGetDeal").setViewName("security/login");
    }
}
