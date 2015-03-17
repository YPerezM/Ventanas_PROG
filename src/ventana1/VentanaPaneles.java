

package ventana1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public  class VentanaPaneles {
    public void crearVentanaSecundaria(){
       JFrame marco= new JFrame(" venta1");
        marco.setBounds(200, 100, 800, 400);
        //Creamos un panel
        JPanel panel1=new JPanel();
        panel1.setBounds(200, 100, 800, 200);
        panel1.setBackground(Color.yellow);
        
        JPanel panel2=new JPanel();
        panel2.setBounds(200, 300, 800, 200);
        panel2.setBackground(Color.GREEN);
        
        marco.setLayout(null);
        marco.add(panel1);
        marco.add(panel2);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); 
    }
     

}
