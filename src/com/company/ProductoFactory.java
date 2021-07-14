package com.company;

public class ProductoFactory {
    private static ProductoFactory instance;

    public static final String CODIGO_CAJA = "CAJA10X10";
    public static final String CODIGO_PELOTAFUTBOL = "PELOTAFUTBOL";
    public static final String CODIGO_PELOTATENNIS = "PELOTATENNIS";

    private ProductoFactory(){}

    public static ProductoFactory getInstance(){
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto (String codigo){
        switch (codigo){
            case CODIGO_CAJA:
                return new ProductoCaja(20.0, 10.0, 10.0, 10.0);
            case CODIGO_PELOTAFUTBOL:
                return new ProductoPelota(30.0, 11.0);
            case CODIGO_PELOTATENNIS:
                return new ProductoPelota(10.0, 0.32);
            default:
                System.out.println("Escoge un producto válido");
                return null;
        }
    }

}
