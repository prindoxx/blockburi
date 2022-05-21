/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import app.VentaPelicula;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

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
    
    public Venta comprarPelicula(HashMap<Integer, Prestamo> mapaPrestamos, HashMap<String, Trabajador> mapaTrabajadores, HashMap<Integer, Pelicula> mapaComprarPelis, HashMap<Integer, Venta> mapaVentas, Pelicula oPeliculaArrendar, String rutTrabajador, String rutCliente, String fechaVenta ) {
    
        Trabajador oTrabajador = new Trabajador();
        oTrabajador.setRut(rutTrabajador);
        if ( oTrabajador.trabajadorExiste(mapaTrabajadores, rutTrabajador) ){
            //existe el trabajador en el mapa
            
            //int numeroRandom = (int)(Math.random()*1000000000+1);//numero random creado para usar de ID
            int total=0;
            Venta oVenta = new Venta();
            HashMap<Integer, Pelicula> mapaPeliculasArrendar = mapaComprarPelis;
            
            mapaPeliculasArrendar.put(oPeliculaArrendar.getId(), oPeliculaArrendar);
            
            for (Map.Entry<Integer, Pelicula> entry : mapaPeliculasArrendar.entrySet()) {
                Pelicula oPelicula1 = entry.getValue();
                
                System.out.println("ID PELICULA MAPA: "+oPelicula1.getId());
                System.out.println("NOMBRE PELICULA MAPA: "+oPelicula1.getNombre());
                
            }
            
            //oPrestamo.setIdPrestamo(numeroRandom);
            oVenta.setRutCliente(rutCliente);
            oVenta.setRutTrabajador(rutTrabajador);
            oVenta.mapaPeliculas = mapaPeliculasArrendar;
            oVenta.setFechaVenta(fechaVenta);
            
            for (Map.Entry<Integer, Pelicula> entry : mapaPeliculasArrendar.entrySet()) {
                
                Pelicula oPeliculaM = entry.getValue();
                
                total += oPeliculaM.getPrecioArriendo();
                
            }
            
            oVenta.setMontoAPagar(total);
            
            //System.out.println("idPrestamo: "+oPrestamo.getIdPrestamo());
            
            return oVenta;
            
        } else {
            //el trabajador no existe en el mapa
            VentaPelicula oVentaPelicula = new VentaPelicula(mapaPeliculas, mapaPrestamos, mapaTrabajadores,mapaVentas);
            JOptionPane.showMessageDialog(oVentaPelicula, "Ingrese un RUT de Trabajador valido");
            return null;
        }
        
        
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
