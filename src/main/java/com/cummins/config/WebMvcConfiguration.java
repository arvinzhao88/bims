//package com.cummins.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//public class WebMvcConfiguration extends WebMvcConfigurerAdapter {
//
//    @Autowired
//    SessionInterceptor sessionInterceptor;
//    /*@Autowired
//    BackSessionInterceptor backSessionInterceptor;*/
//    @Autowired
//    ErrorInterceptor errorInterceptor;
//
//    @Autowired
//    LoginInterceptor loginInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // addPathPatterns 用于添加拦截规则
//        // excludePathPatterns 用户排除拦截
//        // 映射为 user 的控制器下的所有映射
//        registry.addInterceptor(sessionInterceptor).addPathPatterns("/pad/issue/**").excludePathPatterns("/debug/*").excludePathPatterns("/back/*");
//        //registry.addInterceptor(sessionInterceptor).addPathPatterns("/web/**").excludePathPatterns("/debug/*").excludePathPatterns("/back/*");
////        registry.addInterceptor(loginInterceptor).addPathPatterns("/back/**").excludePathPatterns("/back/login").excludePathPatterns("/back/dologin");
//        //registry.addInterceptor(backSessionInterceptor).addPathPatterns("/bms/book/**").excludePathPatterns("/back/login").excludePathPatterns("/back/dologin");
//        //错误返回拦截
////        registry.addInterceptor(errorInterceptor).addPathPatterns("/**");
//        super.addInterceptors(registry);
//    }
//
//}
