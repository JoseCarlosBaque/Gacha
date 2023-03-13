/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import java.sql.*;

/**
 *
 * @author joseb
 */
public class Conexion {

    Connection conectar;
    private static String usuario = "root";
    private static String contrasenia = "1234";
    private static String bd = "juegogacha";
    private static String ip = "localhost";
    private static String puerto = "3306";
    private static String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?useSSL=false&useTimezone=true&serverTimerzone=UTC&allowPublicKeyRetrieval=true";

    public static Connection getConexion() throws SQLException {
        //Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(cadena, usuario, contrasenia);
        //JOptionPane.showMessageDialog(null, "Conexion realizada con Exito");
    }
    
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
    
    public static void close(PreparedStatement ps) throws SQLException {
        ps.close();
    }
    
    public static void close(Connection cn) throws SQLException {
        cn.close();
    }
}
