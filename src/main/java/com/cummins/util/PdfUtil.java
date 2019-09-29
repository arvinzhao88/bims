package com.cummins.util;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
 
import javax.imageio.ImageIO;
 
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

public class PdfUtil {

	static void usage(String error) {
		String msg = "Usage: PPTX2PNG [options] <ppt or pptx file>\n"
				+ (error == null ? "" : ("Error: " + error + "\n")) + "Options:\n"
				+ "    -scale <float>   scale factor\n" + "    -slide <integer> 1-based index of a slide to render\n"
				+ "    -format <type>   png,gif,jpg (,null for testing)"
				+ "    -outdir <dir>    output directory, defaults to origin of the ppt/pptx file"
				+ "    -quiet           do not write to console (for normal processing)";
 
		System.out.println(msg);
		
		// no System.exit here, as we also run in junit tests!
	}
 
	
	public static int toImage2007(String filePath,String saveFilePath) throws Exception {
		
 
		int pagesize = 0;
		
		String slidenumStr = "-1";
		float scale = 1;
		File file = new File(filePath);
		String format = "jpg";
		File outdir =  new File(saveFilePath);
		boolean quiet = false;
 
	
	    if(!outdir.exists())//目录不存在则创建
	    	outdir.mkdirs();
		
		
		if (outdir == null) {
			outdir = file.getParentFile();
		}
		
		FileInputStream is =new FileInputStream(file);
		XMLSlideShow ppt = new XMLSlideShow(is);
		try {
			List<XSLFSlide> slides = ppt.getSlides();
			Set<Integer> slidenum = slideIndexes(slides.size(), slidenumStr);
 
			pagesize = slidenum.size();
 
			Dimension pgsize = ppt.getPageSize();
			int width = (int) (pgsize.width * scale);
			int height = (int) (pgsize.height * scale);
 
			for (Integer slideNo : slidenum) {
				XSLFSlide slide = slides.get(slideNo);
				for (XSLFShape shape : ppt.getSlides().get(slideNo).getShapes()) {
					if (shape instanceof XSLFTextShape) {
						XSLFTextShape tsh = (XSLFTextShape) shape;
						for (XSLFTextParagraph p : tsh) {
							for (XSLFTextRun r : p) {
								r.setFontFamily("宋体");
							}
						}
					}
				}
				String title = slide.getTitle();
				if (!quiet) {
					System.out.println("Rendering slide " + slideNo + (title == null ? "" : ": " + title));
				}
 
				BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				Graphics2D graphics = img.createGraphics();
				DrawFactory.getInstance(graphics).fixFonts(graphics);
 
				// default rendering options
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
				graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
				graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,
						RenderingHints.VALUE_FRACTIONALMETRICS_ON);
 
				graphics.scale(scale, scale);
				// draw stuff
				slide.draw(graphics);
 
				// save the result
				if (!"null".equals(format)) {
					String outname = file.getName().replaceFirst(".pptx?", "");
					//outname = String.format(Locale.ROOT, "%1$s-%2$04d.%3$s", outname, slideNo, format);
					outname = String.format(Locale.ROOT, "%1$01d.%2$s",  slideNo+1, format);
					File outfile = new File(outdir, outname);
					ImageIO.write(img, format, outfile);
				}
 
				graphics.dispose();
				img.flush();
			}
		} finally {
			ppt.close();
			is.close();
		}
 
		return pagesize;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		int aaa = toImage2007("D:\\test\\1.PPTX","D:\\test\\img\\");
		System.out.println(aaa);
		return;
		
	}
 
	private static Set<Integer> slideIndexes(final int slideCount, String range) {
		Set<Integer> slideIdx = new TreeSet<Integer>();
		if ("-1".equals(range)) {
			for (int i = 0; i < slideCount; i++) {
				slideIdx.add(i);
			}
		} else {
			for (String subrange : range.split(",")) {
				String idx[] = subrange.split("-");
				switch (idx.length) {
				default:
				case 0:
					break;
				case 1: {
					int subidx = Integer.parseInt(idx[0]);
					if (subrange.contains("-")) {
						int startIdx = subrange.startsWith("-") ? 0 : subidx;
						int endIdx = subrange.endsWith("-") ? slideCount : Math.min(subidx, slideCount);
						for (int i = Math.max(startIdx, 1); i < endIdx; i++) {
							slideIdx.add(i - 1);
						}
					} else {
						slideIdx.add(Math.max(subidx, 1) - 1);
					}
					break;
				}
				case 2: {
					int startIdx = Math.min(Integer.parseInt(idx[0]), slideCount);
					int endIdx = Math.min(Integer.parseInt(idx[1]), slideCount);
					for (int i = Math.max(startIdx, 1); i < endIdx; i++) {
						slideIdx.add(i - 1);
					}
					break;
				}
				}
			}
		}
		return slideIdx;
	}
}
