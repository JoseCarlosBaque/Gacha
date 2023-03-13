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
    public static UsuarioDAO user_SQL = new UsuarioDAO();
    public static Usuario user = new Usuario();
    public static PersonajeDAO player_SQL = new PersonajeDAO();
    public static List<Personaje> tabla = player_SQL.rellenar_personajes();
    
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}
