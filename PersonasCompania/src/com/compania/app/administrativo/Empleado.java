package com.compania.app.administrativo;

import com.compania.app.Persona;

public class Empleado extends Persona {
    private int empleadoId;
    private double remuneracion;
    private static int ultimoId;
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = ++ultimoId;
    }
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = ++ultimoId;
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion += (porcentaje*remuneracion)/100;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nID: " + empleadoId +
                "\nRemuneracion: " + remuneracion;
    }
}
