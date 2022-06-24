package com.company;

public abstract class Vehiculo {

    private String patente;
    private int posicion;
    private boolean encendido;

    public void encender(){
        encendido = true;
    }
    public void avanzar(){
        posicion = posicion+1;
    }


}
