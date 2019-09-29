
package com.cummins.cummins;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cummins.util.HttpRequest;

//import com.swetake.util.Qrcode;
//import com.swetake.util.Qrcode;
import com.cummins.util.MD5Util;
import org.springframework.util.StringUtils;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Test {

/*public static void main(String[] args) {
		Map<String, String> resultMap = new HashMap<String, String>();
		String accessToken ="mzc5Flvf6OP-Lnc1bLGtfWuMP9-kKLH5cc6mIWGBvpG4kNBVCqHMOY8hPv7TgAulggYouoXz13pqBvyNgk3hgRs6wlo8IWjzU5GTjH7PRr4XVK6fDPowKbf7xbrbvaTH8yUwNFkRn-PBPU2KSvmcge0dsRqHoC5XpYS8ziUUJyCN1mOERYLLpORepsiFV2b7KrHXoYHyZ18rX4FPtKOGfg";
		String code = "uUEUxytDrH0ksBVGXyWmp7qKe2KvyWUbKfrIx0AeUzk";
		String getopenid_url = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo";
		String param = "access_token=" + accessToken + "&code=" + code;
		System.out.println("getUserId code:   " + code);
		// 向微信服务器发送get请求获取openIdStr
		String openIdStr = HttpRequest.sendGet(getopenid_url, param);
		JSONObject json = JSONObject.fromObject(openIdStr);// 转成Json格式
		System.out.println("urlResult:   " + json);
		String openId = "";
		if (openIdStr.indexOf("OpenId") > -1) {
			// openId = json.getString("OpenId");//获取openId
			System.out.println("无权访问:" + openId);
		} else {
			String userId = json.getString("UserId");
			resultMap.put("userId", userId);
			System.out.println("可以访问：userId:" + userId);
		}
		resultMap.put("openId", openId);
		
	}*//*


	*/
/*public static void main(String[] args) {
		Date date = new Date("Fri Mar 08 10:35:37 CST 2019");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String format = sdf.format(date);
		System.out.println(format);
	}*//*


    */
/*public static void main(String[] args) throws ParseException {
        String date = "2018-03-28 10:04:32";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sd.parse(date);
        System.out.println(sd.format(d));
        // 把当前得到的时间用date.getTime()的方法写成时间戳的形式，再加上8小时对应的毫秒数
        long rightTime = (long) (d.getTime() + 3 * 7 * 24 * 60 * 60 * 1000);
        // 把得到的新的时间戳再次格式化成时间的格式
        String newtime = sd.format(rightTime);
        Date dt = sd.parse(newtime);
        System.out.println(newtime);
        System.out.println(dt);
    }*/


/*    public static void createQrCode(String content) {

        try {
            Qrcode qrcode = new Qrcode();
            // 设置二维码排错率, L(7%)、M(15%)、Q(25%)、H(30%) 排错率越高可存储的信息越少，但对二维码的清晰度要求比较低
            qrcode.setQrcodeErrorCorrect('M');
            // N代表数字，A代表字符a-Z，B代表其他字符
            qrcode.setQrcodeEncodeMode('B');
            // 设置二维码版本，取值范围为0-40，值越大尺寸越大，存储的信息越大
            qrcode.setQrcodeVersion(7);

            // 设置图片高宽度
            BufferedImage bufferedImage = new BufferedImage(139, 139, BufferedImage.TYPE_INT_RGB);

            // 创建一个 Graphics2D,画图
            Graphics2D gs = bufferedImage.createGraphics();
            // 设置图片的背景色
            gs.setBackground(Color.WHITE);
            gs.clearRect(0, 0, 139, 139);

            // 设置图片颜色
            gs.setColor(Color.black);

            // 将输出内容转为byte类型
            byte[] contentBytes = content.getBytes("utf-8");

            // 设置偏移量，不设置可能导致解析出错
            int pixoff = 2;

            // 输出内容
            if (contentBytes.length > 0 && contentBytes.length < 130) {
                boolean[][] codeOut = qrcode.calQrcode(contentBytes);
                for (int i = 0; i < codeOut.length; i++) {
                    for (int j = 0; j < codeOut.length; j++) {
                        if (codeOut[j][i]) {
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        }
                    }
                }
            } else {
                System.err.println("QRCode content bytes length = " + contentBytes.length + " not in [ 0,130 ]. ");
                return;
            }

            // 没有logo的二维码
            gs.dispose();
            bufferedImage.flush();


//            ImageIO.write(bufImg, "jpg", response.getOutputStream());  生成图片输出流中

            // 生成二维码QRCode图片
            File imgFile = new File("D:/qrCode/");
            // 生成的图片在D盘下，名为 qrCode.png
            ImageIO.write(bufferedImage, "png", imgFile);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
    /*public static void main(String[] args) {
        //Test.createQrCode("LR001");
        try {
            String s = MD5Util.EncoderByMd5("111111");
            System.out.println(s);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }*/

	/**利用MD5进行加密*/
	/*public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//确定计算方法
		MessageDigest md5=MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		//加密后的字符串
		String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
		return newstr;
	}

	*//**判断用户密码是否正确
	 *newpasswd  用户输入的密码
	 *oldpasswd  正确密码*//*
	public boolean checkpassword(String newpasswd,String oldpasswd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		if(EncoderByMd5(newpasswd).equals(oldpasswd))
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String s = EncoderByMd5("123456");

		System.out.println(s);
	}*/


	//===================================================================================================================
	/*public static String getBase64ByImgUrl(String url) {
		String suffix = url.substring(url.lastIndexOf(".") + 1);
		try {
			URL urls = new URL(url);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			Image image = Toolkit.getDefaultToolkit().getImage(urls);
			BufferedImage biOut = toBufferedImage(image);
			ImageIO.write(biOut, suffix, baos);
			String base64Str = Base64Util.encode(baos.toByteArray());
			return base64Str;
		} catch (Exception e) {
			return "";
		}

	}

	public static BufferedImage toBufferedImage(Image image) {
		if (image instanceof BufferedImage) {
			return (BufferedImage) image;
		}
		// This code ensures that all the pixels in the image are loaded
		image = new ImageIcon(image).getImage();
		BufferedImage bimage = null;
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		try {
			int transparency = Transparency.OPAQUE;
			GraphicsDevice gs = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gs.getDefaultConfiguration();
			bimage = gc.createCompatibleImage(image.getWidth(null),
					image.getHeight(null), transparency);
		} catch (HeadlessException e) {
			// The system does not have a screen
		}
		if (bimage == null) {
			// Create a buffered image using the default color model
			int type = BufferedImage.TYPE_INT_RGB;
			bimage = new BufferedImage(image.getWidth(null),
					image.getHeight(null), type);
		}
		// Copy image to buffered image
		Graphics g = bimage.createGraphics();
		// Paint the image onto the buffered image
		g.drawImage(image, 0, 0, null);
		g.dispose();
		return bimage;
	}

	*//**
	 * 通过图片的url获取图片的base64字符串
	 *
	 * @param imgUrl 图片url
	 * @return 返回图片base64的字符串
	 *//*
	public static String image2Base64(String imgUrl) {
		URL url = null;
		InputStream is = null;
		ByteArrayOutputStream outStream = null;
		HttpURLConnection httpUrl = null;
		try {
			url = new URL(imgUrl);
			httpUrl = (HttpURLConnection) url.openConnection();
			httpUrl.connect();
			httpUrl.getInputStream();
			is = httpUrl.getInputStream();
			outStream = new ByteArrayOutputStream();
			//创建一个Buffer字符串
			byte[] buffer = new byte[1024];
			//每次读取的字符串长度，如果为-1，代表全部读取完毕
			int len = 0;
			//使用一个输入流从buffer里把数据读取出来
			while ((len = is.read(buffer)) != -1) {
				//用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
				outStream.write(buffer, 0, len);
			}
			// 对字节数组Base64编码
			return Base64Util.encode(outStream.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outStream != null) {
				try {
					outStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (httpUrl != null) {
				httpUrl.disconnect();
			}
		}
		return imgUrl;
	}

	public static void main(String[] args) {
		String base64ByImgUrl = getBase64ByImgUrl("http://00.minipic.eastday.com/20170411/20170411212923_f3b93bece00e4178f3bc684240278d9a_5.jpeg");
		System.out.println(base64ByImgUrl);
	}*/
	//===================================================================================================================
	public static void main(String[] args) {
		String jsonStr = "{\"fileNewUrl\":\"http://localhost:8080/webuploader_Web_exploded/upload\\\\20190426\\\\1556248527755.jpg\",\"message\":\"成功\",\"status\":\"1\",\"fileOriginalName\":\"s28993111.jpg\"}";
		JSONObject parse = (JSONObject) JSONObject.parse(jsonStr);
		System.out.println(parse);
		System.out.println(parse.get("status"));
	}
}
