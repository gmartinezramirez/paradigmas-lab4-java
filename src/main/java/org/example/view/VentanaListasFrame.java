package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaListasFrame extends JFrame implements ActionListener {

    List<String> nombreUsuarios = new ArrayList<>();

    JTextField nombreUsuarioTextField;
    JButton btnAgregarUser;

    JLabel nombreUsuarioLabel;

    DefaultListModel listModel;

    JList listaNombres;


    public VentanaListasFrame() {
        super("Mi ventana con listas");
        setSize(200, 200);
        setLocationRelativeTo(null);

        nombreUsuarioLabel = new JLabel("Escribe un nombre de user");
        nombreUsuarioTextField = new JTextField(5);
        btnAgregarUser = new JButton("Agregar usuario");

        listModel = new DefaultListModel();
        var listaNombres = new JList(listModel);
        add(listaNombres);

        add(nombreUsuarioLabel);
        add(nombreUsuarioTextField);
        add(btnAgregarUser);

        // Layout: Organizacion de los componentes graficos
        setLayout(new FlowLayout());

        btnAgregarUser.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregarUser) {
            var nombre = nombreUsuarioTextField.getText();
            // elemento grafico
            listModel.addElement(nombre);
        }
    }
}
