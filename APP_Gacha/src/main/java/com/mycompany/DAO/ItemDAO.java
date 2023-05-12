/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.close;
import static com.mycompany.DAO.Conexion.getConexion;
import com.mycompany.dominio.Item;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class ItemDAO implements IItemnDAO {

    private final String SQL_SELECT = "SELECT * FROM item;";

    @Override
    public List<Item> rellenar_items() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Item> items = new ArrayList<Item>();
        try {
            ps = getConexion().prepareCall(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                items.add(new Item(rs.getInt("id_item"), rs.getString("nombre"),
                        rs.getInt("cantidad"), rs.getString("tipo"), rs.getInt("id_tienda")));
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
        return items;
    }
}
