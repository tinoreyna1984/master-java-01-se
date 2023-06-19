package com.zoo.mamiferos.species;

import com.zoo.mamiferos.base.Canino;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String nombreCientifico, float altura, float largo, float peso, String habitat, int numCamada, String especieLobo) {
        super(nombreCientifico, altura, largo, peso, habitat);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Lobo(String nombreCientifico, float altura, float largo, float peso, String habitat, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(nombreCientifico, altura, largo, peso, habitat, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "Los lobos, en manadas de " + this.getNumCamada() + ", se alimentan de una misma presa después\n"
                + "de haberla cazado.";
    }

    @Override
    public String dormir() {
        return "Un lobo puede dormir hasta 10 horas.";
    }

    @Override
    public String correr() {
        return "Los lobos pueden ir a diversas velocidades desde 50 Km/h.";
    }

    @Override
    public String comunicarse() {
        return "La comunicación típica del lobo es por medio del aullido.";
    }
}
