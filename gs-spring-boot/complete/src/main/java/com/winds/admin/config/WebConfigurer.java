package com.winds.admin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.winds.admin.config.interceptors.LoginInterceptor;

/**
* @author   :WindsJune/博客园：WindsJune
* @version  :1.1.0
* @date     :2018年9月19日 上午9:36:16
* @comments :注册拦截器，拦截请求类型
*/

@Configuration
public class WebConfigurer extends WebMvcConfigurationSupport{
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	
	 // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }
 
    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	
    	//addPathPatterns("/**")表示要拦截的请求，你也可以指定 如：/admin/***; excludePathPatterns("/login","/register")表示哪些请求是可以不拦截的
    	//excludePathPatterns的优先级高于addPathPatterns
    	registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login","/register");
    	super.addInterceptors(registry);
    }

}
