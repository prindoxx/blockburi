/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author jefte
 */
public class Trabajador {
    
    private String rut;
    private String nombre;
    private String usuario;
    private String contrasenia;

    public Trabajador() {
    }

    public Trabajador(String rut, String nombre, String usuario, String contrasenia) {
        this.rut = rut;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /**
    public boolean trabajadorExiste ( HashMap<String, Trabajador> mapaTrabajadores, String rutTrabajador){
        
        if ( mapaTrabajadores.containsKey(rut) ){
            //el trabajador existe en el mapa de trabajadores
            return true;
        }
        //el trabajador no existe en el mapa de trabajadores
        return false;
        
    }
    **/
}
