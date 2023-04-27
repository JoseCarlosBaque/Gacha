/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.*;
import com.mycompany.dominio.Banner;
import com.mycompany.dominio.Personaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class BannerDAO implements IBannerDAO{
    
    private final String SQL_SELECT = "SELECT * FROM banner;";
    
    @Override
    public List<Banner> rellenarBanner() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Banner> banner= new ArrayList<Banner>();
        try {
            ps = getConexion().prepareCall(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                banner.add(new Banner(rs.getInt("id_banner"), 
                        rs.getString("nombre"), rs.getInt("precio"), rs.getInt("step"), 
                        rs.getInt("prob_nuevo"), rs.getInt("prob_sp"), 
                        rs.getInt("prob_ex"), rs.getInt("prob_hero")));
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
        return banner;
    }

    @Override
    public List<Personaje> rellenarBannerPersonajes(List<Personaje> personajes) {
        List<Personaje> lista = new ArrayList<Personaje>();
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * personajes.size());
            if (!(lista.contains(personajes.get(x)))) {
                lista.add(personajes.get(x));
            }
        }
        return lista;
    }
}
