package com.almacen.productos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        // 2 lácteos
        Lacteo leche, yogurt;
        leche = new Lacteo("Gloria", (double)1.25, 1, 25);
        yogurt = new Lacteo("Toni", (double)2, 2, 30);

        // 2 frutas
        Fruta naranja, manzana;
        naranja = new Fruta("naranja", (double) 2, 2, "anaranjado");
        manzana = new Fruta("manzana", (double) 3, 2, "rojo");

        // 2 productos de limpieza
        Limpieza detergente, lejia;
        detergente = new Limpieza("Ace", 2.25,"sulfonato de sodio", 1.25);
        lejia = new Limpieza("Clorox", 1.50, "hipoclorito de sodio", 1.00);

        // 2 productos no perecibles
        NoPerecible arroz, frejolConTocino;
        arroz = new NoPerecible("Paisana", 3.25, 20, 30);
        frejolConTocino = new NoPerecible("Facundo", 1.30, 1, 5);

        productos[0] = leche;
        productos[1] = yogurt;
        productos[2] = naranja;
        productos[3] = manzana;
        productos[4] = detergente;
        productos[5] = lejia;
        productos[6] = arroz;
        productos[7] = frejolConTocino;

        System.out.println("Lista de productos:");
        for (int i = 0; i < 8; i++) {
            imprimir(productos[i]);
        }
    }

    public static void imprimir(Producto producto){
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        if(producto instanceof Lacteo){
            System.out.println("Cantidad: " + ((Lacteo) producto).getCantidad());
            System.out.println("Proteínas: " + ((Lacteo) producto).getProteinas());
        } else if (producto instanceof Fruta){
            System.out.println("Peso: " + ((Fruta) producto).getPeso());
            System.out.println("Color: " + ((Fruta) producto).getColor());
        } else if (producto instanceof Limpieza) {
            System.out.println("Componente activo: " + ((Limpieza) producto).getComponentes());
            System.out.println("Litros: " + ((Limpieza) producto).getLitros());
        } else if (producto instanceof NoPerecible) {
            System.out.println("Contenido: " + ((NoPerecible) producto).getContenido());
            System.out.println("Calorías: " + ((NoPerecible) producto).getCalorias());
        }
    }
}
