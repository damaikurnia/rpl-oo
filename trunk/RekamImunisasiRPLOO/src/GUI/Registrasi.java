/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author a9uszT
 */
public class Registrasi extends javax.swing.JFrame {

    /**
     * Creates new form Registrasi
     */
    public Registrasi() {
        initComponents();
//        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//        this.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                disable();
//            }
//        });
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
        jPanel3 = new javax.swing.JPanel();
        pasien_baru_button = new javax.swing.JButton();
        pasien_lama_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idpetugasTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        keluar_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrasi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        pasien_baru_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pasien_baru_button.setText("Pasien baru");
        pasien_baru_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasien_baru_buttonActionPerformed(evt);
            }
        });

        pasien_lama_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pasien_lama_button.setText("Pasien Lama");
        pasien_lama_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasien_lama_buttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Pilih status pasien :");

        logout_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout_button.setText("keluar");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(pasien_lama_button, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(pasien_baru_button, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel4)))
                        .addGap(0, 206, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasien_baru_button, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasien_lama_button, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Sistem Informasi Imunisasi");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 430, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Puskemas Klaten Selatan");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 28));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("JL. Perjuangan 12, Glodogan, Klaten Selatan");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/puskemas.jpg"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 160));

        idpetugasTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idpetugasTF.setEnabled(false);
        idpetugasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpetugasTFActionPerformed(evt);
            }
        });
        jPanel4.add(idpetugasTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 44, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("idPetugas");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, 20));

        keluar_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        keluar_button.setText("logout");
        keluar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(keluar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void pasien_baru_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasien_baru_buttonActionPerformed
        Registrasi_baru rb = new Registrasi_baru();
        rb.setVisible(true);
        rb.idpetugasTF.setText(idpetugasTF.getText());
        this.dispose();
    }//GEN-LAST:event_pasien_baru_buttonActionPerformed

    private void pasien_lama_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasien_lama_buttonActionPerformed
        Pasien_lama pl = new Pasien_lama();
        pl.setVisible(true);
        pl.idpetugasTF.setText(idpetugasTF.getText());
        this.dispose();
    }//GEN-LAST:event_pasien_lama_buttonActionPerformed

    private void idpetugasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpetugasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpetugasTFActionPerformed

    private void keluar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_buttonActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "yakin keluar", "exit", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            JOptionPane.showMessageDialog(rootPane, "selesai ");
           this.dispose();
           Frame_petugas fp=new Frame_petugas();
           fp.dispose();
            Login_menu lm=new Login_menu();
            lm.setVisible(true);
        }
    }//GEN-LAST:event_keluar_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "yakin keluar", "exit", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            JOptionPane.showMessageDialog(rootPane, "selesai ");
            this.dispose();
            Frame_petugas lm=new Frame_petugas();
            lm.setVisible(true);
        }
    }//GEN-LAST:event_logout_buttonActionPerformed
    @Override
    public void disable() {
        Menuowner.setEnabled(true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi().setVisible(true);
            }
        });
    }
    private Frame_petugas Menuowner;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField idpetugasTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton keluar_button;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton pasien_baru_button;
    private javax.swing.JButton pasien_lama_button;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the Menuowner
     */
    public Frame_petugas getMenuowner() {
        return Menuowner;
    }

    /**
     * @param Menuowner the Menuowner to set
     */
    public void setMenuowner(Frame_petugas Menuowner) {
        this.Menuowner = Menuowner;
    }
}
