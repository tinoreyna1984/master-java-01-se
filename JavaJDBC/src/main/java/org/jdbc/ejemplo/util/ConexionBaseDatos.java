package org.jdbc.ejemplo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url;
    private static String username;
    private static String password;
    private static Connection conn;

    private ConexionBaseDatos() {
    }

    public static Connection getInstance() throws SQLException {
        String motorBD = "jdbc:mysql";
        String hostBD = "localhost:3306";
        String schemaBD = "java_curso";
        String serverTimezoneBD = "serverTimezone=America/Guayaquil";
        url = motorBD + "://" + hostBD + "/" + schemaBD + "?" + serverTimezoneBD;
        username = "root";
        password = "";
        if (conn == null){
            conn = DriverManager.getConnection(url, username, password);
        }
        return conn;
    }
}
