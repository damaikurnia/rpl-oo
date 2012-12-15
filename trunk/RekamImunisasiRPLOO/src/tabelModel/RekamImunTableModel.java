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
public class RekamImunTableModel extends AbstractTableModel {
   private List<RekamImunisasiData> rekam = new ArrayList<RekamImunisasiData>();

    public RekamImunTableModel(List<RekamImunisasiData> RI) {
        this.rekam = RI;
    }

    @Override
    public int getRowCount() {
        return rekam.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RekamImunisasiData k = rekam.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getIdRekamImun();
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
