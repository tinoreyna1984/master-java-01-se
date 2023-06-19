package com.tienda.producto;

import java.util.Date;

public class Producto {
    private String nombre;
    private double precio;
    private String marca;
    private Date fechaVencimiento;

    public Producto(String nombre, double precio, String marca, Date fechaVencimiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
