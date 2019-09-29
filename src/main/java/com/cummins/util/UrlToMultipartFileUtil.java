package com.cummins.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.http.entity.ContentType;
import org.apache.jasper.tagplugins.jstl.core.Url;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * 网络抓取图片 转换哼byte字节流 再根据字节流转换成 MultipartFile
 */
@Slf4j
@Component
public class UrlToMultipartFileUtil {

    @Value("${serverSavePath}")
    private String uploadUrl;

    public JSONObject urlToMultipartFile(String urlStr) {
        //获取文件名称
        String fileName = urlStr.substring(urlStr.lastIndexOf("/")+1);
        URL url = null;
        InputStream input = null;
        JSONObject parse = new JSONObject();
        try {
            url = new URL(urlStr);
            URLConnection urlConn=url.openConnection();
            log.info("----------------------Date:"+new Date(urlConn.getDate()));
            log.info("----------------------Content-Type:"+urlConn.getContentType());
            int length=urlConn.getContentLength();
            log.info("Content-Lentgth:"+length);
            if(length>0){
                System.out.println("==========Content==========");
                input=urlConn.getInputStream();
                //int size = input.available();
                byte[] bt = IOUtils.toByteArray(input);
                input.read(bt);
                input.close();

                InputStream inputStream = new ByteArrayInputStream(bt);
                MultipartFile file = new MockMultipartFile(fileName,fileName,
                        ContentType.APPLICATION_OCTET_STREAM.toString(), inputStream);
                String resUrl = HttpClientUtils.httpClientUploadFile(uploadUrl, file);
                parse = (JSONObject) JSONObject.parse(resUrl);
                return parse;
            }else{
                parse.put("status","0");
                parse.put("message", "没有文件");
                return parse;
            }
        } catch (Exception e) {
            e.printStackTrace();
            parse.put("status","0");
            parse.put("message", "失败");
            return parse;
        } finally {
            input = null;
        }
    }
}
