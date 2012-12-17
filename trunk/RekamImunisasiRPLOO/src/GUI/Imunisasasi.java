/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Connection.ConnMySql;
import Controller.ControlData;
import Data.RekamImunisasiData;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import tabelModel.ImunisasiSekarang;

/**
 *
 * @author a9uszT
 */
public class Imunisasasi extends javax.swing.JFrame {

    /**
     * Creates new form Imunisasasi
     */
    public Imunisasasi() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio_now);
        bg.add(radio_rentang);
        awal();
        GregorianCalendar gc = new GregorianCalendar();
        dateAkhir.setDate(gc.getTime());
        date_imun.setDate(gc.getTime());
        dateawal.setDate(gc.getTime());
        datenow.setDate(gc.getTime());
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
        InternalCetak = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        datenow = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        dateawal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        dateAkhir = new com.toedter.calendar.JDateChooser();
        ok_button = new javax.swing.JButton();
        radio_now = new javax.swing.JRadioButton();
        radio_rentang = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelImun = new javax.swing.JTable();
        buka_imunisasi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date_imun = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        idBidanTF = new javax.swing.JTextField();
        keluar_button = new javax.swing.JButton();
        cetak_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        InternalCetak.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cetak Pasien Imunisasi");

        datenow.setDateFormatString("dd MMM yyyy");
        datenow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Dari tanggal");

        dateawal.setDateFormatString("dd MMM yyyy");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Sampai Dengan");

        dateAkhir.setDateFormatString("dd MMM yyyy");
        dateAkhir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ok_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        radio_now.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_now.setText("Hari Ini");
        radio_now.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_nowActionPerformed(evt);
            }
        });

        radio_rentang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_rentang.setText("Rentang tanggal");
        radio_rentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_rentangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radio_now)
                        .addGap(42, 42, 42)
                        .addComponent(datenow, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateawal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radio_rentang))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datenow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_now))
                .addGap(18, 18, 18)
                .addComponent(radio_rentang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateawal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dateAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout InternalCetakLayout = new javax.swing.GroupLayout(InternalCetak.getContentPane());
        InternalCetak.getContentPane().setLayout(InternalCetakLayout);
        InternalCetakLayout.setHorizontalGroup(
            InternalCetakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InternalCetakLayout.setVerticalGroup(
            InternalCetakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imunisasi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        tabelImun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idRekamImunisasi", "nama Anak", "jenis Imunisasi", "Tanggal Imunisasi"
            }
        ));
        tabelImun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelImunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelImun);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        buka_imunisasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buka_imunisasi.setText("buka imunisasi");
        buka_imunisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buka_imunisasiActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Sistem Informasi Imunisasi");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 430, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Puskemas Klaten Selatan");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 28));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("JL. Perjuangan 12, Glodogan, Klaten Selatan");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/puskemas.jpg"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 160));

        date_imun.setDateFormatString("dd MMM yyyy");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("idBidan");

        idBidanTF.setEnabled(false);
        idBidanTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBidanTFActionPerformed(evt);
            }
        });

        keluar_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        keluar_button.setText("Logout");
        keluar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_buttonActionPerformed(evt);
            }
        });

        cetak_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cetak_button.setText("Cetak");
        cetak_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetak_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buka_imunisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(date_imun, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(idBidanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keluar_button)
                .addGap(45, 45, 45))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 45, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InternalCetak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cetak_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(date_imun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buka_imunisasi))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idBidanTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keluar_button))
                        .addGap(5, 5, 5)))
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(214, 222, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InternalCetak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(cetak_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void buka_imunisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buka_imunisasiActionPerformed
        tampilTable();
    }//GEN-LAST:event_buka_imunisasiActionPerformed

    private void idBidanTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBidanTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBidanTFActionPerformed

    private void keluar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_buttonActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "yakin keluar", "exit", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            JOptionPane.showMessageDialog(rootPane, "selesai ");
            dispose();
            Login_menu lm = new Login_menu();
            lm.setVisible(true);
        }
    }//GEN-LAST:event_keluar_buttonActionPerformed

    private void cetak_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetak_buttonActionPerformed
        InternalCetak.setVisible(true);
    }//GEN-LAST:event_cetak_buttonActionPerformed

    private void radio_nowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_nowActionPerformed
        if (radio_now.isSelected()) {
            datenow.setVisible(true);
            dateawal.setVisible(false);
            dateAkhir.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
        }
    }//GEN-LAST:event_radio_nowActionPerformed

    private void radio_rentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_rentangActionPerformed
        if (radio_rentang.isSelected()) {
            datenow.setVisible(false);
            dateawal.setVisible(true);
            dateAkhir.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
        }
    }//GEN-LAST:event_radio_rentangActionPerformed

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        if (radio_now.isSelected()) {
            try {
                Connection kon = null;
                String reportSource = "";
                kon = ConnMySql.getConnections();
                Date tglawal = datenow.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String awal = sdf.format(tglawal);
                reportSource = "./reports/LaporanImunisasi.jasper";
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("tanggalImunisasi", awal);
                try {
                    JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, kon);
                    JasperViewer.viewReport(jasperPrint, false);
                } catch (JRException ex) {
                    ex.printStackTrace();
                }
                this.setExtendedState(JFrame.ICONIFIED);
            } catch (Exception ex) {
                Logger.getLogger(Imunisasasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (radio_rentang.isSelected()) {
            try {
                Connection kon = null;
                String reportSource = "";
                kon = ConnMySql.getConnections();
                Date tglawal = datenow.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String awal = sdf.format(tglawal);
                Date tglAkhir = dateAkhir.getDate();
                String akhir = sdf.format(tglAkhir);
                reportSource = "./reports/LaporanImunisasi.jasper";
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("tanggalAwal", awal);
                params.put("tanggalAkhir", akhir);
                try {
                    JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, kon);
                    JasperViewer.viewReport(jasperPrint, false);
                } catch (JRException ex) {
                    ex.printStackTrace();
                }
                this.setExtendedState(JFrame.ICONIFIED);
            } catch (Exception ex) {
                Logger.getLogger(Imunisasasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        InternalCetak.setVisible(false);
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void tabelImunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelImunMouseClicked
        try {
            int i = tabelImun.getSelectedRow();
            String kodeimun = tabelImun.getValueAt(i, 0).toString();
            String nama = tabelImun.getValueAt(i, 1).toString();
            String imun = tabelImun.getValueAt(i, 2).toString();
            int a = JOptionPane.showConfirmDialog(rootPane,
                    " imunisasi pada " + nama + " \n dengan jenis imunisasi "
                    + imun + " \n lanjut imunisasi ?",
                    "information", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                ControlData.getKoneksi().updateBidan(idBidanTF.getText(), kodeimun);
            }
            tampilTable();
        } catch (Exception ex) {
            Logger.getLogger(Imunisasasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelImunMouseClicked

    private void tampilTable() {
        Date tgl = date_imun.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String tanggal = sdf.format(tgl);
        try {
            List<RekamImunisasiData> lkat = ControlData.getKoneksi().getAllImunisasiSekarang(tanggal);
            ImunisasiSekarang KTM = new ImunisasiSekarang(lkat);
            tabelImun.setModel(KTM);
        } catch (Exception ex) {
            Logger.getLogger(Registrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void awal() {
        datenow.setVisible(false);
        dateawal.setVisible(false);
        dateAkhir.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        InternalCetak.setVisible(false);
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
            java.util.logging.Logger.getLogger(Imunisasasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imunisasasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imunisasasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imunisasasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Imunisasasi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalCetak;
    private javax.swing.JButton buka_imunisasi;
    private javax.swing.JButton cetak_button;
    private com.toedter.calendar.JDateChooser dateAkhir;
    private com.toedter.calendar.JDateChooser date_imun;
    private com.toedter.calendar.JDateChooser dateawal;
    private com.toedter.calendar.JDateChooser datenow;
    public static javax.swing.JTextField idBidanTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar_button;
    private javax.swing.JButton ok_button;
    private javax.swing.JRadioButton radio_now;
    private javax.swing.JRadioButton radio_rentang;
    private javax.swing.JTable tabelImun;
    // End of variables declaration//GEN-END:variables
}
