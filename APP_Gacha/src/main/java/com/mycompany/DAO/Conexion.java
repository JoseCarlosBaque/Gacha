/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

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
        //return DriverManager.getConnection(cadena, usuario, contrasenia);
        //JOptionPane.showMessageDialog(null, "Conexion realizada con Exito");
        return getDataSource().getConnection();
    }
    
    public static DataSource getDataSource(){
        BasicDataSource bs = new BasicDataSource();
        bs.setUrl(cadena);
        bs.setUsername(usuario);
        bs.setPassword(contrasenia);
        //Tamño del pool de conexiones
        //6 conex ya que cada conexion nos va adar varias conexiones
        bs.setInitialSize(5);
        return bs;
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
