package com.ejercicio.abstracta;

import com.ejercicio.interfaces.IProducto;

abstract public class Producto implements IProducto {
    private int precio;
    private double precioVenta;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return (double) precio * 0.75;
    }
}
