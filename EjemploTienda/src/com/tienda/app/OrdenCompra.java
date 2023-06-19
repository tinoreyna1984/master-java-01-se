package com.tienda.app;

import com.tienda.persona.Cliente;
import com.tienda.persona.Empleado;
import com.tienda.producto.Producto;

import java.util.Date;

public class OrdenCompra {
    private int idOrdenCompra;
    private Date fechaHoraCompra;
    private Empleado empleado;
    private Cliente cliente;
    private Producto productos[];

    public OrdenCompra(int idOrdenCompra, Date fechaHoraCompra, Empleado empleado, Cliente cliente, Producto[] productos) {
        this.idOrdenCompra = idOrdenCompra;
        this.fechaHoraCompra = fechaHoraCompra;
        this.empleado = empleado;
        this.cliente = cliente;
        this.productos = productos;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public Date getFechaHoraCompra() {
        return fechaHoraCompra;
    }

    public void setFechaHoraCompra(Date fechaHoraCompra) {
        this.fechaHoraCompra = fechaHoraCompra;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
}
