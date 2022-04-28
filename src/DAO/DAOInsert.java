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
public class DAOInsert {
    
    private Conexion oConexion;
    private String sql;
    
    
    //haciendo conexion a DB, entregando parametros
    public DAOInsert() throws SQLException {
        oConexion = new Conexion("localhost", "blockbuster", "root", "Jefte01432201");
    }
    
    public void agregarPeliculaBD( Pelicula oPelicula ) throws SQLException {
    
        sql = "insert into pelicula  values ('"+oPelicula.getId()+"','"+oPelicula.getNombre()+"','"+oPelicula.getAnio()+"','"+oPelicula.getDirector()+"','"+oPelicula.getGenero()+"','"+oPelicula.getPrecioVenta()+"','"+oPelicula.getPrecioArriendo()+"','"+oPelicula.getStock()+"');";
        oConexion.EjecutarSQL(sql);
        System.out.println(sql);
    
    }
    
}
