package org.example.model;

import java.util.*;

class Carrito {
    private List<Producto> productos = new ArrayList<Producto>();

    void add(Producto p) {
        this.productos.add(p);
    }

    Producto getProducto(int i) {
        return productos.get(i);
    }

    @Override
    public String toString() {
        //Parte de la base que la Clase Producto
        //Cuenta con su propio toString
        //para poder obtener una representación
        //String de cada objeto Producto en la lista
        //Esta es una implementación básica y
        //se podría mejorar cambiando el formato
        return this.productos.toString();
    }


}