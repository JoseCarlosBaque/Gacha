/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.getConexion;
import com.mycompany.dominio.Personaje;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class PersonajeDAO implements IPersonajeDAO{
    private final String SQL_SELECT = "SELECT * FROM personaje;";
    
    //Para hacer una lista con todos los objetos de clase Personaje
    @Override
    public List<Personaje> rellenar_personajes() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Personaje> personajes= new ArrayList<Personaje>();
        try {
            ps = getConexion().prepareCall(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                personajes.add(new Personaje(rs.getInt("id_personaje"), 
                        rs.getString("nombre"), rs.getString("titulo"), rs.getString("tipo"), 
                        rs.getInt("salud"), rs.getInt("nivel"), 
                        rs.getInt("danio_fisico"), rs.getInt("danio_energia"), 
                        rs.getInt("defensa_fisico"), rs.getInt("defensa_energia"), 
                        rs.getInt("critico"), rs.getInt("soul"), rs.getInt("estrellas")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                rs.close();
                ps.close();
                getConexion().close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
        return personajes;
    }
}
