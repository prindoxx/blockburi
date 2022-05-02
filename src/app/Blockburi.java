/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.*;
import model.*;
import DAO.*;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class Blockburi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        DAOSelect oDAOSelect = new DAOSelect();
        
        //se llena el mapa de peliculas
        HashMap<Integer, Pelicula> mapaPeliculas = oDAOSelect.llenarMapaPelicula();
        
        //se llena mapa con prestamos
        //HashMap<Integer, Prestamo> mapaPrestamos = oDAOSelect.llenarPrestamo();
        
        Sistema oSistema = new Sistema();
        oSistema.mapaPrestamos = oDAOSelect.llenarPrestamo();
        
        for (Map.Entry<Integer, Prestamo> entry : oSistema.mapaPrestamos.entrySet()) {
            
            Prestamo oPrestamo = new Prestamo();
            
            oPrestamo = entry.getValue();
            
            /**System.out.println(""+oPrestamo.getIdPrestamo());
            System.out.println(""+oPrestamo.getRutCliente());
            System.out.println(""+oPrestamo.getMontoAPagar());**/
            
            //SE LLENAN LOS PRESTAMOS CON LAS PELICULAS
            oPrestamo.mapaPeliculas = oPrestamo.llenaMapaPeliculasPrestamo(oPrestamo.getIdPrestamo(), mapaPeliculas);
            
        }
        
        //se llena mapa con trabajadores
        HashMap<String, Trabajador> mapaTrabajadores = oDAOSelect.llenarMapaTrabajadores();
        
        
        InicioSesion oInicioSesion = new InicioSesion(mapaPeliculas, oSistema.mapaPrestamos, mapaTrabajadores);
        oInicioSesion.setVisible(true);
        
        
    }
    
}
