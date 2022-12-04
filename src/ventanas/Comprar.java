package ventanas;
import connection_db.InsertProduct;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Comprar extends JFrame implements ActionListener{

  private JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7;
  private JLabel label1, label2, label3, label4, label5, label6, label7;
  private JButton boton1, boton2;
  public static String texto = "";  

    public Comprar(){
        setLayout(null);
        setTitle("Buscar");
        getContentPane().setBackground(new Color(255,0,255));
        
        label1 = new JLabel("Ingrese ID");
        label1.setBounds(45, 40,200,30);
        label1.setFont(new Font("Andale Mono", 1, 12));
        label1.setForeground(new Color(255,255,255));
        add(label1);

        label2 = new JLabel("Cantidad");
        label2.setBounds(45, 120,200,30);
        label2.setFont(new Font("Andale Mono", 1, 12));
        label2.setForeground(new Color(255,255,255));
        add(label2);
    
        textfield1 = new JTextField ();
        textfield1.setBounds(250 ,40,100,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255,0,0));
        add(textfield1);
    
        textfield2 = new JTextField ();
        textfield2.setBounds(250 ,120,100,25);
        textfield2.setBackground(new Color(224,224,224));
        textfield2.setFont(new Font("Andale Mono", 1, 14));
        textfield2.setForeground(new Color(255,0,0));
        add(textfield2);
    
        boton1 = new JButton("Comprar");
        boton1.setBounds(125,320,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);
    
        boton2 = new JButton("Regresar");
        boton2.setBounds(425,120,100,30);
        boton2.setBackground(new Color(255,255,255));
        boton2.setFont(new Font("Andale Mono", 1, 14));
        boton2.setForeground(new Color(255,0,0));
        boton2.addActionListener(this);
        add(boton2);

        //label4 = new JLabel("2017 The Coca-Cola Company");
        //label4.setBounds(85,375,300,30);
        //label4.setFont(new Font("Andale Mono", 1, 12));
        //label4.setForeground(new Color(255,255,255));
        //add(label4);

      }
    
       public void actionPerformed(ActionEvent e){
         if(e.getSource() == boton1){
           String ID = textfield1.getText().trim();
           if(ID.equals("")){
             JOptionPane.showMessageDialog(null, "Debes registrar id.");
           } else {
            //InsertProduct insert = new InsertProduct();
            //insert.insert(ID, Nombre, Marca, Precio, Categoria, Gamma, Existencia);
           }
         }
         if(e.getSource() == boton2){
            MenuPrincipal ventanabienvenida = new MenuPrincipal();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
       }
    }
    
