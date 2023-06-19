package com.zoo.mamiferos.base;

abstract public class Canino extends Mamifero {
    private String color;
    private float tamanoColmillos;
    public Canino(String nombreCientifico, float altura, float largo, float peso, String habitat) {
        super(nombreCientifico, altura, largo, peso, habitat);
    }

    public Canino(String nombreCientifico, float altura, float largo, float peso, String habitat, String color, float tamanoColmillos) {
        super(nombreCientifico, altura, largo, peso, habitat);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }
}
