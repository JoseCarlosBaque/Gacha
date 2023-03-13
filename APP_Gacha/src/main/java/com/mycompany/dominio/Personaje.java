/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

/**
 *
 * @author joseb
 */
public class Personaje {
    private int id_personaje;
    private String nombre;
    private String titulo;
    private String tipo;
    private int salud;
    private int nivel;
    private int daño_fisico;
    private int daño_energia;
    private int defensa_fisica;
    private int defensa_enegia;
    private int critico;
    private int soul;
    private int estrellas;

    public Personaje() {
    }

    public Personaje(String nombre, String titulo, String tipo, int salud, int nivel, int daño_fisico, int daño_energia, int defensa_fisica, int defensa_enegia, int critico, int soul, int estrellas) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.tipo = tipo;
        this.salud = salud;
        this.nivel = nivel;
        this.daño_fisico = daño_fisico;
        this.daño_energia = daño_energia;
        this.defensa_fisica = defensa_fisica;
        this.defensa_enegia = defensa_enegia;
        this.critico = critico;
        this.soul = soul;
        this.estrellas = estrellas;
    }

    public Personaje(int id_personaje, String nombre, String titulo, String tipo, int salud, int nivel, int daño_fisico, int daño_energia, int defensa_fisica, int defensa_enegia, int critico, int soul, int estrellas) {
        this.id_personaje = id_personaje;
        this.nombre = nombre;
        this.titulo = titulo;
        this.tipo = tipo;
        this.salud = salud;
        this.nivel = nivel;
        this.daño_fisico = daño_fisico;
        this.daño_energia = daño_energia;
        this.defensa_fisica = defensa_fisica;
        this.defensa_enegia = defensa_enegia;
        this.critico = critico;
        this.soul = soul;
        this.estrellas = estrellas;
    }

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDaño_fisico() {
        return daño_fisico;
    }

    public void setDaño_fisico(int daño_fisico) {
        this.daño_fisico = daño_fisico;
    }

    public int getDaño_energia() {
        return daño_energia;
    }

    public void setDaño_energia(int daño_energia) {
        this.daño_energia = daño_energia;
    }

    public int getDefensa_fisica() {
        return defensa_fisica;
    }

    public void setDefensa_fisica(int defensa_fisica) {
        this.defensa_fisica = defensa_fisica;
    }

    public int getDefensa_enegia() {
        return defensa_enegia;
    }

    public void setDefensa_enegia(int defensa_enegia) {
        this.defensa_enegia = defensa_enegia;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getSoul() {
        return soul;
    }

    public void setSoul(int soul) {
        this.soul = soul;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
}
