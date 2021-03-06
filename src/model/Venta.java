/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import app.VentaPelicula;
import interfaces.InformacionTransaccion;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author the_i
 */
public class Venta extends Transaccion implements InformacionTransaccion{

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
        Sistema oSistema = new Sistema();
        oTrabajador.setRut(rutTrabajador);
        if ( oSistema.trabajadorExiste(mapaTrabajadores, rutTrabajador) ){
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
    public int mostrarCantidadDeObjetos(HashMap<Integer, Pelicula> mapaPeliculas, HashMap<Integer, Prestamo> mapaPrestamos ) {
        int cont=0;
        cont = mapaPeliculas.size();
        return cont;
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
