/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_uno;

/**
 *
 * @author JAVIER
 */
public class Region {
    private String nombre;
    
    public Region(String r){
    
        establecerNombre(r);
    }
    
    public void establecerNombre(String g){
        nombre = g;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    
}
