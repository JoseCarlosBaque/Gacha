/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.DAO;

import com.mycompany.dominio.Usuario;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author joseb
 */
public interface IUsuarioDAO {
    public void registrar_usuario(JTextField usuario, JPasswordField clave);
    public boolean validar_usuario(JTextField usuario, JPasswordField clave);
    public void elimina_user(Usuario user);
}
