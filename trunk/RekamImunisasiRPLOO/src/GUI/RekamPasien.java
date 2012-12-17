/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.ControlData;
import Data.PasienData;
import Data.RekamImunisasiData;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelModel.CariPasienLamaTableModel;
import tabelModel.RekamImunTableModel;

/**
 * rplt
 *
 * @author a9uszT
 */
public class RekamPasien extends javax.swing.JFrame {

    /**
     * Creates new form RekamPasien
     */
    public RekamPasien() {
        initComponents();
        tampilTable();
        tampilTableCari();
        jInternalFrame1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pencarian_TF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_cari = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rekamImun_table = new javax.swing.JTable();
        input_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        idpasienTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        namaPasienTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        idpetugasTF = new javax.swing.JTextField();
        namaPegawaiTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        namaOrtuTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Pencarian Data Anak");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Key");

        pencarian_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pencarian_TFKeyReleased(evt);
            }
        });

        tabel_cari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idPasien", "Nama pasien", "Tanggal Lahir", "Nama Orang Tua"
            }
        ));
        tabel_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_cariMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_cari);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(pencarian_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pencarian_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 700, 370));

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rekam Imunisasi Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(240, 240, 240))); // NOI18N

        rekamImun_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id Rekam Imunisasi", "jenis Imunisasi", "Tanggal Imunisasi", "Tinggi Badan", "Berat Badan"
            }
        ));
        jScrollPane1.setViewportView(rekamImun_table);

        input_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        input_button.setText("input data");
        input_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_buttonActionPerformed(evt);
            }
        });

        exit_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit_button.setText("Keluar");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(input_button, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 720, 370));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Sistem Informasi Imunisasi");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 430, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Puskemas Klaten Selatan");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 28));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("JL. Perjuangan 12, Glodogan, Klaten Selatan");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/puskemas.jpg"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 160));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        jPanel5.setBackground(new java.awt.Color(102, 255, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identitas Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18), new java.awt.Color(240, 240, 240))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("idPasein");

        idpasienTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpasienTFActionPerformed(evt);
            }
        });
        idpasienTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idpasienTFKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("nama Anak");

        namaPasienTF.setEnabled(false);
        namaPasienTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPasienTFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("idPetugas/Nama");

        idpetugasTF.setEnabled(false);
        idpetugasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpetugasTFActionPerformed(evt);
            }
        });

        namaPegawaiTF.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("nama Orang Tua");

        namaOrtuTF.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(idpasienTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(idpetugasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaPegawaiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaPasienTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaOrtuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(idpetugasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(namaPegawaiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(idpasienTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaPasienTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaOrtuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 730, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void input_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_buttonActionPerformed
        try {
            InputRekamImunisasi in = new InputRekamImunisasi();
            in.setVisible(true);
            InputRekamImunisasi.idPsienTF.setText(idpasienTF.getText());
            InputRekamImunisasi.idPsienTF.setEditable(false);
            InputRekamImunisasi.idPsienTF.setEnabled(false);
            InputRekamImunisasi.idPetugasTF.setText(idpetugasTF.getText());
            InputRekamImunisasi.idPsienTF.setText(idpasienTF.getText());
            String baru = ControlData.getKoneksi().nomorBaruImunisasi(idpasienTF.getText());
            if (baru.equals("null")) {
                baru = "001";
            } else if (baru.length() == 1) {
                baru = "00" + baru;
            } else if (baru.length() == 2) {
                baru = "0" + baru;
            }
            InputRekamImunisasi.idRekamImunTF.setText(idpasienTF.getText() + baru);
        } catch (Exception ex) {
            Logger.getLogger(RekamPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_input_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        try {
            this.dispose();
            Frame_petugas fp = new Frame_petugas();
            fp.setVisible(true);
            String nama = ControlData.getKoneksi().cariPegawai(idpetugasTF.getText());
            fp.label_petugas.setText(nama);
        } catch (Exception ex) {
            Logger.getLogger(RekamPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void idpasienTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpasienTFActionPerformed
        try {
            String cari = idpasienTF.getText();
            PasienData b = ControlData.getKoneksi().getCariPasien(cari);
            if (b != null) {
                String nama = b.getNamaPasien();
                String id = b.getIdPasien();
                String namaOrtu = b.getNamaOrangTua();
                idpasienTF.setText(id);
                namaPasienTF.setText(nama);
                namaOrtuTF.setText(namaOrtu);
            } else {
                int status = JOptionPane.showConfirmDialog(rootPane, "cari dalam list tabel ? ",
                        "search", JOptionPane.YES_NO_OPTION);
                if (status == 0) {
                    jInternalFrame1.setVisible(true);
                    tampilTable();
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(RekamPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_idpasienTFActionPerformed

    private void namaPasienTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPasienTFActionPerformed
    }//GEN-LAST:event_namaPasienTFActionPerformed

    private void idpetugasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpetugasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpetugasTFActionPerformed

    private void idpasienTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idpasienTFKeyReleased
        idpasienTF.getText();
        tampilTable();


    }//GEN-LAST:event_idpasienTFKeyReleased

    private void pencarian_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarian_TFKeyReleased
        String key = pencarian_TF.getText();
        try {
            List<PasienData> search = ControlData.getKoneksi().getCari(key);
            CariPasienLamaTableModel brngTableModel = new CariPasienLamaTableModel(search);
            tabel_cari.setModel(brngTableModel);
        } catch (Exception ex) {
            Logger.getLogger(RekamPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pencarian_TFKeyReleased

    private void tabel_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_cariMouseClicked
        int i = tabel_cari.getSelectedRow();
        String id = tabel_cari.getValueAt(i, 0).toString();
        String nama = tabel_cari.getValueAt(i, 1).toString();
        String tanggalLahir = tabel_cari.getValueAt(i, 2).toString();
        String namaOrtu = tabel_cari.getValueAt(i, 3).toString();
        idpasienTF.setText(id);
        namaPasienTF.setText(nama);
        namaOrtuTF.setText(namaOrtu);
        jInternalFrame1.setVisible(false);
        tampilTable();
    }//GEN-LAST:event_tabel_cariMouseClicked
    public void tampilTable() {
        try {
            List<RekamImunisasiData> lkat = ControlData.getKoneksi().getAllPasienRM(idpasienTF.getText());
            RekamImunTableModel KTM = new RekamImunTableModel(lkat);
            rekamImun_table.setModel(KTM);
        } catch (Exception ex) {
            Logger.getLogger(RekamPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void tampilTableCari() {
        try {
            List<PasienData> lkat = ControlData.getKoneksi().getAllPasien();
            CariPasienLamaTableModel KTM = new CariPasienLamaTableModel(lkat);
            tabel_cari.setModel(KTM);
        } catch (Exception ex) {
            Logger.getLogger(RekamPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(RekamPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RekamPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RekamPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RekamPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RekamPasien().setVisible(true);
            }
        });
    }
    private Frame_petugas Menuowner;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_button;
    public static javax.swing.JTextField idpasienTF;
    public static javax.swing.JTextField idpetugasTF;
    private javax.swing.JButton input_button;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField namaOrtuTF;
    public static javax.swing.JTextField namaPasienTF;
    public static javax.swing.JTextField namaPegawaiTF;
    private javax.swing.JTextField pencarian_TF;
    private javax.swing.JTable rekamImun_table;
    private javax.swing.JTable tabel_cari;
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
