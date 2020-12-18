package com.company;

public class Tenis extends Zapato{

    private String estilo;

    public Tenis(String tipo,String marca, String modelo, int talla, float precio, String color, String estilo) {
        super(tipo,marca, modelo, talla, precio, color);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String calzar() {
        return super.calzar()+" estos "+getTipo()+" que son talla "+getTalla();
    }

    @Override
    public void dosFile(String fileName) {
        super.newArchivo(getTipo()+" "+getModelo()+".txt");
    }

    @Override
    public void writeArchivo(String fileName, String informacion) {
        String datosTenis= "Tipo: "+getTipo()+", Modelo: "+getModelo()+" ,Marca: "+getMarca()+" ,Estilo: "+getEstilo()+" ,Color: "+getColor()+" ,Talla: "+getTalla()+" ,Precio: "+getPrecio();
        inventario.add(datosTenis);
        super.writeArchivo(getTipo()+" "+getModelo()+".txt", String.valueOf(inventario));
    }
}
