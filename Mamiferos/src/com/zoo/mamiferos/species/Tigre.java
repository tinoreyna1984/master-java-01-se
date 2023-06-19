package com.zoo.mamiferos.species;

import com.zoo.mamiferos.base.Felino;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String nombreCientifico, float altura, float largo, float peso, String habitat, String especieTigre) {
        super(nombreCientifico, altura, largo, peso, habitat);
        this.especieTigre = especieTigre;
    }

    public Tigre(String nombreCientifico, float altura, float largo, float peso, String habitat, float tamanoGarras, int velocidad, String especieTigre) {
        super(nombreCientifico, altura, largo, peso, habitat, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "Los tigres de especie " + this.getEspecieTigre() + " son carnívoros.\n"
                + "Se alimentan de otros animales a los que depredan como también de humanos";
    }

    @Override
    public String dormir() {
        return "Duermen un espacio de 10 horas.";
    }

    @Override
    public String correr() {
        return "Los tigres corren recorridos de 2 millas a una velocidad de 80 km/h";
    }

    @Override
    public String comunicarse() {
        return "La comunicación de los tigres es por medio de rugidos hacia su manada.";
    }
}
