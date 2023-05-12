/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.DAO;

import com.mycompany.dominio.Item;
import com.mycompany.dominio.Tienda;
import java.util.List;

/**
 *
 * @author joseb
 */
public interface ITiendaDAO {
    public List<Tienda> rellenar_tiendas();
    public List<Item> rellenarItemsTienda(List<Item> items);
}
