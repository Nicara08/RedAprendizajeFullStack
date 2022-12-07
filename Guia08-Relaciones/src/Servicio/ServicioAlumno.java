package Servicio;

import Entidad.Alumno;
import Entidad.Voto;
import Utilidad.ComparadorVotos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);
    String[] nombres = {"Fede", "Brunela", "Daniel", "Estefania", "Mimi", "Silvi", "Javi", "Pauli"};
    String[] apellidos = {"Lorenzo", "Gonzalez", "Modica", "Garcia", "Campigotto", "Ollarce", "Morgani", "Barison", "Morgani"};
    ArrayList<String> listaAlumnos = new ArrayList();
    ArrayList<Integer> dni = new ArrayList();
    Alumno a1;
    HashSet<Alumno> listaAlumnos2 = new HashSet();
    ArrayList<Alumno> votados = new ArrayList();
    Voto v1 = new Voto();
    ArrayList<Voto> listaVotados = new ArrayList();
    ArrayList<Alumno> lista = new ArrayList(listaAlumnos2);
    ArrayList<Alumno> lista2;

    public void generarAlumnos() {
        System.out.println("Cuantos alumnos desea crear? minimo 10");
        int cantidad = leer.nextInt();
        while (cantidad < 10) {
            System.out.println("Ingrese nuevamente la cantidad de alumnos");
            cantidad = leer.nextInt();
        }
        String[] nombresAleatorios = new String[cantidad];
        System.out.println("");
        for (int i = 0; i < cantidad; i++) {
            nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
                    + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
            listaAlumnos.add(nombresAleatorios[i]);
            System.out.println(nombresAleatorios[i]);

        }
        System.out.println("");
        //System.out.println(listaAlumnos.toString());
        generadorDni(cantidad);
        completarAlumno(cantidad);
        mostrar();
        lista2 = generadorVotos(cantidad);
        mostrar2();
        recuentoVotos(lista2);
        facilitadores(cantidad, lista2);
    }

    public Alumno altaAlumno() {
        return new Alumno("", 0);
    }

    public void generadorDni(int cantidad) {
        int dni2;
        System.out.println("");
        for (int i = 0; i < cantidad; i++) {
            dni2 = (int) (Math.random() * (40000000 - 10000000 + 1) + 10000000);
            dni.add(dni2);
            System.out.println(dni2);
        }
        System.out.println("");
    }

    public void mostrar() {
        System.out.println("");
        for (Alumno aux : listaAlumnos2) {
            System.out.println(aux);
        }
        System.out.println("");
    }

    public void mostrar2() {
        System.out.println("");
        for (Voto aux : listaVotados) {
            System.out.print(aux);
        }
        System.out.println("");
    }

    public void completarAlumno(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            a1 = altaAlumno();
            a1.setNombreCompleto(listaAlumnos.get(i));
            a1.setDni(dni.get(i));
            listaAlumnos2.add(a1);
        }

    }

    /*
    Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.    
     */
    public ArrayList<Alumno> generadorVotos(int cantidad) {
        int contador = 0, aux1 = 0, aux2 = 0, aux3 = 0;
        lista = new ArrayList(listaAlumnos2);
        lista2 = new ArrayList(listaAlumnos2);

        Iterator<Alumno> it = listaAlumnos2.iterator();

        for (int i = 0; i < cantidad; i++) {

            Collections.shuffle(lista2);

            System.out.println(aux1);
            while (contador != 1) {
                aux1 = (int) (Math.random() * ((cantidad - 1) - 1 + 1) + 1);
                aux2 = (int) (Math.random() * ((cantidad - 1) - 1 + 1) + 1);
                aux3 = (int) (Math.random() * ((cantidad - 1) - 1 + 1) + 1);
                if (lista.get(i).getDni() != lista2.get(aux1).getDni() && lista.get(i).getDni() != lista2.get(aux2).getDni() && lista2.get(aux1).getDni() != lista2.get(aux2).getDni() && lista2.get(aux1).getDni() != lista2.get(aux3).getDni() && lista2.get(aux2).getDni() != lista2.get(aux3).getDni() && lista.get(i).getDni() != lista2.get(aux3).getDni()) {
                    Voto v1 = altaVoto();
                    contador++;
                    v1.setA1(lista.get(i));
                    votados.add(lista2.get(aux1));
                    votados.add(lista2.get(aux2));
                    votados.add(lista2.get(aux3));
                    v1.setAlumnosVotados(votados);
                    lista2.get(aux1).setVotos(lista2.get(aux1).getVotos() + 1);
                    lista2.get(aux2).setVotos(lista2.get(aux2).getVotos() + 1);
                    lista2.get(aux3).setVotos(lista2.get(aux3).getVotos() + 1);

                    System.out.println(v1);
                    votados.removeAll(lista2);

                }
            }

            contador = 0;

        }
        return lista2;
    }

    public Voto altaVoto() {
        return new Voto();
    }

//Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
//comienza a hacer el recuento de votos.
    public void recuentoVotos(ArrayList<Alumno> lista2) {
        System.out.println("");
        System.out.println("RECUENTO DE VOTOS");
        System.out.println("");
        
        Collections.sort(lista2, ComparadorVotos.ordenarVotos);
        
        for (Alumno aux : lista2) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    
    public void facilitadores (int cantidad, ArrayList <Alumno> lista2){
        
        for (int i = 0; i < cantidad; i++) {
            if (i==0) {
                System.out.println("");
                System.out.println("Los facilitadores titulares son: ");
                System.out.println(lista2.get(i));
            }else if (i<5) {
                System.out.println(lista2.get(i));
            }
            
            if (i==5) {
                System.out.println("");
                System.out.println("Los facilitadores suplentes son: ");
                System.out.println(lista2.get(i));
            }else if (i>5 && i<10) {
                System.out.println(lista2.get(i));
            }
        }
    }
}
