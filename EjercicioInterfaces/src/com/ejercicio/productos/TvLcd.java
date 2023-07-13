package com.ejercicio.productos;

import com.ejercicio.abstracta.Electronico;

public class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
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
