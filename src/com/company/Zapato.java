package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Zapato {

    private String tipo;
    private String marca;
    private String modelo;
    private int talla;
    private float precio;
    private String color;
    ArrayList <String> inventario = new ArrayList<>();

    public Zapato(String tipo, String marca, String modelo, int talla, float precio, String color) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void dosFile(String fileName);

    public String calzar(){
        return "Que bien me quedan";
    }

    public void newArchivo(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e){
                System.out.println("Excepcion encontrada: "+e);
            }
        }
    }

    public void writeArchivo(String fileName, String informacion) {
        FileWriter file = null;
        try {
            file = new FileWriter(fileName,true);
            file.write(informacion);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
