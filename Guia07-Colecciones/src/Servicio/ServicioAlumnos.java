package Servicio;

import Entidad.Alumnos;
import Utilidad.ComparadorAlumnos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la
 * nacionalidad y su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA –
 * CHILENA – VENEZOLANA solamente. Necesidades: • Crear los métodos de A – B -M
 * (Alta – Baja – modificación ) que manipulen los objetos de este tipo. • Crear
 * una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
 * para no hacer carga manual de los datos) • Ordenar y mostrar la lista de
 * alumnos ordenados por orden alfabético según su apellido de forma ascendente.
 * • Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según
 * su nombre de forma descendente. • Con un alumno especifico (suponiendo que no
 * existen dos alumnos con el mismo nombre y apellido), mostrar por pantalla su
 * edad. Considerar, el manejo de fechas, utilizando el atributo fecha de
 * nacimiento. • Crear listas paralelas de Alumnos, según la nacionalidad. •
 * Realizar un reporte final de datos que informe: o Cuantos alumnos son mayores
 * de 25 años. o Cuantos alumnos tiene su apellido que comienzan con letra L o P
 * o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.
 */
public class ServicioAlumnos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumnos> lista = new ArrayList();
     Date hoy = new Date ();

    public Alumnos altaAlumno() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Ingrese su nacionalidad (argentina, chile o venezuela");
        String nacionalidad = leer.next();
        while (!nacionalidad.equalsIgnoreCase("argentina") & !nacionalidad.equalsIgnoreCase("chile") & !nacionalidad.equalsIgnoreCase("venezuela")) {
            System.out.println("Nacionalidad incorrecta, vuelva a ingresar una opcion valida");
            nacionalidad = leer.next();
        }
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        Date fecha = new Date(anio, mes - 1, dia);

        return new Alumnos(nombre, apellido, nacionalidad, fecha);

    }

//     Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
//para no hacer carga manual de los datos)
    public void crearLista(ArrayList<Alumnos> lista) {

        Date fecha1 = new Date(1987, 9, 17);
        Alumnos a1 = new Alumnos("Federico", "Lorenzo", "Argentina", fecha1);
        lista.add(a1);

        fecha1 = new Date(1988, 2, 28);
        a1 = new Alumnos("Bruno", "Campigotto", "Chile", fecha1);
        lista.add(a1);

        fecha1 = new Date(1988, 2, 28);
        a1 = new Alumnos("Mauro", "Campigotto", "Venezuela", fecha1);
        lista.add(a1);

        fecha1 = new Date(2021, 4, 8);
        a1 = new Alumnos("Brunela", "Lorenzo", "Argentina", fecha1);
        lista.add(a1);

        fecha1 = new Date(2007, 7, 17);
        a1 = new Alumnos("Manuel", "Lorenzo", "Chile", fecha1);
        lista.add(a1);
        System.out.println("");

    }

