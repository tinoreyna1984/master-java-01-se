package com.tienda.persona;

public class Cliente extends Persona{
    private int idCliente;
    public Cliente(String nombre, String apellido, String cedula, String direccion) {
        super(nombre, apellido, cedula, direccion);
    }

    public Cliente(String nombre, String apellido, String cedula, String direccion, int idCliente) {
        super(nombre, apellido, cedula, direccion);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
