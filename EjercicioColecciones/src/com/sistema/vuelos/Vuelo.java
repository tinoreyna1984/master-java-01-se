package com.sistema.vuelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vuelo {
    private String vuelo;
    private String origen;
    private String destino;
    private Date fechaHoraLlegada;
    private int pasajeros;

    public Vuelo(String vuelo, String origen, String destino, Date fechaHoraLlegada, int pasajeros) {
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.pasajeros = pasajeros;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaHoraLlegada(){
        return this.fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Date fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
