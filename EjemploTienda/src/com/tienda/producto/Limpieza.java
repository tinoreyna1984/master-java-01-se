package com.tienda.producto;

import java.util.Date;

public class Limpieza extends Producto{
    private String componenteActivo;
    private double Capacidad;
    public Limpieza(String nombre, double precio, String marca, Date fechaVencimiento) {
        super(nombre, precio, marca, fechaVencimiento);
    }

    public Limpieza(String nombre, double precio, String marca, Date fechaVencimiento, String componenteActivo, double capacidad) {
        super(nombre, precio, marca, fechaVencimiento);
        this.componenteActivo = componenteActivo;
        Capacidad = capacidad;
    }

    public String getComponenteActivo() {
        return componenteActivo;
    }

    public void setComponenteActivo(String componenteActivo) {
        this.componenteActivo = componenteActivo;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double capacidad) {
        Capacidad = capacidad;
    }
}
