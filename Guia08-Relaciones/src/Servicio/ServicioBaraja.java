package Servicio;

import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente. Las operaciones que podrá realizar la
 * baraja son: • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 * no haya más o se haya llegado al final, se indica al usuario que no hay más
 * cartas. • cartasDisponibles(): indica el número de cartas que aún se puede
 * repartir. • darCartas(): dado un número de cartas que nos pidan, le
 * devolveremos ese número de cartas. En caso de que haya menos cartas que las
 * pedidas, no devolveremos nada, pero debemos indicárselo al usuario. •
 * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
 * ninguna indicárselo al usuario • mostrarBaraja(): muestra todas las cartas
 * hasta el final. Es decir, si se saca una carta y luego se llama al método,
 * este no mostrara esa primera carta.
 */
public class ServicioBaraja {

    Scanner leer = new Scanner(System.in);
    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> mazo2 = new ArrayList();
    Carta c1, c2, c3, c4;

    public Carta crearCarta(Carta c1) {
        return new Carta();
    }

    public ArrayList<Carta> completarMazo(ArrayList<Carta> mazo) {

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                c1 = crearCarta(c1);
                c1.setNumero(i);
                c1.setPalos(c1.getPalos().BASTO);
                mazo.add(c1);
                c2 = crearCarta(c2);
                c2.setNumero(i);
                c2.setPalos(c2.getPalos().COPA);
                mazo.add(c2);
                c3 = crearCarta(c3);
                c3.setNumero(i);
                c3.setPalos(c3.getPalos().ESPADA);
                mazo.add(c3);
                c4 = crearCarta(c4);
                c4.setNumero(i);
                c4.setPalos(c4.getPalos().ORO);
                mazo.add(c4);
            }

        }
        return mazo;
    }

    // • barajar(): cambia de posición todas las cartas aleatoriamente.
    public ArrayList<Carta> mezclaMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
        Collections.shuffle(mazo);

        return mazo;
    }

    public void mostrarMazo(ArrayList<Carta> mazo) {
        int opc = 0;
        this.mazo = mazo;
        System.out.println("");
        System.out.println("1. Mazo disponible");
        System.out.println("2. Mazo retirado");
        opc = leer.nextInt();
        if (opc == 1) {
            for (Carta carta : mazo) {
                System.out.println(carta);
            }
            System.out.println("");
        }else if (opc == 2) {
            for (Carta carta : mazo2) {
                System.out.println(carta);
            }
            System.out.println("");
        }

    }

    public void menu(ArrayList<Carta> mazo) {
        int opc = 0;
        this.mazo = mazo;
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("---------------------");
        System.out.println("1. Mostrar el mazo");
        System.out.println("2. Mezclar");
        System.out.println("3. Siguiente carta");
        System.out.println("4. Pedir cartas");
        System.out.println("5. Cartas disponibles");
        System.out.println("6. Cartas recibidas");
        System.out.println("7. Salir");
        opc = leer.nextInt();
        while (opc < 1 || opc > 7) {
            System.out.println("Opcion ingresada incorrecta, vuelva a intentar");
            opc = leer.nextInt();
        }
        opciones(opc, mazo);

    }

    public void cartasRecibidas(ArrayList<Carta> mazo) {
        this.mazo = mazo;
        System.out.println("");
        System.out.println("Cantidad de cartas entregadas: " + mazo2.size());
        System.out.println("");
    }

    public void cartasDisponibles(ArrayList<Carta> mazo) {
        this.mazo = mazo;
        System.out.println("");
        System.out.println("Cantidad de cartas disponibles: " + mazo.size());
        System.out.println("");
    }

    public void pedirCartas(ArrayList<Carta> mazo) {
        int cartas = 0, contador = 0;
        this.mazo = mazo;
        System.out.println("");
        System.out.println("Cuantas cartas quiere retirar del mazo?");
        cartas = leer.nextInt();
        if (cartas > mazo.size()) {
            System.out.println("");
            System.out.println("Cartas isuficientes para prestar");
            System.out.println("");
        } else {
            Iterator<Carta> it = mazo.iterator();
            while (it.hasNext()) {
                Carta next = it.next();
                mazo2.add(next);
                it.remove();
                contador++;
                if (contador == cartas) {
                    break;
                }
            }
        }
        System.out.println("");
    }

    public void siguienteCarta(ArrayList<Carta> mazo) {
        this.mazo = mazo;
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("La siguiente carta es: " + mazo.get(i).toString());
            System.out.println("");
        }

    }

    public void opciones(int opc, ArrayList<Carta> mazo) {
        this.mazo = mazo;

        switch (opc) {
            case 1:
                mostrarMazo(mazo);
                menu(mazo);
                break;
            case 2:
                mezclaMazo(mazo);
                menu(mazo);
                break;
            case 3:
                siguienteCarta(mazo);
                menu(mazo);
                break;
            case 4:
                pedirCartas(mazo);
                menu(mazo);
                break;
            case 5:
                cartasDisponibles(mazo);
                menu(mazo);
                break;
            case 6:
                cartasRecibidas(mazo);
                menu(mazo);
                break;
            case 7:
                System.out.println("");
                System.out.println("MUCHAS GRACIAS");
                System.out.println("");
                break;

        }
    }
}
