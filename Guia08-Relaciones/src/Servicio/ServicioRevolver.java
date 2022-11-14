package Servicio;

import Entidad.Juego;
import Entidad.Jugador1;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Métodos: • llenarRevolver(): le pone los valores de posición actual y de
 * posición del agua. Los valores deben ser aleatorios. *
 */
public class ServicioRevolver {

    Scanner leer = new Scanner(System.in);
    ArrayList<Jugador1> listaJugadores = new ArrayList();
    Jugador1 j1 = new Jugador1();

    public Revolver llenarRevolver() {
        double carga, Agua;
        carga = Math.random() * (7 + 1);
        Agua = Math.random() * (7 + 1);
        int posicionActual = (int) carga;
        int posicionAgua = (int) Agua;
        return new Revolver(posicionActual, posicionAgua);
    }

//    • mojar(): devuelve true
// * si la posición del agua coincide con la posición actual 
    public boolean Mojar(Revolver r1, int posicionActual, Jugador1 jugador) {
        boolean aux = false;
        if (posicionActual == r1.getPosicionAgua()) {
            System.out.println("USTED HA SIDO MOJADO");
            aux = true;
            jugador.setMojado(aux);
            return true;
        }

        return aux;
    }

//    * • siguienteChorro():
// * cambia a la siguiente posición del tambor 
    public int siguienteChorro(Revolver r1) {
        int posicion = r1.getposicionActual() + 1;
        if (posicion == 9) {
            posicion = 0;
        }
        return posicion;
    }

//    • toString(): muestra información
// * del revolver (posición actual y donde está el agua)
    public void mostrarRevolver(Revolver r1) {
        System.out.println("");
        System.out.println("La posicion del tambor es numero: " + r1.getposicionActual() + " y la posicion del agua es: " + r1.getPosicionAgua());
    }

    public ArrayList<Jugador1> cargaJugadores() {

        System.out.println("");
        System.out.println("BIENVENIDO AL JUEGO");
        System.out.println("INGRESE LA CANTIDAD DE PARTICIPANTES");
        int opc = leer.nextInt();
        while (opc > 3) {
            System.out.println("Demasiados participantes, vuelva a ingresar");
            opc = leer.nextInt();
        }
        for (int i = 0; i < opc; i++) {
            j1 = jugador(opc);
            listaJugadores.add(j1);
        }

        return listaJugadores;
    }
  
    public Jugador1 jugador(int opc) {
        String nombre = "";

        System.out.println("");
        System.out.println("Ingrese su ID");
        int id = leer.nextInt();
        if (id < 1 | id > 6) {
            id = 6;
        }
        System.out.println("Ingrese su nombre");
        nombre = leer.next();

        return new Jugador1(id, nombre, false);
    }

//     ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda(Juego juego) {
        int aux = juego.getJugadores().size(), posicion, aux2 = 0;
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.println("RONDA NUMERO " + (i + 1));
            for (int j = 0; j < aux; j++) {
                System.out.println("");
                System.out.println("Turno del jugador " + juego.getJugadores().get(j).getNombre());
                System.out.println("");
                System.out.println("Proceda a disparar");
                posicion = disparo(juego.getRevolver(), juego.getJugadores().get(j));
                juego.getRevolver().setposicionActual(posicion);
                if (juego.getRevolver().getPosicionAgua() == posicion) {
                    System.out.println("El juego ha terminado");
                    System.out.println("El participante " + juego.getJugadores().get(j) + " ha perdido");
                    aux2++;
                } else {
                    System.out.println("Ha pasado de ronda");
                }
                if (aux2 > 0) {
                    break;
                }
                System.out.println("");
                System.out.println("La posicion actual es "+juego.getRevolver().getposicionActual());
                System.out.println("La posicion del agua es "+juego.getRevolver().getPosicionAgua());
                System.out.println("");
            }
            if (aux2 > 0) {
                break;
            }
        }
        System.out.println("");
        System.out.println("EL JUEGO HA TERMINADO");
    }

    //    disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    public int disparo(Revolver r1, Jugador1 jugador) {
        int posicionActual = siguienteChorro(r1);
        Mojar(r1, posicionActual, jugador);
        return posicionActual;
    }
}
