/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication14;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author yash
 */
public class encoded_frame extends javax.swing.JFrame {
     BufferedImage sourceImage = null, EmbeddedImage = null;
    /**
     * Creates new form encoded_frame
     */
    public encoded_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelsourceimage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelembedded = new javax.swing.JLabel();
        jButtonopen = new javax.swing.JButton();
        jButtonembed = new javax.swing.JButton();
        jButtonsave = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(317, 152));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(903, 525));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("MESSAGE"));

        jTextMessage.setColumns(20);
        jTextMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextMessage.setRows(5);
        jScrollPane1.setViewportView(jTextMessage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 790, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SOURCE IMAGE"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelsourceimage, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelsourceimage, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 249, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("EMBEDDED IMAGE"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelembedded, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelembedded, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 247, 380, 240));

        jButtonopen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open.png"))); // NOI18N
        jButtonopen.setText("OPEN");
        jButtonopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonopenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonopen, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 495, 100, 30));

        jButtonembed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonembed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock.png"))); // NOI18N
        jButtonembed.setText("EMBED");
        jButtonembed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonembedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonembed, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 495, -1, 30));

        jButtonsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButtonsave.setText("SAVE");
        jButtonsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 495, 100, 30));

        jButtonreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reset'.png"))); // NOI18N
        jButtonreset.setText("RESET");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 495, 100, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 495, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private File showFileDialog(final boolean open){
        JFileChooser fc=new JFileChooser("open an image");
        FileFilter filefilter=new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name =file.getName().toLowerCase();
                if(open){
                     return file.isDirectory() || name.endsWith(".jpg") || name.endsWith(".jpeg") ||
                name.endsWith(".png") || name.endsWith(".gif") || name.endsWith(".tiff") ||
                name.endsWith(".bmp") || name.endsWith(".dib");
                }
                return file.isDirectory() || name.endsWith(".png") ||    name.endsWith(".bmp");
            }
            @Override
            public String getDescription(){
                if(open)
                   return "Image (*.jpg, *.jpeg, *.png, *.gif, *.tiff, *.bmp, *.dib)";
                return "Image (*.png, *.bmp)";
            }
        };
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filefilter);
        File file=null;
        if(open && fc.showOpenDialog(this) == fc.APPROVE_OPTION)
            file = fc.getSelectedFile();
        else if(!open && fc.showSaveDialog(this) == fc.APPROVE_OPTION)
            file = fc.getSelectedFile();
    return file;
    }
    private void jButtonopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonopenActionPerformed
        // TODO add your handling code here:
        File file=showFileDialog(true);
        
        if(file==null){
            return;
        }
         try {
             sourceImage=ImageIO.read(file);
             jLabelsourceimage.setIcon(new ImageIcon(sourceImage.getScaledInstance(jLabelsourceimage.getWidth(), jLabelsourceimage.getHeight(), sourceImage.SCALE_SMOOTH)));
             this.validate();
         } catch (IOException ex) {
            ex.printStackTrace();
         }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonopenActionPerformed

    private void jButtonembedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonembedActionPerformed
        // TODO add your handling code here:
        if(jTextMessage.equals("")||sourceImage==null){
            JOptionPane.showMessageDialog(this, "No Message has been embedded","No Picture or Message Found",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String Message=jTextMessage.getText();
        EmbeddedImage =sourceImage.getSubimage(0,0,sourceImage.getWidth(),sourceImage.getHeight());
        embeddedMessage(EmbeddedImage,Message);
        
        jLabelembedded.setIcon(new ImageIcon(EmbeddedImage.getScaledInstance(jLabelsourceimage.getWidth(), jLabelsourceimage.getHeight(), EmbeddedImage.SCALE_SMOOTH)));
        this.validate();
        
    }//GEN-LAST:event_jButtonembedActionPerformed

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        // TODO add your handling code here:
        
        jTextMessage.setText("");
        sourceImage=null;
        EmbeddedImage=null;
        jLabelembedded.setIcon(null);
        jLabelsourceimage.setIcon(null);
        
        
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void jButtonsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsaveActionPerformed
        if(EmbeddedImage==null){
            JOptionPane.showMessageDialog(this, "NO MESSAGE HAS BEEN EMBEDDED","nothing to save",JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            File file=showFileDialog(false);
            if(file==null){
                return;
            }
             String name=file.getName();
        String Extension =name.substring(name.lastIndexOf(".")+1).toLowerCase();
        if(!Extension.equals("png") && !Extension.equals("bmp")){
            Extension="png";
            file=new File(file.getAbsoluteFile()+".png");
        }
        
        if(file.exists()) file.delete();
            try {
                ImageIO.write(EmbeddedImage,Extension.toUpperCase(),file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
       
        
        
    }//GEN-LAST:event_jButtonsaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Really want to Go Back");
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void embeddedMessage(BufferedImage img,String mess){
        int messageLength=mess.length();
        int imageWidth=img.getWidth(),imageHeight=img.getHeight();
        int imageSize = imageWidth * imageHeight;
          if(messageLength * 8 + 32 > imageSize) {
       JOptionPane.showMessageDialog(this, "Message is too long for the chosen image",
          "Message too long!", JOptionPane.ERROR_MESSAGE);
       return;
       }
          else{
               embedInteger(img, messageLength, 0, 0);
               byte b[]=mess.getBytes();
               for(int i=0;i<b.length;i++){
              embedByte(img,b[i],i*8+32,0);
          }
          }
    }
    private void embedInteger(BufferedImage img, int n, int start, int storageBit){
            int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
             for(int i=startX; i<maxX && count<32; i++){
                       for(int j=startY; j<maxY && count<32; j++){
                            int rgb = img.getRGB(i, j), bit = getBitValue(n, count);
                             rgb = setBitValue(rgb, storageBit, bit);
                                                img.setRGB(i, j, rgb);
                                        count++;
                       }
             }
    }
    private void embedByte(BufferedImage img, byte b, int start, int storageBit){
         int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
         for(int i=startX; i<maxX && count<8; i++) {
       for(int j=startY; j<maxY && count<8; j++) {
          int rgb = img.getRGB(i, j), bit = getBitValue(b, count);
          rgb = setBitValue(rgb, storageBit, bit);
          img.setRGB(i, j, rgb);
          count++;
          }
       }
    }
    private int getBitValue(int n, int location){
         int v =  (int) (n & Math.round(Math.pow(2, location)));
    return v==0?0:1;
    }
    private int setBitValue(int n,int location,int bit){
         int toggle = (int) Math.pow(2, location), bv = getBitValue(n, location);
    if(bv == bit)
       return n;
    if(bv == 0 && bit == 1)
       n |= toggle;
    else if(bv == 1 && bit == 0)
       n ^= toggle;
    return n;
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(encoded_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encoded_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encoded_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encoded_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encoded_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonembed;
    private javax.swing.JButton jButtonopen;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JButton jButtonsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelembedded;
    private javax.swing.JLabel jLabelsourceimage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextMessage;
    // End of variables declaration//GEN-END:variables
}
