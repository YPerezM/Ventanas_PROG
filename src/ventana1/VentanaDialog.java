

package ventana1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class VentanaDialog {
    public void crearVentanaSecundaria(){
       JFrame marco= new JFrame(" venta1");
        marco.setBounds(200, 100, 800, 400);
        marco.setBackground(Color.GREEN);
        JDialog venta2= new JDialog();
        venta2.setBounds(240, 140, 300, 300);
        venta2.setBackground(Color.yellow);
        venta2.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true); 
    }
     

}
