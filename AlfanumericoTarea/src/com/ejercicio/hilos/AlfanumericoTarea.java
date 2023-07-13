package com.ejercicio.hilos;

import com.ejercicio.enums.Tipo;

public class AlfanumericoTarea implements Runnable{
    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        switch (tipo){
            case NUMERO:
                for (int i = 1; i < 10; i++) {
                    System.out.println("[N]: " + i);
                }
                break;
            case LETRA:
                char[] letras = {
                        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                        'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q',
                        'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                };
                for (int i = 0; i < 27; i++) {
                    System.out.println("[L]: " + letras[i]);
                }
                break;
        }
    }
}
