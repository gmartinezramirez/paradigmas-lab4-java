package org.example.ui;

import java.util.Scanner;

import org.example.model.Tienda;
import org.example.model.TienditaException;

public class Menu {
    private Tienda tiendita = new Tienda();
    private boolean salir = false;

    private void displayOptions() {
        System.out.println("Bienvenido");
        System.out.println("Ingrese una opción");
        System.out.println("1) Agregar cliente");
        System.out.println("2) Agregar producto");
        System.out.println("3) Salir");
    }

    public void run() {
        while (!salir) {
            displayOptions();
            scanOption();
        }
    }

    private void scanOption() {

        Scanner keyboard = new Scanner(System.in);
        int o = keyboard.nextInt();

        switch (o) {
            case 1:
                addClient();
                break;

            case 2:
                addProduct();
                break;

            case 3:
                salir = true;
                break;
        }

    }

    private void addClient() {
        System.out.println("Ingrese el nombre del cliente");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        try {
            tiendita.addClient(name);
            System.out.println("Cliente agregado con �xito");
        } catch (TienditaException te) {
            System.out.println(te.getCode() + ": " + te.getMessage());
        }
    }

    private void addProduct() {
        System.out.println("Ingrese el nombre del producto");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println("Ingrese el precio del producto");
        int price = keyboard.nextInt();
        try {
            tiendita.addProduct(name, price);
            System.out.println("Producto agregado con �xito");
        } catch (TienditaException te) {
            System.out.println(te.getCode() + ": " + te.getMessage());
        }

    }
}