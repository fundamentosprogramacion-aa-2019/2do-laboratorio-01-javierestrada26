package ejercicio_dos;

/**
 *
 * @author JAVIER
 */
public class Confederacion {

    private String nombre;
    private String siglas;
    

    public Confederacion(String n, String s) {
        establecerNombre(n);
        establecerSiglas(s);
    }
    
    public void establecerNombre(String m) {
        nombre = m;
    }
    public void establecerSiglas(String m) {
        siglas = m;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerSiglas() {
        return siglas;
    }
}
