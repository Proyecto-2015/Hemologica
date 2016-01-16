package org.hemologica.salud.web.oms;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class FooterAndHeader extends PdfPageEventHelper{
	
	 Font ffont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.ITALIC);
      
	 public void onStartPage(PdfWriter writer,Document document) {

		Rectangle rect = writer.getBoxSize("art"); 
		 
		PdfPTable table = new PdfPTable(2);
		table.setTotalWidth(110); 
		 
    	Image img;
 		try {

 			table.setWidths(new float[]{1,3});
 			
 			URL imagePath = FooterAndHeader.class.getResource("/img/hemologica-logo-6.png");
 			
 			img = Image.getInstance(imagePath.getPath());
 			img.scaleToFit(20,20);
 			
 			PdfPCell cell = new PdfPCell();
 			cell.setBorder(Rectangle.NO_BORDER);
 			cell.addElement(new Chunk(img, 0, 0));
 			cell.setFixedHeight(35f);
 			table.addCell(cell);
 			
 			PdfPCell cellText = new PdfPCell();
 			cellText.setBorder(Rectangle.NO_BORDER);
 			cellText.addElement(new Chunk("Hemologica"));
 			cellText.setFixedHeight(45f);
 			table.addCell(cellText);
 			
 			table.writeSelectedRows(0, -1, 36, 830, writer.getDirectContent());
 			
 			
 			document.add(Chunk.NEWLINE);
 			
 	         
 		} catch (BadElementException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (MalformedURLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (DocumentException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	
	 }
    	 
	public void onEndPage(PdfWriter writer,Document document) {
		
		Rectangle rect = writer.getBoxSize("art");
		
		PdfPTable table = new PdfPTable(3);
		table.setTotalWidth(160);
        
		Image imgFing, imgUdelar, imgNib;
 		try {

 			table.setWidths(new float[]{2, 1, 1});
 			
 			URL UrlUdelar = FooterAndHeader.class.getResource("/img/udelar-logo.jpg");
 			URL UrlFing = FooterAndHeader.class.getResource("/img/fing-logo.jpg");
 			URL UrlNib = FooterAndHeader.class.getResource("/img/nib-logo.jpg");

 			if(UrlNib != null){
 				
	 			imgNib = Image.getInstance(UrlNib.getPath());
	 					 		
	 			PdfPCell cell = new PdfPCell();
	 			cell.setBorder(Rectangle.NO_BORDER);
	 			cell.addElement(new Chunk(imgNib, 0, rect.getBottom() - 18));
	 			cell.setFixedHeight(30f);
	 			table.addCell(cell);
	 			
 			}
 			
 			if(UrlFing != null){
 				
	 			imgFing = Image.getInstance(UrlFing.getPath());
	 			imgFing.scaleToFit(140,140);
	 			
	 			PdfPCell cell = new PdfPCell();
	 			cell.setBorder(Rectangle.NO_BORDER);
	 			cell.addElement(new Chunk(imgFing, 0, rect.getBottom() - 18));
	 			cell.setFixedHeight(45f);
	 			table.addCell(cell);
	 			
 			}

 			if(UrlUdelar != null){
 				
	 			imgUdelar = Image.getInstance(UrlUdelar.getPath());
	 			imgUdelar.scaleToFit(145,145);
	 			
	 			PdfPCell cell = new PdfPCell();
	 			cell.setBorder(Rectangle.NO_BORDER);
	 			cell.addElement(new Chunk(imgUdelar, 0, rect.getBottom() - 18));
	 			cell.setFixedHeight(45f);
	 			table.addCell(cell);
 			}	
 			
 			
 			table.writeSelectedRows(0, -1, 36, 12, writer.getDirectContent());	 			
 	         
 		} catch (BadElementException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (MalformedURLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (DocumentException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
		
	}
    	 
    	 
//    	 PdfPTable table = new PdfPTable(1);
//    	 
//    	 table.setTotalWidth( document.right() - document.left());
//    	 
////    	 table.setWidthPercentage(100);
//
//         PdfPCell cell = new PdfPCell();
//        
//         Phrase phrase = new Phrase("This is a test document");
//         cell.addElement(phrase);
//         cell.setBorder(Rectangle.NO_BORDER);
//         table.addCell(cell);
//         
//    	 
//        Image img;
//		try {
//			
//			img = Image.getInstance("/Users/paularoche/Documents/Git/Hemologica/Hemologica-Salud-Frontend/Hemologica-Salud-Frontend-web/src/main/webapp/resources/img/hemologica-logo-6.png");
//			img.scaleToFit(100,100);
//			
//			cell.addElement(img);
//			
//			 table.writeSelectedRows(0, -1,  document.leftMargin(),
//		               document.top(), writer.getDirectContent());
//	         
//		} catch (BadElementException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
         
//         ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
//                 footer,
//                 (document.right() - document.left()) / 2 + document.leftMargin(),
//                 document.bottom() - 10, 0);
//     }

}
