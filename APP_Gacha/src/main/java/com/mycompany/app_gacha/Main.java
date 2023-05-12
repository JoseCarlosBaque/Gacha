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
    public static IDestrezaDAO destreza_SQL = new DestrezaDAO();
    public static List<Destreza> cartas = destreza_SQL.rellenar_cartas();
    public static Progreso progress = new Progreso();
    public static IProgesoDAO progress_sql = new ProgresoDAO();
    public static IEventoDAO event_SQL = new EventoDAO();
    public static List<Evento> eventos = event_SQL.rellenar_eventos();
    public static IItemnDAO item_SQL = new ItemDAO();
    public static List<Item> items = item_SQL.rellenar_items();
    public static ITiendaDAO tienda_SQL = new TiendaDAO();
    public static List<Tienda> tiendas = tienda_SQL.rellenar_tiendas();
    public static List<Item> tienda_content = tienda_SQL.rellenarItemsTienda(items);
    public static List<Item> tienda_content1 = tienda_SQL.rellenarItemsTienda(items);
    public static List<Item> tienda_content2 = tienda_SQL.rellenarItemsTienda(items);
    public static IBannerDAO banner_SQL = new BannerDAO();
    public static List<Banner> banners = banner_SQL.rellenarBanner();
    public static List<Personaje> banner_content = banner_SQL.rellenarBannerPersonajes(tabla);
    public static List<Personaje> banner_content1 = banner_SQL.rellenarBannerPersonajes(tabla);
    public static List<Personaje> banner_content2 = banner_SQL.rellenarBannerPersonajes(tabla);
    public static int cont = tabla.size();//contador para id al clonar el objeto
    public static int cont_lvl = 1;//contador para los niveles
    public static int cont_free = 0;//contador para multi gratis
    //Fin Variables Globales
    
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}
