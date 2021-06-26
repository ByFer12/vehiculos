package com.cunoc.app.vehiculos;

public class VehiculoCarga extends Vehiculo implements Giro,Carga{
    private double aceleracion; 


    public VehiculoCarga(String Combustible, int cantidadGalones, int cantidadPasajeros, int velocidadMaxima){
        super(Combustible,cantidadGalones,cantidadPasajeros,velocidadMaxima);
    }
    @Override
    public double getAceleración() {

        return this.aceleracion;
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
    @Override
    public void setAceleración(double aceleración) {
        this.aceleracion=aceleración;
        
    }


    @Override
    public String toString() {
        return super.toString()+ " aceleracion='" + aceleracion;
    }

 
    
}
