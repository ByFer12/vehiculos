package com.cunoc.app.vehiculos;

public class VehiculoCarrera extends Vehiculo implements Giro, Carrera{

    private double aceleracion;

    public VehiculoCarrera(String Combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima) {
        super(Combustible,cantidadGalones,cantidadPasajeros,velocidadMaxima);
    }


    @Override
    public double getAceleración() {
        
        return this.aceleracion;
    }

    @Override
    public void setAceleración(double aceleracion) {
        this.aceleracion=aceleracion;

    }


    public void moverIzquierda() {
        System.out.println("Me muevo a la Izquierda muy rapido porque soy de carrera");
        
    }


    public void moverDerecha() {
        System.out.println("Me muevo a la Derecha muy rapido porque soy de carrera");        
    }


    public void carrera() {
        System.out.println("Soy un vehiculo de carrera");
        
    }
    

    @Override
    public String toString() {
        return super.toString() +" aceleracion='" + aceleracion;
    }

}
