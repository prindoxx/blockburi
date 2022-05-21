/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pablo
 */
public class ArchivosTexto {
    
    File archivo;
    
    public void crearArchivoDeTexto(){
    
        
        archivo = new File("archivo.txt");
        if (archivo.exists()){
            archivo.delete();
        }
        try{
            if(archivo.createNewFile()){
                System.out.println("Archivo creado con exito");
            }else{
                System.out.println("Error al crear archivo");
            }
        }catch(IOException exepcion){
            exepcion.printStackTrace(System.out);
        }
    }
    
    public void escribirMapaTrabajadores(HashMap mapaTrabajadores) throws IOException{
        FileWriter escritura = new FileWriter(archivo);
        
        HashMap<String, Trabajador> mapaTrabajadores2 = new HashMap<>();
        mapaTrabajadores2 = mapaTrabajadores;
        
        escritura.write("Trabajadores\n\n");
        for( Map.Entry<String, Trabajador> entry : mapaTrabajadores2.entrySet() ){
            
            Trabajador oTrabajador = new Trabajador();
            oTrabajador = entry.getValue();
            
            escritura.write("Rut: "+oTrabajador.getRut()+"\n");
            escritura.write("Nombre: "+oTrabajador.getNombre()+"\n");
            escritura.write("Usuario: "+oTrabajador.getUsuario()+"\n");
            escritura.write("Contraseña: "+oTrabajador.getContrasenia()+"\n");
            escritura.write("---------------------------------\n");
        }
        escritura.write("\n");
        
        escritura.close();
        System.out.println("Texto añadido");
    }
    
    public void escribirMapaPrestamos(HashMap mapaPrestamos) throws IOException{
        
        int cont=1;
        FileWriter escritura = new FileWriter("archivo.txt", true);
        
        HashMap<Integer, Prestamo> mapaPrestamos2 = new HashMap<>();
        mapaPrestamos2 = mapaPrestamos;
        
        escritura.write("Prestamos\n\n");
        for( Map.Entry<Integer, Prestamo> entry : mapaPrestamos2.entrySet() ){
            
            Prestamo oPrestamo = new Prestamo();
            oPrestamo = entry.getValue();
            
            escritura.write("Id Prestamo: "+oPrestamo.getIdPrestamo()+"\n");
            escritura.write("Rut Cliente: "+oPrestamo.getRutCliente()+"\n");
            escritura.write("Rut Trabajador: "+oPrestamo.getRutTrabajador()+"\n");
            escritura.write("Fecha Prestamo: "+oPrestamo.getFechaPrestamo()+"\n");
            escritura.write("Fecha Entrega: "+oPrestamo.getFechaEntrega()+"\n");
            escritura.write("Monto a Pagar: "+oPrestamo.getMontoAPagar()+"\n\n");
            escritura.write("Peliculas:\n");
            HashMap<Integer, Pelicula> mapaPeliculaPre = oPrestamo.mapaPeliculas;
            cont=1;
            
            for (Map.Entry<Integer, Pelicula> entry1 : mapaPeliculaPre.entrySet()) {
                
                Pelicula oPelicula = new Pelicula();
                oPelicula = entry1.getValue();
                
                escritura.write("Película n°"+cont+"\n");
                escritura.write("id: "+oPelicula.getId()+"\n");
                escritura.write("nombre: "+oPelicula.getNombre()+"\n");
                escritura.write("Año: "+oPelicula.getAnio()+"\n");
                escritura.write("Director: "+oPelicula.getDirector()+"\n");
                escritura.write("Genero: "+oPelicula.getGenero()+"\n");
                escritura.write("Precio venta: "+oPelicula.getPrecioVenta()+"\n");
                escritura.write("Precio Arriendo: "+oPelicula.getPrecioArriendo()+"\n\n");
                cont++;
                
            }
            
            escritura.write("---------------------------------\n");
        }
        escritura.write("\n");
        
        escritura.close();
        System.out.println("Texto añadido");
    }
    
    public void escribirMapaVentas(HashMap mapaVentas) throws IOException{
        
        int cont=1;
        FileWriter escritura = new FileWriter("archivo.txt", true);
        
        HashMap<Integer, Venta> mapaVentas2 = new HashMap<>();
        mapaVentas2 = mapaVentas;
        
        escritura.write("Ventas del día\n\n");
        for( Map.Entry<Integer, Venta> entry : mapaVentas2.entrySet() ){
            
            Venta oVenta = new Venta();
            oVenta = entry.getValue();
            //escritura.write("Venta\n\n");
            escritura.write("Id Venta: "+oVenta.getIdPrestamo()+"\n");
            escritura.write("Rut Cliente: "+oVenta.getRutCliente()+"\n");
            escritura.write("Rut Trabajador: "+oVenta.getRutTrabajador()+"\n");
            escritura.write("Fecha Venta: "+oVenta.getFechaVenta()+"\n");
            escritura.write("Monto a Pagar: "+oVenta.getMontoAPagar()+"\n\n");
            escritura.write("Peliculas:\n");
            HashMap<Integer, Pelicula> mapaPeliculaPre = oVenta.mapaPeliculas;
            cont=1;
            
            for (Map.Entry<Integer, Pelicula> entry1 : mapaPeliculaPre.entrySet()) {
                
                Pelicula oPelicula = new Pelicula();
                oPelicula = entry1.getValue();
                
                escritura.write("Película n°"+cont+"\n");
                escritura.write("id: "+oPelicula.getId()+"\n");
                escritura.write("nombre: "+oPelicula.getNombre()+"\n");
                escritura.write("Año: "+oPelicula.getAnio()+"\n");
                escritura.write("Director: "+oPelicula.getDirector()+"\n");
                escritura.write("Genero: "+oPelicula.getGenero()+"\n");
                escritura.write("Precio venta: "+oPelicula.getPrecioVenta()+"\n");
                escritura.write("Precio Arriendo: "+oPelicula.getPrecioArriendo()+"\n\n");
                cont++;
                
            }
            
            escritura.write("---------------------------------\n");
        }
        escritura.write("\n");
        
        escritura.close();
        System.out.println("Texto añadido");
    }
    
    public void escribirMapaPeliculas(HashMap mapaPeliculas) throws IOException{
        
        FileWriter escritura = new FileWriter("archivo.txt", true);
        
        HashMap<Integer, Pelicula> mapaPeliculas2 = new HashMap<>();
        mapaPeliculas2 = mapaPeliculas;
        
        escritura.write("Películas\n\n");
        for( Map.Entry<Integer, Pelicula> entry : mapaPeliculas2.entrySet() ){
            
            Pelicula oPelicula = new Pelicula();
            oPelicula = entry.getValue();

            escritura.write("id: "+oPelicula.getId()+"\n");
            escritura.write("nombre: "+oPelicula.getNombre()+"\n");
            escritura.write("Año: "+oPelicula.getAnio()+"\n");
            escritura.write("Director: "+oPelicula.getDirector()+"\n");
            escritura.write("Genero: "+oPelicula.getGenero()+"\n");
            escritura.write("Precio venta: "+oPelicula.getPrecioVenta()+"\n");
            escritura.write("Precio Arriendo: "+oPelicula.getPrecioArriendo()+"\n");
            escritura.write("Stock: "+oPelicula.getStock()+"\n\n");
            escritura.write("---------------------------------\n");
        }
        escritura.close();
        System.out.println("Texto añadido");
    }
}
