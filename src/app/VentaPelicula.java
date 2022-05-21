/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.util.HashMap;
import javax.swing.JOptionPane;
import model.Pelicula;
import model.Prestamo;
import model.Trabajador;
import model.Venta;

/**
 *
 * @author the_i
 */
public class VentaPelicula extends javax.swing.JFrame {
    
    HashMap<Integer, Pelicula> mapaPeliculas;
    HashMap<Integer, Prestamo> mapaPrestamos;
    HashMap<String, Trabajador> mapaTrabajadores;
    HashMap<Integer, Venta> mapaVentas;
    
    HashMap<Integer, Pelicula> mapaComprarPelis = new HashMap<>();
    /**
     * Creates new form VentaPelicula
     */
    public VentaPelicula(HashMap<Integer, Pelicula> mapaPelicula, HashMap<Integer, Prestamo> mapaPrestamo, HashMap<String, Trabajador> mapaTrabajador, HashMap<Integer, Venta> mapaVenta) {
        initComponents();
        mapaPeliculas = mapaPelicula;
        mapaPrestamos = mapaPrestamo;
        mapaTrabajadores = mapaTrabajador;
        mapaVentas = mapaVenta;
        
        
        setLocationRelativeTo(null);
    }

    private VentaPelicula() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdPelicula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtFechaVenta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRutCliente = new javax.swing.JTextField();
        txtRutTrabajador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Venta de Peliculas"));

        jLabel1.setText("idPelicula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio Venta");

        jLabel5.setText("Fecha venta:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel4.setText("Rut Trabajador:");

        jLabel6.setText("Rut Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprar)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtPrecioVenta)
                            .addComponent(txtRutCliente)
                            .addComponent(txtRutTrabajador))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFechaVenta)
                        .addGap(150, 150, 150))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnLimpiar)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRutTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnComprar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        MenuPeliculas oMenu2 = new MenuPeliculas(mapaPeliculas, mapaPrestamos, mapaTrabajadores, mapaVentas);
        
        this.dispose();
        oMenu2.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtFechaVenta.setText("");
        txtIdPelicula.setText("");
        txtNombre.setText("");
        txtPrecioVenta.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:}
        if ( txtIdPelicula.getText().equals("") ) {
        
            JOptionPane.showMessageDialog(this, "Ingrese ID de pelicula");
        
        } else {
            
        
            Pelicula oPelicula = new Pelicula();
            oPelicula = oPelicula.buscarPelicula(mapaPeliculas, Integer.parseInt(txtIdPelicula.getText()));
            
            if ( oPelicula != null ) {
            
                txtNombre.setText(oPelicula.getNombre());
                txtPrecioVenta.setText(String.valueOf(oPelicula.getPrecioVenta()));
            
            } else {
            
                JOptionPane.showMessageDialog(this, "No se encontro la pelicula");
                
                txtFechaVenta.setText("");
                txtIdPelicula.setText("");
                txtNombre.setText("");
                txtPrecioVenta.setText("");
            
            }
        
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        if ( txtIdPelicula.getText().equals("") || txtRutCliente.getText().equals("") || txtRutTrabajador.getText().equals("") || txtFechaVenta.getText().equals("") )  { 
        
            JOptionPane.showMessageDialog(this, "Complete los datos");
        
        }else{
            //Comprar pelicula
            
            //HashMap<Integer, Pelicula> mapaArrendarPelis = new HashMap<>();
            Pelicula oPelicula  = new Pelicula();
          
            //preguntar si quiere Comprar mas peliculas
            int seleccion = JOptionPane.showOptionDialog(this, "¿Desea agregar otra pelicula al carrito de la compra?", "Seleccione opcion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Sí","No"}, "Sí" );
            if( seleccion == 0 ){ //SI DESEA ARRENDAR OTRA PELICULA
                
                oPelicula = oPelicula.buscarPelicula(mapaPeliculas, Integer.parseInt(txtIdPelicula.getText()));
                
                if ( oPelicula != null ){ 
                    
                    mapaComprarPelis.put(oPelicula.getId(), oPelicula);
                
                } else { 
                
                    JOptionPane.showMessageDialog(this, "No se encontro la pelicula");
                
                }
            
                txtRutCliente.setEditable(false);
                txtRutTrabajador.setEditable(false);
                txtFechaVenta.setEditable(false);

                txtIdPelicula.setText("");
                txtNombre.setText("");
                txtPrecioVenta.setText("");
            
            } 
            
            if ( seleccion == 1 ) { //NO DESEA ARRENDAR OTRA PELICULA
                
                int numeroRandom = (int)(Math.random()*1000000000+1);//numero random creado para usar de ID
                
                Venta oVenta = new Venta();
                System.out.println(""+numeroRandom);
                
                oPelicula = oPelicula.buscarPelicula(mapaPeliculas, Integer.parseInt(txtIdPelicula.getText()));
                
                oVenta = oVenta.comprarPelicula(mapaPrestamos, mapaTrabajadores, mapaComprarPelis,mapaVentas, oPelicula, txtRutTrabajador.getText(), txtRutCliente.getText(), txtFechaVenta.getText());
                
                oVenta.setIdPrestamo(numeroRandom);
                
                if ( oVenta != null ) {
                
                    mapaVentas.put(oVenta.getIdPrestamo(), oVenta);
                    
                    System.out.println("idVenta: "+oVenta.getIdPrestamo());
                    JOptionPane.showMessageDialog(this, "La pelicula se compró correctamente");
                    JOptionPane.showMessageDialog(this, "El ID de la venta es: "+oVenta.getIdPrestamo());
                
                }

                txtRutCliente.setEditable(true);
                txtFechaVenta.setEditable(true);

                txtRutCliente.setText("");
                txtRutTrabajador.setText("");
                txtFechaVenta.setText("");
                txtIdPelicula.setText("");
                txtNombre.setText("");
                txtPrecioVenta.setText("");
            
            }
        }
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(VentaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtIdPelicula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRutCliente;
    private javax.swing.JTextField txtRutTrabajador;
    // End of variables declaration//GEN-END:variables
}
