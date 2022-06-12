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
 * @author Pablo
 */
public class Pelicula{
    
    private int id;
    private String nombre;
    private int anio;
    private String director;
    private String genero;
    private int precioVenta;
    private int precioArriendo;
    private int stock;

    public Pelicula() {
    }

    public Pelicula(int id, String nombre, int anio, String director, String genero, int precioVenta, int precioArriendo, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.director = director;
        this.genero = genero;
        this.precioVenta = precioVenta;
        this.precioArriendo = precioArriendo;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPrecioArriendo() {
        return precioArriendo;
    }

    public void setPrecioArriendo(int precioArriendo) {
        this.precioArriendo = precioArriendo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void agregarPelicula(){
    
        /**mapa**/
        
        /**bd**/
    }
    /**
    public Pelicula buscarPelicula( HashMap<Integer, Pelicula> mapa, String nombre){
    
        //mapa
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
        //mapa
        if ( mapa.containsKey(id) ){
            //esta la pelicula con ese id en el mapa
            //System.out.println("La pelicula si esta");
            /**Pelicula oPelicula = new Pelicula();
            oPelicula = mapa.get(id);
            System.out.println(""+oPelicula.getNombre());
            System.out.println(""+oPelicula.getAnio());
            System.out.println(""+oPelicula.getDirector());**//**
            return mapa.get(id);
        } else {
            //no esta la pelicula en el mapa
            return null;
        }
        
    }
    **/
    
    /**
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
    **//**
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
    **//**
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
    **/
}
