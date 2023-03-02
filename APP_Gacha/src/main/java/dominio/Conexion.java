/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class Conexion {
    Connection conectar;
    String usuario = "root";
    String contrasenia = "1234";
    String bd = "juegogacha";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection comprobarConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //JOptionPane.showMessageDialog(null, "Conexion realizada con Exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e.toString());
        }
        return conectar;
    }
}
