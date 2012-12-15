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
public class SmsTableModel extends AbstractTableModel {
   private List<RekamImunisasiData> barang = new ArrayList<RekamImunisasiData>();

    public SmsTableModel(List<RekamImunisasiData> RI) {
        this.barang = RI;
    }

    @Override
    public int getRowCount() {
        return barang.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
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
                return k.getPasien().getNamaOrangTua();
            case 3:
                return k.getPasien().getNotelpOrtu();
                case 4:
                return k.getImun().getNamaImunisasi();
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
                return "Nama Orang Tua";
            case 3:
                return "Nomor telp Ortu";
                 case 4:
                return "Imunisasi";
            default:
                return "";
        }
    } 
}
