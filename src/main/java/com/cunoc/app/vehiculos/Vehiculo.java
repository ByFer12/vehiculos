package com.cunoc.app.vehiculos;

public abstract class Vehiculo {
    private String Combustible; // diesel o gasolina
    private int cantidadGalones; // de combustible
    private int cantidadPasajeros;
    private int velocidadMaxima;

    public Vehiculo() {
    }

    public Vehiculo(String Combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima) {
        this.Combustible = Combustible;
        this.cantidadGalones = cantidadGalones;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;

    }

    public String getCombustible() {
        return this.Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public int getCantidadGalones() {
        return this.cantidadGalones;
    }

    public void setCantidadGalones(int cantidadGalones) {
        this.cantidadGalones = cantidadGalones;
    }

    public int getCantidadPasajeros() {
        return this.cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract double getAceleración();

    public abstract void setAceleración(int aceleración);

}
