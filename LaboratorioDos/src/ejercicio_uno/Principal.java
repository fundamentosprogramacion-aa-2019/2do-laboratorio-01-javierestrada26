/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_uno;

/**
 *
 * @author JAVIER
 */
public class Principal {
    public static void main(String[] args) {
        Region r1 = new Region("Costa");
        Region r2 = new Region("Sierra");
        Region r3 = new Region("Oriente");
        
        Provincia p1 = new Provincia("Loja", r2);
        Provincia p2 = new Provincia("Pichincha", r2);
        Provincia p3 = new Provincia("Guayas", r1);
        Provincia p4 = new Provincia("Zamora Chinchipe", r3);
        Provincia p5 = new Provincia("Azuay", r2);
        
        
        Ciudad c1 = new Ciudad("Catamayo", 15000, p1);
        Ciudad c2 = new Ciudad("Zapotillo",9000, p1);
        Ciudad c3 = new Ciudad("Quito", 100000, p2);
        Ciudad c4 = new Ciudad("Cuenca", 75000, p5);
        Ciudad c5 = new Ciudad("Guayaquil", 1500000, p3);
        Ciudad c6 = new Ciudad("Zamora", 17000, p4);
        Ciudad c7 = new Ciudad("Milagro", 19000, p3);
        Ciudad c8 = new Ciudad("Cariamanga", 12000, p1);
        Ciudad c9 = new Ciudad("Sangolqui", 54000, p2);
        Ciudad c10 = new Ciudad("Yantzaza", 11000, p4);
        
        
        Ciudad [] ciudad = new Ciudad [10];
        ciudad [0] = c1;
        ciudad [1] = c2;
        ciudad [2] = c3;
        ciudad [3] = c4;
        ciudad [4] = c5;
        ciudad [5] = c6;
        ciudad [6] = c7;
        ciudad [7] = c8;
        ciudad [8] = c9;
        ciudad [9] = c10;
        
        for (int i = 0; i < ciudad.length; i++) {
            System.out.printf("%s\n", ciudad[i]);
        }
        
        int suma = 0;
        for (int i = 0; i < ciudad.length; i++) {
            suma = ciudad[i].obtenerPoblacion() + suma;
        }
        double promedio;
        promedio = (double) suma / ciudad.length;
        System.out.printf("==========================O"
                + "========================\n"
                + "El promedio del número de habitantes es: %.2f\n", promedio);
    }
}
