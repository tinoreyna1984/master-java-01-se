package com.tienda.app;

public class Factura {
    private int idFactura;
    private double total;
    private String formaPago;
    private OrdenCompra ordenCompra;

    public Factura(int idFactura, double total, String formaPago, OrdenCompra ordenCompra) {
        this.idFactura = idFactura;
        this.total = total;
        this.formaPago = formaPago;
        this.ordenCompra = ordenCompra;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
}
