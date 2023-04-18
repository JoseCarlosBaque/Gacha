/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app_gacha;

import com.mycompany.DAO.*;
import com.mycompany.dominio.*;
import java.util.List;


/**
 *
 * @author joseb
 */
public class Main {
    //Variable Globales
    public static IUsuarioDAO user_SQL = new UsuarioDAO();
    public static Usuario user = new Usuario();
    public static IPersonajeDAO player_SQL = new PersonajeDAO();
    public static List<Personaje> tabla = player_SQL.rellenar_personajes();
    public static Progreso progress = new Progreso();
    public static IProgesoDAO progress_sql = new ProgresoDAO();
    public static IEventoDAO event_SQL = new EventoDAO();
    public static List<Evento> eventos = event_SQL.rellenar_eventos();
    //Fin Variables Globales
    
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}
