package com.cummins.util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.poi.hslf.usermodel.HSLFShape;
import org.apache.poi.hslf.usermodel.HSLFSlideShow;
import org.apache.poi.hslf.usermodel.HSLFSlideShowImpl;
import org.apache.poi.hslf.usermodel.HSLFTextParagraph;
import org.apache.poi.hslf.usermodel.HSLFTextRun;
import org.apache.poi.hslf.usermodel.HSLFTextShape;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

public class PdfUtils {

	public static void main(String[] args) throws Exception {
		toImage2007("D:/test.pptx","D:\\java-project-2\\filepath\\test");
		//toImage2003();

	}

	public static int toImage2007(String filePath,String saveFilePath) throws Exception {
		FileInputStream is = new FileInputStream(filePath);
		XMLSlideShow ppt = new XMLSlideShow(is);
		is.close();

		Dimension pgsize = ppt.getPageSize();
		System.out.println(pgsize.width + "--" + pgsize.height);

		int pageSize = ppt.getSlides().size();
		
		for (int i = 0; i < ppt.getSlides().size(); i++) {
			try {
				// 防止中文乱码
				for (XSLFShape shape : ppt.getSlides().get(i).getShapes()) {
					if (shape instanceof XSLFTextShape) {
						XSLFTextShape tsh = (XSLFTextShape) shape;
						for (XSLFTextParagraph p : tsh) {
							for (XSLFTextRun r : p) {
								r.setFontFamily("宋体");
							}
						}
					}
				}
				BufferedImage img = new BufferedImage(pgsize.width, pgsize.height, BufferedImage.TYPE_INT_RGB);
				Graphics2D graphics = img.createGraphics();
				// clear the drawing area
				graphics.setPaint(Color.white);
				graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));

				// render
				ppt.getSlides().get(i).draw(graphics);

				File dir = new File(saveFilePath);
			    if(!dir.exists())//目录不存在则创建
			         dir.mkdirs();
			        
			        
				// save the output
				String filename = saveFilePath+"/" + (i + 1) + ".jpg";
				System.out.println(filename);
				FileOutputStream out = new FileOutputStream(filename);
				javax.imageio.ImageIO.write(img, "png", out);
				out.close();
			} catch (Exception e) {
				System.out.println("第" + i + "张ppt转换出错");
			}
		}
		return pageSize;
		//System.out.println("7success");
	}

	public static int toImage2003(String filePath,String saveFilePath){
		int pageSize = 0;
		try {
			HSLFSlideShow ppt = new HSLFSlideShow(new HSLFSlideShowImpl(filePath));

			Dimension pgsize = ppt.getPageSize();
			
			pageSize = ppt.getSlides().size();
			for (int i = 0; i < ppt.getSlides().size(); i++) {
				// 防止中文乱码
				for (HSLFShape shape : ppt.getSlides().get(i).getShapes()) {
					if (shape instanceof HSLFTextShape) {
						HSLFTextShape tsh = (HSLFTextShape) shape;
						for (HSLFTextParagraph p : tsh) {
							for (HSLFTextRun r : p) {
								r.setFontFamily("宋体");
							}
						}
					}
				}
				BufferedImage img = new BufferedImage(pgsize.width, pgsize.height, BufferedImage.TYPE_INT_RGB);
				Graphics2D graphics = img.createGraphics();
				// clear the drawing area
				graphics.setPaint(Color.white);
				graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));

				// render
				ppt.getSlides().get(i).draw(graphics);
				File dir = new File(saveFilePath);
			    if(!dir.exists())//目录不存在则创建
			         dir.mkdirs();
				// save the output
			    String filename = saveFilePath+"/" + (i + 1) + ".jpg";
				System.out.println(filename);
				FileOutputStream out = new FileOutputStream(filename);
				javax.imageio.ImageIO.write(img, "png", out);
				out.close();
				// resizeImage(filename, filename, width, height);

			}
			return pageSize;
			//System.out.println("3success");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return pageSize;
	}

	/***
	 * 功能 :调整图片大小
	 * 
	 * @param srcImgPath
	 *            原图片路径
	 * @param distImgPath
	 *            转换大小后图片路径
	 * @param width
	 *            转换后图片宽度
	 * @param height
	 *            转换后图片高度
	 */
	public static void resizeImage(String srcImgPath, String distImgPath, int width, int height) throws IOException {

		File srcFile = new File(srcImgPath);
		Image srcImg = ImageIO.read(srcFile);
		BufferedImage buffImg = null;
		buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		buffImg.getGraphics().drawImage(srcImg.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);

		ImageIO.write(buffImg, "JPEG", new File(distImgPath));

	}

}
