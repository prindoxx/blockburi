/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;
import DAO.*;
import java.sql.SQLException;

/**
 *
 * @author jefte
 */
public class Sistema {
    
    public HashMap<Integer, Prestamo> mapaPrestamos;
   
    public Sistema() {
        mapaPrestamos = new HashMap<>();
    }
    
    public Pelicula buscarPelicula( HashMap<Integer, Pelicula> mapa, String nombre){
    
        /**mapa**/
        for( HashMap.Entry<Integer, Pelicula> entry : mapa.entrySet() ){
        
            Pelicula oPelicula = entry.getValue();//obtiene el valor de cierta posicion en el mapa
            
            if( oPelicula.getNombre().equals(nombre) ){
                //el nombre dado por parametro es igual al nombre de la pelicula
                //System.out.println("la peliucla si esta");
                return oPelicula;
            }
        
        }
        
        return null;
        
    }
    
    public Pelicula buscarPelicula( HashMap<Integer, Pelicula> mapa, int id){
        //devuelve la pelicula con ese id si se encuentra en el mapa
        /**mapa**/
        if ( mapa.containsKey(id) ){
            //esta la pelicula con ese id en el mapa
            //System.out.println("La pelicula si esta");
            /**Pelicula oPelicula = new Pelicula();
            oPelicula = mapa.get(id);
            System.out.println(""+oPelicula.getNombre());
            System.out.println(""+oPelicula.getAnio());
            System.out.println(""+oPelicula.getDirector());**/
            return mapa.get(id);
        } else {
            //no esta la pelicula en el mapa
            return null;
        }
        
    }
    
    public void agregarPelicula( int id, Pelicula oPeliculaAgregar, HashMap<Integer, Pelicula> mapa) throws SQLException{
        //con id
        Sistema oSistema = new Sistema();
        Pelicula oPelicula = oSistema.buscarPelicula(mapa, id);
       
        if ( oPelicula == null ){
            DAOInsert oDAOInsert = new DAOInsert();
            //la pelicula no esta en el mapa de peliculas ya existentes
            oPeliculaAgregar.setId(id);
            mapa.put(id, oPeliculaAgregar); //se agrega la pelicula en el mapa
            oDAOInsert.agregarPeliculaBD(oPeliculaAgregar);//se agrega la pelicula en la BD
        
        } else {
            DAOUpdate oUpdate = new DAOUpdate();
            //la pelicula esta en el mapa de peliculas 
            oPelicula.setStock( ( oPelicula.getStock() + oPeliculaAgregar.getStock() ) );//se actualiza el stock
            mapa.put(id, oPelicula); //se modifico el stock de la pelicula del mapa
            oUpdate.modificarStock(oPelicula);//se modifica el stock de la pelicula en la bd
            
        }
        
    }
    
    public void agregarPelicula ( Pelicula oPeliculaAgregar, HashMap<Integer, Pelicula> mapa ) throws SQLException{
        //sin id
        Sistema oSistema = new Sistema();
        Pelicula oPelicula = oSistema.buscarPelicula(mapa, oPeliculaAgregar.getNombre());
        
        
        if ( oPelicula == null ){
            //la pelicula no esta en el mapa de peliculas
            
            int numeroRandom = (int)(Math.random()*1000000000+1);//numero random creado para usar de ID
            
            DAOInsert oDAOInsert = new DAOInsert();
            oPeliculaAgregar.setId(numeroRandom);
            mapa.put(numeroRandom, oPeliculaAgregar);//agregamos la pelicula al mapa
            oDAOInsert.agregarPeliculaBD(oPeliculaAgregar);//agregamos la pelicula a la bd
            
        } else {
            //la pelicula esta en el mapa
            
            DAOUpdate oUpdate = new DAOUpdate();
            oPelicula.setStock( ( oPelicula.getStock() + oPeliculaAgregar.getStock() ) );
            mapa.put(oPelicula.getId(), oPelicula); //se modifico el stock de la pelicula del mapa
            oUpdate.modificarStock(oPelicula);//se modifica el stock de la pelicula en la bd
        }
    
    }
    
    public Pelicula eliminarPelicula( int id, HashMap<Integer, Pelicula> mapa ) throws SQLException {
        //eliminacion por id
        Sistema oSistema = new Sistema();
        Pelicula oPelicula = oSistema.buscarPelicula(mapa, id);
        
        if( oPelicula == null ){
            //no existe la pelicula a eliminar
            return null;
        } else {
            DAODelete oDelete = new DAODelete();
            //existe la pelicula a eliminar
            
            oDelete.eliminarPelicula(oPelicula);
            return mapa.remove(id);
        }
    
    }
    
