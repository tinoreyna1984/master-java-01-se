package com.tienda.persona;

public class Empleado extends Persona{
    private int id;
    private String rol;
    public Empleado(String nombre, String apellido, String cedula, String direccion) {
        super(nombre, apellido, cedula, direccion);
    }

    public Empleado(String nombre, String apellido, String cedula, String direccion, int id, String rol) {
        super(nombre, apellido, cedula, direccion);
        this.id = id;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
