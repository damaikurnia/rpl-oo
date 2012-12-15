/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a9uszT
 */
public class ConnMySql {
// Sesuaikan properti jdbcURL dengan basis data anda

    private static String jdbcURL = "jdbc:mysql://localhost:3306/rploo";
    private static String user = "root";
    private static String password = "root";
    private static Connection connection = null;

    /**
     * Creates a new instance of UserConnection
     */
//    public ConnMySql() {
//        try {
//            Class.forName("org.gjt.mm.mysql.Driver");
//            connection = DriverManager.getConnection(jdbcURL, user, password);
////            System.out.println("koneksi berhasil");
//        } catch (Exception ex) {
//            System.out.println("message: " + ex.getMessage());
//        }
//    }
    public static Connection getConnections() throws Exception {
        if (connection == null) {
            Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
//            System.out.println("koneksi berhasil");
        }
        return connection;
    }

//    public boolean isConnected() {
//        if (connection != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean getClosed() {
//        if (isConnected()) {
//            try {
//                connection.close();
//                connection = null;
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public String getJdbcURL() {
//        return jdbcURL;
//    }
//
//    public void setJdbcURL(String jdbcURL) {
//        this.jdbcURL = jdbcURL;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Connection getConnection() {
//        return connection;
//    }
//
//    public void setConn(Connection connection) {
//        this.connection = connection;
//    }

//    public ResultSet login(String username, String password) throws SQLException {
//
//        Statement statement = connection.createStatement();
//        String query = "select idpegawai,passwordpegawai from pegawai where admin='"
//                + username + "'and adminPassword= '" + password + "';";
//        System.out.println(query);
//        ResultSet rest = statement.executeQuery(query);
//        return rest;
//    }
//    public static void main(String[] args) {
//        try {
//            ConnMySql.getConnections();
//        } catch (Exception ex) {
//            Logger.getLogger(ConnMySql.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
