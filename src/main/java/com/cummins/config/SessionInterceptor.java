package com.cummins.config;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.service.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cummins.contact.dto.Person;
import com.cummins.contact.service.IPersonService;
import com.cummins.util.HttpRequest;
import com.cummins.util.StringUtil;
import com.cummins.wx.service.IWxAccessTokenService;

import net.sf.json.JSONObject;

@Component
public class SessionInterceptor extends HandlerInterceptorAdapter {

	@Value("${qywx_corpid}")
	private String qyWxCorpId;

	@Value("${qywx_corpsecret}")
	private String qyWxCorpsecret;

	@Value("${qywx_appid}")
	private String qyWxAppId;
	
	@Value("${qywx_appid}")
	private String qyContactWxAppId;

	@Value("${pad.debug}")
	private boolean isDebug;

	/*@Value("${webPath}")
	private String webPath;*/

	@Autowired
	private IWxAccessTokenService wxAccessTokenService;

	@Autowired
	private PermissionService permissionService;

	private final static Logger logger = LoggerFactory.getLogger(SessionInterceptor.class);

	private static final String QY_WECHAT_OAUTH_URL = "https://open.weixin.qq.com/connect/oauth2/authorize";
	
	private static final String SESSION_PERSON= "wx_person_info";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String urlStr = request.getRequestURL().toString();
		// 强制http转换成https
		if (!isDebug) {
			urlStr = urlStr.replace("http", "https");
			urlStr = urlStr.replace("/pad", "bims/pad");
		}
		String params = request.getQueryString();
		if (params != null) {
			urlStr += "?" + params;
		}
		System.out.println(urlStr);

//		Person person = (Person) request.getSession().getAttribute(SESSION_PERSON);
		BimsPerson person = (BimsPerson) request.getSession().getAttribute(SESSION_PERSON);

		if (person != null && person.getBelongRole().contains("1")) {
			/*logger.info("*********************  授权通过 **************");
			logger.info("userInfo : uid = " + person.getId());
			request.getSession().setAttribute(SESSION_PERSON, person);
			logger.info("*********************  授权通过 **************");*/
			return true;
		}
		String code = request.getParameter("code");
		logger.info("code====="+code);
		if (StringUtil.isNotBlank(code)) {
			Map<String, String> resultMap = getUserId(code);
			if (resultMap.containsKey("userId")) {

//				person = personService.getByAccount(1, resultMap.get("userId"));
				person = permissionService.getPersonByAcc(resultMap.get("userId"));

				if (person == null || !person.getBelongRole().contains("1")) {
					logger.error("Request uri :: {}, Person not found with account :: {}", request.getRequestURI(),resultMap.get("userId"));
					return false;
				} else {
					logger.info("userInfo : uid = " + person.getId());
					request.getSession().setAttribute(SESSION_PERSON, person);
					logger.info("*********************  授权通过 **************");
					return true;
				}
			} else {
				logger.error("无权访问"+code);
			}

		}
//		String basePath = webPath.substring(0, webPath.length() - 1);
//		String resultUrl = URLEncoder.encode(basePath + "/pad/issue/index", "UTF-8");
		String resultUrl = URLEncoder.encode(urlStr, "UTF-8");
		String redirectUrl = String.format(
				"%s?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_base&state=#wechat_redirect",
				QY_WECHAT_OAUTH_URL, qyWxCorpId, resultUrl);
		logger.info("redirect WechatOauth to :: {}", redirectUrl);
		response.sendRedirect(redirectUrl);

		return true;
		//return super.preHandle(request, response, handler);
	}

	private Map<String, String> getUserId(String code) {
		Map<String, String> resultMap = new HashMap<String, String>();
		String accessToken = wxAccessTokenService.getAccessTokenOnly(qyWxCorpsecret, qyContactWxAppId);
		String getopenid_url = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo";
		String param = "access_token=" + accessToken + "&code=" + code;
		logger.info("getUserId code:   " + code);
		// 向微信服务器发送get请求获取openIdStr
		String openIdStr = HttpRequest.sendGet(getopenid_url, param);
		JSONObject json = JSONObject.fromObject(openIdStr);// 转成Json格式
		logger.info("urlResult:   " + json);
		String openId = "";
		if (openIdStr.indexOf("OpenId") > -1) {
			// openId = json.getString("OpenId");//获取openId
			logger.error("无权访问:" + openId);
		} else {
			String userId = json.getString("UserId");
			resultMap.put("userId", userId);
			logger.info("可以访问：userId:" + userId);
		}
		resultMap.put("openId", openId);
		return resultMap;

	}

}
