/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import static com.mycompany.DAO.Conexion.*;
import com.mycompany.app_gacha.Main;
import com.mycompany.app_gacha.MenuPrincipal;
import com.mycompany.dominio.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author joseb
 */
public class UsuarioDAO implements IUsuarioDAO{
    private final String SQL_REGISTRAR = "INSERT INTO usuario (usuario, clave) VALUES (?, ?);";
    private final String SQL_LOGIN = "SELECT * FROM usuario WHERE usuario = ? and clave = ?;";
    private final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";
    
    //Registrar un Usuario nuevo
    @Override
    public void registrar_usuario(JTextField usuario, JPasswordField clave) {
        String contra = String.valueOf(clave.getPassword());
        PreparedStatement ps = null;
        try {
            ps = getConexion().prepareCall(SQL_REGISTRAR);
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se registro correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                close(ps);
                close(getConexion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }
    
    //Crear Objeto de Clara usuario
    @Override
    public boolean validar_usuario(JTextField usuario, JPasswordField clave) {
        boolean visible = false;
        String contra = String.valueOf(clave.getPassword());
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = getConexion().prepareCall(SQL_LOGIN);
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            rs = ps.executeQuery();
            if (rs.next()) {
                Main.user = new Usuario(rs.getInt("id_usuario"), rs.getString("usuario"), rs.getString("clave"), rs.getInt("nivel"));
                JOptionPane.showMessageDialog(null, "Se inicio sesion correctamente");
                visible = true;
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo iniciar sesion");                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                //Cerrar el rs, ps, conexion
                close(rs);
                close(ps);
                close(getConexion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
        return visible;
    }
    
    //Eliminar un Usuario
    @Override
    public void elimina_user(Usuario user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, user.getId_usuario());
            ps.executeUpdate();
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
    }
}
