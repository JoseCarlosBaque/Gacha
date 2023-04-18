/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.DAO;

import com.mycompany.dominio.Evento;
import java.util.List;

/**
 *
 * @author joseb
 */
public interface IEventoDAO {
    public List<Evento> rellenar_eventos();
    public void nuevo_user_evento();
}
