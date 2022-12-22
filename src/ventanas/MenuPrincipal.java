package ventanas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

public class MenuPrincipal extends JFrame implements ActionListener{
    private JButton boton1, boton2, boton3, boton4, boton5;
    private JLabel labelLogo, labelTitulo;

    public MenuPrincipal(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,255));

    ImageIcon imagen = new ImageIcon("utils/inicio_image.jpeg");
    labelLogo = new JLabel(imagen);  
    labelLogo.setBounds(0,0,1050,600);
    add(labelLogo);

    ImageIcon titulo = new ImageIcon("utils/accesorios.png");
    labelTitulo = new JLabel(titulo);  
    labelTitulo.setBounds(-180,-10,1050,200);
    labelLogo.add(labelTitulo);

    BevelBorder bevel = new BevelBorder(1, new Color(222,125,83), new Color(222,125,83));
    boton1 = new JButton("Registrar");
    boton1.setBounds(50,225,150,150);
    boton1.setBackground(new Color(248,222,207));
    boton1.setFont(new Font("Calibri", 3, 25));
    boton1.setForeground(new Color(222,125,83));
    boton1.addActionListener(this);
    boton1.setBorder(bevel);
    labelLogo.add(boton1);

    BevelBorder bevel1 = new BevelBorder(1, new Color(222,125,83), new Color(222,125,83));
    boton2 = new JButton("Buscar");
    boton2.setBounds(50,400,150,150);
    boton2.setBackground(new Color(248,222,207));
    boton2.setFont(new Font("Calibri", 3, 25));
    boton2.setForeground(new Color(222,125,83));
    boton2.addActionListener(this);
    boton2.setBorder(bevel1);
    labelLogo.add(boton2);

    BevelBorder bevel2 = new BevelBorder(1, new Color(222,125,83), new Color(222,125,83));
    boton3 = new JButton("Comprar");
    boton3.setBounds(225,225,150,150);
    boton3.setBackground(new Color(248,222,207));
    boton3.setFont(new Font("Calibri", 3, 25));
    boton3.setForeground(new Color(222,125,83));
    boton3.addActionListener(this);
    boton3.setBorder(bevel2);
    labelLogo.add(boton3);

    BevelBorder bevel3 = new BevelBorder(1, new Color(222,125,83), new Color(222,125,83));
    boton4 = new JButton("Listado");
    boton4.setBounds(225,400,150,150);
    boton4.setBackground(new Color(248,222,207));
    boton4.setFont(new Font("Calibri", 3, 25));
    boton4.setForeground(new Color(222,125,83));
    boton4.addActionListener(this);
    boton4.setBorder(bevel3);
    labelLogo.add(boton4);

    BevelBorder bevel4 = new BevelBorder(1, new Color(222,125,83), new Color(222,125,83));
    boton5 = new JButton("Salir");
    boton5.setBounds(550,400,150,150);
    boton5.setBackground(new Color(248,222,207));
    boton5.setFont(new Font("Calibri", 3, 25));
    boton5.setForeground(new Color(222,125,83));
    boton5.addActionListener(this);
    boton5.setBorder(bevel4);
    labelLogo.add(boton5);

    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Registrar ventanaRegistrar = new Registrar();
            ventanaRegistrar.setBounds(0,0,1000,600);
            ventanaRegistrar.setVisible(true);
            ventanaRegistrar.setResizable(false);
            ventanaRegistrar.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton2){
            Buscar ventanaBuscar = new Buscar();
            ventanaBuscar.setBounds(0,0,600,500);
            ventanaBuscar.setVisible(true);
            ventanaBuscar.setResizable(false);
            ventanaBuscar.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton3){
            Comprar ventanaComprar = new Comprar();
            ventanaComprar.setBounds(0,0,600,500);
            ventanaComprar.setVisible(true);
            ventanaComprar.setResizable(false);
            ventanaComprar.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton4){
            Listado ventanaListado = new Listado();
            ventanaListado.setBounds(0,0,600,500);
            ventanaListado.setVisible(true);
            ventanaListado.setResizable(false);
            ventanaListado.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton5){
            System.exit(0);
        }
    }

}
