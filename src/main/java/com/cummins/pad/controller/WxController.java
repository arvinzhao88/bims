package com.cummins.pad.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cummins.util.HttpClientUtils;
import com.cummins.util.UrlToMultipartFileUtil;
import com.cummins.wx.dto.WxAccessToken;
import com.cummins.wx.service.IWxAccessTokenService;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("pad/issue")
@Controller
public class WxController {
    @Autowired
    UrlToMultipartFileUtil urlToMultipartFileUtil;
    @Autowired
    private IWxAccessTokenService wechatTokenService;

    private static final Logger logger = LoggerFactory.getLogger(WxController.class);

    @Value("${serverSavePath}")
    private String serverSavePath;

    @Value("${uploadImageServerPath}")
    private String uploadImageServerPath;

    @Value("${qywx_appid}")
    private String wechatPublicNumber_appid;

    @Value("${qywx_corpsecret}")
    private String wechatPublicNumber_secret;

    @RequestMapping(value = "/savePicture", method = RequestMethod.POST)
    @ResponseBody
    public String savePicture(String mediaId, HttpServletRequest request) throws IOException {
        String path = request.getSession().getServletContext().getRealPath(File.separator);
        logger.info("mediaId是：" + mediaId);
        Boolean flag = true;
        String filename = saveImageToDisk(mediaId, path);
        logger.info("filename:" + filename);
        if (StringUtils.isEmpty(filename)) {
            flag = false;
        }
    /*    String filePath =
    "/usr/local/apache-tomcat-8.5.34/webapps/cummins-lushi-1.0/static/upload/" + filename;*/
        String filePath = path + File.separator + "upload" + File.separator + filename;
        File file = new File(filePath);
        logger.info("当前文件的大小" + file.length());
        // 2M=2097152字节
        if (file.length() > 2097152) {
            return null;
        } else {
            FileInputStream input = new FileInputStream(file);
            MultipartFile multipartFile =
                    new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));
            // String returnfilepath =
            // HttpClientUtils.httpClientUploadFile("http://test.cncnews.cn/wup/webUploader?p=lushi",
            // multipartFile);
            String returnfilepath =
                    HttpClientUtils.httpClientUploadFile(uploadImageServerPath, multipartFile);
            JSONObject jsonObject = JSON.parseObject(returnfilepath);
            return returnfilepath;
        }
    }

    /**
     * 保存图片至服务器
     *
     * @param mediaId
     * @return 文件名
     */
    public String saveImageToDisk(String mediaId, String path) throws IOException {
        InputStream inputStream = getMediaStream(mediaId);
        byte[] data = new byte[2048];
        int len;
        FileOutputStream fileOutputStream = null;
        String filename = null;
        try {
            // 服务器存图路径
            // String path = "/usr/local/apache-tomcat-8.5.34/webapps/cummins-lushi-1.0/static/upload/";
//            String path = serverSavePath;
//            logger.info("文件路径为：" + path);
            filename = System.currentTimeMillis() + getNonceStr() + ".jpg";
            logger.info("filename:" + filename);
            File file = new File(path + File.separator + "upload" + File.separator + filename);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(file);
            while ((len = inputStream.read(data)) != -1) {
                fileOutputStream.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        logger.info("return的filename:" + filename);
        return filename;
    }

    public String getBase64FromInputStream(InputStream in) {
        // 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        byte[] data = null;
        // 读取图片字节数组
        try {
            ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
            byte[] buff = new byte[100];
            int rc = 0;
            while ((rc = in.read(buff, 0, 100)) > 0) {
                swapStream.write(buff, 0, rc);
            }
            data = swapStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new String(Base64.encodeBase64(data));
    }

    public InputStream getMediaStream(String mediaId) throws IOException {
        String url = "https://qyapi.weixin.qq.com/cgi-bin/media/get";
    /*   WeChat weChat = WeChat.getInstance();
    String accessToken = weChat.getToken();
    if (accessToken == null || "".equals(accessToken)) {
      accessToken = WeixinUtil.getAccessToken().getToken();
      weChat.setToken(accessToken);
    }*/
        WxAccessToken accessTokens = wechatTokenService.getAccessToken(wechatPublicNumber_secret, wechatPublicNumber_appid);
        String accessToken = accessTokens.getAccessToken();
        logger.info("access_token" + accessToken);
        String params = "access_token=" + accessToken + "&media_id=" + mediaId;
        InputStream is = null;
        try {
            String urlNameString = url + "?" + params;
            logger.info("urlNameString" + urlNameString);
            URL urlGet = new URL(urlNameString);
            if (urlGet.getProtocol().toLowerCase().equals("https")) {
                HttpsURLConnection http = (HttpsURLConnection) urlGet.openConnection();
                http.setRequestMethod("GET"); // 必须是get方式请求
                http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                http.setDoOutput(true);
                http.setDoInput(true);
                http.connect();
                // 获取文件转化为byte流
                is = http.getInputStream();
            }
            // HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return is;
    }

    public String getNonceStr() {
        String currTime = getCurrTime();
        String strTime = currTime.substring(8, currTime.length());
        String strRandom = buildRandom(4) + "";
        return strTime + strRandom;
    }

    /**
     * 获取当前时间 yyyyMMddHHmmss
     */
    public String getCurrTime() {
        Date now = new Date();
        SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String s = outFormat.format(now);
        return s;
    }

    /**
     * 取出一个指定长度大小的随机正整数.
     *
     * @param length int 设定所取出随机数的长度。length小于11
     * @return int 返回生成的随机数。
     */
    public int buildRandom(int length) {
        int num = 1;
        double random = Math.random();
        if (random < 0.1) {
            random = random + 0.1;
        }
        for (int i = 0; i < length; i++) {
            num = num * 10;
        }
        return (int) ((random * num));
    }
}
