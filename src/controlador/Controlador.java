/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import DAO.DAOSelect;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Trabajador;

/**
 *
 * @author pablo
 */
public class Controlador {
    
    
    public Trabajador inicioSesion(String usuario, String contra) throws SQLException{
        
            
            //String usuario, contra;
        DAOSelect oDAOSelect = new DAOSelect();    
       
        

        Trabajador oTrabajador = new Trabajador();
        //usuario = txtUser.getText();
        //contra = txtContra.getText();

        oTrabajador = oDAOSelect.inicioSesion(usuario, contra);

        if ( oTrabajador != null ){ //este if comprueba que el trabajador exista

           return oTrabajador;

        } else {

            return null;

        }
            
        
    }
    
    public Trabajador inicioSesion(String usuario) throws SQLException{
        if (usuario.equals("admin")){
            DAOSelect oDAOSelect = new DAOSelect();
            Trabajador oTrabajador = new Trabajador();
            oTrabajador = oDAOSelect.inicioSesion(usuario);
            if ( oTrabajador != null ){ //este if comprueba que el trabajador exista

                return oTrabajador;

            } else {

                return null;

            }
        }
        return null;
    }
}
