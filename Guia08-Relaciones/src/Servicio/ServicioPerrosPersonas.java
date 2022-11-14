package Servicio;

import Entidad.Perro;
import Entidad.Persona1;
import Enum.EnumPerros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 */
public class ServicioPerrosPersonas {
    boolean adopto=false;
    int contador=0; 
    String personita;
    Scanner leer = new Scanner(System.in);
    ArrayList<Persona1> personas = new ArrayList();
    ArrayList<Perro> perros = new ArrayList();
    ArrayList<Persona1> personas2 = new ArrayList();
    ArrayList<Perro> perros2 = new ArrayList();
    Perro p1 = new Perro();
    Persona1 p2 = new Persona1();

    public Perro crearPerro() {
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingrese la raza del perro (COCKER, CALLEJERO, LABRADOR, GOLDEN;");
        String raza = leer.next().toUpperCase();

        while (!raza.equalsIgnoreCase("cocker") && !raza.equalsIgnoreCase("dogo") && !raza.equalsIgnoreCase("callejero") && !raza.equalsIgnoreCase("labrador") && !raza.equalsIgnoreCase("golden")) {
            System.out.println("Raza incorrecta, vuelva a intentar");
            raza = leer.next().toUpperCase();
        }

        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Tamaño del perro");
        String tamanio = leer.next();

        return new Perro(nombre, EnumPerros.valueOf(raza), edad, tamanio);
    }

    public Persona1 crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su DNI");
        String dni = leer.next();
        //Perro p1 = crearPerro ();

        return new Persona1(nombre, apellido, edad, dni);
    }

    public ArrayList<Persona1> altasPersonas() {
        System.out.println("Cuantas personas se cargaran al sistema?");
        int opc = leer.nextInt();

        for (int i = 0; i < opc; i++) {
            p2 = crearPersona();
            personas.add(p2);
        }
        return personas;
    }

    public ArrayList<Perro> altasPerros() {
        System.out.println("Cuantos perros se cargaran al sistema?");
        int opc = leer.nextInt();

        for (int i = 0; i < opc; i++) {
            p1 = crearPerro();
            perros.add(p1);
        }
        return perros;
    }

    public void mostrarPersonas(ArrayList<Persona1> personas) {
        System.out.println("");
        System.out.println("Las personas disponibles a adoptar son: ");

        for (Persona1 aux : personas) {
            System.out.println("Nombre: " + aux.getNombre() + " Apellido: " + aux.getApellido());
        }
        System.out.println("");
        System.out.println("Desea seleccionar una persona? S o N");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nombre de la persona");
            personita = leer.next();
            
            Iterator<Persona1> it = personas.iterator();
            
            while (it.hasNext()) {
                Persona1 next = it.next();
                if (next.getNombre().equalsIgnoreCase(personita)) {
                    System.out.println("Desea adoptar? S o N");
                    opc = leer.next();
                    if (opc.equalsIgnoreCase("s")) {
                        contador++;
                        
                        mostrarPerros(perros, next.getNombre());
                        if (adopto==true) {
                            personas2.add(next);
                            it.remove();
                            adopto=false;
                        }
                    }
                }else{
                    System.out.println("No se encuentra esa persona en la lista");
                }
            }
            
    }
        adopto=false;
        System.out.println("");
    }
    public void mostrarPerros(ArrayList<Perro> perros, String nombre) {
        System.out.println("");
        System.out.println("Los perros disponibles a adoptar son: ");

        for (Perro aux : perros) {
            System.out.println(aux.toString());
        }
        System.out.println("");
            if (contador==1) {
            System.out.println("Ingrese el nombre del perrito");
            String perrito = leer.next();
            
            Iterator<Perro> it = perros.iterator();

            while (it.hasNext()) {
                Perro next = it.next();
                if (next.getNombre().equalsIgnoreCase(perrito)) {
                    System.out.println("Has adoptado a: " + next.getNombre());
                    perros2.add(next);
                    Iterator<Persona1> aux = personas.iterator();
                    while (aux.hasNext()) {
                        Persona1 next1 = aux.next();
                        if (next1.getNombre().equalsIgnoreCase(nombre)) {
                            next1.setPerro(next);
                            adopto=true;
                        }
                        
                    }
                    it.remove();
                    

                } else {
                    System.out.println("El perrito seleccionado no se encuentra");
                }
            }
                if (perros.size()==0) {
                    System.out.println("No hay perritos disponibles para adoptar");
                }
            System.out.println("");
        }
            contador=0;
            
        }
           
    public void mostrarPersonasQueAdotaron() {
        System.out.println("");
        for (Persona1 aux : personas2) {
            System.out.println(aux.toString());
        }
        System.out.println("");
    }

    public void mostrarPerrosAdoptados() {
        System.out.println("");
        for (Perro aux : perros2) {
            System.out.println(aux.toString());
        }
        System.out.println("");
    }

    public void menu(ArrayList<Persona1> personas, ArrayList<Perro> perros) {
        int opc = 0;
        do {
            System.out.println("");
            System.out.println("BIENVENIDO AL SISTEMA DE ADOPCION");
            System.out.println("---------------------------------");
            System.out.println("1. DAR ALTA A LA PERSONA");
            System.out.println("2. DAR ALTA A UN PERRO");
            System.out.println("3. MOSTRAR BASE DE DATOS DE PERSONAS");
            System.out.println("4. MOSTRAR PERROS DISPONIBLES PARA ADOPTAR");
            System.out.println("5. MOSTRAR PERSONAS QUE YA ADOPTARON");
            System.out.println("6. MOSTRAR PERROS QUE FUERON ADOPTADOS");
            System.out.println("7. SALIR");
            opc = leer.nextInt();
            System.out.println("");
        } while (opc < 1 || opc > 7);
        if (opc == 7) {
            System.out.println("");
            System.out.println("MUCHAS GRACIAS POR UTILIZAR EL SISTEMA");
            System.out.println("");
        } else {
            switch (opc) {
                case 1:
                    personas = altasPersonas();
                    menu(personas, perros);
                    break;
                case 2:
                    perros = altasPerros();
                    menu(personas, perros);
                    break;
                case 3:
                    mostrarPersonas(personas);
                    menu(personas, perros);
                    break;
                case 4:
                    mostrarPerros(perros, personita);
                    menu(personas, perros);
                    break;
                case 5:
                    mostrarPersonasQueAdotaron();
                    menu(personas, perros);
                    break;
                case 6:
                    mostrarPerrosAdoptados();
                    menu(personas, perros);
                    break;
            }

        }

    }
}
/*
private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    private Perro perro;
 */
