package com.cummins.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class ErrorInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("【-MyInterceptor1,在请求处理之前进行调用(controller方法调用之前)-】");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        int code = response.getStatus();
        if (response.getStatus() == 500) {
            modelAndView.setViewName("/error/error");
            /*
             * setViewName(String viewName);
             * 为此ModelAndView设置视图名称，由DispatcherServlet通过ViewResolver解析。 将覆盖任何预先存在的视图名称或视图。
             */
        } else if (response.getStatus() == 404) {
            modelAndView.setViewName("/error/error");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
