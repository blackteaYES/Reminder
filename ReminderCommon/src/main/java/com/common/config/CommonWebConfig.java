package com.common.config;

import com.common.handler.ResultResponseHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: ybx
 * @email: 1520688026@qq.com
 * @date: 2020/10/7 12:03 上午
 */
@Configuration
public class CommonWebConfig implements WebMvcConfigurer {

    @Autowired
    private ResultResponseHandlerInterceptor resultResponseHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptor = registry.addInterceptor(resultResponseHandlerInterceptor);
        // 拦截所有、排除
        interceptor.addPathPatterns("/**");
    }
}
