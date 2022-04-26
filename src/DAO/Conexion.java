/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.Statement; 
import java.sql.ResultSet;

import java.sql.SQLException;

/**
 *
 * @author jefte
 */
public class Conexion {
    
    private Connection oConnection;
    public Statement oStatement;
    public ResultSet oResultSet;
    
    public Conexion(String server, String bd, String user, String pass) throws SQLException{
        MysqlDataSource mysql = new MysqlDataSource();
        mysql.setServerName(server);
        mysql.setDatabaseName(bd);
        mysql.setUser(user);
        mysql.setPassword(pass);
        oConnection = mysql.getConnection();
    }
    
    //ejecutar delete, update o insert
    
    public void EjecutarSQL(String sql) throws SQLException{
        oStatement = oConnection.createStatement();
        oStatement.executeUpdate(sql);
        oStatement.close();
    }
    
    
    public ResultSet ejecutarSelect (String select) throws SQLException{
        
        oStatement = oConnection.createStatement();
        oResultSet = oStatement.executeQuery(select);
        
        return oResultSet;
    }
    
}