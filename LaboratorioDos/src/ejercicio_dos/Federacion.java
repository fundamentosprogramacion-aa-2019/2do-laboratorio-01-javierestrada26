package ejercicio_dos;

/**
 *
 * @author JAVIER
 */
public class Federacion {

    private String nombre;
    private String deporte;
    private Confederacion confederacion;

    public Federacion(String n, String d, Confederacion c) {
        establecerNombre(n);
        establecerConfederacion(c);
        establecerDeporte(d);

    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerConfederacion(Confederacion m) {
        confederacion = m;
    }

    public void establecerDeporte(String m) {
        deporte = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Confederacion obtenerConfederacion() {
        return confederacion;
    }

    public String obtenerDeporte() {
        return deporte;
    }
    
    
}
