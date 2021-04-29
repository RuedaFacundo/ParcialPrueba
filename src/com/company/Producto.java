package com.company;

public class Producto {

    private String nombre;
    private int stock;
    private double precio;

    public Producto (){}

    public Producto (String nombre, int stock, double precio){
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int actualizarStock (){
        return this.stock - 1;
    }

    @Override
    public String toString(){
        return "Producto: " +
                " Nombre: " + this.nombre;
    }
}
