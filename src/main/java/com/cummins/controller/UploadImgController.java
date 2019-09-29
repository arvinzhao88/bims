package com.cummins.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cummins.util.HttpClientUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;



@Controller
@RequestMapping("/uploadFile")
public class UploadImgController {
	
	
	@Value("${file.savepath}")
	private String fileSavePath;

    @Value("${uploadImageServerPath}")
    private String urlImg;
	
	@RequestMapping("uploader1")
	@ResponseBody
    public Map<String,String> upload(HttpServletRequest request,HttpServletResponse response){
		Map<String,String> resultMap = new HashMap<String,String>();
		resultMap.put("status", "1");
		String fileName;
        MultipartHttpServletRequest Murequest = (MultipartHttpServletRequest)request;
        Map<String, MultipartFile> files = Murequest.getFileMap();//得到文件map对象
        String upaloadUrl = request.getSession().getServletContext().getRealPath("/")+"upload/";//得到当前工程路径拼接上文件名
        //获取项目地址
        String scheme = request.getScheme();//http
        String serverName = request.getServerName();//地址
        int serverPort = request.getServerPort();//端口
        String contextPath = request.getContextPath();//项目名
        String url = scheme+"://"+serverName+":"+serverPort+contextPath + "/upload/";//eg:http://127.0.0.1:8080/upload

        //String upaloadUrl = fileSavePath;//得到当前工程路径拼接上文件名
        File dir = new File(upaloadUrl);
        if(!dir.exists())//目录不存在则创建
            dir.mkdirs();
        for(MultipartFile file :files.values()){
            fileName=file.getOriginalFilename();
            String type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
            if (type!=null) {// 判断文件类型是否为空
            	String trueFileNamePrex = String.valueOf(System.currentTimeMillis());
            	String trueFilePath  = upaloadUrl+ trueFileNamePrex;
            	 String trueFileName=trueFileNamePrex+"."+type;
            	 String newFileName= upaloadUrl+trueFileName;
            	 File tagetFile = new File(newFileName);//创建文件对象
                 if(!tagetFile.exists()){//文件名不存在 则新建文件，并将文件复制到新建文件中
                     try {
                         tagetFile.createNewFile();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                     try {
                         file.transferTo(tagetFile);
                         resultMap.put("filepath", url+trueFileName);
                     } catch (IllegalStateException e) {
                         e.printStackTrace();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 }
                 
                 
                 /*if(type.equals("pptx") || type.equals("PPTX") ) {
                	 try {
						//int pptPageSize = PdfUtils.toImage2007(newFileName,trueFilePath);
                		 
                		 ConvertFileUtil.officeToPDF(newFileName, trueFilePath+".pdf");
                		 
                		 int pptPageSize = PdfUtil.toImage2007(newFileName, trueFilePath);
						resultMap.put("pageSize", Integer.toString(pptPageSize));
					} catch (Exception e) {
						
						resultMap.put("status", "0");
					}
                 }*/
            }
            
            
        }
        return resultMap;
	}

    @RequestMapping("uploader")
    @ResponseBody
    public String upload(HttpServletRequest request, HttpServletResponse response, MultipartFile file){
        String imgPath = HttpClientUtils.httpClientUploadFile(urlImg, file);
        return imgPath;
    }
}