package ventanas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuPrincipal extends JFrame implements ActionListener{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    public MenuPrincipal(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,255));
        
    boton1 = new JButton("Registrar");
    boton1.setBounds(125,320,100,30);
    boton1.setBackground(new Color(255,255,255));
    boton1.setFont(new Font("Andale Mono", 1, 14));
    boton1.setForeground(new Color(255,0,0));
    boton1.addActionListener(this);
    add(boton1);

    boton2 = new JButton("Buscar");
    boton2.setBounds(125,100,100,30);
    boton2.setBackground(new Color(255,255,255));
    boton2.setFont(new Font("Andale Mono", 1, 14));
    boton2.setForeground(new Color(255,0,0));
    boton2.addActionListener(this);
    add(boton2);

    boton3 = new JButton("Comprar");
    boton3.setBounds(125,150,100,30);
    boton3.setBackground(new Color(255,255,255));
    boton3.setFont(new Font("Andale Mono", 1, 14));
    boton3.setForeground(new Color(255,0,0));
    boton3.addActionListener(this);
    add(boton3);

    boton4 = new JButton("Salir");
    boton4.setBounds(125,200,100,30);
    boton4.setBackground(new Color(255,255,255));
    boton4.setFont(new Font("Andale Mono", 1, 14));
    boton4.setForeground(new Color(255,0,0));
    boton4.addActionListener(this);
    add(boton4);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Registrar ventanalicencia = new Registrar();
            ventanalicencia.setBounds(0,0,600,500);
            ventanalicencia.setVisible(true);
            ventanalicencia.setResizable(false);
            ventanalicencia.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton2){
            Buscar ventanalicencia = new Buscar();
            ventanalicencia.setBounds(0,0,600,500);
            ventanalicencia.setVisible(true);
            ventanalicencia.setResizable(false);
            ventanalicencia.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton3){
            Comprar ventanalicencia = new Comprar();
            ventanalicencia.setBounds(0,0,600,500);
            ventanalicencia.setVisible(true);
            ventanalicencia.setResizable(false);
            ventanalicencia.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton4){
            System.exit(0);
        }
    }

}
