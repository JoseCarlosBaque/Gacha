/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.*;
import com.mycompany.app_gacha.Main;
import static com.mycompany.app_gacha.Main.progress;
import com.mycompany.dominio.Progreso;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class ProgresoDAO implements IProgesoDAO{
    private final String SQL_SELECT = "SELECT * FROM progreso WHERE id_usuario = ?";
    private final String SQL_INSERTAR = "INSERT INTO progreso (id_usuario, experiencia, fecha) VALUES (?, ?, ?)";
    private final String SQL_UPDATE = "UPDATE progreso set experiencia = ?, fecha = ? WHERE id_usuario = ?";
    
    //Crear Objeto de Clase Progreso
    @Override
    public void crear_objeto() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = getConexion().prepareCall(SQL_SELECT);
            ps.setInt(1, Main.user.getId_usuario());
            rs = ps.executeQuery();
            if (rs.next()) {                
                progress = new Progreso(rs.getInt("id_progreso"), rs.getInt("id_usuario"), 
                        rs.getInt("experiencia"), rs.getDate("fecha"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                close(rs);
                close(ps);
                close(getConexion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }
    
    //Nuevo progreso para un Usuario nuevo
    @Override
    public void nuevo_progreso(int id_usuario) {
        Date fecha = new Date();
        java.sql.Date fecha_sql = new java.sql.Date(fecha.getTime());
        PreparedStatement ps = null;
        try {
            ps = getConexion().prepareStatement(SQL_INSERTAR);
            ps.setInt(1, id_usuario);
            ps.setInt(2, 0);
            ps.setDate(3, fecha_sql);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                close(ps);
                close(getConexion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }
    
    //Para actulizar el progreso de un usuario
    @Override
    public void update_progreso(int exp) {
        Date fecha = new Date();
        java.sql.Date fecha_sql = new java.sql.Date(fecha.getTime());
        PreparedStatement ps = null;
        try {
            ps = getConexion().prepareStatement(SQL_UPDATE);
            ps.setInt(1, exp);
            ps.setDate(2, fecha_sql);
            ps.setInt(3, Main.user.getId_usuario());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                close(ps);
                close(getConexion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }
}
