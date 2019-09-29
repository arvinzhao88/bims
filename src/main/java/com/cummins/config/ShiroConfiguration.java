package com.cummins.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.mgt.SecurityManager;



@Configuration
public class ShiroConfiguration {

	 /*//将自己的验证方式加入容器
    @Bean
    public SystemRealm myShiroRealm() {
    	SystemRealm systemRealm = new SystemRealm();
        return systemRealm;
    }

    //权限管理，配置主要是Realm的管理认证
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    //Filter工厂，设置对应的过滤条件和跳转条件
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String,String> map = new HashMap<String, String>();
        //登出
        //map.put("/back/logout","logout"); //取消了shiro的登出功能 因为跳转到了莫名其妙的地址 要使用放开即可
        map.put("/view/static/back/css/**", "anon");
        map.put("/view/static/back/js/**", "anon");
        map.put("/view/static/back/images/**", "anon");
        map.put("/view/vendors/**", "anon");
        map.put("/view/layer/**", "anon");
        map.put("/view/front/**", "anon");
        map.put("/view/build/**", "anon");
        map.put("/back/dologin", "anon");
        map.put("/back/upload", "anon");
        
        // <!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        
        
        //对所有用户认证
        //只对后台登录的用户做认证
        map.put("/back/**","authc");
        map.put("/bms/book/**","authc");
        //登录
        shiroFilterFactoryBean.setLoginUrl("/back/login");
        //首页
        shiroFilterFactoryBean.setSuccessUrl("/back/index");
        //错误页面，认证不通过跳转
        shiroFilterFactoryBean.setUnauthorizedUrl("/error");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    //加入注解的使用，不加入这个注解不生效
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }*/
}
