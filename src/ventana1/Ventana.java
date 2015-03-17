

package ventana1;

import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Ventana extends JFrame{
    public static void main(String[] args){
        VentanaDialog obj1=new VentanaDialog();
    VentanaPaneles obj2= new VentanaPaneles();
    VentanaComponentes obj3= new VentanaComponentes();
    
    obj1.crearVentanaSecundaria();
    obj2.crearVentanaSecundaria();
    obj3.crearVentanaSecundaria();
    
    }
    
    
    
    
    

}
