package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentanaFrame extends JFrame implements ActionListener {

    private JButton botonAccion;
    private JButton botonAccion2;

    public MiVentanaFrame() {
        super("Mi ventana titulo");
        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        botonAccion = new JButton("Hola soy boton presioname");
        botonAccion2 = new JButton("Hola soy boton 2 presioname");
        add(botonAccion);
        add(botonAccion2);

        botonAccion.setSize(200,300);
        setLayout(new FlowLayout());

        botonAccion.addActionListener(this);
        botonAccion2.addActionListener(this);
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
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }
}
