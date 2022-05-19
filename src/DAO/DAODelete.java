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
public class DAODelete {
    
    private Conexion oConexion;
    private String sql;
    
    
    //haciendo conexion a DB, entregando parametros
    public DAODelete() throws SQLException {
        oConexion = new Conexion("localhost", "blockbuster", "root", "1234");
    }
    
    public void eliminarPelicula( Pelicula oPelicula ) throws SQLException {
    
        sql = "delete from pelicula where idpelicula='" + oPelicula.getId() + "';";
        oConexion.EjecutarSQL(sql);
        System.out.println(sql);
    
    }
    
}
