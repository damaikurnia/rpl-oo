///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package Connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import oracle.jdbc.OracleDriver;
//
///**
// *
// * @author basisb16
// */
//public class ConnOracle {
//
//    private static Connection connection;
//
//    public static Connection getConnections() throws Exception {
//        if (connection == null) {
//            DriverManager.registerDriver(new OracleDriver());
//            String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
//            String userid = "rploo";
//            String password = "rploo";
//            connection = DriverManager.getConnection(jdbcUrl, userid, password);
//        }
//        return connection;
//    }
//    public static void main(String[] args) {
//        try {
//            ConnOracle.getConnections();
//        } catch (Exception ex) {
//            Logger.getLogger(ConnOracle.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
