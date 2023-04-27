/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

/**
 *
 * @author joseb
 */
public class Banner {
    private int id_banner;
    private String nombre;
    private int precio;
    private int step;
    private int prob_nuevo;
    private int prob_sp;
    private int prob_ex;
    private int prob_hero;

    public Banner(int id_banner, String nombre, int precio, int step, int prob_nuevo, int prob_sp, int prob_ex, int prob_hero) {
        this.id_banner = id_banner;
        this.nombre = nombre;
        this.precio = precio;
        this.step = step;
        this.prob_nuevo = prob_nuevo;
        this.prob_sp = prob_sp;
        this.prob_ex = prob_ex;
        this.prob_hero = prob_hero;
    }

    public int getId_banner() {
        return id_banner;
    }

    public void setId_banner(int id_banner) {
        this.id_banner = id_banner;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getProb_nuevo() {
        return prob_nuevo;
    }

    public void setProb_nuevo(int prob_nuevo) {
        this.prob_nuevo = prob_nuevo;
    }

    public int getProb_sp() {
        return prob_sp;
    }

    public void setProb_sp(int prob_sp) {
        this.prob_sp = prob_sp;
    }

    public int getProb_ex() {
        return prob_ex;
    }

    public void setProb_ex(int prob_ex) {
        this.prob_ex = prob_ex;
    }

    public int getProb_hero() {
        return prob_hero;
    }

    public void setProb_hero(int prob_hero) {
        this.prob_hero = prob_hero;
    }
}
