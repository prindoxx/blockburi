/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author the_i
 */
public class Venta extends Transaccion{

    private String fechaVenta;

    public Venta() {
    }

    public Venta(String fechaVenta, int idPrestamo, String rutCliente, String rutTrabajador, HashMap<Integer, Pelicula> mapaPeliculas, int montoAPagar) {
        super(idPrestamo, rutCliente, rutTrabajador, montoAPagar, mapaPeliculas);
        this.fechaVenta = fechaVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    

    @Override
    public HashMap<Integer, Pelicula> llenaMapaPeliculasTransaccion(int idPrestamo, HashMap<Integer, Pelicula> mapa) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void infoVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
