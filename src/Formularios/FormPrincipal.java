package Formularios;

import Elementos.MecanicasJuego;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author SortOmega
 * @link https://github.com/SortOmega
 */
public class FormPrincipal extends javax.swing.JFrame {
    
    Color Transparente = new Color(255, 255, 255, 0);
    Color Azulito = new Color(0,200,255);
    Color CerrarOnHover = new Color(255, 80, 120, 255);
    int posicionClicX, posicionClicY;
    
    public FormPrincipal() {
        initComponents();
        frmBODY.setBackground(Color.white);
        Header.setBackground(Color.black);
        labelCerrar.setBackground(Color.black);
        PanelOpciones.setBackground(Azulito);
        
        llenarDificultad();
        labelPalabras.setBackground(Color.ORANGE);
        
    }
    
    private void llenarDificultad(){
        DefaultComboBoxModel modeloDificultad = new DefaultComboBoxModel();
        modeloDificultad.addElement("Facil");
        modeloDificultad.addElement("Normal");
        modeloDificultad.addElement("Dificil");
        cmbDificultad.setModel(modeloDificultad);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmBODY = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        labelCerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListPalabras = new javax.swing.JList<>();
        labelPalabras = new javax.swing.JLabel();
        PanelOpciones = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbDificultad = new javax.swing.JComboBox<>();
        btnEmpezar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        txtAciertos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFallidos = new javax.swing.JTextField();
        PanelJuego = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Juego de Pares");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frmBODY.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(102, 102, 102)));
        frmBODY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        labelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrar.setText("X");
        labelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelCerrar.setFocusable(false);
        labelCerrar.setOpaque(true);
        labelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCerrarMouseExited(evt);
            }
        });
        Header.add(labelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Juego de Pares");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 230, 30));

        frmBODY.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Aciertos:");
        frmBODY.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        ListPalabras.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 153, 153), null));
        ListPalabras.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ListPalabras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListPalabras.setFocusable(false);
        jScrollPane1.setViewportView(ListPalabras);

        frmBODY.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 160, 370));

        labelPalabras.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        labelPalabras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPalabras.setText("Lista de Palabras");
        labelPalabras.setFocusable(false);
        labelPalabras.setOpaque(true);
        frmBODY.add(labelPalabras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 160, 50));

        PanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Dificultad:");
        jLabel3.setFocusable(false);
        PanelOpciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        cmbDificultad.setBackground(new java.awt.Color(255, 255, 255));
        cmbDificultad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbDificultad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        cmbDificultad.setFocusable(false);
        PanelOpciones.add(cmbDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, 30));

        btnEmpezar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEmpezar.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpezar.setText("Empezar Juego");
        btnEmpezar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmpezar.setFocusable(false);
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        PanelOpciones.add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 190, 30));

        btnAyuda.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(0, 102, 255));
        btnAyuda.setText("?");
        btnAyuda.setToolTipText("Como Jugar?");
        btnAyuda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAyuda.setFocusable(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        PanelOpciones.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        frmBODY.add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 50));

        txtAciertos.setEditable(false);
        txtAciertos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAciertos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAciertos.setText("0");
        frmBODY.add(txtAciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Fallos:");
        frmBODY.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 70, 30));

        txtFallidos.setEditable(false);
        txtFallidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFallidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFallidos.setText("0");
        frmBODY.add(txtFallidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 130, 30));

        PanelJuego.setOpaque(false);
        PanelJuego.setLayout(new java.awt.GridLayout(1, 0));
        frmBODY.add(PanelJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 450, 280));

        getContentPane().add(frmBODY, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        posicionClicX = evt.getX();
        posicionClicY = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int direccionX = evt.getXOnScreen();
        int direccionY = evt.getYOnScreen();
        this.setLocation( direccionX - posicionClicX, direccionY - posicionClicY );
    }//GEN-LAST:event_HeaderMouseDragged

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void labelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseEntered
        labelCerrar.setBackground(CerrarOnHover);
        labelCerrar.setForeground( new Color(220,220, 220));
    }//GEN-LAST:event_labelCerrarMouseEntered

    private void labelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseExited
        labelCerrar.setBackground(Color.black);
        labelCerrar.setForeground(Color.white);
    }//GEN-LAST:event_labelCerrarMouseExited

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        MecanicasJuego JuegoPares = new MecanicasJuego(cmbDificultad, ListPalabras, PanelJuego, txtAciertos, txtFallidos);
        JuegoPares.empezarJuego();
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        dialogAyuda Ayuda = new dialogAyuda(this, true);
        Ayuda.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JList<String> ListPalabras;
    private javax.swing.JPanel PanelJuego;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JComboBox<String> cmbDificultad;
    private javax.swing.JPanel frmBODY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelPalabras;
    private javax.swing.JTextField txtAciertos;
    private javax.swing.JTextField txtFallidos;
    // End of variables declaration//GEN-END:variables
}
