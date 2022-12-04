package ventanas;
import connection_db.BuscarProducto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Buscar extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1,
    labelOut1, labelOut2, labelOut3, labelOut4, labelOut5, labelOut6;
  private JButton boton1, boton2, boton3;
  public static String texto = "";  

    public Buscar(){
        setLayout(null);
        setTitle("Buscar");
        getContentPane().setBackground(new Color(255,0,255));
        
        label1 = new JLabel("Ingrese ID");
        label1.setBounds(45, 40,200,30);
        label1.setFont(new Font("Andale Mono", 1, 12));
        label1.setForeground(new Color(255,255,255));
        add(label1);
    
        textfield1 = new JTextField ();
        textfield1.setBounds(250 ,40,100,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255,0,0));
        add(textfield1);
    
        boton1 = new JButton("Buscar");
        boton1.setBounds(125,80,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Editar");
        boton2.setBounds(250, 80,100,30);
        boton2.setBackground(new Color(255,255,255));
        boton2.setFont(new Font("Andale Mono", 1, 14));
        boton2.setForeground(new Color(255,0,0));
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Regresar");
        boton3.setBounds(375, 80,100,30);
        boton3.setBackground(new Color(255,255,255));
        boton3.setFont(new Font("Andale Mono", 1, 14));
        boton3.setForeground(new Color(255,0,0));
        boton3.addActionListener(this);
        add(boton3);

    
        labelOut1 = new JLabel ("Nombre: ");
        labelOut1.setBounds(45,120,255,25);
        labelOut1.setBackground(new Color(224,224,224));
        labelOut1.setFont(new Font("Andale Mono", 1, 14));
        labelOut1.setForeground(new Color(255,255,255));
        add(labelOut1);
    
        labelOut2 = new JLabel ("Marca: ");
        labelOut2.setBounds(45,160,255,25);
        labelOut2.setBackground(new Color(224,224,224));
        labelOut2.setFont(new Font("Andale Mono", 1, 14));
        labelOut2.setForeground(new Color(255,255,255));
        add(labelOut2);
    
        labelOut3 = new JLabel ("Precio: ");
        labelOut3.setBounds(45,200,255,25);
        labelOut3.setBackground(new Color(224,224,224));
        labelOut3.setFont(new Font("Andale Mono", 1, 14));
        labelOut3.setForeground(new Color(255,255,255));
        add(labelOut3);
    
        labelOut4 = new JLabel ("Categoria: ");
        labelOut4.setBounds(45,240,255,25);
        labelOut4.setBackground(new Color(224,224,224));
        labelOut4.setFont(new Font("Andale Mono", 1, 14));
        labelOut4.setForeground(new Color(255,255,255));
        add(labelOut4);
    
        labelOut5 = new JLabel ("Gamma: ");
        labelOut5.setBounds(45,280,255,25);
        labelOut5.setBackground(new Color(224,224,224));
        labelOut5.setFont(new Font("Andale Mono", 1, 14));
        labelOut5.setForeground(new Color(255,255,255));
        add(labelOut5);
    
        labelOut6 = new JLabel ("Existencia: ");
        labelOut6.setBounds(45,320,255,25);
        labelOut6.setBackground(new Color(224,224,224));
        labelOut6.setFont(new Font("Andale Mono", 1, 14));
        labelOut6.setForeground(new Color(255,255,255));
        add(labelOut6);
    
      }
    
       public void actionPerformed(ActionEvent e){
         if(e.getSource() == boton1){
           String ID = textfield1.getText().trim();
           if(ID.equals("")){
             JOptionPane.showMessageDialog(null, "Debes registrar id.");
           } else {
            try {
              BuscarProducto buscar = new BuscarProducto();
              String[] result = buscar.buscar(ID);
              labelOut1.setText("Nombre: " + result[0]);
              labelOut2.setText("Marca: " + result[1]);
              labelOut3.setText("Precio: " + result[2]);
              labelOut4.setText("Categoria: " + result[3]);
              labelOut5.setText("Gamma: " + result[4]);
              labelOut6.setText("Existencia: " + result[5]);
            }catch(Exception e1){
              JOptionPane.showMessageDialog(null, "Producto no encontrado");

            }


           }
         }
         if(e.getSource() == boton2){
            String ID = textfield1.getText().trim();
            if(ID.equals("")){
              JOptionPane.showMessageDialog(null, "Debes registrar id.");
            } else {
              try {
                BuscarProducto buscar = new BuscarProducto();
                String[] result = buscar.buscar(ID);
                labelOut1.setText("Nombre: " + result[0]);
                labelOut2.setText("Marca: " + result[1]);
                labelOut3.setText("Precio: " + result[2]);
                labelOut4.setText("Categoria: " + result[3]);
                labelOut5.setText("Gamma: " + result[4]);
                labelOut6.setText("Existencia: " + result[5]);

                Editar ventanaEditar = new Editar(ID, result);
                ventanaEditar.setBounds(0,0,600,500);
                ventanaEditar.setVisible(true);
                ventanaEditar.setResizable(false);
                ventanaEditar.setLocationRelativeTo(null);
                this.setVisible(false);
              }catch(Exception e1){
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
  
              }
      
            }
        }
        if(e.getSource() == boton3){

          MenuPrincipal ventanabienvenida = new MenuPrincipal();
          ventanabienvenida.setBounds(0,0,350,450);
          ventanabienvenida.setVisible(true);
          ventanabienvenida.setResizable(false);
          ventanabienvenida.setLocationRelativeTo(null);
          this.setVisible(false);
        }
       }
    }
    
