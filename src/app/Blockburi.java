/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.*;
import model.*;

/**
 *
 * @author Pablo
 */
public class Blockburi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<Integer, Pelicula> mapaPeliculas = new HashMap<>()/**/;
        
        /*SE PLANEA CAMBIAR A LLENADO DE MAPA POR BASE DE DATOS*/
        Pelicula Pelicula1 = new Pelicula(12345678, "The Shawshank Redemption", 1994, "Frank Darabont", "Drama", 20990, 6500, 13);
        Pelicula Pelicula2 = new Pelicula(234567891, "El Padrino", 1972, "Francis Ford Coppola", "Drama", 24990, 8750, 4);
        Pelicula Pelicula3 = new Pelicula(345678912, "El Padrino II", 1974, "Francis Ford Coppola", "Drama", 24990, 9990, 2);
        
        ArrayList<Integer> listPelicula1 = new ArrayList<>();
        listPelicula1.add(12345678);
        
        ArrayList<Integer> listPelicula2 = new ArrayList<>();
        listPelicula2.add(12345678);
        listPelicula2.add(234567891);
        
        ArrayList<Integer> listPelicula3 = new ArrayList<>();
        listPelicula3.add(12345678);
        listPelicula3.add(234567891);
        listPelicula3.add(345678912);
        
        Prestamo Prestamo1 = new Prestamo(123, "1-1", "1-2", listPelicula1, "01-01-01", "05-01-01", 6500);
        Prestamo Prestamo2 = new Prestamo(234, "2-1", "2-2", listPelicula2, "02-02-02", "06-02-02", 15250);
        Prestamo Prestamo3 = new Prestamo(345, "3-1", "3-2", listPelicula3, "03-03-03", "07-03-03", 25240);
        
        Trabajador Trabajador1 = new Trabajador("1-2", "Pablo", "1", "1");
        Trabajador Trabajador2 = new Trabajador("2-2", "Ivan", "2", "2");
        Trabajador Trabajador3 = new Trabajador("3-2", "Jefte", "3", "3");
        
        mapaPeliculas.put(12345678, Pelicula1);
        mapaPeliculas.put(234567891, Pelicula2);
        mapaPeliculas.put(345678912, Pelicula3);
        
        InicioSesion oInicioSesion = new InicioSesion(mapaPeliculas);
        oInicioSesion.setVisible(true);
        
        
    }
    
}
