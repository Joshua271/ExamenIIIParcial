package com.company;

public class Chinela extends Zapato{

    private String cordones;
    private String material;

    public Chinela(String tipo, String marca, String modelo, int talla, float precio, String color, String cordones, String material) {
        super(tipo, marca, modelo, talla, precio, color);
        this.cordones = cordones;
        this.material = material;
    }

    public String getCordones() {
        return cordones;
    }

    public void setCordones(String cordones) {
        this.cordones = cordones;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        String datosChinelas= "Tipo: "+getTipo()+", Modelo: "+getModelo()+", Marca: "+getMarca()+", Color: "+getColor()+", Talla: "+getTalla()+", Aplica cordones: "+getCordones()+", Tipo de material:"+getMaterial()+", Precio: "+getPrecio();
        inventario.add(datosChinelas);
        super.writeArchivo(getTipo()+" "+getModelo()+".txt", String.valueOf(inventario));
    }
}
