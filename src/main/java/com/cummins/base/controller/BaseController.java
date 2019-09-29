package com.cummins.base.controller;

import com.cummins.wx.service.IWxAccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cummins.wx.dto.WxAccessToken;
import com.cummins.util.SHA1Util;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BaseController {
    @Value("${qywx_corpid}")
    private String qyWxCorpId;

    @Value("${qywx_corpsecret}")
    private String qyWxCorpsecret;

    @Value("${qywx_appid}")
    private String qyWxAppId;

    @Value("${qywx_contact_appid}")
    private String qyContactWxAppId;

    /*@Value("${webPath}")
    private String webPath;*/

    @Autowired
    private IWxAccessTokenService wxAccessTokenService;

	@ModelAttribute
    public void init(ModelMap model) {





    }

    public Map<String, Object> sign(HttpServletRequest request) {


        String url = "http://test.cncnews.cn:8080/cummins-ftbms-1.0/web/index";
        url = request.getRequestURL().toString();
        if (url != null && url.contains("#")) {
            url = url.split("#")[0];
        }
        WxAccessToken accessToken = wxAccessTokenService.getAccessToken(qyWxCorpsecret, qyContactWxAppId);
        String nonceStr = UUID.randomUUID().toString();
        long timestamp = System.currentTimeMillis();
        StringBuffer sign = new StringBuffer();
        sign.append("jsapi_ticket=").append(accessToken.getJsapiTicket()).append("&noncestr=").append(nonceStr);
        sign.append("&timestamp=").append(timestamp).append("&url=").append(url);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("url", url);
        map.put("corpId", qyWxCorpId);
        map.put("timestamp", timestamp);
        map.put("nonceStr", nonceStr);
        map.put("sign", SHA1Util.hex_sha1(sign.toString()));

        return map;
    }
}
