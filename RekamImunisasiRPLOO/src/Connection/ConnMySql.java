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

    private static String jdbcURL = "jdbc:mysql://localhost:3306/rploo";
    private static String user = "root";
    private static String password = "root";
    private static Connection connection = null;

    /**
     * Creates a new instance of UserConnection
     */

    public static Connection getConnections() throws Exception {
        if (connection == null) {
            Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
//            System.out.println("koneksi berhasil");
        }
        return connection;
    }

//


}
