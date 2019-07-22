/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_tres;

/**
 *
 * @author JAVIER
 */
public class Area_Municipal {
    private String nombre;
    private Persona director_area;
    private Municipio municipio;
    
    
    public Area_Municipal(String n, Persona p, Municipio m){
        establecerNombre(n);
        establecerDirectorArea(p);
        establecerMunicipio(m);
        
    }
    
    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerDirectorArea(Persona a) {
        director_area = a;
    }

    public void establecerMunicipio(Municipio a) {
        municipio = a;
    }

    public String obtenetNombre() {
        return nombre;
    }

    public Persona obtenetDirectorArea() {
        return director_area;
    }

    public Municipio obtenetMunicipio() {
        return municipio;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Area Municipal: \n\tNombre: %s\n\t"
                + "Director: %s\n\tMunicipio: %s\n\t",
               obtenetNombre(), 
               obtenetDirectorArea().obtenerNombre(),
               obtenetMunicipio().obtenerNombres());
        
        return cadena;
   }
}
