package com.patrones.singleton;

public class Conexion {
    // 1. la instancia y el constructor deben ser privados
    // 2. la instancia es estática
    private static Conexion instancia = null;
    private Conexion(){
        //Para evitar instancias
    }

    // 3. debe implementarse un método estático getInstance
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

}
