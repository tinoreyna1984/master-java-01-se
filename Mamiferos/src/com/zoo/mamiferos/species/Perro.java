package com.zoo.mamiferos.species;

import com.zoo.mamiferos.base.Canino;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String nombreCientifico, float altura, float largo, float peso, String habitat, int fuerzaMordida) {
        super(nombreCientifico, altura, largo, peso, habitat);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Perro(String nombreCientifico, float altura, float largo, float peso, String habitat, String color, float tamanoColmillos, int fuerzaMordida) {
        super(nombreCientifico, altura, largo, peso, habitat, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros, al tener una fuerza de mordida de " + this.getFuerzaMordida() + ", se\n"
                + "alimentan fundamentalmente de carne y algunas legumbres caseras. Son omnívoros.";
    }

    @Override
    public String dormir() {
        return "Los perros duermen unas 8 horas.";
    }

    @Override
    public String correr() {
        return "La velocidad del perro es baja en razas pequeñas.";
    }

    @Override
    public String comunicarse() {
        return "Los perros, típicamente, ladran para comunicarse.";
    }
}
