package org.example;

import org.example.ui.Menu;
import org.example.view.MainFrame;
import org.example.view.MiVentanaFrame;
import org.example.view.WaterCalculatorAppGUI;

public class Main {
    public static void main(String[] args) {

        // Documentacion Java Swing: https://docs.oracle.com/javase/tutorial/uiswing/components/list.html
        //System.out.println("Hello world!");
        //new MainFrame().setVisible(true);

        // Mostrar una ventana - Hacer ventana visible
        new MiVentanaFrame().setVisible(true);

        // Ejemplo: calculadora de agua
        //new WaterCalculatorAppGUI().setVisible(true);

        // Ejemplo: tiendita. Otra forma de hacer GUI
        // Menu por terminal
        //Menu m = new Menu();
        //m.run();

        // Menu Grafico
    }
}