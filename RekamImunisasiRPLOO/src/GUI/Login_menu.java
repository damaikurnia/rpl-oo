/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Menu_Utama.java
 *
 * Created on Oct 7, 2012, 2:25:13 PM
 */
package GUI;

import Controller.ControlData;
import Controller.ControlLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author a9uszT
 */
public class Login_menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Utama
     */
    public Login_menu() {
        initComponents();
        ButtonGroup BG = new ButtonGroup();
        BG.add(PetugasRB);
        BG.add(bidan_RB);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        PetugasRB = new javax.swing.JRadioButton();
        bidan_RB = new javax.swing.JRadioButton();
        masuk_button = new javax.swing.JButton();
        password_TF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Sistem Informasi Imunisasi");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 430, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Puskemas Klaten Selatan");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 28));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("JL. Perjuangan 12, Glodogan, Klaten Selatan");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/puskemas.jpg"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 160));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Login");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Use ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Login as");

        PetugasRB.setBackground(new java.awt.Color(51, 255, 0));
        PetugasRB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PetugasRB.setText("Petugas");

        bidan_RB.setBackground(new java.awt.Color(51, 255, 0));
        bidan_RB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bidan_RB.setText("Bidan");

        masuk_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masuk_button.setText("Masuk");
        masuk_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PetugasRB)
                                    .addComponent(bidan_RB)
                                    .addComponent(password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(masuk_button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(PetugasRB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bidan_RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(masuk_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void masuk_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_buttonActionPerformed
        String id = usernameTF.getText();
        String passwd = password_TF.getText();
        if (PetugasRB.isSelected()) {
            if (usernameTF.getText().equals("") && password_TF.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Username dan Password belum terisi.");
            } else {
                try {
                    boolean cek = ControlLogin.getKoneksi().LoginPetugas(id, passwd);
                    if (cek == true) {
                        Frame_petugas FP = new Frame_petugas();
                        FP.setVisible(true);
                        emptyField();
                        String nama = ControlData.getKoneksi().cariPegawai(id);
                        FP.label_petugas.setText(nama);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Username dan Password Petugas salah.");
                        emptyField();
                        usernameTF.requestFocus();

                    }
                } catch (Exception ex) {
                    Logger.getLogger(Login_menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if ((bidan_RB.isSelected())) {
            if (usernameTF.getText().equals("") && password_TF.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Username dan Password belum terisi.");
            } else {
                try {
                    boolean cek = ControlLogin.getKoneksi().LoginBidan(id, passwd);
                    if (cek == true) {
                        Frame_bidan FP = new Frame_bidan();
                        FP.setVisible(true);
                        emptyField();
//                    FP.setMenuowner(this);
                        emptyField();
//                    FP.setMenuowner(this);
                        this.dispose();
                        String nama = ControlData.getKoneksi().cariBidan(id);
                        FP.label_Bidan.setText(nama);
//                    this.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Username dan Password Bidan salah.");
                        emptyField();
                        usernameTF.requestFocus();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Login_menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            if (usernameTF.getText().equals("") && password_TF.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Username dan Password belum terisi.");
            }
        }
    }//GEN-LAST:event_masuk_buttonActionPerformed
    private void emptyField() {
        usernameTF.setText("");
        password_TF.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login_menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PetugasRB;
    private javax.swing.JRadioButton bidan_RB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton masuk_button;
    private javax.swing.JPasswordField password_TF;
    public static javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
