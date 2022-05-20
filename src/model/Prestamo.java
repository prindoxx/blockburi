/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;
import DAO.*;
import app.AgregarPrestamo;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Prestamo extends Transaccion{
    
    
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
        
        listaIdPeliculas = oSelect.llenarMapaPrestamoPelicula(idPrestamo);
        
        for ( int i=0; i < listaIdPeliculas.size() ; i++  ) {
        
            oPelicula = oPelicula.buscarPelicula(mapa, listaIdPeliculas.get(i));
            mapaPeliculas.put(listaIdPeliculas.get(i), oPelicula);
            
        }
        
        return mapaPeliculas;
    
    }
    
    public Prestamo arrendarPelicula(HashMap<Integer, Prestamo> mapaPrestamos, HashMap<String, Trabajador> mapaTrabajadores, HashMap<Integer, Pelicula> mapaArrendarPelis, HashMap<Integer, Venta> mapaVentas, Pelicula oPeliculaArrendar, String rutTrabajador, String rutCliente, String fechaAr, String fechaDev ) {
    
        Trabajador oTrabajador = new Trabajador();
        oTrabajador.setRut(rutTrabajador);
        if ( oTrabajador.trabajadorExiste(mapaTrabajadores, rutTrabajador) ){
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
    
    //arrendar pelicula en modificar prestamo, ya tenemos el prestamo creado, y solo estamos añadiendo una pelicula, por eso necesitamos pocos datos por parametro
    public Prestamo arrendarPelicula(HashMap<Integer, Pelicula> mapaPelis, Prestamo oPrestamoCreado, Pelicula oPeliculaArrendar){
    
        int total = 0;
        
        //agregamos la pelicula al prestamo ya creado
        oPrestamoCreado.mapaPeliculas.put(oPeliculaArrendar.getId(), oPeliculaArrendar);
        
        //se suma el precio de la pelicula arrendada
        oPrestamoCreado.setMontoAPagar(oPrestamoCreado.getMontoAPagar() + oPeliculaArrendar.getPrecioArriendo());
        
        Pelicula oPelicula = new Pelicula();
        
        oPelicula = mapaPelis.get(oPeliculaArrendar.getId());
        
        //se modifica el stock de la pelicula, ya que se agrego a un prestamo, en otras palabras se arrendó
        oPelicula.setStock(oPelicula.getStock()-1);
        
        mapaPelis.put(oPelicula.getId(), oPelicula);
        
        return oPrestamoCreado;
    
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
    
      public Pelicula mostrarPeliculaAnio (HashMap<Integer, Prestamo> mapaPrestamo){//funcion para la parte ep4.1
        Prestamo oPrestamo = new Prestamo();
        Pelicula oPelicula = new Pelicula();
        Pelicula oPelicula1 = new Pelicula();
        int aux = 0;
        for (Map.Entry<Integer, Prestamo> entry : mapaPrestamo.entrySet()) {
            
            oPrestamo = entry.getValue();
            
            for (Map.Entry<Integer, Pelicula> entry1 : oPrestamo.mapaPeliculas.entrySet()){
                
                oPelicula = entry1.getValue();
                oPelicula = oPelicula.buscarPelicula(mapaPeliculas, oPelicula.getId());
                
                if(oPelicula.getAnio() > aux){
                    aux = oPelicula.getAnio();
                    oPelicula1 = oPelicula;
                }
                
            }
           
        }
        return oPelicula1;
    }
    
    @Override
    public void infoVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarPeliculaPorConsola(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
