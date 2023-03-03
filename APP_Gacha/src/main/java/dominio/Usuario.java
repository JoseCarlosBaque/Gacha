/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import com.mycompany.app_gacha.MenuPrincipal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author joseb
 */
public class Usuario {
    private int id_usuario;
    String usuario;
    String clave;
    private int nivel;

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
    public void validar_user(JTextField usuario, JPasswordField clave) {
        setUsuario(usuario.getText());
        String contra = String.valueOf(clave.getPassword());
        setClave(contra);
        Conexion conectar = new Conexion();
        String consulta = "SELECT * FROM usuario WHERE usuario.usuario = ? and usuario.clave = ?;";
        try {
            ResultSet rs = null;
            CallableStatement cs = conectar.comprobarConexion().prepareCall(consulta);
            cs.setString(1, getUsuario());
            cs.setString(2, contra);
            rs = cs.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Se inicio sesion correctamente");
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo iniciar sesion");                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
    public void registrar_user(JTextField usuario, JPasswordField clave) {
        setUsuario(usuario.getText());
        String contra = String.valueOf(clave.getPassword());
        setClave(contra);
        Conexion conectar = new Conexion();
        String consulta = "INSERT INTO usuario (usuario.usuario, usuario.clave) VALUES (?, ?);";
        try {
            CallableStatement cs = conectar.comprobarConexion().prepareCall(consulta);
            cs.setString(1, getUsuario());
            cs.setString(2, contra);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se registro correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
}
