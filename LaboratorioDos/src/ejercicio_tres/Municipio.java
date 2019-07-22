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
public class Municipio {
    private String nombre;
    private Ciudad ciudad;

   
    public Municipio(String n, Ciudad c) {
        establecerNombre(n);
        establecerCiudad(c);

    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerCiudad(Ciudad m) {
        ciudad = m;
    }

    public String obtenerNombres() {
        return nombre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Municipio: \n\tNombre: %s\n\t"
                + "Ciudad: %s\n\t",
                obtenerNombres(),
                obtenerCiudad().obtenerNombre());

        return cadena;
    }
}
