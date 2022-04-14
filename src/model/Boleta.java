/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pablo
 */
public class Boleta {
    
    private int idBoleta;
    private String rutCliente;
    private String rutTrabajador;
    private int idPelicula;
    private String fechaCompra;
    private int precio;

    public Boleta() {
    }

    public Boleta(int idBoleta, String rutCliente, String rutTrabajador, int idPelicula, String fechaCompra, int precio) {
        this.idBoleta = idBoleta;
        this.rutCliente = rutCliente;
        this.rutTrabajador = rutTrabajador;
        this.idPelicula = idPelicula;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
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

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
