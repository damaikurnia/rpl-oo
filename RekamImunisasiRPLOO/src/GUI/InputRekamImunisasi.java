/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.ControlData;
import Data.ImunisasiData;
import Data.PasienData;
import Data.RekamImunisasiData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author a9uszT
 */
public class InputRekamImunisasi extends javax.swing.JFrame {

    /**
     * Creates new form InputRekamImunisasi
     */
    public InputRekamImunisasi() {
        initComponents();
        GregorianCalendar gc = new GregorianCalendar();
        jDateChooser_tanggalImun.setDate(gc.getTime());
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
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        idPsienTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        idRekamImunTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        idPetugasTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        idBidanTF = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        beratbadanTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tinggiBadanTF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser_tanggalImun = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Simpan_button = new javax.swing.JButton();
        Batal_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jPanel6.setBackground(new java.awt.Color(102, 255, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "data Anak", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(240, 240, 240))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("id Anak");

        idPsienTF.setEnabled(false);
        idPsienTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPsienTFActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("idRekam Imunisasi");

        idRekamImunTF.setEnabled(false);
        idRekamImunTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRekamImunTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(59, 59, 59)
                        .addComponent(idPsienTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idRekamImunTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(idRekamImunTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idPsienTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Input Data Rekam Imunisasi");

        jPanel7.setBackground(new java.awt.Color(102, 255, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Bidan dan petugas"));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("id Petugas");

        idPetugasTF.setEnabled(false);
        idPetugasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPetugasTFActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Id Bidan");

        idBidanTF.setEnabled(false);
        idBidanTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBidanTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(42, 42, 42)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idPetugasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBidanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idPetugasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(idBidanTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(102, 255, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Keadaan Anak"));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Berat Badan");

        beratbadanTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratbadanTFActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Tinggi Badan");

        tinggiBadanTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinggiBadanTFActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Tanggal Imunisasi");

        jDateChooser_tanggalImun.setDateFormatString("dd MMM yyyy");
        jDateChooser_tanggalImun.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Kg");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Cm");

        Simpan_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Simpan_button.setText("Simpan");
        Simpan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan_buttonActionPerformed(evt);
            }
        });

        Batal_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Batal_button.setText("Batal");
        Batal_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Batal_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser_tanggalImun, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(tinggiBadanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(beratbadanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(Batal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Simpan_button, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jDateChooser_tanggalImun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(beratbadanTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(tinggiBadanTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simpan_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Batal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(220, 220, 220))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void idPsienTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPsienTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPsienTFActionPerformed

    private void idRekamImunTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRekamImunTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRekamImunTFActionPerformed

    private void idPetugasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPetugasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPetugasTFActionPerformed

    private void idBidanTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBidanTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBidanTFActionPerformed

    private void beratbadanTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratbadanTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratbadanTFActionPerformed

    private void tinggiBadanTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiBadanTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiBadanTFActionPerformed

    private void Simpan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan_buttonActionPerformed
        if (beratbadanTF.getText().equals("") && tinggiBadanTF.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "field berat badan dan tinggi kosong \n harap isi dahulu",
                    "warning", JOptionPane.WARNING_MESSAGE);
        } else if (beratbadanTF.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "berat badan kosong \n harap isi dahulu", "warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (tinggiBadanTF.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "tinggi badan kosong \n harap isi dahulu", "warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String id = idPsienTF.getText();
                String idrekam = idRekamImunTF.getText();
                String idpetugas = idPetugasTF.getText();
                String idbidan = idBidanTF.getText();
                String tinggi = tinggiBadanTF.getText();
                String berat = beratbadanTF.getText();
                Date tgl = jDateChooser_tanggalImun.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String tanggal = sdf.format(tgl);
                String lahir = ControlData.getKoneksi().cariTanggallahir(idPsienTF.getText());
                String selisih = ControlData.getKoneksi().cariSelisih(tanggal, lahir);
                String imunID = ControlData.getKoneksi().cariImunisasi(Integer.valueOf(selisih));
                RekamImunisasiData RI = new RekamImunisasiData();
                RI.setIdPetugas(idpetugas);
                RI.setBeratBadan(Integer.valueOf(berat));
                RI.setTinggiBadan(Integer.valueOf(tinggi));
                PasienData pd = new PasienData();
                pd.setIdPasien(id);
                RI.setPasien(pd);
                RI.setIdBidan(idbidan);
                RI.setTanggal(tanggal);
                ImunisasiData idt = new ImunisasiData();
                idt.setIdImunisasi(imunID);
                RI.setImun(idt);
                RI.setIdRekamImun(idrekam);

                ControlData.getKoneksi().tambahRekamImunisasiBaru(RI);
                JOptionPane.showMessageDialog(rootPane, "Data masuk dalam Databse Imunisasi");
                this.dispose();
                RekamPasien rp = new RekamPasien();
                RekamPasien.idpasienTF.setText(idPsienTF.getText());
                RekamPasien.idpetugasTF.setText(idPetugasTF.getText());
                Parent.tampilTable();

            } catch (Exception ex) {
                Logger.getLogger(InputRekamImunisasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_Simpan_buttonActionPerformed

    private void Batal_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Batal_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Batal_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(InputRekamImunisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputRekamImunisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputRekamImunisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputRekamImunisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputRekamImunisasi().setVisible(true);
            }
        });
    }
    private RekamPasien Parent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal_button;
    private javax.swing.JButton Simpan_button;
    public static javax.swing.JTextField beratbadanTF;
    private javax.swing.JTextField idBidanTF;
    public static javax.swing.JTextField idPetugasTF;
    public static javax.swing.JTextField idPsienTF;
    public static javax.swing.JTextField idRekamImunTF;
    private com.toedter.calendar.JDateChooser jDateChooser_tanggalImun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JTextField tinggiBadanTF;
    // End of variables declaration//GEN-END:variables

    /**
     * @param Parent the Parent to set
     */
    public void setParent(RekamPasien Parent) {
        this.Parent = Parent;
    }
}
