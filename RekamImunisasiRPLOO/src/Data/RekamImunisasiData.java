/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author a9uszT
 */
public class RekamImunisasiData {
    private PasienData pasien;
    private String idRekamImun;
    private String tanggal;
    private ImunisasiData imun;
    private int beratBadan;
    private int tinggiBadan;
    private String idBidan;
    private String idPetugas;



    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the jenisImun
     */
    public ImunisasiData getImun() {
        return imun;
    }

    /**
     * @param jenisImun the jenisImun to set
     */
    public void setImun(ImunisasiData jenisImun) {
        this.imun = jenisImun;
    }

    /**
     * @return the beratBadan
     */
    public int getBeratBadan() {
        return beratBadan;
    }

    /**
     * @param beratBadan the beratBadan to set
     */
    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }

    /**
     * @return the tinggiBadan
     */
    public int getTinggiBadan() {
        return tinggiBadan;
    }

    /**
     * @param tinggiBadan the tinggiBadan to set
     */
    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    /**
     * @return the idBidan
     */
    public String getIdBidan() {
        return idBidan;
    }

    /**
     * @param idBidan the idBidan to set
     */
    public void setIdBidan(String idBidan) {
        this.idBidan = idBidan;
    }

    /**
     * @return the idPetugas
     */
    public String getIdPetugas() {
        return idPetugas;
    }

    /**
     * @param idPetugas the idPetugas to set
     */
    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    /**
     * @return the pasien
     */
    public PasienData getPasien() {
        return pasien;
    }

    /**
     * @param pasien the pasien to set
     */
    public void setPasien(PasienData pasien) {
        this.pasien = pasien;
    }

    /**
     * @return the idRekamImun
     */
    public String getIdRekamImun() {
        return idRekamImun;
    }

    /**
     * @param idRekamImun the idRekamImun to set
     */
    public void setIdRekamImun(String idRekamImun) {
        this.idRekamImun = idRekamImun;
    }
}