    public boolean trabajadorExiste ( HashMap<String, Trabajador> mapaTrabajadores, String rutTrabajador){
        
        if ( mapaTrabajadores.containsKey(rutTrabajador) ){
            //el trabajador existe en el mapa de trabajadores
            return true;
        }
        //el trabajador no existe en el mapa de trabajadores
        return false;
        
    }
    
    public Prestamo eliminarPrestamo( int id, HashMap<Integer, Prestamo> mapa ) throws SQLException {
        //eliminacion por id
        Prestamo oPrestamo = mapa.get(id);
        
        if( oPrestamo == null ){
            //no existe la pelicula a eliminar
            return null;
        } else {
            //DAODelete oDelete = new DAODelete();
            //existe la pelicula a eliminar
            
            //oDelete.eliminarPelicula(oPelicula);
            return mapa.remove(id);
        }
    
    }
    
    public Prestamo buscarPrestamo(HashMap<Integer, Prestamo> mapaPrestamo, int id ){
    
        if ( mapaPrestamo.containsKey(id) ) {
            //el mapa de prestamos contiene ese prestamo
            return mapaPrestamo.get(id);
            
        } else { 
            //el mapa no contiene ese prestamo
            return null;
        }
    
    }
    
    public ArrayList buscarPrestamoPorPelicula (HashMap<Integer, Prestamo> mapaPrestamo, Pelicula oPelicula){
        
        ArrayList prestamosArrayList = new ArrayList();
        HashMap<Integer, Prestamo> mapaPrestamo1 = new HashMap<>();
        mapaPrestamo1 = mapaPrestamo;
        
        for (Map.Entry<Integer, Prestamo> entry : mapaPrestamo1.entrySet()) {
            //accedemos al mapa de préstamos
            Prestamo oPrestamo = new Prestamo();
            oPrestamo = entry.getValue();
            
            for (Map.Entry<Integer, Pelicula> entry1 : oPrestamo.mapaPeliculas.entrySet()){
                //accedemos al mapa de peliculas que está dentro de cada préstamo
                Pelicula oPelicula1 = new Pelicula();
                oPelicula1 = entry1.getValue();
                
                if(oPelicula1 == oPelicula){
                    //guardamos la película en un arraylist por si hay varias películas con el mismo género
                    prestamosArrayList.add(oPrestamo);
                }
                
            }
           
        }
        return prestamosArrayList;
    }
    
    public Pelicula mostrarPeliculaAnio (HashMap<Integer, Prestamo> mapaPrestamo){//funcion para la parte ep4.1
         
        Pelicula oPelicula1 = new Pelicula();
        int aux = 0;
        HashMap<Integer, Prestamo> mapaPrestamo1 = new HashMap<>();
        mapaPrestamo1 = mapaPrestamo;
                
        for (Map.Entry<Integer, Prestamo> entry : mapaPrestamo1.entrySet()) {
            //accedemos al mapa de prestamos
            Prestamo oPrestamo = new Prestamo();
            oPrestamo = entry.getValue();
            
            for (Map.Entry<Integer, Pelicula> entry1 : oPrestamo.mapaPeliculas.entrySet()){
                //accedemos al mapa de peliculas que está dentro de cada prestamo
                Pelicula oPelicula = new Pelicula();
                oPelicula = (Pelicula)entry1.getValue();
                
                if(oPelicula.getAnio() > aux){
                    //comparamos cual pelicula tiene el mayor año
                    aux = oPelicula.getAnio();
                    oPelicula1 = oPelicula;
                }
                
            }
           
        }
        return oPelicula1;
        
    }
      
    public ArrayList buscarPeliculaPorGenero (HashMap<Integer, Prestamo> mapaPrestamo, String genero){
        
        ArrayList peliculasArrayList = new ArrayList();
        Pelicula oPelicula1 = new Pelicula();
        
        HashMap<Integer, Prestamo> mapaPrestamo1 = new HashMap<>();
        mapaPrestamo1 = mapaPrestamo;
                
        for (Map.Entry<Integer, Prestamo> entry : mapaPrestamo1.entrySet()) {
            //accedemos al mapa de prestamos
            Prestamo oPrestamo = new Prestamo();
            oPrestamo = entry.getValue();
            
            for (Map.Entry<Integer, Pelicula> entry1 : oPrestamo.mapaPeliculas.entrySet()){
                //accedemos al mapa de peliculas que está dentro de cada prestamo
                Pelicula oPelicula = new Pelicula();
                oPelicula = entry1.getValue();
                
                if((oPelicula.getGenero()).equals(genero)){
                    //comparamos cual pelicula tiene el mayor año
                    peliculasArrayList.add(oPelicula);
                }
                
            }
           
        }
        if(peliculasArrayList.isEmpty()){
            return null;
        }
        else{
            return peliculasArrayList;
        }
    }
}
