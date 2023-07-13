package com.ejercicio.productos;

import java.util.Date;

public class Comic extends Libro{
    private String personaje;

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public Date getFechaPublicacion() {
        return super.getFechaPublicacion();
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public String getEditorial() {
        return super.getEditorial();
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }
}
