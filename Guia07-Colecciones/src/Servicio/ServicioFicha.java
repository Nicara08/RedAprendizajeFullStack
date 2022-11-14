package Servicio;

import Entidad.Ficha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Implementa un clase Ficha (de dominó) con su constructor y sus getters, con
 * un toString() (que imprima el “seis-zero” como “6:0|” y con un método llamado
 * “Ficha girarFicha()” que gire la ficha (el “6:0|” pasaría a ser “0:6|”).
 * Implementa también el método “boolean esUnDoble()”. A) Ahora implementa con
 * ArrayLists una clase que genere todas las fichas desde el doble 0 al doble
 * MAX_NUM. Después, el programa, actuando como si fuera un robot jugando al
 * solitario, empezará por tirar el doble más grande e irá tirando fichas (las
 * jugadas tienen que ser legales) hasta que haya tirado todas sus fichas (de su
 * “mano” a la “mesa) o ya no pueda tirar ninguna ficha más. Tu ejecución puede
 * ser diferente de las de los ejemplos dependiendo de cómo lo implementes. B)
 * No obstante, como estamos todo el rato eliminando fichas de la “mano” y la
 * mitad de las veces estás insertando fichas al principio de la “pila” sería
 * más eficiente implementarlas con LinkedList. Haz por tanto esta
 * re-implementación con LinkedList. Pista: Acuérdate que LinkedList incluye
 * métodos como addFirst(), addLast(), getFirst(), getLast() que ArrayList no
 * tiene. Nota: Como en la “mano” no importa en que posición esté cada elemento,
 * también podría ser un HashSet. Pista: ¿Si te peta al eliminar una ficha de la
 * “mano” con un java.util.ConcurrentModificationException que tienes que
 * cambiar en como recorres la List y/o en como eliminas el elemento?
 */
public class ServicioFicha {

    int num1, num2;
    ArrayList<Ficha> lista2 = new ArrayList();
    Ficha fichas = new Ficha();

    public ArrayList<Ficha> completarFichas(int max) {
        int aux = 0;
        for (int i = 0; i < max + 1; i++) {

            for (int j = 0; j < max + 1; j++) {
                if (aux <= max & j <= (max - aux)) {
                    num1 = i;
                    num2 = j + aux;
                    lista2.add(crearFicha(num1, num2));
                }

            }
            aux++;
        }
        return lista2;
    }

    public Ficha crearFicha(int num1, int num2) {
        return new Ficha(num1, num2);
    }

    public void mostrarFichas(ArrayList<Ficha> mano, LinkedList<Ficha> mesa) {
        System.out.print("Mano (" + mano.size() + ") ");
        HashSet<Ficha> hash = new HashSet(mano);

        for (Ficha aux : mano) {
            System.out.print(aux.getNum1() + aux.getDoble() + aux.getNum2() + aux.getBarra() + " ");
        }
        System.out.println("");
        System.out.print("Mesa (" + mesa.size() + ") ");
        for (Ficha aux : mesa) {
            System.out.print(aux.getNum1() + aux.getDoble() + aux.getNum2() + aux.getBarra() + " ");
        }
        System.out.println("");
        System.out.println("");
    }

    public void juego(ArrayList<Ficha> mano, LinkedList<Ficha> mesa) {
        int var = 0, contador = 0;

        if (mesa.size() == 0) {
            mesa.add(mano.get(mano.size() - 1));
            mano.remove(mano.size() - 1);
            mostrarFichas(mano, mesa);
        }

        Iterator<Ficha> it = mano.iterator();
        /*do {*/
            contador=0;
            while (it.hasNext()) {
                Ficha next = it.next();
                if (mesa.getFirst().getNum1() == next.getNum1() & mesa.getFirst().getNum1() == next.getNum2()) {
                    mesa.addFirst(next);
                    it.remove();
                    mostrarFichas(mano, mesa);
                    contador++;
                    

                } else if (mesa.getFirst().getNum1() == next.getNum1() & mesa.getFirst().getNum1() != next.getNum2()) {
                    var = next.getNum1();
                    next.setNum1(next.getNum2());
                    next.setNum2(var);
                    mesa.addFirst(next);
                    it.remove();
                    mostrarFichas(mano, mesa);
                    contador++;
                    
                } else if (mesa.getFirst().getNum1() == next.getNum2() & mesa.getFirst().getNum1() != next.getNum1()) {
                    mesa.addFirst(next);
                    it.remove();
                    mostrarFichas(mano, mesa);
                    contador++;
                    
                }
            }
            if (contador!=0) {
            juego(mano, mesa);
        }
            
        /*} while (contador!=0);*/

    }

//    public ArrayList<Ficha> rotarFicha (ArrayList<Ficha> num1, ArrayList<Ficha> num2){
//        
//    }
}
