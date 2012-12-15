/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelModel;

import Data.PasienData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a9uszT
 */
public class CariPasienLamaTableModel extends AbstractTableModel{

    private List<PasienData> Anak = new ArrayList<PasienData>();

    public CariPasienLamaTableModel(List<PasienData> barang) {
        this.Anak = barang;
    }

    @Override
    public int getRowCount() {
        return Anak.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PasienData k = Anak.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getIdPasien();
            case 1:
                return k.getNamaPasien();
            case 2:
                return k.getTanggalLahir();
            case 3:
                return k.getNamaOrangTua();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Anak";
            case 1:
                return "Nama Anak";
            case 2:
                return "Tanggal Lahir Anak";
            case 3:
                return "Nama ortu";
            default:
                return "";
        }
    } 
}
