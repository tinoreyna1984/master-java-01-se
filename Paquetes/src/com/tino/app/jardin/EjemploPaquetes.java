package com.tino.app.jardin;

import com.tino.app.hogar.*;

import static com.tino.app.hogar.Persona.*;
import static com.tino.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Andrés");
        p.setApellido("Guzmán");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";
        
        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
