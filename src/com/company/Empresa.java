package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Cliente implements Pedido2{

    private int cuit;
    private int km;
    private List<Producto> productos = new ArrayList<>();

    public Empresa (){
        super();
    }

    public Empresa (String nombre, String direccion, int telefono, int cuit, int km, List<Producto> productos){
        super(nombre, direccion, telefono);
        this.cuit = cuit;
        this.km = km;
        this.productos = productos;
    }

    @Override
    public double precioEnvio(){
        return (this.km*20) * 0.85; /// km a 20 pesos con descuento del 15%
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
                ", Cuit: " + this.cuit +
                ", Km: " + this.km;

    }

}
