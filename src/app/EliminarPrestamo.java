/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author jefte
 */
public class EliminarPrestamo extends javax.swing.JFrame {
    
    DefaultTableModel oModeloTabla = new DefaultTableModel();
    HashMap<Integer, Pelicula> mapaPeliculas;
    HashMap<Integer, Prestamo> mapaPrestamos;
    HashMap<String, Trabajador> mapaTrabajadores;

    /**
     * Creates new form EliminarPrestamo
     */
    public EliminarPrestamo(HashMap<Integer, Pelicula> mapaPelicula, HashMap<Integer, Prestamo> mapaPrestamo, HashMap<String, Trabajador> mapaTrabajador) {
        initComponents();
        mapaPeliculas = mapaPelicula;
        mapaPrestamos = mapaPrestamo;
        mapaTrabajadores = mapaTrabajador;
        setLocationRelativeTo(null);
        
        oModeloTabla.addColumn("ID");
        oModeloTabla.addColumn("Nombre");
        oModeloTabla.addColumn("Año");
        oModeloTabla.addColumn("Director");
        oModeloTabla.addColumn("Genero");
        
        tblPeliculas.setModel(oModeloTabla);
    }

    private EliminarPrestamo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdPrestamo = new javax.swing.JTextField();
        btnBuscarPrestamo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRutCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRutTrabajador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaPrestamo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMontoPagar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeliculas = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminarPrestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Eliminar Prestamo"));

        jLabel1.setText("Id Prestamo");

        txtIdPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPrestamoActionPerformed(evt);
            }
        });

        btnBuscarPrestamo.setText("Buscar");
        btnBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamoActionPerformed(evt);
            }
        });

        jLabel2.setText("Rut Cliente");

        txtRutCliente.setEditable(false);

        jLabel3.setText("Rut Trabajador");

        txtRutTrabajador.setEditable(false);

        jLabel4.setText("Fecha Prestamo");

        txtFechaPrestamo.setEditable(false);

        jLabel5.setText("Fecha Entrega");

        txtFechaEntrega.setEditable(false);

        jLabel6.setText("Monto a Pagar");

        txtMontoPagar.setEditable(false);

        jLabel7.setText("Peliculas Arrendadas en este Prestamo");

        tblPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPeliculas);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminarPrestamo.setText("Eliminar Prestamo");
        btnEliminarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaPrestamo)
                                    .addComponent(txtIdPrestamo)
                                    .addComponent(txtRutCliente)
                                    .addComponent(txtRutTrabajador)
                                    .addComponent(txtFechaEntrega)
                                    .addComponent(txtMontoPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarPrestamo)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPrestamo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRutTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMontoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnEliminarPrestamo))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed
        // TODO add your handling code here:

        for(int i=0; i<tblPeliculas.getRowCount();i++){
            oModeloTabla.removeRow(i);
            i-=1;
        }

        if ( txtIdPrestamo.getText().equals("") ) {

            JOptionPane.showMessageDialog(this, "Ingrese un ID de Prestamo");

        } else {

            Prestamo oPrestamo = new Prestamo();

            oPrestamo = mapaPrestamos.get(Integer.parseInt(txtIdPrestamo.getText()));
            if (oPrestamo == null){
            
                JOptionPane.showMessageDialog(this, "Ocurrio un problema");

                txtIdPrestamo.setText("");
                txtRutCliente.setText("");
                txtRutTrabajador.setText("");
                txtFechaPrestamo.setText("");
                txtFechaEntrega.setText("");
                txtMontoPagar.setText("");

                for(int i=0; i<tblPeliculas.getRowCount();i++){
                    oModeloTabla.removeRow(i);
                    i-=1;
                }

            }else{
                
                txtRutCliente.setText(oPrestamo.getRutCliente());
                txtRutTrabajador.setText(oPrestamo.getRutTrabajador());
                txtFechaPrestamo.setText(oPrestamo.getFechaPrestamo());
                txtFechaEntrega.setText(oPrestamo.getFechaEntrega());
                txtMontoPagar.setText(String.valueOf(oPrestamo.getMontoAPagar()));

                HashMap<Integer, Pelicula> mapaPeliculasPrestamos = oPrestamo.mapaPeliculas;
                String [] datosPeliculas = new String[oModeloTabla.getColumnCount()];

                for (Map.Entry<Integer, Pelicula> entry : mapaPeliculasPrestamos.entrySet()) {

                    Pelicula oPelicula = new Pelicula();
                    oPelicula = entry.getValue();

                    datosPeliculas[0] = String.valueOf(oPelicula.getId());
                    datosPeliculas[1] = oPelicula.getNombre();
                    datosPeliculas[2] = String.valueOf(oPelicula.getAnio());
                    datosPeliculas[3] = oPelicula.getDirector();
                    datosPeliculas[4] = oPelicula.getGenero();

                    oModeloTabla.addRow(datosPeliculas);

                }
            }

            

        }

    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        Menu oMenu = new Menu(mapaPeliculas, mapaPrestamos, mapaTrabajadores);

        this.dispose();
        oMenu.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:

        txtIdPrestamo.setText("");
        txtRutCliente.setText("");
        txtRutTrabajador.setText("");
        txtFechaPrestamo.setText("");
        txtFechaEntrega.setText("");
        txtMontoPagar.setText("");

        for(int i=0; i<tblPeliculas.getRowCount();i++){
            oModeloTabla.removeRow(i);
            i-=1;
        }

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPrestamoActionPerformed
        // TODO add your handling code here:
        if ( txtIdPrestamo.getText().equals("") ) {

            JOptionPane.showMessageDialog(this, "Ingrese ID de Pelicula");

        } else{
            
            Prestamo oPrestamo = new Prestamo();
            
            try {
                oPrestamo.eliminarPrestamo(Integer.parseInt(txtIdPrestamo.getText()), mapaPrestamos);
                
                txtIdPrestamo.setText("");
                txtRutCliente.setText("");
                txtRutTrabajador.setText("");
                txtFechaPrestamo.setText("");
                txtFechaEntrega.setText("");
                txtMontoPagar.setText("");
                
                JOptionPane.showMessageDialog(this, "Prestamo eliminado correctamente");

                for(int i=0; i<tblPeliculas.getRowCount();i++){
                    oModeloTabla.removeRow(i);
                    i-=1;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(EliminarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarPrestamoActionPerformed

    private void txtIdPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPrestamoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EliminarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarPrestamo;
    private javax.swing.JButton btnEliminarPrestamo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeliculas;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaPrestamo;
    private javax.swing.JTextField txtIdPrestamo;
    private javax.swing.JTextField txtMontoPagar;
    private javax.swing.JTextField txtRutCliente;
    private javax.swing.JTextField txtRutTrabajador;
    // End of variables declaration//GEN-END:variables
}
