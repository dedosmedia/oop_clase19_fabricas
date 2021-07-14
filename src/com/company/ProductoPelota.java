package com.company;

public class ProductoPelota extends Producto {
    private Double radio;

    public ProductoPelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        Double volumen = (4* (Math.PI)*Math.pow(this.radio, 3.0) )/3;
        return volumen;
    }
}
