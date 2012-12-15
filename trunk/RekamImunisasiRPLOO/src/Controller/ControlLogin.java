/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author a9uszT
 */
public class ControlLogin {
     private Connection conn;

    public ControlLogin(Connection conn) {
        this.conn = conn;
    }

    public static ControlLogin getKoneksi() throws Exception {
        ControlLogin control = new ControlLogin(ConnMySql.getConnections());
        return control;
    }
     public boolean LoginPetugas(String id,String password) throws SQLException {
        PreparedStatement stmt = null;
        boolean cek = false;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT idpegawai,passwordpegawai FROM pegawai "
                + "where idPegawai=? AND passwordpegawai=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        stmt.setString(2, password);
        result = stmt.executeQuery();
        if (result.next()) {
            cek = true;
        }
        conn.commit();
        return cek;

    }
      public boolean LoginBidan(String id,String password) throws SQLException {
        PreparedStatement stmt = null;
        boolean cek = false;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT idbidan,passwordbidan FROM bidan "
                + "where idbidan=? AND passwordbidan=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        stmt.setString(2, password);
        result = stmt.executeQuery();
        if (result.next()) {
            cek = true;
        }
        conn.commit();
        return cek;

    }
    
}
