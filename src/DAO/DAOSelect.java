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
        oConexion = new Conexion("localhost", "blockbuster", "root", "Jefte01432201");
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
    
    
}
