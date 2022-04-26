/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class DAO {
    
    private Conexion oConexion;
    private String sql;
    
    
    //haciendo conexion a DB, entregando parametros
    public DAO() throws SQLException {
        oConexion = new Conexion("localhost", "blockbuster", "root", "Jefte01432201");
    }
    
}
