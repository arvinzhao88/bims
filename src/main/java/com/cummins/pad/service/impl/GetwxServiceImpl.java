package com.cummins.pad.service.impl;


import com.cummins.pad.service.IGetwxpropService;
import com.cummins.util.SHA1Util;
import com.cummins.wx.dto.WxAccessToken;
import com.cummins.wx.service.IWxAccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class GetwxServiceImpl implements IGetwxpropService {

  @Value("${qywx_corpid}")
  private String qyWxCorpId;

  @Value("${qywx_corpsecret}")
  private String qyWxCorpsecret;

  @Value("${qywx_appid}")
  private String qyWxAppId;

  @Value("${qywx_contact_appid}")
  private String qyContactWxAppId;

  @Value("${pad.debug}")
  private boolean isDebug;

/*  @Value("${webPath}")
  private String webPath;*/

  @Autowired private IWxAccessTokenService wxAccessTokenService;

  @Override
  public Map<String, String> getwxprop(String urlback) {
    String url = urlback;
    if (!isDebug) {
      url = urlback.replaceAll("http", "https");
      url = url.replace("/pad", "bims/pad");
    }
    Map<String, String> resultMap = new HashMap<String, String>();
    WxAccessToken accessToken =
        wxAccessTokenService.getAccessToken(qyWxCorpsecret, qyContactWxAppId);

    // AccessToken token = accessTokenService.getAccessToken(companyId);AccessToken token =
    // accessTokenService.getAccessToken(companyId);

    String jsapi_ticket = accessToken.getJsapiTicket();
    System.out.println(
        "accessToken:" + accessToken.getAccessToken() + "ticket:" + accessToken.getJsapiTicket());

    String nonceStr = UUID.randomUUID().toString();
    StringBuffer sign = new StringBuffer();
    sign.append("jsapi_ticket=").append(jsapi_ticket).append("&noncestr=").append(nonceStr);
    sign.append("&timestamp=").append(create_timestamp()).append("&url=").append(url);

    System.out.println("sign=" + sign);
    resultMap.put("url", url);
    resultMap.put("nonceStr", nonceStr);
    resultMap.put("timestamp", create_timestamp());
    resultMap.put("signature", SHA1Util.hex_sha1(sign.toString()));
    resultMap.put("appId", qyWxCorpId);

    return resultMap;
  }

  @Override
  public String create_timestamp() {
    return Long.toString(System.currentTimeMillis() / 1000);
  }
}
