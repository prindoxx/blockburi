/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pablo
 */
public class Pelicula {
    
    private int id;
    private String nombre;
    private int anio;
    private String director;
    private String genero;
    private int precioVenta;
    private int precioArriendo;
    private int stock;

    public Pelicula() {
    }

    public Pelicula(int id, String nombre, int anio, String director, String genero, int precioVenta, int precioArriendo, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.director = director;
        this.genero = genero;
        this.precioVenta = precioVenta;
        this.precioArriendo = precioArriendo;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPrecioArriendo() {
        return precioArriendo;
    }

    public void setPrecioArriendo(int precioArriendo) {
        this.precioArriendo = precioArriendo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
