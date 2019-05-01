/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siddarth
 * 
 */
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
public class WordGenerator {
      //Get lines from text file
    public List<String> getLines (String fileName) throws Exception {
        //ReadFile instance
        Readfile rf = new Readfile();
 
        //Read the text
        try {
            List<String> lines = rf.readLines(fileName);
            for (String line : lines) {
                System.out.println(line);
            }
            return lines;
        } catch (IOException e) {
            // Print out the exception that occurred
            System.out.println("Unable to create " + fileName + ": " + e.getMessage());
            throw e;
        }
    }
 
    //Create Word
    public String createWord(List<String> lines,String str) throws IOException {
      
        
            //Write the Document in file system
            String ext= ".docx";
           
        
   XWPFDocument document = new XWPFDocument();
    OutputStream out = new FileOutputStream(
                    new File(str.concat(ext)));
             XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText(lines.toString());
            document.write(out);      
        System.out.println("createdWord" + "_" + str.concat(ext) + " written successfully");
            String s = str.concat(ext);
              System.out.println(s);
              return s;
    }
    
}
