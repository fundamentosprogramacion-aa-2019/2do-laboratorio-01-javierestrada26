/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_dos;

/**
 *
 * @author JAVIER
 */
public class Equipo {

    private String nombre;
    private int n_campeonatos;
    private Federacion federacion ;
    
    public Equipo (String n, int c, Federacion f){
        establecerNombre(n);
        establecerCampeonatos(c);
        establecerFederacion(f);
    
    }
    
     public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerCampeonatos(int c){
        n_campeonatos = c;
    }
    public void establecerFederacion(Federacion f){
        federacion = f;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerCampeonatos(){
        return n_campeonatos;
    }
    public Federacion obtenerFederacion(){
        return federacion;
    }
    
    public String toString(){
        String cadena = String.format("*******************************"
                + "***********************\n"
                + "EQUIPO:\n\t"
                + "- Nombre: %s\n\t"
                + "- Numero de campeonatos: %d\n"
                + "FEDERACIÓN: \n\t"
                + " %s\n\t"
                ,
                obtenerNombre(),
                obtenerCampeonatos(),
                obtenerFederacion().obtenerNombre());
        return cadena;
    }
}
