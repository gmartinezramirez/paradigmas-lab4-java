package org.example.model;

import java.util.*;
public class Tienda {
    private List<Producto> productos = new ArrayList<Producto>();
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void addClient(String userName) throws TienditaException {
        Cliente c = new Cliente(userName);
        if (!clientes.contains(c))
            this.clientes.add(c);
        else
            throw (new TienditaException(500, "Nombre Usuario ya Existe"));

    }

    public void addProduct(String name, int price) throws TienditaException {
        Producto p = new Producto(name, price);
        if (!productos.contains(p))
            this.productos.add(p);
        else
            throw (new TienditaException(600, "Producto ya existe"));
    }
}