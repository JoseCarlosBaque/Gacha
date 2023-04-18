/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

/**
 *
 * @author joseb
 */
public class Evento {
    private int id_evento;
    private int id_progreso;
    private String nombre;
    private int niveles;

    public Evento(int id_evento, String nombre, int niveles) {
        this.id_evento = id_evento;
        this.nombre = nombre;
        this.niveles = niveles;
    }
    
    public int getId_evento() {
        return id_evento;
    }

    public int getId_progreso() {
        return id_progreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNiveles() {
        return niveles;
    }
    
}
