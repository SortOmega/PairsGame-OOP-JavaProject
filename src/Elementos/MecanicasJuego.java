
package Elementos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MecanicasJuego {
    
    private int cantidadPalabras = 0;
    private Casillas Boton1 = new Casillas();
    private Casillas Boton2 = new Casillas();
    private int ContadorFallos = 0;
    private int ContadorAciertos= 0;
    private int BotonSeleccionados=0;
    private JComboBox cmbDificultad;
    private JList ListPalabra;
    private JPanel PanelJuego;
    private JTextField txtAciertos;
    private JTextField txtFallos;
    private Vector PalabrasJuego = new Vector();
    public MecanicasJuego(JComboBox objetoCombobox, JList objetoListPalabra, JPanel contenedorPanelJuego, JTextField campoAciertos, JTextField campoFallidos){
        cmbDificultad = objetoCombobox;
        PanelJuego = contenedorPanelJuego;
        ListPalabra = objetoListPalabra;
        txtAciertos = campoAciertos;
        txtFallos = campoFallidos;
    }
    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    public Vector getPalabrasJuego() {
        return PalabrasJuego;
    }

    public void setPalabrasJuego(Vector PalabrasJuego) {
        this.PalabrasJuego = PalabrasJuego;
    }
    
    public void empezarJuego(){
        if( null == cmbDificultad.getSelectedItem().toString()){
            JOptionPane.showMessageDialog(null, "Error al seleccionar una dificultad valida!", "Dificultad Error", JOptionPane.WARNING_MESSAGE);
            return;
        }else switch (cmbDificultad.getSelectedItem().toString()) {
            case "Facil" -> cantidadPalabras = 4;
            case "Normal" -> cantidadPalabras = 8;
            case "Dificil" -> cantidadPalabras = 12;
            default -> JOptionPane.showMessageDialog(null, "Error al seleccionar una dificultad valida!", "Dificultad Error", JOptionPane.WARNING_MESSAGE);
        }
        try{
            SelectorArchivoPalabras ArchivoPalabras = new SelectorArchivoPalabras();
            boolean Valido = ArchivoPalabras.SeleccionarArchivo(cantidadPalabras);
            if(Valido){
                EstablecerListado( ArchivoPalabras.getListadoPalabras(), cantidadPalabras);
                //duplicar palabras
                for(int i = 0; i < cantidadPalabras; i++){
                    PalabrasJuego.add( ArchivoPalabras.getListadoPalabras().get(i) );
                }
                //System.out.println("---------------------------------------------");
                for(int i = 0; i < cantidadPalabras; i++){
                    //System.out.println( (i+1) + ")" + PalabrasJuego.get(i) );
                    PalabrasJuego.add( PalabrasJuego.get(i) );
                }
                Collections.shuffle(PalabrasJuego);
                GenerarCasillas(cantidadPalabras, PalabrasJuego);
                //System.out.println("Todo bien hasta aqui");
            }
            else{
                JOptionPane.showMessageDialog(null, "El archivo no contiene la cantidad de palabras necesarias para empezar el juego!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null , error.toString());
        }
    }
    
    public void GenerarCasillas(int cantidadPabalabras, Vector Palabras){
        GridLayout Cuadricula = new GridLayout(0, 4, 8, 8);
        PanelJuego.setLayout(Cuadricula);
        PanelJuego.removeAll();
        PanelJuego.updateUI();
        for( int i = 0; i < (cantidadPabalabras*2); i++){
            Casillas btnPalabra = new Casillas();
            btnPalabra.setPalabraCasilla( Palabras.get(i).toString() );
            btnPalabra.setText( "Casilla " + (i+1) );
            btnPalabra.setOpaque(true);
            //Evento
            btnPalabra.addActionListener( (evento) -> {
                casillaEvento(evento);
            } );
            PanelJuego.add(btnPalabra);
        }
        PanelJuego.updateUI();
    }
    
    private void EstablecerListado( Vector palabras, int NumeroPalabras ){
        
        DefaultListModel Modelo = new DefaultListModel();
        ListPalabra.setModel(Modelo);
        
        for (int i=0; i < NumeroPalabras; i++){
            Modelo.addElement(palabras.get(i));
        }
    }
    
    private void casillaEvento(ActionEvent evento){
        Casillas BotonClickeado = (Casillas) evento.getSource();
        if(BotonClickeado.isSelected()==true){
            //JOptionPane.showMessageDialog(this, "Se ha Activado el Boton");
            BotonSeleccionados++;
        }
        if(BotonClickeado.isSelected()==false){
            //JOptionPane.showMessageDialog(this, "Se ha desactivado el Boton");
            BotonSeleccionados--;
        }
        if (BotonSeleccionados==1){
            Boton1 = BotonClickeado;
        }else if(BotonSeleccionados==2){
            Boton2 = BotonClickeado;
            if ( Boton1.getPalabraCasilla().equals( Boton2.getPalabraCasilla() ) ){
                
                JOptionPane.showMessageDialog(null, 
                      "Haz encontrado una Pareja de Palabras! \n"
                      + Boton1.getText() + ": " + Boton1.getPalabraCasilla()+"\n"
                      + Boton2.getText() + ": " + Boton2.getPalabraCasilla()+"\n");
                Boton1.setSelected(false);
                Boton2.setSelected(false);
                BotonSeleccionados=0;
                Boton1.setEnabled(false);
                Boton2.setEnabled(false);
                Boton1.setText( Boton1.getPalabraCasilla() );
                Boton2.setText( Boton1.getPalabraCasilla() );
                Boton1.setBackground(Color.green);
                Boton2.setBackground(Color.green);
                ContadorAciertos++;
                txtAciertos.setText( String.valueOf(ContadorAciertos) );
                PanelJuego.updateUI();
            }else{
                JOptionPane.showMessageDialog(null, 
                      "Pareja de Palabras Incorrecta! \n"
                      + Boton1.getText() + ": " + Boton1.getPalabraCasilla()+"\n"
                      + Boton2.getText() + ": " + Boton2.getPalabraCasilla()+"\n");//*/
                Boton1.setSelected(false);
                Boton2.setSelected(false);
                BotonSeleccionados=0;
                ContadorFallos++;
                txtFallos.setText( String.valueOf(ContadorFallos) );
            }
            
            if (ContadorAciertos==cantidadPalabras){
                JOptionPane.showMessageDialog(null, "Has Descubierto todas las Palabras Pares\n"
                        + "Felicitaciones, has ganado!");
                ContadorAciertos=0;
                ContadorFallos=0;
                txtAciertos.setText( String.valueOf( ContadorAciertos ));
                txtFallos.setText( String.valueOf(ContadorFallos) ) ;
                ListPalabra.setModel( new DefaultListModel() );
                ListPalabra.updateUI();
                PanelJuego.removeAll();
                PanelJuego.updateUI();
                BotonSeleccionados=0;
                
            }
        }
    }
}
