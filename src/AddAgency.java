import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class AddAgency extends javax.swing.JFrame {
    
    private dbConnection db;
    private int id;
    private String filename = null;
    private String newFilePath;
    private Path originalPath;
    private Path newPath;

    /**
     * Creates new form TalentEdit
     */
    public AddAgency() {
        initComponents();
        db = new dbConnection();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditTitleTalent = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        AgencyLabel = new javax.swing.JLabel();
        DebutLabel = new javax.swing.JLabel();
        FoundedField = new javax.swing.JTextField();
        DescLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescArea = new javax.swing.JTextArea();
        Pict = new javax.swing.JPanel();
        Picture = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        BrowseFile = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        CorpoField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EditTitleTalent.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EditTitleTalent.setText("Add New Agency");

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NameLabel.setText("Name");

        AgencyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgencyLabel.setText("Agency Corporation");

        DebutLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DebutLabel.setText("Founded in");

        DescLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescLabel.setText("Description");

        DescArea.setColumns(20);
        DescArea.setLineWrap(true);
        DescArea.setRows(5);
        DescArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(DescArea);

        Picture.setText("Picture");

        javax.swing.GroupLayout PictLayout = new javax.swing.GroupLayout(Pict);
        Pict.setLayout(PictLayout);
        PictLayout.setHorizontalGroup(
            PictLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PictLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PictLayout.setVerticalGroup(
            PictLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PictLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        BrowseFile.setText("Browse");
        BrowseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseFileActionPerformed(evt);
            }
        });

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DebutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CorpoField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FoundedField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BrowseFile)
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(CancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EditTitleTalent, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(AgencyLabel)
                        .addGap(59, 59, 59)
                        .addComponent(DebutLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FoundedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EditTitleTalent)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameLabel)
                                    .addComponent(DescLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(CorpoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Pict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BrowseFile)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(ConfirmButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseFileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
        chooser.addChoosableFileFilter(fnwf);
        int load = chooser.showOpenDialog(null);
        
        if (load == chooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                
                Image see = ImageIO.read(f);
                Picture.setIcon(new ImageIcon(see.getScaledInstance(Picture.getWidth(), Picture.getHeight(), Image.SCALE_SMOOTH)));
                filename = f.getAbsolutePath();
                BrowseFile.setText(filename);
            } catch (IOException ex) {
                Logger.getLogger(EditTalent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            File directory = new File("src//Images//"); // replace 
            if (!directory.exists()) {
                directory.mkdirs();
            }
            
//          Explode base and ext from original name file img
            String originalBase = f.getName().split("\\.")[0];
            String originalExt = f.getName().split("\\.")[1];
//            ===================================================
            
//          Process of a random generator name file from img file
            String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            StringBuilder salt = new StringBuilder();
            Random rnd = new Random();
            while (salt.length() < 7) { // length of the random string.
                int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                salt.append(SALTCHARS.charAt(index));
            }
            String newBaseName = salt.toString().toLowerCase();
//          =======================================

            originalPath = Paths.get(filename);
            newPath = Paths.get(directory.getPath() + File.separator + newBaseName + "." + originalExt);

            newFilePath = "src//Images//" + newBaseName + "." + originalExt;
        }
    }//GEN-LAST:event_BrowseFileActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:

        String name = NameField.getText();
        String corpo = CorpoField.getText();
        String Found = FoundedField.getText();
        String desc = DescArea.getText();
            
        String sql = "INSERT INTO agency VALUES (NULL,'"+name+"','"+corpo+"','"+Found+"','"+desc+"','" +newFilePath+"')";
        db.updateQuery(sql);
            
        try {
            Files.copy(originalPath, newPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            
        dispose();
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EditTalent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTalent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTalent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTalent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAgency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgencyLabel;
    private javax.swing.JButton BrowseFile;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField CorpoField;
    private javax.swing.JLabel DebutLabel;
    private javax.swing.JTextArea DescArea;
    private javax.swing.JLabel DescLabel;
    private javax.swing.JLabel EditTitleTalent;
    private javax.swing.JTextField FoundedField;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel Pict;
    private javax.swing.JLabel Picture;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}