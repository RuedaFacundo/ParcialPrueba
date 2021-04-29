package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    Producto Televisor = new Producto("Televisor", 30, 45000);
    Producto Notebook = new Producto("Notebook", 30, 60000);
    Producto Celular = new Producto("Celular", 30, 25000);

    List<Producto> productList = new ArrayList<>();
    productList.add(Televisor);
    productList.add(Notebook);
    productList.add(Celular);

    Empresa Arcor = new Empresa("Arcor", "Gascon 1050", 223500989, 30714802, 5, productList);
    Particular Facundo = new Particular("Facundo", "Friuli 797", 22300044, 36617491, 10, productList);


    Scanner entradaEscaner = new Scanner (System.in);


        System.out.println("Seleccione una opcion");
        System.out.println("1. Persona Juridica");
        System.out.println("2. Persona Fisica");
        int opcion;
        opcion = entradaEscaner.nextInt();
        switch (opcion){
            case 1: /// EMPRESA
                System.out.println ("Razon social:");
                String nombreCliente = "";
                nombreCliente = entradaEscaner.nextLine();
                System.out.println ("Direccion:");
                String direccionCliente = "";
                direccionCliente = entradaEscaner.nextLine();
                System.out.println("Telefono:");
                int telefonoCliente;
                telefonoCliente = entradaEscaner.nextInt();
                System.out.println("CUIT:");
                int cuitCliente;
                cuitCliente = entradaEscaner.nextInt();
                System.out.println("Km de distancia:");
                int kmEnvio;
                kmEnvio = entradaEscaner.nextInt();
                Empresa company = new Empresa(nombreCliente, direccionCliente, telefonoCliente, cuitCliente, kmEnvio, productList);
                System.out.println(company);
                break;

            case 2: /// PERSONA
                System.out.println("Nombre:");
                String nombrePersona;
                nombrePersona = entradaEscaner.nextLine ();
                System.out.println("Direccion:");
                String direccionPersona;
                direccionPersona = entradaEscaner.nextLine ();
                System.out.println("Telefono:");
                int telefonoPersona;
                telefonoPersona = entradaEscaner.nextInt();
                System.out.println("DNI:");
                int dniPersona;
                dniPersona = entradaEscaner.nextInt();
                System.out.println("Km de distancia:");
                int kmEnvioPersona;
                kmEnvioPersona = entradaEscaner.nextInt();
                Particular person = new Particular(nombrePersona, direccionPersona, telefonoPersona, dniPersona, kmEnvioPersona, productList);
                System.out.println(person);
                break;

            default:
                System.out.println("Ingrese un numero valido");
                break;

        }



    }
}
