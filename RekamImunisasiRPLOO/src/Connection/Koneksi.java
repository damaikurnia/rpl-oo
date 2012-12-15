/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {

    String url = "jdbc:mysql://localhost:3306/sms";
    String user = "root";
    String password = "root";
    private Connection koneksi = null;
    public Statement st = null;

    public Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver ditemukan");
            // TODO code application logic here
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            koneksi = DriverManager.getConnection(url, user, password);
//            System.out.println("Koneksi OK");
            st = koneksi.createStatement();


        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection bukaKoneksi() throws SQLException {
        koneksi = DriverManager.getConnection(url, user, password);
        return koneksi;
    }

    public Connection getKoneksi() {
        return koneksi;
    }

    public void setKoneksi(Connection koneksi) {
        this.koneksi = koneksi;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public void tutupKoneksi() throws SQLException {
        if (koneksi != null) {
            koneksi.close();
        }
    }

}
        


