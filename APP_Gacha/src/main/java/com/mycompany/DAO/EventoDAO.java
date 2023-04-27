/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.*;
import static com.mycompany.app_gacha.Main.eventos;
import static com.mycompany.app_gacha.Main.progress;
import com.mycompany.dominio.Evento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class EventoDAO implements IEventoDAO{
    private final String SQL_SELECT = "SELECT * FROM evento";
    private final String SQL_INSERT = "INSERT INTO evento (id_evento, id_progreso, nombre, niveles) VALUES (?, ?, ?, ?)";
    
    //Rellenar los eventos
    @Override
    public List<Evento> rellenar_eventos() {
        List<Evento> eventos = new ArrayList<Evento>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = getConexion().prepareCall(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {                
                eventos.add(new Evento(rs.getInt("id_evento"),
                        rs.getString("nombre"), rs.getInt("niveles")));
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
        return eventos;
    }
    
    //Nuevos registro de evento para el nuevo usuario
    @Override
    public void nuevo_user_evento() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            for (int i = 0; i < eventos.size(); i++) {
                ps = getConexion().prepareCall(SQL_INSERT);
                ps.setInt(1, eventos.get(i).getId_evento());
                ps.setInt(2, progress.getId_progreso());
                ps.setString(3, eventos.get(i).getNombre());
                ps.setInt(4, eventos.get(i).getNiveles());
                ps.executeUpdate();
                ps.close();
            }
            rs = ps.executeQuery();
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
}
