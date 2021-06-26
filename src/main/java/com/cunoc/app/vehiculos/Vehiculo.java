package com.cunoc.app.vehiculos;

public abstract class Vehiculo {
    protected String Combustible; // diesel o gasolina
    protected int cantidadGalones; // de combustible
    protected int cantidadPasajeros;
    protected int velocidadMaxima;

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

    public static void pedirObjeto(Vehiculo vehic) {
        if (vehic instanceof VehiculoCamioneta) {
            System.out.println("El vehiculo es Camioneta");

        }
        if(vehic instanceof VehiculoCarga){
            System.out.println("El vehiculo es de carga");
        }
        if(vehic instanceof VehiculoCarrera){
            System.out.println("El vehiculo es de carrera");

        }

    }

    public abstract double getAceleración();

    public abstract void setAceleración(int aceleración);

}
