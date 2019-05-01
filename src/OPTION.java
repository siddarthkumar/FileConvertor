
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siddarth
 */
public class OPTION extends javax.swing.JFrame {

    /**
     * Creates new form OPTION
     */
    public OPTION() {
        initComponents();
        this.setResizable(true);
        
        this.dial.setPreferredSize(this.getSize());
        //this.pack();>I
        ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        alpha = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo1.setBackground(new java.awt.Color(255, 255, 255));
        combo1.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        combo1.setForeground(new java.awt.Color(0, 0, 0));
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".TXT", ".DOC", ".DOCX", ".PDF" }));
        getContentPane().add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 170, 40));

        combo2.setBackground(new java.awt.Color(255, 255, 255));
        combo2.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        combo2.setForeground(new java.awt.Color(0, 0, 0));
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".TXT", ".DOC", ".DOCX", ".PDF" }));
        getContentPane().add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 160, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 170, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Microsoft Himalaya", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 150, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("DialogInput", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BROWSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 150, 40));

        alpha.setBackground(new java.awt.Color(255, 255, 255));
        alpha.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        alpha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(alpha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 210, 40));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("GIVE IT A NAME");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 210, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     WELCOME TO THE DRAGON CORPSE  !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 750, 40));

        dial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lg-leverage-of-coding.jpg"))); // NOI18N
        getContentPane().add(dial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
String s;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          JFileChooser cho = new JFileChooser();
      cho.showOpenDialog(null);
      File f = cho.getSelectedFile();
      String fname =f.getAbsolutePath();
         s = fname;
        alpha.setText(s);System.out.println(s);
    }//GEN-LAST:event_jButton3ActionPerformed
 BufferedWriter bw = null;
  FileWriter fw = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String extension = getFileExtension(new File(alpha.getText()));
 if(extension.equalsIgnoreCase(".txt")==true && combo2.getSelectedItem().toString().equalsIgnoreCase(".pdf")==true){System.out.println(extension);
 
 Document doc = new Document();

    try {
         String snm = name.getText();
                    String sbm2 = snm.concat(".pdf");
PdfWriter pdf = PdfWriter.getInstance(doc,new FileOutputStream(sbm2));
doc.open();
             Readfile rf = new Readfile();
         try {
            List<String> lines = rf.readLines(alpha.getText());
            for (String line : lines) {
                System.out.println(line);
                 doc.add(new Paragraph(line));}
                            JOptionPane.showMessageDialog(null,"created successfully Opening...");
               if (Desktop.isDesktopSupported()) {
    try {
                   
                    File myFile = new File(sbm2);
                    Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                    ex.printStackTrace(); 
                                        }
                                                }
		doc.close();
		pdf.close(); 
            
            
        } catch (Exception e) {
            // Print out the exception that occurred
            System.out.println(e.getMessage());  
        }
           
    }catch(Exception e)
    {e.getMessage();}
 }
 else if(extension.equalsIgnoreCase(".docx")==true && combo2.getSelectedItem().toString().equalsIgnoreCase(".txt")==true){System.out.println(extension);

 if (Desktop.isDesktopSupported()) {
try{
 Wordreader read = new Wordreader();
 System.out.println(read.returnText(alpha.getText()));
 fw = new FileWriter(name.getText().concat(".txt"));
    bw =new BufferedWriter(fw);
    String s = name.getText().concat(".txt");
   bw .write(read.returnText(alpha.getText()));
    JOptionPane.showMessageDialog(null,"Successfully written opening ....! please press ok");
      File myFile = new File(name.getText().concat(".txt"));
                    Desktop.getDesktop().open(myFile);
}catch(Exception e)
{JOptionPane.showMessageDialog(null,e);}
finally{
 	try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
   
      
  
 
 }
 } 
 
 }
 else if(extension.equalsIgnoreCase(".txt")==true && combo2.getSelectedItem().toString().equalsIgnoreCase(".docx")==true){System.out.println(extension);
WordGenerator wg = new WordGenerator();
     Readfile rf = new Readfile();
         try {
            List<String> lines = rf.readLines(alpha.getText());
           
            for (String line : lines) {
               // System.out.println(line);
                 } 
          String sn= wg.createWord(lines,name.getText());
          JOptionPane.showMessageDialog(null,"created Successfully");   
                        if (Desktop.isDesktopSupported()) {
    try {
                   
                    File myFile = new File(sn);
                    Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                    ex.printStackTrace(); 
                                        }
   
                        }
         }catch(Exception e)
                  {
                  JOptionPane.showMessageDialog(null,e.getMessage());     
                    }
 } else if(extension.equalsIgnoreCase(".pdf")==true && combo2.getSelectedItem().toString().equalsIgnoreCase(".txt")==true){System.out.println(extension);
  PdfReader reader ;
  try{
      
  reader = new PdfReader(alpha.getText());
   String content  = PdfTextExtractor.getTextFromPage(reader, 1);
    System.out.println(content);
    fw = new FileWriter(name.getText().concat(".txt"));
    bw =new BufferedWriter(fw);
    String s = name.getText().concat(".txt");
   bw .write(content);
    JOptionPane.showMessageDialog(null,"Successfully written opening ....! please press ok");
    
      if (Desktop.isDesktopSupported()) {
    try {
                   
                    File myFile = new File(s);
                    Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                    ex.printStackTrace(); 
                                        }
   
                        }
      reader.close();
         }catch(Exception e)
                  {
                  JOptionPane.showMessageDialog(null,e.getMessage());     
                    }
 }
 else if(extension.equalsIgnoreCase(".pdf")==true && combo2.getSelectedItem().toString().equalsIgnoreCase(".docx")==true)
 {  WordGenerator wg = new WordGenerator();
    System.out.println(extension);
     PdfReader reader ;
  try{
      
  reader = new PdfReader(alpha.getText());
   String content  = PdfTextExtractor.getTextFromPage(reader, 1);
    System.out.println(content);
    ArrayList al = new ArrayList();
    al.add(content);
  String sno = wg.createWord(al,name.getText());
 
    JOptionPane.showMessageDialog(null,"Successfully written opening ....! please press ok");
    
      if (Desktop.isDesktopSupported()) {
    try {
                   
                    File myFile = new File(sno);
                    Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                    ex.printStackTrace(); 
                                        }
   
                        }
      reader.close();
         }catch(Exception e)
                  {
                  JOptionPane.showMessageDialog(null,e.getMessage());     
                    }
  finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();
			}
            }
 }
 else if(extension.equalsIgnoreCase(".docx")==true && combo2.getSelectedItem().toString().equalsIgnoreCase(".pdf")==true){
 System.out.println(extension);
 Document doc = new Document();

    try {
         String snm = name.getText();
                    String sbm2 = snm.concat(".pdf");
PdfWriter pdf = PdfWriter.getInstance(doc,new FileOutputStream(sbm2));
doc.open();
            Wordreader read = new Wordreader();
 System.out.println(read.returnText(alpha.getText()));
                 doc.add(new Paragraph(read.returnText(alpha.getText())));
                            JOptionPane.showMessageDialog(null,"created successfully Opening...");
               if (Desktop.isDesktopSupported()) {
    try {
                   
                    File myFile = new File(sbm2);
                    Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                    ex.printStackTrace(); 
                                        }
                                                }
		doc.close();
		pdf.close(); 
            
            
       
           
    }catch(Exception e)
    {e.getMessage();}
 }
 else{System.out.println("error in file detecting");JOptionPane.showMessageDialog(null,"Could not Detect File !");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
     private static String getFileExtension(File file) {
        String extension = "";
 
        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
            }
        } catch (Exception e) {
            extension = "";
        }
 
        return extension;
 
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPTION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alpha;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel dial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}