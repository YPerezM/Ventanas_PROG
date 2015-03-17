

package ventana1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public  class VentanaComponentes {
    public void crearVentanaSecundaria(){
       JFrame marco= new JFrame(" venta1");
        marco.setBounds(200, 100, 800, 400);
        //Creamos un panel
        JPanel panel1=new JPanel();
        panel1.setBounds(0, 0, 800, 800);
        //Creamos componentes
        //Etiquetas:JLabel
        JLabel eUsuario= new JLabel("usuario");
        JLabel eContraseña= new JLabel("contraseña");
        //cajas de texto
        JTextField cUsuario=new JTextField();
        JTextField cPassword=new JTextField();
        cUsuario.setSize(60, 40);
        cPassword.setSize(60, 40);
        
        //boton
        //ImageIcon img=new ImageIcon("dancing-banana.gif");
        JButton boton=new JButton("nombreBoton");
        boton.setSize(200, 100);
        boton.setBackground(Color.yellow);
        JButton boton2=new JButton(new ImageIcon("dancing-banana.gif"));
        panel1.add(boton);
        panel1.add(boton2);
        
        marco.add(panel1);
        
        marco.add(panel1);
        
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); 
    }
     

}
