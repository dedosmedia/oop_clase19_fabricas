package com.company;

public class ProductoCaja extends Producto{
    private Double longitud;
    private Double ancho;
    private Double altura;

    public ProductoCaja(Double peso, Double longitud, Double ancho, Double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public Double calcularEspacio() {
        Double volumen= this.longitud* this.altura* this.ancho;
        return volumen;
    }
}