//    Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los
//objetos de este tipo.
    public ArrayList<Alumnos> bajaAlumno(String nombre, String apellido, ArrayList<Alumnos> lista) {
        //Iterator <Alumnos>it = lista.iterator();
        //Date fecha1 = new Date (1987, 9, 17);
        //Alumnos al = new Alumnos (nombre, apellido,"",fecha1);
        //ArrayList <Alumnos> fantasma = new ArrayList (lista);
        int contador = 0;
        for (Alumnos aux : lista) {
            if (aux.getNombre().equalsIgnoreCase(nombre) & aux.getApellido().equalsIgnoreCase(apellido)) {
                contador = lista.indexOf(aux);
            }
        }
        if (contador > 0) {
            System.out.println("El alumno ha sido eliminado");
            lista.remove(contador);
        } else {
            System.out.println("El alumno no se encuentra en la lista");
        }

        return lista;

    }

    public ArrayList<Alumnos> modificarAlumno(ArrayList<Alumnos> lista) {

        int contador = 0, indice=0;
        String nacionalidad;
        int anio, mes, dia;

        System.out.println("Ingrese el nombre y el apellido del alumno que desea modificar");
        String nombre = leer.next();
        String apellido = leer.next();
        for (Alumnos aux : lista) {
            if (aux.getNombre().equalsIgnoreCase(nombre) & aux.getApellido().equalsIgnoreCase(apellido)) {
                indice = lista.indexOf(aux);
                contador++;

                //lista.add(a);
            }
        }
        if (contador > 0) {
            System.out.println("Ingrese los datos nuevos, nombre");
            nombre = leer.next();
            System.out.println("Ingrese el apellido nuevo");
            apellido = leer.next();
            System.out.println("Ingrese la nacionalidad");
            nacionalidad = leer.next();
            System.out.println("Ingrese año, mes y dia de nacimiento");
            anio = leer.nextInt();
            mes = leer.nextInt();
            dia = leer.nextInt();
            Date fecha = new Date(anio, mes, dia);
            Alumnos a = new Alumnos(nombre, apellido, nacionalidad, fecha);
            lista.set(indice, a);
            
            
            System.out.println("El alumno ha sido modificado");
            
        } else {
            System.out.println("El alumno no se encuentra en la lista");
        }

        return lista;

    }
    
    public void ordenApellido (ArrayList<Alumnos> lista){
        Collections.sort(lista, ComparadorAlumnos.appellidoAscendente);
        System.out.println("Lista ordenada por apellido de forma ascendente");
        System.out.println(lista);
    }
    
    public void ordenNombre (ArrayList<Alumnos> lista){
        Collections.sort(lista, ComparadorAlumnos.nombreDescendente);
        System.out.println("Lista ordenada por nombre de forma descenendiente");
        System.out.println(lista);
    }
    
    /*Con un alumno especifico (suponiendo que no
 * existen dos alumnos con el mismo nombre y apellido), mostrar por pantalla su
 * edad. Considerar, el manejo de fechas, utilizando el atributo fecha de
 * nacimiento*/
    public void edadAlumno (ArrayList <Alumnos> lista){
        System.out.println("Ingrese el nombre y apellido del alumno que desea conocer la edad");
        String nombre, apellido;
        nombre = leer.next();
        apellido = leer.next();
        int anios=0;
       
        for (Alumnos aux : lista) {
            if (nombre.equalsIgnoreCase(aux.getNombre())&apellido.equalsIgnoreCase(aux.getApellido())) {
                anios = hoy.getYear() - (aux.getNacimiento().getYear()%100);
                System.out.println("La edad del alumno "+nombre+" "+apellido+" es: "+anios+" años");
            }
        }
    }
    
    /* Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
VENEZOLANA.*/
    
    public void reporte (ArrayList <Alumnos> lista){
        int conEdad=0, conLP=0, conArg=0, conCh=0, anios;
        
        for (Alumnos aux : lista) {
            anios = hoy.getYear()- (aux.getNacimiento().getYear()%100);
            if (anios>=25) {
                conEdad++;
            }
            if (aux.getApellido().substring(0, 1).equalsIgnoreCase("l") || aux.getApellido().substring(0, 1).equalsIgnoreCase("p") ) {
                conLP++;
            }
            
            if (aux.getNacionalidad().equalsIgnoreCase("argentina")) {
                conArg++;
            }else if (aux.getNacionalidad().equalsIgnoreCase("chile")) {
                conCh++;
            }
        }
        System.out.println("Los alumnos mayores a 25 son "+conEdad);
        System.out.println("Los alumnos con apellido que comienzan con l o p son: "+conEdad);
        System.out.println("Los alumnos argentinos son: "+conArg);
        System.out.println("Los alumnos chilenos son: "+conCh);
        System.out.println("Los alumnos venezolanos son: "+(lista.size()-(conEdad+conCh)));
    }
}
