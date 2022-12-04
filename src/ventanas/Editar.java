package ventanas;
import connection_db.EditarProducto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Editar extends JFrame implements ActionListener{

  public String Editar;
  private JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7;
  private JLabel label1, label2, label3, label4, label5, label6, label7;
  private JButton boton1, boton2;
  public static String texto = "";  
  String ID;
    public Editar(String ID, String[] result){
        setLayout(null);
        setTitle("Editar");
        getContentPane().setBackground(new Color(255,0,255));
        
        this.ID = ID;
        String Nombre = result[0];
        String Marca = result[1];
        String Precio = result[2];
        String Categoria = result[3];
        String Gamma = result[4];
        String Existencia = result[5];
        
        label1 = new JLabel("ID: " + ID);
        label1.setBounds(45, 40,200,30);
        label1.setFont(new Font("Andale Mono", 1, 12));
        label1.setForeground(new Color(255,255,255));
        add(label1);
    
        boton1 = new JButton("Inicio");
        boton1.setBounds(125,320,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Guardar");
        boton2.setBounds(250,320,100,30);
        boton2.setBackground(new Color(255,255,255));
        boton2.setFont(new Font("Andale Mono", 1, 14));
        boton2.setForeground(new Color(255,0,0));
        boton2.addActionListener(this);
        add(boton2);

        
        label2 = new JLabel("Nombre");
        label2.setBounds(45, 80,200,30);
        label2.setFont(new Font("Andale Mono", 1, 12));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Marca");
        label3.setBounds(45, 120,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
    
        label4 = new JLabel("Precio");
        label4.setBounds(45, 160,200,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
    
        label5 = new JLabel("Categoria");
        label5.setBounds(45,200,200,30);
        label5.setFont(new Font("Andale Mono", 1, 12));
        label5.setForeground(new Color(255,255,255));
        add(label5);
    
        label6 = new JLabel("Gamma");
        label6.setBounds(45,240,200,30);
        label6.setFont(new Font("Andale Mono", 1, 12));
        label6.setForeground(new Color(255,255,255));
        add(label6);
    
        label7 = new JLabel("Numero de productos");
        label7.setBounds(45,280,200,30);
        label7.setFont(new Font("Andale Mono", 1, 12));
        label7.setForeground(new Color(255,255,255));
        add(label7);
    
        //label4 = new JLabel("2017 The Coca-Cola Company");
        //label4.setBounds(85,375,300,30);
        //label4.setFont(new Font("Andale Mono", 1, 12));
        //label4.setForeground(new Color(255,255,255));
        //add(label4);
    
        textfield2 = new JTextField (Nombre);
        textfield2.setBounds(250,80,255,25);
        textfield2.setBackground(new Color(224,224,224));
        textfield2.setFont(new Font("Andale Mono", 1, 14));
        textfield2.setForeground(new Color(255,0,0));
        add(textfield2);
    
        textfield3 = new JTextField (Marca);
        textfield3.setBounds(250,120,255,25);
        textfield3.setBackground(new Color(224,224,224));
        textfield3.setFont(new Font("Andale Mono", 1, 14));
        textfield3.setForeground(new Color(255,0,0));
        add(textfield3);
    
        textfield4 = new JTextField (Precio);
        textfield4.setBounds(250,160,255,25);
        textfield4.setBackground(new Color(224,224,224));
        textfield4.setFont(new Font("Andale Mono", 1, 14));
        textfield4.setForeground(new Color(255,0,0));
        add(textfield4);
    
        textfield5 = new JTextField (Categoria);
        textfield5.setBounds(250,200,255,25);
        textfield5.setBackground(new Color(224,224,224));
        textfield5.setFont(new Font("Andale Mono", 1, 14));
        textfield5.setForeground(new Color(255,0,0));
        add(textfield5);
    
        textfield6 = new JTextField (Gamma);
        textfield6.setBounds(250,240,255,25);
        textfield6.setBackground(new Color(224,224,224));
        textfield6.setFont(new Font("Andale Mono", 1, 14));
        textfield6.setForeground(new Color(255,0,0));
        add(textfield6);
    
        textfield7 = new JTextField (Existencia);
        textfield7.setBounds(250,280,255,25);
        textfield7.setBackground(new Color(224,224,224));
        textfield7.setFont(new Font("Andale Mono", 1, 14));
        textfield7.setForeground(new Color(255,0,0));
        add(textfield7);
    
      }
    
       public void actionPerformed(ActionEvent e){
         if(e.getSource() == boton2){

           String Nombre = textfield2.getText().trim();
           String Marca = textfield3.getText().trim();
           String Precio = textfield4.getText().trim();
           String Categoria = textfield5.getText().trim();
           String Gamma = textfield6.getText().trim();
           String Existencia = textfield7.getText().trim();
           String[] result = {Nombre, Marca, Precio, Categoria, Gamma, Existencia};
           
           System.out.println(this.ID);
           try{
            int existenciaInt = Integer.parseInt(Existencia);
            float precioFlaot = Float.parseFloat(Precio);
           
           if(ID.equals("")){
             JOptionPane.showMessageDialog(null, "Debes registrar id.");
           } else {
            try{
              EditarProducto editar = new EditarProducto();
              editar.editar(this.ID, result);

              Object[] possibleValues = { "Si", "No", "Buscar" };

              var selectedValue = JOptionPane.showOptionDialog(null,
                "Registro editado correctamente", "Registro correcto",
                0, 3, null, possibleValues, possibleValues[0]);
              System.out.println(selectedValue);
              if (selectedValue == 0){
                MenuPrincipal ventanabienvenida = new MenuPrincipal();
                ventanabienvenida.setBounds(0,0,350,450);
                ventanabienvenida.setVisible(true);
                ventanabienvenida.setResizable(false);
                ventanabienvenida.setLocationRelativeTo(null);
                this.setVisible(false);
              }
              if (selectedValue == 1){

              }
              if (selectedValue == 2){
                Buscar ventanaBuscar = new Buscar();
                ventanaBuscar.setBounds(0,0,600,500);
                ventanaBuscar.setVisible(true);
                ventanaBuscar.setResizable(false);
                ventanaBuscar.setLocationRelativeTo(null);
                this.setVisible(false);
              }
            }catch(Exception e1){
              JOptionPane.showMessageDialog(null, e1);
            }

           }
          }catch(Exception e2){
            System.out.println(e2);
            JOptionPane.showMessageDialog(null,  "Debe ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
           
          }
         }
        
         if(e.getSource() == boton1){
          MenuPrincipal ventanabienvenida = new MenuPrincipal();
          ventanabienvenida.setBounds(0,0,350,450);
          ventanabienvenida.setVisible(true);
          ventanabienvenida.setResizable(false);
          ventanabienvenida.setLocationRelativeTo(null);
          this.setVisible(false);
         }
       }
    }
    