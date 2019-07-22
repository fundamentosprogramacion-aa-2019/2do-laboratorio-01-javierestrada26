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
public class Depart_Municipal {

    private String nombre;
    private Area_Municipal area;
    private double presupuesto;
    private Persona jefe;
    
    public Depart_Municipal(String n, Area_Municipal a, 
            double p, Persona j){
        establecerNombre(n);
        establecerArea_M(a);
        establecerPresupuesto(p);
        establecerJefe(j);
        
    }
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerArea_M(Area_Municipal a) {
        area = a;
    }

    public void establecerPresupuesto(double p) {
        presupuesto = p;
    }

    public void establecerJefe(Persona j) {
        jefe = j;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Area_Municipal obtenerArea() {
        return area;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public Persona obtenerJefe() {
        return jefe;
    }
    
    public String toString(){
        String cadena = String.format("Departamento Municipal: \n\tNombre: "
                + "%s\n\t"
                + "Area Municipal: %s\n\tPresupuesto: %s\n\t"
                + "Jefe: %s %s\n\t",
               obtenerNombre(), 
               obtenerArea().obtenetNombre(),
               obtenerPresupuesto(),obtenerJefe().obtenerNombre()
                ,obtenerJefe().obtenerApellido());
        
        return cadena;
   }
}
