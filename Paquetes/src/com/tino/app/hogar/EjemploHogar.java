package com.tino.app.hogar;

import com.tino.app.jardin.Perro;

import static com.tino.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
