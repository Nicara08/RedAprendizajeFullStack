
package guia08.relaciones;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
public class EjerEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador ("Lionel", "Messi", "Delantero", 10);
        Jugador j2 = new Jugador ("Leandro", "Paredes", "Medio", 5);
        Jugador j3 = new Jugador ("Nicolas", "Otamendi", "Defensa", 2);
        Jugador j4 = new Jugador ("Dibu", "Martniez", "Arquero", 1);
        ArrayList <Jugador> equipo = new ArrayList ();
        equipo.add(j1);
        equipo.add(j2);
        equipo.add(j3);
        equipo.add(j4);
        Equipo e1 = new Equipo (equipo);
        System.out.println(e1.toString());
        
    }
    
}
