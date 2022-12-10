package Elementos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SelectorArchivoPalabras {

    private Vector listadoPalabras = new Vector();

    //CONSTRUCTOR
    public SelectorArchivoPalabras() {

    }

    //FIN CONSTRUCTOR
    public Vector getListadoPalabras() {
        return listadoPalabras;
    }

    public void setListadoPalabras(Vector listadoPalabras) {
        this.listadoPalabras = listadoPalabras;
    }

    public boolean SeleccionarArchivo(int NumeroPalabrasASeleccionar) {
        JFileChooser Escoger = new JFileChooser();
        Escoger.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto (*.txt)", "txt");
        Escoger.setFileFilter(filtro);

        Escoger.showOpenDialog(null);

        File archivo = Escoger.getSelectedFile();
        if ((archivo == null) || (archivo.getName().equals(""))) {
            JOptionPane.showMessageDialog(null, "Nombre de archivo inválido", "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE);
        } else {  
            return LeerArchivo(archivo, NumeroPalabrasASeleccionar);
        }
        return false;
    }

    private boolean LeerArchivo(File ArchivoSeleccionado, int NumeroPalabrasASeleccionar) {
        try {
            FileReader archivo = new FileReader(ArchivoSeleccionado);
            BufferedReader lecturaBufer = new BufferedReader(archivo);
            String cadena;

            Vector tempVector = new Vector();
            while ((cadena = lecturaBufer.readLine()) != null) {
                if( !"".equals( cadena.trim() ))
                tempVector.add( cadena.trim() );
            }
            
            for (int iterator = 0; iterator < tempVector.size(); iterator++) {
                if ( ! listadoPalabras.contains(tempVector.get( iterator )) ) {
                    listadoPalabras.add( tempVector.elementAt(iterator) );
                    //System.out.println(listadoPalabras.elementAt(iterator));
                }
            }
            System.out.println( "\n" + tempVector + " " + tempVector.size() +"\n" +
                                  listadoPalabras + " " + listadoPalabras.size());
            
            System.out.println( listadoPalabras.size() + " " + NumeroPalabrasASeleccionar);
            if( !( listadoPalabras.size() >= NumeroPalabrasASeleccionar )  ) return false;
            
            Iterator itr = listadoPalabras.iterator();
            Collections.shuffle(listadoPalabras);
            itr = listadoPalabras.iterator();
            
            return true;
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se Encotro un Archivo Válido!", "File Load Error", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return false;
    }

}
