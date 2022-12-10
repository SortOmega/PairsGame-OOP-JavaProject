
package proyectojuegopoo;

import Formularios.FormPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ProyectoJuegoPOO {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println(e.toString());
        }
        
        FormPrincipal Principal = new FormPrincipal();
        Principal.setVisible(true);
    }
    
}
