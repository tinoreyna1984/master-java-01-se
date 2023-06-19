package com.zoo.mamiferos.species;

import com.zoo.mamiferos.base.Felino;

public class Guepardo extends Felino {
    public Guepardo(String nombreCientifico, float altura, float largo, float peso, String habitat) {
        super(nombreCientifico, altura, largo, peso, habitat);
    }

    public Guepardo(String nombreCientifico, float altura, float largo, float peso, String habitat, float tamanoGarras, int velocidad) {
        super(nombreCientifico, altura, largo, peso, habitat, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Los guepardos se alimentan de carne de otros animales que cazan y de humanos";
    }

    @Override
    public String dormir() {
        return "Los guepardos duermen 10 horas diarias";
    }

    @Override
    public String correr() {
        return "Los guepardos corren recorridos de 2 millas a una velocidad de 80 km/h";
    }

    @Override
    public String comunicarse() {
        return "La comunicación de los guepardos es por medio de rugidos hacia su manada.";
    }
}
