package com.company;

public class Cliente {

    private String nombre;
    private String direccion;
    private int telefono;

    public Cliente (){}

    public Cliente (String nombre, String direccion, int telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return " Nombre: " + this.nombre +
                ", Direccion: " + this.direccion +
                ", Telefono: " + this.telefono;
    }
}
