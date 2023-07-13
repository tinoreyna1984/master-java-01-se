package org.jdbc.ejemplo;

import org.jdbc.ejemplo.util.ConexionBaseDatos;

import java.sql.*;

//
public class Main {
    public static void main(String[] args) {
        //
        try (
                Connection conn = ConexionBaseDatos.getInstance();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCTOS") // el ";" final no es necesario
        ) {
            // recorre cada registro
            while (rs.next()) {
                System.out.println("registro -> id: " + rs.getInt("id") + ", nombre: " + rs.getString("nombre") + ", precio: " + rs.getInt("precio") + ", fecha: " + rs.getDate("fecha_registro"));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + ", SQLCODE" + e.getSQLState() + " - Error: " + e.getErrorCode());
        }
    }
}