package com.company;

import java.util.ArrayList;
import java.util.List;

public class Particular extends Cliente implements Pedido2{

    private int dni;
    private int km;
    private List<Producto> productos = new ArrayList<>();


    public Particular (){
        super();
    }

    public Particular (String nombre, String direccion, int telefono, int dni, int km, List<Producto> productos){
        super(nombre, direccion, telefono);
        this.dni = dni;
        this.km = km;
        this.productos = productos;
    }

    @Override
    public double precioEnvio(){
        return this.km*20; /// km a 20 pesos
    }

    @Override
    public double precioTotal(){
        double total = 0;
        for (Producto producto : productos){
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public void imprimirProductos(){
        for (Producto producto : productos){
            System.out.println(producto.toString());
        }
    }

    @Override
    public String toString(){
        return " Empresa: " +
                super.toString() +
                ", Dni: " + this.dni +
                ", Km: " + this.km;
    }



}
