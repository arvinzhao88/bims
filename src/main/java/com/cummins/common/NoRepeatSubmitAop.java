/*
package com.cummins.common;

import com.cummins.contact.util.JsonResult;
import com.google.common.cache.Cache;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

*/
/**
 * @功能描述 aop解析注解
 * @author www.gaozz.club
 * @date 2018-08-26
 *//*

@Aspect
@Component
@Slf4j
public class NoRepeatSubmitAop {

    @Autowired
    private Cache<String, Integer> cache;

    @Around("execution(* com.cummins.bms.controller.*Controller.*(..)) && @annotation(nrs)")
    public Object arround(ProceedingJoinPoint pjp, NoRepeatSubmit nrs) {
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            String sessionId = RequestContextHolder.getRequestAttributes().getSessionId();
            HttpServletRequest request = attributes.getRequest();
            String key = sessionId + "-" + request.getServletPath();
            if (cache.getIfPresent(key) == null) {// 如果缓存中有这个url视为重复提交
                Object o = pjp.proceed();
                cache.put(key, 0);
                return o;
            } else {
                log.error("重复提交");
                return JsonResult.failure("请勿重复提交");
            }
        } catch (Throwable e) {
            e.printStackTrace();
            log.error("验证重复提交时出现未知异常!");
            return JsonResult.failure("请勿重复提交");
        }

    }

}*/
