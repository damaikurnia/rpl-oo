/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnMySql;
import Data.ImunisasiDT;
import Data.PasienData;
import Data.RekamImunisasiData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a9uszT
 */
public class ControlData {

    private Connection conn;

    public ControlData(Connection conn) {
        this.conn = conn;
    }

    public static ControlData getKoneksi() throws Exception {
        ControlData control = new ControlData(ConnMySql.getConnections());
        return control;
    }

    public void tambahPasienBaruPrepared(PasienData pasdt) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "insert into " + "pasien values (?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, pasdt.getIdPasien());
            stmt.setString(2, pasdt.getNamaPasien());
            stmt.setString(3, pasdt.getAlamat());
            stmt.setString(4, pasdt.getTanggalLahir());
            stmt.setString(5, pasdt.getJenisKelamin());
            stmt.setString(6, pasdt.getNamaOrangTua());
            stmt.setString(7, pasdt.getNotelpOrtu());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException se) {
            conn.rollback();
            throw se;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                try {
                    throw e;
                } catch (Exception ex) {
                    Logger.getLogger(ControlData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public List<PasienData> getCari(String cari) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        String query = "SELECT idpasien,namapasien,tanggallahir,namaortu "
                + " FROM pasien "
                + " where Upper(namapasien) like '%" + cari.toUpperCase()
                + "%'  or "
                + "  idpasien like '%" + cari.toUpperCase() + "%' "
                + "order by idpasien ";
        psmt = conn.prepareStatement(query);
        rset = psmt.executeQuery();
        List<PasienData> pasien = new ArrayList<PasienData>();
        while (rset.next()) {
            PasienData pasdt = new PasienData();
            pasdt.setIdPasien(rset.getString(1));
            pasdt.setNamaPasien(rset.getString(2));
            pasdt.setTanggalLahir(rset.getString(3));
            pasdt.setNamaOrangTua(rset.getString(4));
            pasien.add(pasdt);
        }
        return pasien;
    }

    public List<PasienData> getAllPasien() throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String query = "SELECT idpasien,namapasien,DATE_FORMAT(tanggallahir, '%d-%M-%Y'),namaortu "
                + " FROM pasien "
                + " order by idpasien ";
        psmt = conn.prepareStatement(query);
        rset = psmt.executeQuery();
        List<PasienData> pasien = new ArrayList<PasienData>();
        while (rset.next()) {
            PasienData pasdt = new PasienData();
            pasdt.setIdPasien(rset.getString(1));
            pasdt.setNamaPasien(rset.getString(2));
            pasdt.setTanggalLahir(rset.getString(3));
            pasdt.setNamaOrangTua(rset.getString(4));
            pasien.add(pasdt);
        }
        conn.commit();
        return pasien;
    }

    public String cariPegawai(String kode) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String namaPegawai = "";
        conn.setAutoCommit(false);
        String query = "SELECT namapegawai from pegawai where idpegawai=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kode);
        result = stmt.executeQuery();
        if (result.next()) {
            namaPegawai = result.getString(1);
        }
        conn.commit();
        return namaPegawai;
    }

    public String cariKodePegawai(String Nama) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String kodePegawai = "";
        conn.setAutoCommit(false);
        String query = "SELECT idpegawai from pegawai where namapegawai=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Nama);
        result = stmt.executeQuery();
        if (result.next()) {
            kodePegawai = result.getString(1);
        }
        conn.commit();
        return kodePegawai;
    }

    public String cariKodeBidan(String Nama) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String kodeBidan = "";
        conn.setAutoCommit(false);
        String query = "SELECT idbidan from bidan where namaBidan=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, Nama);
        result = stmt.executeQuery();
        if (result.next()) {
            kodeBidan = result.getString(1);
        }
        conn.commit();
        return kodeBidan;
    }

    public String cariBidan(String kode) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String namaBidan = "";
        conn.setAutoCommit(false);
        String query = "SELECT namabidan from bidan where idbidan=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, kode);
        result = stmt.executeQuery();
        if (result.next()) {
            namaBidan = result.getString(1);
        }
        conn.commit();
        return namaBidan;
    }

    public List<RekamImunisasiData> getAllPasienRM(String id) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String query = "SELECT p.namapasien,r.idrekamimunisasi,p.namaortu,i.namaimunisasi,DATE_FORMAT(r.tanggal, '%d-%M-%Y') "
                + "  FROM pasien p,rekamimunisasi r,imunisasi i"
                + " where p.idpasien= ? and p.idpasien = r.idpasien "
                + " and r.jenisimun = i.idimunisasi "
                + "order by r.tanggal ";
        psmt = conn.prepareStatement(query);
        psmt.setString(1, id);
        rset = psmt.executeQuery();
        List<RekamImunisasiData> pasien = new ArrayList<RekamImunisasiData>();
        while (rset.next()) {
            RekamImunisasiData pasdt = new RekamImunisasiData();
            PasienData pd = new PasienData();
            ImunisasiDT imun = new ImunisasiDT();
            pd.setNamaPasien(rset.getString(1));
            pd.setNamaOrangTua(rset.getString(3));
            pasdt.setPasien(pd);
            pasdt.setIdRekamImun(rset.getString(2));

            pasdt.setTanggal(rset.getString(5));
            imun.setNamaImunisasi(rset.getString(4));
            pasdt.setImun(imun);
            pasien.add(pasdt);
        }
        conn.commit();
        return pasien;
    }

    public String cariTanggallahir(String id) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String tanggal = "";
        conn.setAutoCommit(false);
        String query = "SELECT tanggallahir from pasien where idpasien=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        if (result.next()) {
            tanggal = result.getString(1);
        }
        conn.commit();
        return tanggal;
    }

    public String cariSelisih(String dateawal, String dateakhir) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String selisih = "";
        conn.setAutoCommit(false);
        String query = "SELECT ROUND((DATEDIFF(?,?)/7),0)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dateawal);
        stmt.setString(2, dateakhir);
        result = stmt.executeQuery();
        if (result.next()) {
            selisih = result.getString(1);
        }
        conn.commit();
        return selisih;
    }

    public String cariImunisasi(int minggu) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        String imun = "";
        conn.setAutoCommit(false);
        String query = "SELECT idimunisasi from imunisasi where minggu =?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, minggu);
        result = stmt.executeQuery();
        if (result.next()) {
            imun = result.getString(1);
        }
        if (minggu < 4) {
            return imun = "1";
        }
        conn.commit();
        return imun;
    }

    public void tambahRekamImunisasiBaru(RekamImunisasiData pasdt) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "insert into " + "rekamimunisasi values (?,?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, pasdt.getIdRekamImun());
            stmt.setString(2, pasdt.getTanggal());
            stmt.setString(3, pasdt.getImun().getIdImunisasi());
            stmt.setInt(4, pasdt.getBeratBadan());
            stmt.setInt(5, pasdt.getTinggiBadan());
            stmt.setString(6, "KOSONG");
            stmt.setString(7, pasdt.getIdPetugas());
            stmt.setString(8, pasdt.getPasien().getIdPasien());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException se) {
            conn.rollback();
            throw se;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                try {
                    throw e;
                } catch (Exception ex) {
                    Logger.getLogger(ControlData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public PasienData getCariPasien(String cari) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        String query = "SELECT idpasien,namapasien,tanggallahir,namaortu "
                + " FROM pasien "
                + " where idpasien = ?"
                + "order by idpasien ";
        psmt = conn.prepareStatement(query);
        psmt.setString(1, cari);
        rset = psmt.executeQuery();
        PasienData pasien = null;
        while (rset.next()) {
            pasien = new PasienData();
            pasien.setIdPasien(rset.getString(1));
            pasien.setNamaPasien(rset.getString(2));
            pasien.setTanggalLahir(rset.getString(3));
            pasien.setNamaOrangTua(rset.getString(4));
        }
        return pasien;
    }

    public List<RekamImunisasiData> getAllImunisasiSekarang(String date) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String query = "SELECT r.idrekamimunisasi,p.namapasien,i.namaimunisasi,DATE_FORMAT(r.tanggal, '%d-%M-%Y') "
                + " from rekamimunisasi r,pasien p,imunisasi i"
                + " where r.idbidan= 'KOSONG' and"
                + " r.idpasien= p.idpasien and r.jenisimun=i.idimunisasi  and r.tanggal=? ";
        psmt = conn.prepareStatement(query);
        psmt.setString(1, date);
        rset = psmt.executeQuery();
        List<RekamImunisasiData> pasien = new ArrayList<RekamImunisasiData>();
        while (rset.next()) {
            RekamImunisasiData pasdt = new RekamImunisasiData();
            PasienData pd = new PasienData();
//            pd.setIdPasien(rset.getString(1));
            pd.setNamaPasien(rset.getString(2));
            pasdt.setPasien(pd);
            ImunisasiDT idt = new ImunisasiDT();
            idt.setNamaImunisasi(rset.getString(3));
            pasdt.setImun(idt);
            pasdt.setIdRekamImun(rset.getString(1));
            pasdt.setTanggal(rset.getString(4));
            pasien.add(pasdt);
        }
        conn.commit();
        return pasien;
    }

    public void updateBidan(String kode, String rm) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "update rekamimunisasi set idbidan=? where idrekamimunisasi=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, kode);
            stmt.setString(2, rm);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException se) {
            conn.rollback();
            throw se;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                try {
                    throw e;
                } catch (Exception ex) {
                    Logger.getLogger(ControlData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void deleteRekamImun(String kode) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from rekamimunisasi where idrekamimunisasi=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, kode);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException se) {
            conn.rollback();
            throw se;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                try {
                    throw e;
                } catch (Exception ex) {
                    Logger.getLogger(ControlData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public List<RekamImunisasiData> getAllKirimSMS(String date) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String query = "SELECT r.idpasien,p.namapasien,p.namaortu,p.telportu,i.namaimunisasi "
                + " from rekamimunisasi r,pasien p,imunisasi i"
                + " where r.idpasien= p.idpasien  and r.jenisimun=i.idimunisasi and "
                + "r.tanggal=? ";
//        and r.jenisimun=i.idimunisasi
        psmt = conn.prepareStatement(query);
        psmt.setString(1, date);
        rset = psmt.executeQuery();
        List<RekamImunisasiData> pasien = new ArrayList<RekamImunisasiData>();
        while (rset.next()) {
            RekamImunisasiData pasdt = new RekamImunisasiData();
            PasienData pd = new PasienData();
            pd.setIdPasien(rset.getString(1));
            pd.setNamaPasien(rset.getString(2));
            pd.setNamaOrangTua(rset.getString(3));
            pd.setNotelpOrtu(rset.getString(4));
            pasdt.setPasien(pd);
            ImunisasiDT idt = new ImunisasiDT();
            idt.setNamaImunisasi(rset.getString(5));
            pasdt.setImun(idt);
            pasien.add(pasdt);
        }
        conn.commit();
        return pasien;
    }

    public String nomorBaru(String code) throws SQLException {
        PreparedStatement stmt = null;
        int cari = 0;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT IFNULL((MAX(SUBSTR(idpasien,-1,3))),0)"
                + " FROM pasien WHERE SUBSTR(idpasien,1,1)=?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, code);
        result = stmt.executeQuery();
        if (result.next()) {
            cari = Integer.parseInt(result.getString(1)) + 1;
            System.out.println(cari);
        }
        conn.commit();
        return String.valueOf(cari);

    }

    public String nomorBaruImunisasi(String code) throws SQLException {
        PreparedStatement stmt = null;
        int cari = 0;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT IFNULL((MAX(SUBSTR(idrekamimunisasi,-1,3))),0)"
                + " FROM rekamimunisasi WHERE idpasien=?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, code);
        result = stmt.executeQuery();
        if (result.next()) {
            cari = Integer.parseInt(result.getString(1)) + 1;
            System.out.println(cari);
        }
        conn.commit();
        return String.valueOf(cari);

    }

    public String nextImunisasi(String code) throws SQLException {
        PreparedStatement stmt = null;
        String cari = "";
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT namaimunisasi from imunisasi where idimunisasi="
                + "(SELECT idimunisasi from imunisasi where namaimunisasi=?)+1 ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, code);
        result = stmt.executeQuery();
        if (result.next()) {
            cari = (result.getString(1));
        }
        conn.commit();
        return cari;
    }
}
