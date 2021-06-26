package com.cunoc.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.cunoc.app.vehiculos.Vehiculo;
import com.cunoc.app.vehiculos.VehiculoCamioneta;
import com.cunoc.app.vehiculos.VehiculoCarga;
import com.cunoc.app.vehiculos.VehiculoCarrera;

public class ManejadorVehiculo {

    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
   
    Scanner ent = new Scanner(System.in);
   
    double aceleracion;

    public void menu() {
        int opcion;
        char seguir;
        do {
            do {
                System.out.println("1) Ingreso de vehiculo de carga");
                System.out.println("2) Ingreso de vehiculo de carrera");
                System.out.println("3) Ingreso de vehiculo camioneta");
                System.out.println("4) Mostrar datos de vehiculos:");
                opcion = ent.nextInt();
            } while (opcion < 1 || opcion > 3);
            switch (opcion) {
                case 1:
                insertarCarga();
                    break;

                case 2:
                insertarCarrera();
                    break;

                case 3:
                insertarCamioneta();
                    break;

                case 4:
                mostrarDatos();
                break;    

            }

            System.out.println("Desea ingresar mas vehiculos? \ns= Si\n n=No ");
            seguir = ent.nextLine().charAt(0);
        } while (seguir == 's' || seguir == 'S');

    }

    public void insertarCarrera() {
        String combustible;
        int cantidadGalones;
        int cantidadPasajeros;
        int velocidadMaxima;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de combustible de ");
        combustible=entrada.nextLine();
        ent.nextLine();        System.out.println("Ingrese la cantidad de combustible ");
        cantidadGalones=entrada.nextInt();
        System.out.println("Ingrese la cantidad  de pasajeros");
        cantidadPasajeros=entrada.nextInt();
        System.out.println("Ingrese la Velocidad Máxima: ");
        velocidadMaxima=entrada.nextInt();
 
        VehiculoCarrera v1=new VehiculoCarrera(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima);
        
        vehiculos.add(v1);
    }

    public void insertarCarga() {
        String combustible;
        int cantidadGalones;
        int cantidadPasajeros;
        int velocidadMaxima;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tipo de combustible de ");
        combustible=entrada.nextLine();
        System.out.println("Ingrese la cantidad de combustible ");
        cantidadGalones=entrada.nextInt();
        System.out.println("Ingrese la cantidad  de pasajeros");
        cantidadPasajeros=entrada.nextInt();
        System.out.println("Ingrese la Velocidad Máxima: ");
        velocidadMaxima=entrada.nextInt();

        VehiculoCarga v3=new VehiculoCarga(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima);

        vehiculos.add(v3);

    }

    public void insertarCamioneta() {
        String combustible;
        int cantidadGalones;
        int cantidadPasajeros;
        int velocidadMaxima;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tipo de combustible de ");
        combustible=entrada.nextLine();
        System.out.println("Ingrese la cantidad de combustible ");
        cantidadGalones=entrada.nextInt();
        System.out.println("Ingrese la cantidad  de pasajeros");
        cantidadPasajeros=entrada.nextInt();
        System.out.println("Ingrese la Velocidad Máxima: ");
        velocidadMaxima=entrada.nextInt();

        VehiculoCamioneta v2=new VehiculoCamioneta(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima);
        vehiculos.add(v2);
    }

    public void mostrarDatos(){

        for (Vehiculo aux : vehiculos) {
            System.out.println(aux.toString());
            System.out.println("");
        }
    }
}

