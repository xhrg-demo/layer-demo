package com.github.xhrg.demo.api.config;

//import com.github.xhrg.demo.api.interceptor.MyInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new MyInterceptor())
//                .addPathPatterns("/*")//匹配要过滤的路径
//                .excludePathPatterns("/api/excludePath/*"); //匹配不过滤的路径
//    }
//}
