package com.cunoc.app.vehiculos;

public class VehiculoCamioneta extends Vehiculo implements Giro, Camioneta{
    private double aceleración;

    public VehiculoCamioneta(String Combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima) {
        super(Combustible,cantidadGalones,cantidadPasajeros,velocidadMaxima);
    }

    @Override
    public double getAceleración() {
        
        return this.aceleración;
    }

    @Override
    public void setAceleración(int aceleración) {
        this.aceleración=aceleración;
        
    }

    public void moverIzquierda() {
        System.out.println("Me muevo a la izquierda y llevo pasajeros");
        
    }

    public void moverDerecha() {
        System.out.println("Me muevo a la derecha y llevo pasajeros");
        
    }

    public  void camoineta() {
        System.out.println("Soy un vehiculo de camioneta");        
    }

 


    
}
