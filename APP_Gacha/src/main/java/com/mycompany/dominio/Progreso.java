/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

import java.sql.Date;

/**
 *
 * @author joseb
 */
public class Progreso {
    private int id_progreso;
    private int id_usuario;
    private int experiencia;
    private Date fecha;

    public Progreso() {
    }

    public Progreso(int id_progreso, int id_usuario, int experiencia, Date fecha) {
        this.id_progreso = id_progreso;
        this.id_usuario = id_usuario;
        this.experiencia = experiencia;
        this.fecha = fecha;
    }

    public int getId_progreso() {
        return id_progreso;
    }

    public void setId_progreso(int id_progreso) {
        this.id_progreso = id_progreso;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
