/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;
import DAO.*;
import app.AgregarPrestamo;
import interfaces.InformacionTransaccion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Prestamo extends Transaccion implements InformacionTransaccion{
    
    
    //private ArrayList<Pelicula> listIdPeliculas;//cambiar a oPelicula
    private String fechaPrestamo; //falta importar libreria para fechas
    private String fechaEntrega;

    public Prestamo() {
    }

    public Prestamo(String fechaPrestamo, String fechaEntrega, int idPrestamo, String rutCliente, String rutTrabajador, HashMap<Integer, Pelicula> mapaPeliculas, int montoAPagar) {
        super(idPrestamo, rutCliente, rutTrabajador, montoAPagar, mapaPeliculas);
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    
    public HashMap<Integer, Pelicula> llenaMapaPeliculasTransaccion ( int idPrestamo, HashMap<Integer, Pelicula> mapa ) throws SQLException{
    
        HashMap<Integer, Pelicula> mapaPeliculas = new HashMap<>();
        Pelicula oPelicula = new Pelicula();
        ArrayList<Integer> listaIdPeliculas = new ArrayList<>();
        DAOSelect oSelect = new DAOSelect();
        Sistema oSistema = new Sistema();
        
        listaIdPeliculas = oSelect.llenarMapaPrestamoPelicula(idPrestamo);
        
        for ( int i=0; i < listaIdPeliculas.size() ; i++  ) {
        
            oPelicula = oSistema.buscarPelicula(mapa, listaIdPeliculas.get(i));
            mapaPeliculas.put(listaIdPeliculas.get(i), oPelicula);
            
        }
        
        return mapaPeliculas;
    
    }
    
    public Prestamo arrendarPelicula(HashMap<Integer, Prestamo> mapaPrestamos, HashMap<String, Trabajador> mapaTrabajadores, HashMap<Integer, Pelicula> mapaArrendarPelis, HashMap<Integer, Venta> mapaVentas, Pelicula oPeliculaArrendar, String rutTrabajador, String rutCliente, String fechaAr, String fechaDev ) {
    
        Trabajador oTrabajador = new Trabajador();
        Sistema oSistema = new Sistema();
        oTrabajador.setRut(rutTrabajador);
        if ( oSistema.trabajadorExiste(mapaTrabajadores, rutTrabajador) ){
            //existe el trabajador en el mapa
            
            //int numeroRandom = (int)(Math.random()*1000000000+1);//numero random creado para usar de ID
            int total=0;
            Prestamo oPrestamo = new Prestamo();
            HashMap<Integer, Pelicula> mapaPeliculasArrendar = mapaArrendarPelis;
            
            mapaPeliculasArrendar.put(oPeliculaArrendar.getId(), oPeliculaArrendar);
            
            for (Map.Entry<Integer, Pelicula> entry : mapaPeliculasArrendar.entrySet()) {
                Pelicula oPelicula1 = entry.getValue();
                
                System.out.println("ID PELICULA MAPA: "+oPelicula1.getId());
                System.out.println("NOMBRE PELICULA MAPA: "+oPelicula1.getNombre());
                
            }
            
            //oPrestamo.setIdPrestamo(numeroRandom);
            oPrestamo.setRutCliente(rutCliente);
            oPrestamo.setRutTrabajador(rutTrabajador);
            oPrestamo.mapaPeliculas = mapaPeliculasArrendar;
            oPrestamo.setFechaPrestamo(fechaAr);
            oPrestamo.setFechaEntrega(fechaDev);
            
            for (Map.Entry<Integer, Pelicula> entry : mapaPeliculasArrendar.entrySet()) {
                
                Pelicula oPeliculaM = entry.getValue();
                
                total += oPeliculaM.getPrecioArriendo();
                
            }
            
            oPrestamo.setMontoAPagar(total);
            
            //System.out.println("idPrestamo: "+oPrestamo.getIdPrestamo());
            
            return oPrestamo;
            
        } else {
            //el trabajador no existe en el mapa
            AgregarPrestamo oAgregarPrestamo = new AgregarPrestamo(mapaPeliculas, mapaPrestamos, mapaTrabajadores,mapaVentas);
            JOptionPane.showMessageDialog(oAgregarPrestamo, "Ingrese un RUT de Trabajador valido");
            return null;
        }
        
        
    }
    
    //arrendar pelicula en modificar prestamo, ya tenemos el prestamo creado, y solo estamos a??adiendo una pelicula, por eso necesitamos pocos datos por parametro
    public Prestamo arrendarPelicula(HashMap<Integer, Pelicula> mapaPelis, Prestamo oPrestamoCreado, Pelicula oPeliculaArrendar){
    
        int total = 0;
        
        //agregamos la pelicula al prestamo ya creado
        oPrestamoCreado.mapaPeliculas.put(oPeliculaArrendar.getId(), oPeliculaArrendar);
        
        //se suma el precio de la pelicula arrendada
        oPrestamoCreado.setMontoAPagar(oPrestamoCreado.getMontoAPagar() + oPeliculaArrendar.getPrecioArriendo());
        
        Pelicula oPelicula = new Pelicula();
        
        oPelicula = mapaPelis.get(oPeliculaArrendar.getId());
        
        //se modifica el stock de la pelicula, ya que se agrego a un prestamo, en otras palabras se arrend??
        oPelicula.setStock(oPelicula.getStock()-1);
        
        mapaPelis.put(oPelicula.getId(), oPelicula);
        
        return oPrestamoCreado;
    
    }
    /**
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
    **//**
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
                //accedemos al mapa de peliculas que est?? dentro de cada prestamo
                Pelicula oPelicula = new Pelicula();
                oPelicula = (Pelicula)entry1.getValue();
                
                if(oPelicula.getAnio() > aux){
                    //comparamos cual pelicula tiene el mayor a??o
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
                //accedemos al mapa de peliculas que est?? dentro de cada prestamo
                Pelicula oPelicula = new Pelicula();
                oPelicula = entry1.getValue();
                
                if((oPelicula.getGenero()).equals(genero)){
                    //comparamos cual pelicula tiene el mayor a??o
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
    }**/
     /**
    public ArrayList buscarPrestamoPorPelicula (HashMap<Integer, Prestamo> mapaPrestamo, Pelicula oPelicula){
        
        ArrayList prestamosArrayList = new ArrayList();
        HashMap<Integer, Prestamo> mapaPrestamo1 = new HashMap<>();
        mapaPrestamo1 = mapaPrestamo;
        
        for (Map.Entry<Integer, Prestamo> entry : mapaPrestamo1.entrySet()) {
            //accedemos al mapa de pr??stamos
            Prestamo oPrestamo = new Prestamo();
            oPrestamo = entry.getValue();
            
            for (Map.Entry<Integer, Pelicula> entry1 : oPrestamo.mapaPeliculas.entrySet()){
                //accedemos al mapa de peliculas que est?? dentro de cada pr??stamo
                Pelicula oPelicula1 = new Pelicula();
                oPelicula1 = entry1.getValue();
                
                if(oPelicula1 == oPelicula){
                    //guardamos la pel??cula en un arraylist por si hay varias pel??culas con el mismo g??nero
                    prestamosArrayList.add(oPrestamo);
                }
                
            }
           
        }
        return prestamosArrayList;
    }
**/
    @Override
    public int mostrarCantidadDeObjetos(HashMap<Integer, Pelicula> mapaPeliculas, HashMap<Integer, Prestamo> mapaPrestamos) {
        
        int cont=0;
        cont = mapaPrestamos.size();
       
        return cont;
    }

    public ArrayList buscarPeliculaPorGenero(HashMap<Integer, Prestamo> mapaPrestamos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int infoTransaccion(HashMap<Integer, Pelicula> mapaPeliculas) {
        HashMap<Integer, Pelicula> mapaDePeliculas = mapaPeliculas;
        int cont=0;
        for (Map.Entry<Integer, Pelicula> entry : mapaDePeliculas.entrySet()){
            Pelicula pelicula = new Pelicula();
            pelicula = entry.getValue();
            if (pelicula != null) cont++;
        }
        return cont;
    }
    
}
