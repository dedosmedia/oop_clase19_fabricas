package com.company;

public class Main {

    public static void main(String[] args) {

        ProductoFactory productoFabrica = ProductoFactory.getInstance();

        Almacen almacen1 = new Almacen();
        almacen1.agregarProducto(productoFabrica.crearProducto(ProductoFactory.CODIGO_CAJA));
        almacen1.agregarProducto(productoFabrica.crearProducto(ProductoFactory.CODIGO_PELOTAFUTBOL));
        almacen1.agregarProducto(productoFabrica.crearProducto(ProductoFactory.CODIGO_PELOTATENNIS));

        System.out.println(almacen1.calcularEspacioNecesario());
    }
}
