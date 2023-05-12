/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

import java.util.ArrayList;

/**
 *
 * @author joseb
 */
public class Usuario {
    private int id_usuario;
    private String usuario;
    private String clave;
    private int nivel;
    private ArrayList<Personaje> equipo = new ArrayList<Personaje>();
    private ArrayList<Item> items = new ArrayList<Item>();

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

    public ArrayList<Personaje> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Personaje> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
}
