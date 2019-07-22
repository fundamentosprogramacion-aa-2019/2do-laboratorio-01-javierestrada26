
package ejercicio_uno;
import ejercicio_uno.*;
/**
 *
 * @author JAVIER
 */
public class Provincia {
    private String nombre;
    private Region region;
    
    
    public Provincia(String n, Region r){
        establecerNombre(n);
        establecerRegion(r);
    
    }
    
     public void establecerNombre(String o){
        nombre = o;
    }
    public void establecerRegion(Region o){
        region = o;
    }
    
    public String obtenerNombre(){
    
        return nombre;
    }
    
    public Region obtenerRegion(){
    
        return region;
    }
    
    public String toString(){
    String cadena = String.format ("Provincia:\n\tNombre: %s\n\tRegión: "
                + "\n", obtenerNombre());
    
    return cadena;
    }
}
