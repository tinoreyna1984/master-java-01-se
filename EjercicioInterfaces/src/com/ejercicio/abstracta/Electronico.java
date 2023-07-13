package com.ejercicio.abstracta;

import com.ejercicio.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
