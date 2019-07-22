
package ejercicio_uno;

/**
 *
 * @author JAVIER
 */
public class Ciudad {
    private String nombre;
    private int poblacion;
    private Provincia provincia;
    
    public Ciudad (String n, int p, Provincia v){
        establecerNombre(n);
        establecerPoblacion(p);
        establecerProvincia(v);
    }
    
    public void establecerNombre(String m){
        nombre = m;
    }
    public void establecerPoblacion(int m){
        poblacion = m;
    }
    public void establecerProvincia(Provincia m){
        provincia = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerPoblacion(){
        return poblacion;
    }
    public Provincia obtenerProvincia(){
        return provincia;
    }
    
    public String toString(){
        String cadena = String.format ("Ciudad:\n\tNombre: %s\n\tPoblacion: %d"
                + "\n\tProvincia: %s", 
                obtenerNombre(),
                obtenerPoblacion(),
                obtenerProvincia().obtenerNombre());
                
        return cadena;
    }
}
