/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import com.mycompany.app_gacha.Main;
import com.mycompany.app_gacha.MenuPrincipal;
import static com.mycompany.DAO.Conexion.getConexion;
import com.mycompany.dominio.Usuario;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author joseb
 */
public class UsuarioDAO {
    private final String SQL_LOGIN = "SELECT * FROM usuario WHERE usuario.usuario = ? and usuario.clave = ?;";
    private final String SQL_REGISTRAR = "INSERT INTO usuario (usuario.usuario, usuario.clave) VALUES (?, ?);";
    
    public boolean validar_usuario(JTextField usuario, JPasswordField clave) {
        boolean visible = false;
        //String consulta = "SELECT * FROM usuario WHERE usuario.usuario = ? and usuario.clave = ?;";
        String contra = String.valueOf(clave.getPassword());
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = getConexion().prepareCall(SQL_LOGIN);
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            rs = ps.executeQuery();
            if (rs.next()) {
                Main.user = new Usuario(rs.getInt("id_usuario"), rs.getString("usuario"), rs.getString("clave"), rs.getInt("nivel"));
                //visible = true;
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
                rs.close();
                ps.close();
                getConexion().close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
        return visible;
    }
    
    public void registrar_usuario(JTextField usuario, JPasswordField clave) {
        String contra = String.valueOf(clave.getPassword());
        PreparedStatement ps = null;
        try {
            ps = getConexion().prepareCall(SQL_REGISTRAR);
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se registro correctamente");
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                ps.close();
                getConexion().close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }
}
