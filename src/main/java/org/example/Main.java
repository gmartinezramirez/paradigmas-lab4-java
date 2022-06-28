package org.example;

import org.example.view.MainFrame;
import org.example.view.MiVentanaFrame;
import org.example.view.WaterCalculatorAppGUI;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //new MainFrame().setVisible(true);

        // Mostrar una ventana - Hacer ventana visible
        new MiVentanaFrame().setVisible(true);

        new WaterCalculatorAppGUI().setVisible(true);
    }
}