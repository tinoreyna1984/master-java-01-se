package com.mito.concurrencia;

// clase que hereda de Thread
public class THilo extends Thread {

    private int id;

    public THilo(int id){
        this.id = id;
    }

    // método principal que debe sobreescribirse
    @Override
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println("[T]Ejecuntándose hilo de id -->" + id);
        }
    }

}
