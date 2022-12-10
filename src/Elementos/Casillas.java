
package Elementos;

import javax.swing.JToggleButton;
public class Casillas extends JToggleButton{

    private String PalabraCasilla;
    //CONSTRUCTOR
    public Casillas(){
        super();
    }
    //FIN CONSTRUCTOR
    public String getPalabraCasilla() {
        return PalabraCasilla;
    }
    public void setPalabraCasilla(String PalabraCasilla) {
        this.PalabraCasilla = PalabraCasilla;
    }
}
