/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.close;
import static com.mycompany.DAO.Conexion.getConexion;
import com.mycompany.dominio.Item;
import com.mycompany.dominio.Tienda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class TiendaDAO implements ITiendaDAO {

    private final String SQL_SELECT = "SELECT * FROM tienda;";

    @Override
    public List<Tienda> rellenar_tiendas() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Tienda> tiendas = new ArrayList<Tienda>();
        try {
            ps = getConexion().prepareCall(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                tiendas.add(new Tienda(rs.getInt("id_tienda"), rs.getString("nombre")));
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
        return tiendas;
    }

    @Override
    public List<Item> rellenarItemsTienda(List<Item> items) {
        List<Item> lista = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * items.size());
            if (x == 0 || x == 1 || x == 2) {
                x = (int) (Math.random() * items.size());
            } else {
                if (!(lista.contains(items.get(x)))) {
                    lista.add(items.get(x));
                }
            }
        }
        return lista;
    }

}
