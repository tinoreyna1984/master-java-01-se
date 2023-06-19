package com.tienda.producto;

import java.util.Date;

public class Comestible  extends Producto{

    private boolean esPerecedero;
    public Comestible(String nombre, double precio, String marca, Date fechaVencimiento) {
        super(nombre, precio, marca, fechaVencimiento);
    }

    public Comestible(String nombre, double precio, String marca, Date fechaVencimiento, boolean esPerecedero) {
        super(nombre, precio, marca, fechaVencimiento);
        this.esPerecedero = esPerecedero;
    }

    public boolean isEsPerecedero() {
        return esPerecedero;
    }

    public void setEsPerecedero(boolean esPerecedero) {
        this.esPerecedero = esPerecedero;
    }
}
