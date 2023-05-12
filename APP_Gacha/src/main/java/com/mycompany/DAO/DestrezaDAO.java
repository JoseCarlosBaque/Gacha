/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.close;
import static com.mycompany.DAO.Conexion.getConexion;
import com.mycompany.dominio.Destreza;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class DestrezaDAO implements IDestrezaDAO{
    
    private final String SQL_SELECT = "SELECT * FROM destreza;";

    @Override
    public List<Destreza> rellenar_cartas() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Destreza> cartas= new ArrayList<Destreza>();
        try {
            ps = getConexion().prepareCall(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                cartas.add(new Destreza(rs.getInt("id_destreza"), rs.getString("tipo"), 
                        rs.getInt("danio"), rs.getInt("multiplicador")));
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
        return cartas;
    }
    
}
