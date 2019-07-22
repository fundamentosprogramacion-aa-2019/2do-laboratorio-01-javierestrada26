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
public class Persona {
    private int edad;
    private String nombre;
    private String apellido;
   
    public Persona(String n, String a, int e){
        establecerNombre(n);
        establecerApellido(a);
        establecerEdad(e);
    }
    public void establecerNombre(String g) {
        nombre = g;
    }

    public void establecerApellido(String g) {
        this.apellido = g;
    }

    public void establecerEdad(int g) {
        edad = g;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }
    
    public String toString() {
        String cadena = String.format("Persona: \n\tNombre: %s\n\t"
                + "Apellido: %s\n\tEdad: %s\n\t",
                obtenerNombre(),obtenerApellido(),obtenerEdad());

        return cadena;
    }
}
