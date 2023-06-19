package com.almacen.productos;

public class Fruta extends Producto {
    private int peso;
    private String color;

    public Fruta(String nombre, Double precio) {
        super(nombre, precio);
    }

    public Fruta(String nombre, Double precio, int peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
