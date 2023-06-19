package com.zoo.mamiferos.base;

abstract public class Felino extends Mamifero {
    private float tamanoGarras;
    private int velocidad;
    public Felino(String nombreCientifico, float altura, float largo, float peso, String habitat) {
        super(nombreCientifico, altura, largo, peso, habitat);
    }

    public Felino(String nombreCientifico, float altura, float largo, float peso, String habitat, float tamanoGarras, int velocidad) {
        super(nombreCientifico, altura, largo, peso, habitat);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }
}
