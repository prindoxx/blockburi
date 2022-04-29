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
        this.mapaPeliculas = mapaPeliculas;
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
    
    
}
