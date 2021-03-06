/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author jefte
 */
public class MostrarPrestamo extends javax.swing.JFrame {
    
    DefaultTableModel oModeloTablaPrestamo = new DefaultTableModel();
    DefaultTableModel oModeloTablaPelicula = new DefaultTableModel();
    HashMap<Integer, Pelicula> mapaPeliculas;
    HashMap<Integer, Prestamo> mapaPrestamos;
    HashMap<String, Trabajador> mapaTrabajadores;
    HashMap<Integer, Venta> mapaVentas;

    /**
     * Creates new form MostrarSistema
     */
    public MostrarPrestamo(HashMap<Integer, Pelicula> mapaPelicula, HashMap<Integer, Prestamo> mapaPrestamo, HashMap<String, Trabajador> mapaTrabajador, HashMap<Integer, Venta> mapaVenta) {
        initComponents();
        mapaPeliculas = mapaPelicula;
        mapaPrestamos = mapaPrestamo;
        mapaTrabajadores = mapaTrabajador;
        mapaVentas = mapaVenta;
        setLocationRelativeTo(null);
        
        oModeloTablaPrestamo.addColumn("ID");
        oModeloTablaPrestamo.addColumn("RUT Cliente");
        oModeloTablaPrestamo.addColumn("RUT Trabajador");
        //oModeloTabla.addColumn("Cantidad de Peliculas arrendadas");
        oModeloTablaPrestamo.addColumn("Fecha Prestamo");
        oModeloTablaPrestamo.addColumn("Fecha Entrega");
        oModeloTablaPrestamo.addColumn("Monto a Pagar");
        
        tblPrestamos.setModel(oModeloTablaPrestamo);
        
        oModeloTablaPelicula.addColumn("ID Prestamo");
        oModeloTablaPelicula.addColumn("ID Pelicula");
        oModeloTablaPelicula.addColumn("Nombre");
        oModeloTablaPelicula.addColumn("Año");
        oModeloTablaPelicula.addColumn("Director");
        oModeloTablaPelicula.addColumn("Genero");
        
        tblPeliculasPrestamos.setModel(oModeloTablaPelicula);
        
        String [] datosPrestamos = new String[oModeloTablaPrestamo.getColumnCount()];
        String [] datosPeliculas = new String[oModeloTablaPelicula.getColumnCount()+1];
        //HashMap<Integer, Pelicula> mapaPelisPrestadas = new HashMap<>();
        
        for (Map.Entry<Integer, Prestamo> entry : mapaPrestamo.entrySet()) {
            
            Prestamo oPrestamo = new Prestamo();
            Sistema oSistema = new Sistema();
            
            oPrestamo = entry.getValue();
            
            datosPrestamos[0] = String.valueOf(oPrestamo.getIdPrestamo());
            datosPrestamos[1] = oPrestamo.getRutCliente();
            datosPrestamos[2] = oPrestamo.getRutTrabajador();
            datosPrestamos[3] = oPrestamo.getFechaPrestamo();
            datosPrestamos[4] = oPrestamo.getFechaEntrega();
            datosPrestamos[5] = String.valueOf(oPrestamo.getMontoAPagar());
            
            oModeloTablaPrestamo.addRow(datosPrestamos);
            
            for (Map.Entry<Integer, Pelicula> entry1 : oPrestamo.mapaPeliculas.entrySet()) {
                
                Pelicula oPelicula, oPelicula1 = new Pelicula();
                
                oPelicula = entry1.getValue();
                
                oPelicula1 = oSistema.buscarPelicula(mapaPeliculas, oPelicula.getId());
                
                datosPeliculas[0] = String.valueOf(oPrestamo.getIdPrestamo());
                datosPeliculas[1] = String.valueOf(oPelicula1.getId());
                datosPeliculas[2] = oPelicula1.getNombre();
                datosPeliculas[3] = String.valueOf(oPelicula1.getAnio());
                datosPeliculas[4] = oPelicula1.getDirector();
                datosPeliculas[5] = oPelicula1.getGenero();
                
                oModeloTablaPelicula.addRow(datosPeliculas);
                
            }
            
        }
        
       
        
    }

    private MostrarPrestamo() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeliculasPrestamos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Mostrar Prestamos"));

        jLabel1.setText("Tabla de Prestamos");

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPrestamos);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblPeliculasPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPeliculasPrestamos);

        jLabel2.setText("Tabla de Peliculas contenidas en Prestamos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(btnAtras)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        MenuPrestamos oMenuPrestamos = new MenuPrestamos(mapaPeliculas, mapaPrestamos, mapaTrabajadores, mapaVentas);
        
        this.dispose();
        oMenuPrestamos.setVisible(true);
        
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPeliculasPrestamos;
    private javax.swing.JTable tblPrestamos;
    // End of variables declaration//GEN-END:variables
}
