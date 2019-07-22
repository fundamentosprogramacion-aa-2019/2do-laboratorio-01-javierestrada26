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
public class Principal {
    public static void main(String[] args) {
        
        //agregamos personal
        Persona p1 = new Persona("Santiago", "Estrada", 25);
        Persona p2 = new Persona("Jessica", "Estrada", 24);
        Persona p3 = new Persona("Génesis", "García", 27);
        Persona p4 = new Persona("Homero", "Chamba", 29);
        Persona p5 = new Persona("Santiago", "Cedillo", 31);
        Persona p6 = new Persona("María", "Alejandro", 32);
        Persona p7 = new Persona("Jeampier", "Reyes", 36);
        Persona p8 = new Persona("Diego", "Mora", 30);
        
        //asignamos ciudades
        Ciudad c1 = new Ciudad("Catamayo", "Loja");
        Ciudad c2 = new Ciudad("Loja", "Loja");
        Ciudad c3 = new Ciudad("Quito", "Pichincha");
        
        //asignamos municipios
        Municipio m1 = new Municipio("Municipio Autónomo Descentralizado "
                + "de Catamayo ", c1);
        Municipio m2= new Municipio("Municipio Metropolitano de Quito", c3);
        Municipio m3 = new Municipio("Municipio Autónomo "
                + "Descentralizado de Loja", c2);
        Municipio m4 = new Municipio("Municipio Autónomo Descentralizado "
                + "de Quitumbe", c3);
        
        //creamos areas municipales
        Area_Municipal a1 = new Area_Municipal("Administración", p8, m1);
        Area_Municipal a2 = new Area_Municipal("Bienestar Social", p3, m2);
        Area_Municipal a3 = new Area_Municipal("Cultura", p7, m3);
        Area_Municipal a4 = new Area_Municipal("Medio Ambiente", p1, m4);
        Area_Municipal a5 = new Area_Municipal("Obras y Servicios", p4, m4);
        
        
        //creamos departamentos
        Depart_Municipal dm1 = new Depart_Municipal("Archivo Histórico"
                , a3, 2000, p8);
        Depart_Municipal dm2 = new Depart_Municipal("Contraloría"
                , a1, 7000, p5);
        Depart_Municipal dm3 = new Depart_Municipal("Matriculación Vehicular"
                , a2, 8000, p3);
        Depart_Municipal dm4 = new Depart_Municipal("Patronato"
                , a2, 12000, p1);
        Depart_Municipal dm5 = new Depart_Municipal("Planificación"
                , a1, 9000, p2);
        Depart_Municipal dm6 = new Depart_Municipal("Presupuesto"
                , a5, 15000, p7);
        Depart_Municipal dm7 = new Depart_Municipal("Relaciones publicas"
                , a4, 10000, p4);
        Depart_Municipal dm8 = new Depart_Municipal("Dirección Administrativa"
                , a3, 4000, p6);
        
        //arreglo de todos los departamentos
        Depart_Municipal[] depaMunicipales = new Depart_Municipal[8];
        depaMunicipales[0] = dm1;
        depaMunicipales[1] = dm2;
        depaMunicipales[2] = dm3;
        depaMunicipales[3] = dm4;
        depaMunicipales[4] = dm5;
        depaMunicipales[5] = dm6;
        depaMunicipales[6] = dm7;
        depaMunicipales[7] = dm8;
        //recorrido de los departamentos
        for (int i = 0; i < depaMunicipales.length; i++) {
            System.out.println(depaMunicipales[i]);
        }
        //presentar resultados
        ResultadoDepart resultado = new ResultadoDepart();
        System.out.printf("==================O================="
                + "\nLa suma de presupuestos es: %.2f$", 
                resultado.obtenerPresuspuesto(depaMunicipales));
        System.out.printf("\n=================O==================="
                + "\nEl promedio de edades es: %.2f años\n", 
                resultado.obtenerPromedioEdades(depaMunicipales));
    }
}
