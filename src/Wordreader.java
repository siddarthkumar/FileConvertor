
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siddarth
 */
public class Wordreader {
    XWPFWordExtractor extractor ;
    public String returnText(String filename)
    {
        XWPFDocument document = null;
		FileInputStream fileInputStream = null;
		try {
 
			
			File fileToBeRead = new File(filename);
			fileInputStream = new FileInputStream(fileToBeRead);
			document = new XWPFDocument(fileInputStream);
			extractor = new XWPFWordExtractor(document);
 
			System.out.println("The Contents of the Word File are ::");
			System.out.println("--------------------------------------");
 
			//System.out.println(extractor.getText());
                       
 
		} catch (Exception e) {
			System.out.println("We had an error while reading the Word Doc");
		} finally {
			try {
				if (document != null) {
					document.close();
				}
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception ex) {
			}
		}
        
        
        
      return extractor.getText();  
     }
    
}
