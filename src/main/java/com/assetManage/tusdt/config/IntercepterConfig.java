package com.assetManage.tusdt.config;


import com.assetManage.tusdt.intercepter.LoginIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截以/asset_manage开头的所有接口
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/asset_manage/*/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }

}
