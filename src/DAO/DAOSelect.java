/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.SQLException;
import java.util.*;
import model.*;

/**
 *
 * @author Pablo
 */
public class DAOSelect {
    
    private Conexion oConexion;
    private String sql;
    
    
    //haciendo conexion a DB, entregando parametros
    public DAOSelect() throws SQLException {
        oConexion = new Conexion("localhost", "blockbuster", "root", "1234");
    }
    
    //
    public HashMap<Integer, Pelicula> llenarMapaPelicula() throws SQLException{
    
        HashMap<Integer, Pelicula> mapaPeliculas = new HashMap<>();
        Pelicula oPelicula;
        
        sql = "SELECT * FROM blockbuster.pelicula;";
        oConexion.oResultSet = oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        while( oConexion.oResultSet.next() ) {
        
            oPelicula = new Pelicula();
            
            oPelicula.setId(oConexion.oResultSet.getInt("idpelicula"));
            oPelicula.setNombre(oConexion.oResultSet.getString("nombre"));
            oPelicula.setAnio(oConexion.oResultSet.getInt("anio"));
            oPelicula.setDirector(oConexion.oResultSet.getString("director"));
            oPelicula.setGenero(oConexion.oResultSet.getString("genero"));
            oPelicula.setPrecioVenta(oConexion.oResultSet.getInt("precioVenta"));
            oPelicula.setPrecioArriendo(oConexion.oResultSet.getInt("precioArriendo"));
            oPelicula.setStock(oConexion.oResultSet.getInt("stock"));
            
            mapaPeliculas.put(oPelicula.getId(), oPelicula);
        
        }
        
        return mapaPeliculas;
    
    }
    
    public Trabajador inicioSesion(String usuario, String contra ) throws SQLException {
    
        Trabajador oTrabajador;
        
        sql = "SELECT * FROM trabajador WHERE usuario= '" + usuario + "' and contrasenia = ('" + contra + "')";
        oConexion.oResultSet = oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        if (oConexion.oResultSet.next()) {
            
            oTrabajador = new Trabajador();
            
            oTrabajador.setRut(oConexion.oResultSet.getString("rut"));
            oTrabajador.setNombre(oConexion.oResultSet.getString("nombre"));
            oTrabajador.setUsuario(oConexion.oResultSet.getString("usuario"));
            oTrabajador.setContrasenia(oConexion.oResultSet.getString("contrasenia"));
            
            return oTrabajador;
            
        } else {
        
            return null;
            
        }
    
    }
    
    public Pelicula buscarPelicula (int idPelicula) throws SQLException {
    
        Pelicula oPelicula;
        
        sql = "SELECT * FROM pelicula WHERE idpelicula= '" + idPelicula + "';";
        oConexion.oResultSet = oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        if ( oConexion.oResultSet.next() ) {
        
            oPelicula = new Pelicula();
            
            oPelicula.setId(oConexion.oResultSet.getInt("idpelicula"));
            oPelicula.setNombre(oConexion.oResultSet.getString("nombre"));
            oPelicula.setAnio(oConexion.oResultSet.getInt("anio"));
            oPelicula.setDirector(oConexion.oResultSet.getString("director"));
            oPelicula.setGenero(oConexion.oResultSet.getString("genero"));
            oPelicula.setPrecioVenta(oConexion.oResultSet.getInt("precioVenta"));
            oPelicula.setPrecioArriendo(oConexion.oResultSet.getInt("precioArriendo"));
            oPelicula.setStock(oConexion.oResultSet.getInt("stock"));
            
            return oPelicula;
        
        } else {
        
            return null;
        
        }
    
    }
    
    public ArrayList<Integer> llenarMapaPrestamoPelicula(int idPrestamo) throws SQLException{
    
        //HashMap<Integer, Pelicula> mapaPeliculas = new HashMap<>();
        ArrayList<Integer> listaIdPeliculas = new ArrayList<>();
        Pelicula oPelicula;
        
        sql = " SELECT `prestamo_pelicula`.`pelicula_idpelicula` FROM `blockbuster`.`prestamo_pelicula` where prestamo_idPrestamo = '"+ idPrestamo +"';   ";
        oConexion.oResultSet = oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        while( oConexion.oResultSet.next() ) {
        
            oPelicula = new Pelicula();
            
            oPelicula.setId(oConexion.oResultSet.getInt("pelicula_idpelicula"));
            
            listaIdPeliculas.add(oPelicula.getId());
            
        }
        
        return listaIdPeliculas;
             
    }
    
    public HashMap<Integer, Prestamo> llenarPrestamo() throws SQLException{
    
        HashMap<Integer, Prestamo> mapaPrestamos = new HashMap<>();
        HashMap<Integer, Prestamo> mapaPrestamosPeliculas = new HashMap<>();
        Prestamo oPrestamo;
        Pelicula oPelicula;
        
        sql = " SELECT * FROM blockbuster.prestamo; ";
        oConexion.oResultSet = oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        while ( oConexion.oResultSet.next() ) {
        
            oPrestamo = new Prestamo();
            oPelicula = new Pelicula();
            
            oPrestamo.setIdPrestamo(oConexion.oResultSet.getInt("idPrestamo"));
            oPrestamo.setRutCliente(oConexion.oResultSet.getString("rutCliente"));
            oPrestamo.setRutTrabajador(oConexion.oResultSet.getString("trabajador_rut"));
            
            //oPelicula = oPelicula.buscarPelicula(mapaPeliculas, oPrestamo.getIdPrestamo());
            
           // oPrestamo.mapaPeliculas = llenarMapaPrestamoPelicula();
            
            //oPrestamo.setMapaPeliculas(llenarMapaPrestamoPelicula(oPrestamo.getIdPrestamo()));
            oPrestamo.setFechaPrestamo(oConexion.oResultSet.getString("fechaPrestamo"));
            oPrestamo.setFechaEntrega(oConexion.oResultSet.getString("fechaEntrega"));
            oPrestamo.setMontoAPagar(oConexion.oResultSet.getInt("montoAPagar"));
           
            mapaPrestamos.put(oPrestamo.getIdPrestamo(), oPrestamo);
            
        }
        
        return mapaPrestamos;
    
    }
    
    public HashMap<String, Trabajador> llenarMapaTrabajadores() throws SQLException{
    
        HashMap<String, Trabajador> mapaTrabajadores = new HashMap<>();
        Trabajador oTrabajador;
        
        sql = "SELECT * FROM blockbuster.trabajador;";
        oConexion.oResultSet = oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        while( oConexion.oResultSet.next() ) {
        
            oTrabajador = new Trabajador();
            
            oTrabajador.setRut(oConexion.oResultSet.getString("rut"));
            oTrabajador.setNombre(oConexion.oResultSet.getString("nombre"));
            oTrabajador.setUsuario(oConexion.oResultSet.getString("usuario"));
            oTrabajador.setContrasenia(oConexion.oResultSet.getString("contrasenia"));
            
            mapaTrabajadores.put(oTrabajador.getRut(), oTrabajador);
        
        }
        
        return mapaTrabajadores;
    
    }
    
    
}
