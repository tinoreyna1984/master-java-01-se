package com.zoo.mamiferos.species;

import com.zoo.mamiferos.base.Felino;

public class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String nombreCientifico, float altura, float largo, float peso, String habitat, int numManada, float potenciaRugidoDecibel) {
        super(nombreCientifico, altura, largo, peso, habitat);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Leon(String nombreCientifico, float altura, float largo, float peso, String habitat, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(nombreCientifico, altura, largo, peso, habitat, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public void setNumManada(int numManada) {
        this.numManada = numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león se alimenta de carne animal de otra especie y humana, en virtud de \n" +
                "su capacidad depredadora y como respuesta a la defensa de su manada";
    }

    @Override
    public String dormir() {
        return "Los leones duermen alrededor de 10 horas";
    }

    @Override
    public String correr() {
        return "Los leones corren en manada, la cual puede tener mínimo " + this.getNumManada() + " integrantes.";
    }

    @Override
    public String comunicarse() {
        return "Los leones rugen para comunicarse de diversas formas con respecto a su manada.\n" +
                "Dicho rugido puede alcanzar los " + this.getPotenciaRugidoDecibel() + " decibeles.";
    }
}
