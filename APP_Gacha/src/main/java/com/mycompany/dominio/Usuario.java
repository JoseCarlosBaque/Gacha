/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

import com.mycompany.DAO.Conexion;
import com.mycompany.app_gacha.MenuPrincipal;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author joseb
 */
public class Usuario {
    private Conexion conectar = new Conexion();
    private int id_usuario;
    private String usuario;
    private String clave;
    private int nivel;
    private ArrayList<Personaje> equipo = new ArrayList<Personaje>();
    private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

    public Usuario() {
    }

    public Usuario(String usuario, String clave, int nivel) {
        this.usuario = usuario;
        this.clave = clave;
        this.nivel = nivel;
    }

    public Usuario(int id_usuario, String usuario, String clave, int nivel) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.clave = clave;
        this.nivel = nivel;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
//    lista_personajes VARCHAR(125),
//    public boolean validar_user(JTextField usuario, JPasswordField clave) {
//        boolean visible = false;
//        setUsuario(usuario.getText());
//        String contra = String.valueOf(clave.getPassword());
//        setClave(contra);
//        String consulta = "SELECT * FROM usuario WHERE usuario.usuario = ? and usuario.clave = ?;";
//        try {
//            ResultSet rs = null;
//            PreparedStatement ps = conectar.getConexion().prepareCall(consulta);
//            ps.setString(1, getUsuario());
//            ps.setString(2, contra);
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                this.setId_usuario(rs.getInt("id_usuario"));
//                this.setNivel(rs.getInt("nivel"));
//                visible = true;
//                JOptionPane.showMessageDialog(null, "Se inicio sesion correctamente");
//                MenuPrincipal menu = new MenuPrincipal();
//                menu.setVisible(true);
//            }else {
//                JOptionPane.showMessageDialog(null, "No se pudo iniciar sesion");                
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
//        }
//        return visible;
//    }
    
//    public void registrar_user(JTextField usuario, JPasswordField clave) {
//        setUsuario(usuario.getText());
//        String contra = String.valueOf(clave.getPassword());
//        setClave(contra);
//        setNivel(0);
//        String consulta = "INSERT INTO usuario (usuario.usuario, usuario.clave) VALUES (?, ?);";
//        try {
//            CallableStatement cs = conectar.getConexion().prepareCall(consulta);
//            cs.setString(1, getUsuario());
//            cs.setString(2, contra);
//            cs.execute();
//            JOptionPane.showMessageDialog(null, "Se registro correctamente");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
//        }
//    }
    
    public void logear(JFrame login) {
        login.setVisible(true);
    }
}
