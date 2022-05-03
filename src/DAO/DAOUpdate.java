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
public class DAOUpdate {
    
    private Conexion oConexion;
    private String sql;
    
    
    //haciendo conexion a DB, entregando parametros
    public DAOUpdate() throws SQLException {
        oConexion = new Conexion("localhost", "blockbuster", "root", "Jefte01432201");
    }
    
    public void modificarStock( Pelicula oPelicula ) throws SQLException {
    
        sql = " UPDATE `blockbuster`.`pelicula` SET `stock` = ' " + oPelicula.getStock() + " ' WHERE `idpelicula` = ' " + oPelicula.getId() + " '; ";
        oConexion.EjecutarSQL(sql);
        System.out.println(sql);
    
    }
    
}
