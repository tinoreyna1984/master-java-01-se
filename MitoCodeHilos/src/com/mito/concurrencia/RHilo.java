package com.mito.concurrencia;

// clase que implementa la interfaz Runnable
public class RHilo implements Runnable {

    private int id;

    public RHilo(int id){
        this.id = id;
    }

    // debe implementarse este método
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println("[R]Ejecuntándose hilo de id -->" + id);
        }

    }

}
