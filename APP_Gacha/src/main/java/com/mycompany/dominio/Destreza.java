/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

/**
 *
 * @author joseb
 */
public class Destreza {
    private int id_destreza;
    private String tipo;
    private int danio;
    private int multlipicador;

    public Destreza(int id_destreza, String tipo, int danio, int multlipicador) {
        this.id_destreza = id_destreza;
        this.tipo = tipo;
        this.danio = danio;
        this.multlipicador = multlipicador;
    }
    
    public int getId_destreza() {
        return id_destreza;
    }

    public void setId_destreza(int id_destreza) {
        this.id_destreza = id_destreza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getMultlipicador() {
        return multlipicador;
    }

    public void setMultlipicador(int multlipicador) {
        this.multlipicador = multlipicador;
    }
    
}
