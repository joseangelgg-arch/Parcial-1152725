/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import Modelo.Producto;

/**
 *
 * @author estudiantes
 */
public class Inventario {
    private List<Producto> productos;
    
    public Inventario(List<Producto> productos){
        Producto p = new Producto("Medicamento", 3500, 1);
        this.productos = productos;
    }
    
    public void agregar(List<Producto> productos, int a){
        for(Producto : productos){
            if(){
            }
        }
        
        productos.add();
        
        
    }
    
    public void eliminar(String nombre){
        if(productos.contains(nombre)){
            productos.remove(nombre);
        }
        
    }
    
    public void limpiar(){
        productos.clear();
    }
    
    public List<Producto> obtenerTodos(){
        return productos;
    }
}
