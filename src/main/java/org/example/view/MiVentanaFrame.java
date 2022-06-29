package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentanaFrame extends JFrame implements ActionListener {

    private JButton botonAccion;
    private JButton botonAccion2;

    private JButton botonAccion3;
    private JButton botonAbrirVentanaListas;

    public MiVentanaFrame() {
        // Esto siempre va en todas las ventanas
        super("Mi ventana titulo");
        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        botonAccion = new JButton("Hola soy boton presioname");
        botonAccion2 = new JButton("Hola soy boton 2 presioname");
        botonAccion3 = new JButton("Hola soy boton 3 presioname");
        botonAbrirVentanaListas = new JButton("Abrir ventana con listas");

        // Los componentes se agregan a la ventana con add
        add(botonAccion);
        add(botonAccion2);
        add(botonAccion3);
        add(botonAbrirVentanaListas);

        botonAccion.setSize(200,300);

        // Layout: Organizacion de los componentes graficos
        setLayout(new FlowLayout());

        // ActionLister: escucha cambios en los componentes graficos
        botonAccion.addActionListener(this);
        botonAccion2.addActionListener(this);
        botonAccion3.addActionListener(this);
        botonAbrirVentanaListas.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == botonAccion) {
                String message = "Hola, esto es mi superboton accion";
                JOptionPane.showMessageDialog(this, message);
            } else if (evento.getSource() == botonAccion2) {
                this.setVisible(false);
                new MainFrame().setVisible(true);
                new LoginFrame().setVisible(true);
            } else if (evento.getSource() == botonAccion3) {
                System.out.println("Se apreto boton 3");
                // abrir otra ventana es crear (pasar por contructor) y
                // hacerlo visible con .setVisible(true);
                //this.setVisible(false);
                new WaterCalculatorAppGUI().setVisible(true);
            } else if (evento.getSource() == botonAbrirVentanaListas) {
                new VentanaListasFrame().setVisible(true);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }
}
