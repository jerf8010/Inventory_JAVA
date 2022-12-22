package ventanas;
import connection_db.ListarProductos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Listado extends JFrame implements ActionListener{
    private JButton boton1, boton2;
    public Listado(){

        ListarProductos listado = new ListarProductos();
        String[][] results = listado.listar();
        JTextArea textArea = new JTextArea(results.length, 20); 
        textArea.setEditable(false);

        setTitle("Listado de productos: Total - " + results.length);
        String textoFinal = "===========================================================================\n";
        textoFinal = textoFinal + "Nombre\t\tMarca\t\tExistencia\t\tPrecio\n";
        textoFinal = textoFinal + "===========================================================================\n";

        System.out.println(results.length); 
        for(int j = 0; j < results.length; j ++){
            textoFinal = textoFinal + results[j][0].trim() + "\t\t" + results[j][1].trim() + "\t\t" + results[j][2].trim() + "\t\t" + results[j][3].trim() + "\n";
            textoFinal = textoFinal + "________________________________________________________________________________________________\n";
        }
        textArea.setText(textoFinal);
        textArea.setBounds(0, 20, 100, 200);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        add(scrollableTextArea);     

        boton1 = new JButton("Regresar");
        //boton1.setBounds(0,0,10,20);
        boton1.setBackground(new Color(248,222,207));
        boton1.setFont(new Font("Calibri", 3, 25));
        boton1.setForeground(new Color(222,125,83));
        boton1.addActionListener(this);
        add(boton1, BorderLayout.PAGE_START);

        boton2 = new JButton("Salir");
        //boton1.setBounds(0,0,10,20);
        boton2.setBackground(new Color(248,222,207));
        boton2.setFont(new Font("Calibri", 3, 25));
        boton2.setForeground(new Color(222,125,83));
        boton2.addActionListener(this);
        add(boton2, BorderLayout.PAGE_END );
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            MenuPrincipal ventanabienvenida = new MenuPrincipal();
            ventanabienvenida.setBounds(100,1500,1000,600);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton2){
            System.exit(0);

        }
    }
}