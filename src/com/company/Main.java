package com.company;

import javax.swing.*;
import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String message = "Que tipo de zapato desea agregar?\n\n1. Tenis\n2. Sandalia\n3. Chinela\n4. Salir\n\nElija una opcion correcta";
        int opt=1;
        boolean bye=false;
        Scanner Sc = new Scanner(System.in);

        do {
            opt= Integer.parseInt(JOptionPane.showInputDialog(message));

            switch (opt){

                case 1:
                    String tipo="Tenis",marca,color,modelo,estilo;
                    int talla;
                    float precio;
                    ArrayList <String> InventarioTenis = new ArrayList<String>();

                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.print("Marca: ");
                    marca=Sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo=Sc.nextLine();
                    System.out.print("Estilo: ");
                    estilo=Sc.nextLine();
                    System.out.print("Color: ");
                    color=Sc.nextLine();
                    System.out.print("Talla: ");
                    talla=Sc.nextInt();
                    System.out.print("Precio: L.");
                    precio=Sc.nextFloat();
                    Sc.nextLine();

                    Zapato tenis = new Tenis(tipo,marca,modelo,talla,precio,color,estilo);
                    tenis.dosFile(tipo+".txt");
                    tenis.writeArchivo(tipo, String.valueOf(InventarioTenis));
                    System.out.println(tenis.calzar());
                    break;

                case 2:
                    String tipo2="Sandalias",marca2,color2,modelo2,estilo2,plantilla;
                    int talla2;
                    float precio2;
                    ArrayList <String> InventarioSandalia = new ArrayList<String>();

                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.print("Marca: ");
                    marca2=Sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo2=Sc.nextLine();
                    System.out.print("Estilo: ");
                    estilo2=Sc.nextLine();
                    System.out.print("Color: ");
                    color2=Sc.nextLine();
                    System.out.print("Tipo de plantilla: ");
                    plantilla=Sc.nextLine();
                    System.out.print("Talla: ");
                    talla2=Sc.nextInt();
                    System.out.print("Precio: L.");
                    precio2=Sc.nextFloat();
                    Sc.nextLine();

                    Zapato sandalia = new Sandalia(tipo2,marca2,modelo2,talla2,precio2,color2,plantilla);
                    sandalia.dosFile(tipo2+".txt");
                    sandalia.writeArchivo(tipo2, String.valueOf(InventarioSandalia));
                    System.out.println(sandalia.calzar());
                    break;

                case 3:
                    String tipo3="Chinelas",marca3,color3,modelo3,estilo3,material,cordones;
                    int talla3;
                    float precio3;
                    ArrayList <String> InventarioChinelas = new ArrayList<String>();

                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.print("Marca: ");
                    marca3=Sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo3=Sc.nextLine();
                    System.out.print("Estilo: ");
                    estilo3=Sc.nextLine();
                    System.out.print("Color: ");
                    color3=Sc.nextLine();
                    System.out.print("Tipo de material: ");
                    material=Sc.nextLine();
                    System.out.print("Aplica cordones: ");
                    cordones=Sc.nextLine();
                    System.out.print("Talla: ");
                    talla3=Sc.nextInt();
                    System.out.print("Precio: L.");
                    precio3=Sc.nextFloat();
                    Sc.nextLine();

                    Zapato chinela = new Chinela(tipo3,marca3,modelo3,talla3,precio3,color3,cordones,material);
                    chinela.dosFile(tipo3+".txt");
                    chinela.writeArchivo(tipo3, String.valueOf(InventarioChinelas));
                    System.out.println(chinela.calzar());
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,"Gracias ing. Walter por todo!");
                    bye=true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Por favor ingrese una opcion correcta");
                    break;
            }
        }while(bye==false);
    }
}
