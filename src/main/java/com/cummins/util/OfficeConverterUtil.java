/*
package com.cummins.util;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class OfficeConverterUtil {

	
	public static final int PPT_SAVEAS_JPG = 17;
	
	
	
	*/
/*public static boolean officeFileConverterToPdf(String argInputFilePath, String argPdfPath) {
		if (argInputFilePath.isEmpty() || argPdfPath.isEmpty() || getFileSufix(argInputFilePath).isEmpty()) {
			logger.debug("输入或输出文件路徑有誤！");
			return false;
		}
 
		String suffix = getFileSufix(argInputFilePath);
 
		File file = new File(argInputFilePath);
		if (!file.exists()) {
			logger.debug("文件不存在！");
			return false;
		}
 
		// PDF如果不存在则创建文件夹
		file = new File(getFilePath(argPdfPath));
		if (!file.exists()) {
			file.mkdir();
		}
 
		// 如果输入的路径为PDF 则生成失败
		if (suffix.equals("pdf")) {
			System.out.println("PDF not need to convert!");
			return false;
		}
 
		if (suffix.equals("doc") || suffix.equals("docx") || suffix.equals("txt")) {
			return wordToPDF(argInputFilePath, argPdfPath);
		} else if (suffix.equals("xls") || suffix.equals("xlsx")) {
			return excelToPdf(argInputFilePath, argPdfPath);
		} else if (suffix.equals("ppt") || suffix.equals("pptx")) {
			return pptToPdf(argInputFilePath, argPdfPath);
			// return ppt2PDF(argInputFilePath, argPdfPath);
		}
 
		return false;
	}*//*


	
	*/
/**
	 * ppt to pdf
	 * 
	 * @param inputFile
	 * @param pdfFile
	 * @return
	 *//*

	public static boolean pptToPdf(String inputFile, String pdfFile) {
//		ComThread.InitSTA();
		ActiveXComponent activeXComponent = new ActiveXComponent("PowerPoint.Application");
//		activeXComponent.setProperty("Visible", new Variant(false));
		Dispatch ppts = activeXComponent.getProperty("Presentations").toDispatch();
 
		//deletePdf(pdfFile);
 
		Dispatch ppt = Dispatch.call(ppts, "Open", inputFile, false, // ReadOnly
				true, // Untitled指定文件是否有标题
				true// WithWindow指定文件是否可见
		).toDispatch();
 
//		Dispatch ppt = Dispatch.invoke(ppts, "Open", Dispatch.Method, new Object[] { inputFile, new Variant(false), new Variant(true) }, new int[1]).toDispatch();
 
//		Dispatch.call(ppt, "SaveAs", pdfFile, PPT_SAVEAS_PDF);
//		Dispatch.call(ppt, "SaveAs", pdfFile, new Variant(PPT_SAVEAS_PDF));
//		Dispatch.call(ppt, "SaveAs", pdfFile, new Variant(PPT_SAVEAS_PDF));
//		Dispatch.invoke(ppt, "SaveAs", Dispatch.Method, new Object[] { pdfFile, PPT_SAVEAS_PDF }, new int[1]);
//		Dispatch.invoke(ppt, "SaveAs", Dispatch.Method, new Object[] { new Variant(PPT_SAVEAS_PDF) }, new int[1]);
		Dispatch.callN(ppt, "SaveAs",  new Variant(pdfFile));
		
		Dispatch.call(ppt, "Close");
 
		activeXComponent.invoke("Quit");
//		ComThread.Release();
		return true;
	}
 
	*/
/**
	 * ppt to img
	 * 
	 * @param inputFile
	 * @param imgFile
	 * @return
	 *//*

	public static boolean pptToImg(String inputFile, String imgFile) {
		// 打开word应用程序
		ActiveXComponent app = new ActiveXComponent("PowerPoint.Application");
		// 设置word不可见，office可能有限制
		// app.setProperty("Visible", false);
		// 获取word中国所打开的文档，返回Documents对象
		Dispatch files = app.getProperty("Presentations").toDispatch();
		// 调用Documents对象中Open方法打开文档，并返回打开的文档对象Document
		Dispatch file = Dispatch.call(files, "open", inputFile, true, true, false).toDispatch();
		// 调用Document对象的SaveAs方法，将文档保存为pdf格式
		// Dispatch.call(doc, "ExportAsFixedFormat", outputFile,
		// PPT_TO_PDF);
		Dispatch.call(file, "SaveAs", imgFile, PPT_SAVEAS_JPG);
		// 关闭文档
		// Dispatch.call(file, "Close", false);
		Dispatch.call(file, "Close");
		// 关闭word应用程序
		// app.invoke("Quit", 0);
		app.invoke("Quit");
		return true;
	}
	
	
	
	public static void main(String[] args) {
		pptToImg ("D:\\test\\1.PPTX","D:\\test\\1546583839294\\11.jpg");
	}



}
*/
