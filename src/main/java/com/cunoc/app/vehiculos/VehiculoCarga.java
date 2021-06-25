package com.cunoc.app.vehiculos;

public class VehiculoCarga extends Vehiculo implements Giro,Carga{
    private double aceleración; 


    public VehiculoCarga(String Combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima){
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
       System.out.println("Me estoy moviendo a la Izquierda muy despacio porque llevo carga");
        
    }
    public void moverDerecha() {
        System.out.println("Me estoy moviendo a la Derecha despacio porque llevo carga");
        
    }
    public void carga() {
            System.out.println("Soy un vehiculo de carga");
        
    }
    
}
