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
        
        /*SE PLANEA CAMBIAR A LLENADO DE MAPA POR BASE DE DATOS*/
        /**Pelicula Pelicula1 = new Pelicula(12345678, "The Shawshank Redemption", 1994, "Frank Darabont", "Drama", 20990, 6500, 13);
        Pelicula Pelicula2 = new Pelicula(234567891, "El Padrino", 1972, "Francis Ford Coppola", "Drama", 24990, 8750, 4);
        Pelicula Pelicula3 = new Pelicula(345678912, "El Padrino II", 1974, "Francis Ford Coppola", "Drama", 24990, 9990, 2);**/
        ArrayList<Integer> listPelicula1 = new ArrayList<>();
        listPelicula1.add(12345678);
        
        ArrayList<Integer> listPelicula2 = new ArrayList<>();
        listPelicula2.add(12345678);
        listPelicula2.add(234567891);
        
        ArrayList<Integer> listPelicula3 = new ArrayList<>();
        listPelicula3.add(12345678);
        listPelicula3.add(234567891);
        listPelicula3.add(345678912);
        
        Trabajador Trabajador1 = new Trabajador("1-2", "Pablo", "1", "1");
        Trabajador Trabajador2 = new Trabajador("2-2", "Ivan", "2", "2");
        Trabajador Trabajador3 = new Trabajador("3-2", "Jefte", "3", "3");
        
        /**mapaPeliculas.put(12345678, Pelicula1);
        mapaPeliculas.put(234567891, Pelicula2);
        mapaPeliculas.put(345678912, Pelicula3);**/
        
        InicioSesion oInicioSesion = new InicioSesion(mapaPeliculas);
        oInicioSesion.setVisible(true);
        
        
    }
    
}
