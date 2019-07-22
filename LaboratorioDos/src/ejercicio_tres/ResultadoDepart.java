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
public class ResultadoDepart {
    
     public double obtenerPresuspuesto(Depart_Municipal[] 
            departamentos) {
        double Presupuesto = 0;

        for (int i = 0; i < departamentos.length; i++) {
            Presupuesto = (double) departamentos[i].obtenerPresupuesto() 
                    + Presupuesto;
        }
        return Presupuesto;
    }

    public double obtenerPromedioEdades(Depart_Municipal[] departamentos) {
        double totalEdades = 0;
        double promedio_edades;
        for (int i = 0; i < departamentos.length; i++) {
            totalEdades = (double) departamentos[i].obtenerJefe().obtenerEdad()
                    + totalEdades;
        }

        promedio_edades = totalEdades / departamentos.length;
        return promedio_edades;
    }
}
