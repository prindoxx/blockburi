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
        HashMap<Integer, Prestamo> mapaPrestamo = oDAOSelect.llenarPrestamo();
        
        for (Map.Entry<Integer, Prestamo> entry : mapaPrestamo.entrySet()) {
            
            Prestamo oPrestamo = new Prestamo();
            
            oPrestamo = entry.getValue();
            
            /**System.out.println(""+oPrestamo.getIdPrestamo());
            System.out.println(""+oPrestamo.getRutCliente());
            System.out.println(""+oPrestamo.getMontoAPagar());**/
            
            //SE LLENAN LOS PRESTAMOS CON LAS PELICULAS
            oPrestamo.mapaPeliculas = oPrestamo.llenaMapaPeliculasPrestamo(oPrestamo.getIdPrestamo(), mapaPeliculas);
            
        }
        
        
        
        Trabajador Trabajador1 = new Trabajador("1-2", "Pablo", "1", "1");
        Trabajador Trabajador2 = new Trabajador("2-2", "Ivan", "2", "2");
        Trabajador Trabajador3 = new Trabajador("3-2", "Jefte", "3", "3");
        
        /**mapaPeliculas.put(12345678, Pelicula1);
        mapaPeliculas.put(234567891, Pelicula2);
        mapaPeliculas.put(345678912, Pelicula3);**/
        
        
        /**InicioSesion oInicioSesion = new InicioSesion(mapaPeliculas);
        oInicioSesion.setVisible(true);**/
        
        
    }
    
}
