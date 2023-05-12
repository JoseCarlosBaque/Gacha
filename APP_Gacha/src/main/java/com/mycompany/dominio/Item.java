/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominio;

/**
 *
 * @author joseb
 */
public class Item implements Cloneable{
    private int id_item;
    private String nombre;
    private int cantidad;
    private String tipo;
    private int id_tienda;
    private boolean stock;

    public Item(int id_item, String nombre, int cantidad, String tipo, int id_tienda) {
        this.id_item = id_item;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.id_tienda = id_tienda;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
