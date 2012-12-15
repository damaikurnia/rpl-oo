/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelModel;

import Data.RekamImunisasiData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a9uszT
 */
public class ImunisasiSekarang extends AbstractTableModel {
   private List<RekamImunisasiData> barang = new ArrayList<RekamImunisasiData>();

    public ImunisasiSekarang(List<RekamImunisasiData> RI) {
        this.barang = RI;
    }

    @Override
    public int getRowCount() {
        return barang.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RekamImunisasiData k = barang.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getPasien().getIdPasien();
            case 1:
                return k.getPasien().getNamaPasien();
            case 2:
                return k.getImun().getNamaImunisasi();
            case 3:
                return k.getTanggal();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Imunisasi";
            case 1:
                return "Nama Anak";
            case 2:
                return "jenis Imunisasi";
            case 3:
                return "tanggal Imunisasi";
            default:
                return "";
        }
    } 
}
