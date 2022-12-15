package ventanas;
import connection_db.*;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.awt.*;

public class IngresarFactura extends JFrame implements ActionListener{

  private JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7, textfield8, textfield9;
  private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
  private JButton boton1;
  public static String texto = ""; 
  private String total, ID; 

  public IngresarFactura(String ID, String total){
        this.ID = ID;
        this.total = total;
        setLayout(null);
        setTitle("Ingresar Factura");
        getContentPane().setBackground(new Color(255,0,255));
        
        label1 = new JLabel("Producto " + ID);
        label1.setBounds(45, 40,200,30);
        label1.setFont(new Font("Andale Mono", 1, 12));
        label1.setForeground(new Color(255,255,255));
        add(label1);
    
        label2 = new JLabel("Ingrese la fecha");
        label2.setBounds(45, 80,200,30);
        label2.setFont(new Font("Andale Mono", 1, 12));
        label2.setForeground(new Color(255,255,255));
        add(label2);
    
        label4 = new JLabel("Ingrese la razón social");
        label4.setBounds(45, 120,200,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
    
        label5 = new JLabel("Ingrese rfc");
        label5.setBounds(45,160,200,30);
        label5.setFont(new Font("Andale Mono", 1, 12));
        label5.setForeground(new Color(255,255,255));
        add(label5);
    
        label6 = new JLabel("Ingrese e-mail");
        label6.setBounds(45,200,200,30);
        label6.setFont(new Font("Andale Mono", 1, 12));
        label6.setForeground(new Color(255,255,255));
        add(label6);
    
        label7 = new JLabel("Ingrese la dirección");
        label7.setBounds(45,240,200,30);
        label7.setFont(new Font("Andale Mono", 1, 12));
        label7.setForeground(new Color(255,255,255));
        add(label7);
    
        label8 = new JLabel("Total $ " + total );
        label8.setBounds(45,280,300,30);
        label8.setFont(new Font("Andale Mono", 1, 12));
        label8.setForeground(new Color(255,255,255));
        add(label8);
    
        label9 = new JLabel("Ingrese el número de factura");
        label9.setBounds(45,320,300,30);
        label9.setFont(new Font("Andale Mono", 1, 12));
        label9.setForeground(new Color(255,255,255));
        add(label9);
    
        textfield2 = new JTextField ();
        textfield2.setBounds(250,80,100,25);
        textfield2.setBackground(new Color(224,224,224));
        textfield2.setFont(new Font("Andale Mono", 1, 14));
        textfield2.setForeground(new Color(255,0,0));
        add(textfield2);
    
        textfield4 = new JTextField ();
        textfield4.setBounds(250,120,100,25);
        textfield4.setBackground(new Color(224,224,224));
        textfield4.setFont(new Font("Andale Mono", 1, 14));
        textfield4.setForeground(new Color(255,0,0));
        add(textfield4);
    
        textfield5 = new JTextField ();
        textfield5.setBounds(250,160,100,25);
        textfield5.setBackground(new Color(224,224,224));
        textfield5.setFont(new Font("Andale Mono", 1, 14));
        textfield5.setForeground(new Color(255,0,0));
        add(textfield5);
    
        textfield6 = new JTextField ();
        textfield6.setBounds(250,200,100,25);
        textfield6.setBackground(new Color(224,224,224));
        textfield6.setFont(new Font("Andale Mono", 1, 14));
        textfield6.setForeground(new Color(255,0,0));
        add(textfield6);
    
        textfield7 = new JTextField ();
        textfield7.setBounds(250,240,100,25);
        textfield7.setBackground(new Color(224,224,224));
        textfield7.setFont(new Font("Andale Mono", 1, 14));
        textfield7.setForeground(new Color(255,0,0));
        add(textfield7);
    
        textfield9 = new JTextField ();
        textfield9.setBounds(250,320,100,25);
        textfield9.setBackground(new Color(224,224,224));
        textfield9.setFont(new Font("Andale Mono", 1, 14));
        textfield9.setForeground(new Color(255,0,0));
        add(textfield9);
    
        boton1 = new JButton("Registrar");
        boton1.setBounds(125,360,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);
      }
    
    
       public void actionPerformed(ActionEvent e){
         if(e.getSource() == boton1){
           String fecha = textfield2.getText().trim();
           String razonSocial = textfield4.getText().trim();
           String rfc = textfield5.getText().trim();
           String email = textfield6.getText().trim();
           String direccion = textfield7.getText().trim();
           String numeroFactura = textfield9.getText().trim();
           if(numeroFactura.equals("")){
              JOptionPane.showMessageDialog(null, "Debes registrar id.");
           } else {
              InsertarFactura insert = new InsertarFactura();
              String resultRequest = insert.insert(this.ID, fecha, razonSocial, rfc, email,  direccion, total, numeroFactura);
              if(resultRequest == "OK"){
                JOptionPane.showMessageDialog(null, "Factura  " + numeroFactura + " registrada");
                MenuPrincipal ventanabienvenida = new MenuPrincipal();
                ventanabienvenida.setBounds(0,0,350,450);
                ventanabienvenida.setVisible(true);
                ventanabienvenida.setResizable(false);
                ventanabienvenida.setLocationRelativeTo(null);
                this.setVisible(false);
              }else{
              JOptionPane.showMessageDialog(null, resultRequest);
            }
          }
         }
       }
    }
    