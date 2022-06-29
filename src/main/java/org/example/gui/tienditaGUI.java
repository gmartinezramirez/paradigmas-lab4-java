package org.example.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import org.example.model.*;

public class tienditaGUI {

    private JFrame frame;
    private JTextField textFieldName;
    private Tienda tiendita = new Tienda();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    tienditaGUI window = new tienditaGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public tienditaGUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 665, 473);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textFieldName = new JTextField();
        frame.getContentPane().add(textFieldName, BorderLayout.NORTH);
        textFieldName.setColumns(10);

        JButton btnAddClient = new JButton("Add Cliente");

        //Mostrar graficam3ente los clientes

        btnAddClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    tiendita.addClient(textFieldName.getText());
                    javax.swing.JOptionPane.showMessageDialog(null, "Cliente agregado con �xito");
                } catch (TienditaException e2) {
                    // TODO: handle exception
                    javax.swing.JOptionPane.showMessageDialog(null, "Error " + e2.getCode() + ": " + e2.getMessage());
                }
            }
        });
        frame.getContentPane().add(btnAddClient, BorderLayout.WEST);
    }

}
