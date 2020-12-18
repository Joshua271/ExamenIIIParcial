package com.company;

public class Sandalia extends Zapato{

    private String plantilla;

    public Sandalia(String tipo, String marca, String modelo, int talla, float precio, String color, String plantilla) {
        super(tipo, marca, modelo, talla, precio, color);
        this.plantilla = plantilla;
    }

    public String getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(String plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public void dosFile(String fileName) {
        super.newArchivo(getTipo()+" "+getModelo()+".txt");

    }

    @Override
    public String calzar() {
        return super.calzar()+" estas "+getTipo()+" que son talla "+getTalla();
    }


    @Override
    public void writeArchivo(String fileName, String informacion) {
        String datosSandalias= "Tipo: "+getTipo()+", Modelo: "+getModelo()+", Marca: "+getMarca()+", Tipo de plantilla: "+getPlantilla()+", Color: "+getColor()+", Talla: "+getTalla()+", Precio: "+getPrecio();
        inventario.add(datosSandalias);
        super.writeArchivo(getTipo()+" "+getModelo()+".txt", String.valueOf(inventario));
    }
}
