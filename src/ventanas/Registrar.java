package ventanas;
import connection_db.InsertProduct;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Registrar extends JFrame implements ActionListener{

  private JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7;
  private JLabel label1, label2, label3, label4, label5, label6, label7;
  private JButton boton1, boton2;
  public static String texto = "";  

    public Registrar(){
        setLayout(null);
        setTitle("Registrar");
        getContentPane().setBackground(new Color(255,0,255));
        
        label1 = new JLabel("Ingrese ID");
        label1.setBounds(45, 40,200,30);
        label1.setFont(new Font("Andale Mono", 1, 12));
        label1.setForeground(new Color(255,255,255));
        add(label1);
    
        label2 = new JLabel("Ingrese su nombre");
        label2.setBounds(45, 80,200,30);
        label2.setFont(new Font("Andale Mono", 1, 12));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Ingrese su marca");
        label3.setBounds(45, 120,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
    
        label4 = new JLabel("Ingrese su precio");
        label4.setBounds(45, 160,200,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
    
        label5 = new JLabel("Ingrese su categoria");
        label5.setBounds(45,200,200,30);
        label5.setFont(new Font("Andale Mono", 1, 12));
        label5.setForeground(new Color(255,255,255));
        add(label5);
    
        label6 = new JLabel("Ingrese su Gamma");
        label6.setBounds(45,240,200,30);
        label6.setFont(new Font("Andale Mono", 1, 12));
        label6.setForeground(new Color(255,255,255));
        add(label6);
    
        label7 = new JLabel("Ingrese cuantos productos");
        label7.setBounds(45,280,200,30);
        label7.setFont(new Font("Andale Mono", 1, 12));
        label7.setForeground(new Color(255,255,255));
        add(label7);
    
        //label4 = new JLabel("2017 The Coca-Cola Company");
        //label4.setBounds(85,375,300,30);
        //label4.setFont(new Font("Andale Mono", 1, 12));
        //label4.setForeground(new Color(255,255,255));
        //add(label4);
    
        textfield1 = new JTextField ();
        textfield1.setBounds(250 ,40,100,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255,0,0));
        add(textfield1);
    
        textfield2 = new JTextField ();
        textfield2.setBounds(250,80,255,25);
        textfield2.setBackground(new Color(224,224,224));
        textfield2.setFont(new Font("Andale Mono", 1, 14));
        textfield2.setForeground(new Color(255,0,0));
        add(textfield2);
    
        textfield3 = new JTextField ();
        textfield3.setBounds(250,120,255,25);
        textfield3.setBackground(new Color(224,224,224));
        textfield3.setFont(new Font("Andale Mono", 1, 14));
        textfield3.setForeground(new Color(255,0,0));
        add(textfield3);
    
        textfield4 = new JTextField ();
        textfield4.setBounds(250,160,255,25);
        textfield4.setBackground(new Color(224,224,224));
        textfield4.setFont(new Font("Andale Mono", 1, 14));
        textfield4.setForeground(new Color(255,0,0));
        add(textfield4);
    
        textfield5 = new JTextField ();
        textfield5.setBounds(250,200,255,25);
        textfield5.setBackground(new Color(224,224,224));
        textfield5.setFont(new Font("Andale Mono", 1, 14));
        textfield5.setForeground(new Color(255,0,0));
        add(textfield5);
    
        textfield6 = new JTextField ();
        textfield6.setBounds(250,240,255,25);
        textfield6.setBackground(new Color(224,224,224));
        textfield6.setFont(new Font("Andale Mono", 1, 14));
        textfield6.setForeground(new Color(255,0,0));
        add(textfield6);
    
        textfield7 = new JTextField ();
        textfield7.setBounds(250,280,255,25);
        textfield7.setBackground(new Color(224,224,224));
        textfield7.setFont(new Font("Andale Mono", 1, 14));
        textfield7.setForeground(new Color(255,0,0));
        add(textfield7);
    
        boton1 = new JButton("Registrar");
        boton1.setBounds(125,320,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Regresar");
        boton2.setBounds(325,320,100,30);
        boton2.setBackground(new Color(255,255,255));
        boton2.setFont(new Font("Andale Mono", 1, 14));
        boton2.setForeground(new Color(255,0,0));
        boton2.addActionListener(this);
        add(boton2);
      }
    
    
       public void actionPerformed(ActionEvent e){
         if(e.getSource() == boton1){
           String ID = textfield1.getText().trim();
           String Nombre = textfield2.getText().trim();
           String Marca = textfield3.getText().trim();
           String Precio = textfield4.getText().trim();
           String Categoria = textfield5.getText().trim();
           String Gamma = textfield6.getText().trim();
           String Existencia = textfield7.getText().trim();
           try{
            int existenciaInt = Integer.parseInt(Existencia);
            float precioFlaot = Float.parseFloat(Precio);
           
           if(ID.equals("")){
              JOptionPane.showMessageDialog(null, "Debes registrar id.");
           } else {
              InsertProduct insert = new InsertProduct();
              Boolean resultRequest = insert.insert(ID, Nombre, Marca, Precio, Categoria, Gamma, Existencia);
              if (resultRequest == false){
                JOptionPane.showMessageDialog(null,  "El ID " + ID + " ya existe, intente con otro.", "Error", JOptionPane.ERROR_MESSAGE);

              }else{
                JOptionPane.showMessageDialog(null, "Producto " + ID + " guardado!!");

              }
          }
        }catch(Exception e2){
          System.out.println(e2);
          JOptionPane.showMessageDialog(null,  "Debe ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
         
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
    