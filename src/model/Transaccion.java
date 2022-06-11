/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.DAOSelect;
import interfaces.InformacionTransaccion;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author the_i
 */
public abstract class Transaccion{
   
    private int idPrestamo;
    private String rutCliente;
    private String rutTrabajador;
    private int montoAPagar;
    public HashMap<Integer, Pelicula> mapaPeliculas;
    
    public Transaccion (){
    }
    
    public Transaccion (int idPrestamo, String rutCliente, String rutTrabajador,  int montoAPagar, HashMap<Integer, Pelicula> mapaPeliculas) {
        this.idPrestamo = idPrestamo;
        this.rutCliente = rutCliente;
        this.rutTrabajador = rutTrabajador;
        this.montoAPagar = montoAPagar;
        mapaPeliculas =  new HashMap<>();
        
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

    public int getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(int montoAPagar) {
        this.montoAPagar = montoAPagar;
    }
    
    public abstract void mostrarPeliculasPorConsola(HashMap<Integer, Pelicula> mapaPeliculas);
    
    
}
