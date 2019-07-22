package ejercicio_dos;

/**
 *
 * @author JAVIER
 */
public class Principal {

    public static void main(String[] args) {
        
    
    Confederacion c1 = new Confederacion("Unión de Asociaciones "
            + "Europeas de Fútbol", "UEFA");
    Confederacion c2 = new Confederacion("Confederación de Fútbol de Norte"
            + ", Centroamérica y el Caribe", "CONCACAF");
    Confederacion c3 = new Confederacion("Confederación Sudamericana "
            + "de Fútbol ", "CONMEBOL");
    Confederacion c4 = new Confederacion("Confederación Africana"
            + " de Fútbol", "CAF");
    
    

    Federacion f1 = new Federacion("Federación Ecuatoriana "
            + "de Fútbol", "Fútbol", c3);
    Federacion f2 = new Federacion("Asociación de Fútbol Argentino"
            + " ", "Fútbol", c3);
    Federacion f3 = new Federacion("Real Federación Española de"
            + " Fútbol ", "Fútbol", c1);
    Federacion f4 = new Federacion("Asociación Inglesa"
            + " de Fútbol ", "Fútbol", c1);
    Federacion f5 = new Federacion("Federación de Fútbol de los "
            + "Estados Unidos", "Fútbol", c2);
    Federacion f6 = new Federacion("Federación Mexicana de Futbol "
            + "Asociación", "Fútbol", c2);
    Federacion f7 = new Federacion("Asociación de Fútbol "
            + "de Sudáfrica ", "Fútbol", c4);
    Federacion f8 = new Federacion("Federación Argelina de "
            + "Fútbol", "Fútbol", c4);
    
    

    Equipo e1 = new Equipo("Barcelona S.C", 14, f1);
    Equipo e2 = new Equipo("Emelec", 2, f1);
    Equipo e3 = new Equipo("Real Madrid", 20, f3);
    Equipo e4 = new Equipo("Barcelona", 14, f3);
    Equipo e5 = new Equipo("Liverpool", 9, f4);
    Equipo e6 = new Equipo("Tottenham", 8, f4);
    Equipo e7 = new Equipo("America", 17, f6);
    Equipo e8 = new Equipo("Cruz Azul ", 5, f6);
    Equipo e9 = new Equipo("Boca Juniors", 30, f2);
    Equipo e10 = new Equipo("Red Bull", 2, f5);
    Equipo e11 = new Equipo("Ajax Cape Town", 1, f7);
    Equipo e12 = new Equipo("CR Belouizdad", 4, f8);

    Equipo [] equipos = new Equipo[12];
        equipos [0] = e1;
        equipos [1] = e2;
        equipos [2] = e3;
        equipos [3] = e4;
        equipos [4] = e5;
        equipos [5] = e6;
        equipos [6] = e7;
        equipos [7] = e8;
        equipos [8] = e9;
        equipos [9] = e10;
        equipos [10] = e11;
        equipos [11] = e12;
        
 
        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%s\n", equipos[i]);
        }
        
        int total = 0;
        for (int i = 0; i < equipos.length; i++) {
            total = equipos[i].obtenerCampeonatos()+total;
        }
        System.out.printf("********************************"
                + "***********************\n"
                + " El total de campeonatos es de : %d\n", total);
    }

}