package com.cummins.config;

import com.cummins.bims.dto.SysUser;
import com.cummins.bims.service.ISysUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*@Component
public class SystemRealm extends AuthorizingRealm{

	@Autowired
	private ISysUserService sysUserService;

	//注入ehcache的缓存区域
    @Value("bmpsShiroCache")//注入缓存具体对象的名字,该名字在ehcache.xml中配置的
    public void setSuperAuthenticationCacheName(String authenticationCacheName){
        super.setAuthenticationCacheName(authenticationCacheName);
    }


	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//给当前用户授权的权限（功能权限、角色）
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //两种方式：
        //方式1：工具类来获取(首长-)
        //      User user=(User)SecurityUtils.getSubject().getPrincipal();
        //方式2：通过参数获取首长(推荐)
        SysUser sysUser = (SysUser) principals.getPrimaryPrincipal();
        authorizationInfo.addStringPermission("user"); 
        
        return authorizationInfo;//将授权信息交给安全管理器接口。
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		 //用户名密码令牌（action传过来）
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //调用业务层来查询(根据用户名来查询用户，无需密码)
        SysUser sysuser = new SysUser();
		sysuser.setLoginName(upToken.getUsername());
		SysUser sysUserFind = sysUserService.getByUser(sysuser);


        //判断用户是否存在
        if (sysUserFind == null) {
            //用户不存在
            return null;//抛出异常
        } else {
            //用户名存在
            //参数1：用户对象，将来要放入session,数据库查询出来的用户
            //参数2：凭证（密码）：密码校验：校验的动作交给shiro
            //参数3:当前使用的Realm在Spring容器中的名字(bean的名字，自动在spring容器中寻找)
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(sysUserFind, sysUserFind.getPassword(), super.getName());
            return authenticationInfo;//密码校验失败，会自动抛出IncorrectCredentialsException
        }
	}

}*/
