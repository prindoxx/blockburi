/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.util.*;
import static java.util.Map.entry;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
/**
 *
 * @author the_i
 */
public class BuscarPeliculaPorGenero extends javax.swing.JFrame {

    DefaultTableModel oModeloTabla = new DefaultTableModel();
    HashMap<Integer, Pelicula> mapaPeliculas;
    HashMap<Integer, Prestamo> mapaPrestamos;
    HashMap<String, Trabajador> mapaTrabajadores;
    HashMap<Integer, Venta> mapaVentas;
    
    public BuscarPeliculaPorGenero(HashMap<Integer, Pelicula> mapaPelicula, HashMap<Integer, Prestamo> mapaPrestamo, HashMap<String, Trabajador> mapaTrabajador, HashMap<Integer, Venta> mapaVenta) {
       
        initComponents();
        setLocationRelativeTo(null);
        mapaPeliculas = mapaPelicula;
        mapaPrestamos = mapaPrestamo;
        mapaTrabajadores = mapaTrabajador;
        mapaVentas = mapaVenta;
        
        oModeloTabla.addColumn("ID");
        oModeloTabla.addColumn("Nombre");
        oModeloTabla.addColumn("Año");
        oModeloTabla.addColumn("Director");
        oModeloTabla.addColumn("Genero");
        oModeloTabla.addColumn("Valor Compra");
        oModeloTabla.addColumn("Valor arriendo");
        oModeloTabla.addColumn("Stock");
        oModeloTabla.addColumn("idPrestamo");
        
        tblGenero.setModel(oModeloTabla);
        
    }

    private BuscarPeliculaPorGenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGenero = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Peliculas por genero"));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblGenero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblGenero);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Escriba el genero de pelicula a buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAtras)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtGenero))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtras)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        MenuPrestamos oMenuPrestamos = new MenuPrestamos(mapaPeliculas, mapaPrestamos, mapaTrabajadores, mapaVentas);
        
        this.dispose();
        oMenuPrestamos.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(txtGenero.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "Ingrese un genero");
        }
        else{
            
            //Pelicula oPelicula = new Pelicula();
            Prestamo oPrestamo = new Prestamo();
            Sistema oSistema = new Sistema();
            ArrayList peliculaArrayList = new ArrayList();


            peliculaArrayList = oPrestamo.buscarPeliculaPorGenero(mapaPrestamos,txtGenero.getText());
            String [] datosPeliculas = new String[oModeloTabla.getColumnCount()];
            
            for (int i = 0; i < peliculaArrayList.size(); i++) {
                
                Pelicula oPelicula = (Pelicula)peliculaArrayList.get(i);
                ArrayList prestamosArrayList = oSistema.buscarPrestamoPorPelicula(mapaPrestamos, oPelicula);
                
                datosPeliculas[0] = String.valueOf(oPelicula.getId());
                datosPeliculas[1] = oPelicula.getNombre();
                datosPeliculas[2] = String.valueOf(oPelicula.getAnio());
                datosPeliculas[3] = oPelicula.getDirector();
                datosPeliculas[4] = oPelicula.getGenero();
                datosPeliculas[5] = String.valueOf(oPelicula.getPrecioVenta());
                datosPeliculas[6] = String.valueOf(oPelicula.getPrecioArriendo());
                datosPeliculas[7] = String.valueOf(oPelicula.getStock());
                
                for (int j = 0; j < prestamosArrayList.size(); j++) {
                    oPrestamo = (Prestamo)prestamosArrayList.get(j);
                    
                    if(((Pelicula)oPrestamo.mapaPeliculas.get(j)) != oPelicula){
                        datosPeliculas[8] = String.valueOf(oPrestamo.getIdPrestamo());
                      
                    }
                    
                }
                
                oModeloTabla.addRow(datosPeliculas);
                
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPeliculaPorGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPeliculaPorGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPeliculaPorGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPeliculaPorGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPeliculaPorGenero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGenero;
    private javax.swing.JTextField txtGenero;
    // End of variables declaration//GEN-END:variables
}
