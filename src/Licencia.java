import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame {

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1; 
  private JTextArea textarea1;
  String nombre = "";

  public Licencia(){
    setLayout(null);
    setTitle("Licencia de uso");
    App ventanaBienvenida = new App();
    nombre = ventanaBienvenida.texto;

    label1 = new JLabel("TERMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0, 0, 0));
    add(label1);

  }
}


 