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
public class Prestamo {
    
    private int idPrestamo;
    private String rutCliente;
    private String rutTrabajador;
    //private ArrayList<Pelicula> listIdPeliculas;//cambiar a oPelicula
    public HashMap<Integer, Pelicula> mapaPeliculas;
    private String fechaPrestamo; //falta importar libreria para fechas
    private String fechaEntrega;
    private int montoAPagar;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, String rutCliente, String rutTrabajador, String fechaPrestamo, String fechaEntrega, int montoAPagar) {
        this.idPrestamo = idPrestamo;
        this.rutCliente = rutCliente;
        this.rutTrabajador = rutTrabajador;
        mapaPeliculas =  new HashMap<>();
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.montoAPagar = montoAPagar;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutTrabajador() {
        return rutTrabajador;
    }

    public void setRutTrabajador(String rutTrabajador) {
        this.rutTrabajador = rutTrabajador;
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

    public int getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(int montoAPagar) {
        this.montoAPagar = montoAPagar;
    }


    public HashMap<Integer, Pelicula> llenaMapaPeliculasPrestamo ( int idPrestamo, HashMap<Integer, Pelicula> mapa ) throws SQLException{
    
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
    
    public Prestamo arrendarPelicula(HashMap<Integer, Prestamo> mapaPrestamos, HashMap<String, Trabajador> mapaTrabajadores, HashMap<Integer, Pelicula> mapaArrendarPelis, Pelicula oPeliculaArrendar, String rutTrabajador, String rutCliente, String fechaAr, String fechaDev ) {
    
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
            AgregarPrestamo oAgregarPrestamo = new AgregarPrestamo(mapaPeliculas, mapaPrestamos, mapaTrabajadores);
            JOptionPane.showMessageDialog(oAgregarPrestamo, "Ingrese un RUT de Trabajador valido");
            return null;
        }
        
        
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
    
}
