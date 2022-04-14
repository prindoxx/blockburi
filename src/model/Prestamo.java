/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pablo
 */
public class Prestamo {
    
    private int idTransaccion;
    private String rutCliente;
    private String rutTrabajador;
    private int idPelicula;
    private String fechaPrestamo; //falta importar libreria para fechas
    private String fechaEntrega;
    private int montoAPagar;

    public Prestamo() {
    }

    public Prestamo(int idTransaccion, String rutCliente, String rutTrabajador, int idPelicula, String fechaPrestamo, String fechaEntrega, int montoAPagar) {
        this.idTransaccion = idTransaccion;
        this.rutCliente = rutCliente;
        this.rutTrabajador = rutTrabajador;
        this.idPelicula = idPelicula;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.montoAPagar = montoAPagar;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutTrabajador() {
        return rutTrabajador;
    }

    public void setRutTrabajador(String rutTrabajador) {
        this.rutTrabajador = rutTrabajador;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(int montoAPagar) {
        this.montoAPagar = montoAPagar;
    }
    
    
}
