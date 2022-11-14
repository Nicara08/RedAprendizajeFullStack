package Servicio;

import Entidad.Asientos;
import Entidad.Cine;
import Entidad.Espectadores;
import Entidad.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * /**
 * Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto
 * de asientos (8 filas por 6 columnas). De Cine nos interesa conocer la
 * película que se está reproduciendo, la sala con los espectadores y el precio
 * de la entrada. Luego, de las películas nos interesa saber el título,
 * duración, edad mínima y director. Por último, del espectador, nos interesa
 * saber su nombre, edad y el dinero que tiene disponible. Para representar la
 * sala con los espectadores vamos a utilizar una matriz. Los asientos son
 * etiquetados por una letra y un número la fila A1 empieza al final del mapa
 * como se muestra en la tabla. También deberemos saber si el asiento está
 * ocupado por un espectador o no, si esta ocupado se muestra una X, sino un
 * espacio vacío. 8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X 7 A X | 7 B X | 7
 * C X | 7 D X | 7 E | 7 F X 6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F 5 A X | 5
 * B X | 5 C X | 5 D X | 5 E X | 5 F X 4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4
 * F X 3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X 2 A X | 2 B | 2 C X | 2 D X |
 * 2 E X | 2 F 1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X Se debe realizar
 * una pequeña simulación, en la que se generen muchos espectadores y se los
 * ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde
 * ya este ocupado el asiento). Los espectadores serán ubicados de uno en uno y
 * para ubicarlos tener en cuenta que sólo se podrá sentar a un espectador si
 * tiene el dinero suficiente para pagar la entrada, si hay espacio libre en la
 * sala y si tiene la edad requerida para ver la película. En caso de que el
 * asiento este ocupado se le debe buscar uno libre. Al final del programa
 * deberemos mostrar la tabla, podemos mostrarla con la letra y numero de cada
 * asiento o solo las X y espacios vacíos.
 */
public class ServicioCine {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Asientos a1;
    Cine c1;
    Espectadores e1;
    Asientos[][] capacidad = new Asientos[8][6];
    int[][] capacidad2 = new int[8][6];
    Peliculas p1, p2, p3;
    ArrayList<Peliculas> listaPelis = new ArrayList();

    public void crearSala() {
        for (int i = 0; i < capacidad.length; i++) {
            for (int j = 0; j < capacidad[0].length; j++) {
                //System.out.print(i+" "+(j+1)+" ,  ");
                a1 = crearButaca();
                a1.setPosicion(8 - i);

                switch (j) {
                    case 0:
                        a1.setLetra("A");
                        break;
                    case 1:
                        a1.setLetra("B");
                        break;
                    case 2:
                        a1.setLetra("C");
                        break;
                    case 3:
                        a1.setLetra("D");
                        break;
                    case 4:
                        a1.setLetra("E");
                        break;
                    case 5:
                        a1.setLetra("F");
                        break;
                }
                a1.setOcupado("-");
                capacidad[i][j] = a1;
                //System.out.print(" |" + capacidad[i][j].getPosicion() + " " + capacidad[i][j].getLetra() + " " + capacidad[i][j].getOcupado() + "| ");
            }
            //System.out.println("");
        }
        System.out.println("");
        p1 = new Peliculas("Titanic", 200, 14, "Jack");
        listaPelis.add(p1);
        p2 = new Peliculas("Toy Story", 120, 0, "Pixar");
        listaPelis.add(p2);
        p3 = new Peliculas("Gladiador", 140, 18, "Mike0");
        listaPelis.add(p3);
        c1 = new Cine(listaPelis, 1000, capacidad);
        mostrarSala();
        System.out.println("Las peliculas en cartelera son:");
        System.out.println(listaPelis.toString());
        elegirPeli();
        
        
    }

    public Asientos crearButaca() {
//        String letra = "";
//        int posicion =0;
//        String ocupado= "-";

        return new Asientos();
    }

    public void mostrarSala() {
        System.out.println("");
        for (int i = 0; i < capacidad.length; i++) {
            for (int j = 0; j < capacidad[0].length; j++) {

                System.out.print(" |" + capacidad[i][j].getPosicion() + " " + capacidad[i][j].getLetra() + " " + capacidad[i][j].getOcupado() + "| ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void elegirPeli() {
        int contador = 0, contador2=0, contador3=0;
        System.out.println("");
        System.out.println("Ingrese que pelicula desea ver");
        String peli = leer.next();
        for (Peliculas aux : listaPelis) {
            if (aux.getTitulo().equalsIgnoreCase(peli)) {
                contador++;
                System.out.println("Pelicula seleccionada, complete sus datos");
                e1 = crearEspectador();
                if (e1.getEdad() >= aux.getEdadMinima()) {
                    
                    contador2++;
                    if (e1.getDinero() >= c1.getValor()) {
                        System.out.println("Compra exitosa,");
                        System.out.println("A continuacion usted vera la disponibilidad de la sala");
                        contador3++;
                        llenarSala();
                        mostrarSala();
                        elegirAsiento();
                        mostrarSala();
                        
                    } 
                } 
            }
        }
        if (contador == 0 && contador2 == 0 && contador3 == 0) {
            System.out.println("La pelicula no se encuentra en cartelera");
        }
        if (contador > 0 && contador2 == 0 && contador3 == 0) {
            System.out.println("Usted es menor de edad, no puede ingresar");
        }
        if (contador > 0 && contador2 > 0 && contador3 == 0) {
            System.out.println("No posee fondos suficientes");
        }
        System.out.println("");
        contador=0;
    }

    public Espectadores crearEspectador() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su dinero disponible");
        float dinero = leer.nextInt();

        return new Espectadores(nombre, edad, dinero);
    }

    public void llenarSala() {
        double num = 0;
        int num1;
        System.out.println("");
        for (int i = 0; i < capacidad.length; i++) {
            for (int j = 0; j < capacidad[0].length; j++) {
                num = Math.random() * 2 + 1;
                num1 = (int) num;
                if (num1==1) {
                    capacidad[i][j].setOcupado("X");
                }
                //System.out.print(" |" + capacidad[i][j].getPosicion() + " " + capacidad[i][j].getLetra() + " " + capacidad[i][j].getOcupado() + "| ");
            }
           
        }
        System.out.println("");
        
    }
    
    public void elegirAsiento (){
        System.out.println("");
        System.out.println("Elija numero de fila");
        int fila = leer.nextInt();
        System.out.println("Elija la columna con su letra correspondiente");
        String letra = leer.next();
        
        for (int i = 0; i < capacidad.length; i++) {
            for (int j = 0; j < capacidad[0].length; j++) {
                
                if (capacidad[i][j].getPosicion()==fila) {
                    if (capacidad[i][j].getLetra().equalsIgnoreCase(letra)) {
                        if (capacidad[i][j].getOcupado().equalsIgnoreCase("X")) {
                            System.out.println("La butaca se encuentra ocupada, vuelva a intentar");
                            elegirAsiento();
                        }else{
                            System.out.println("Butaca reservada");
                            capacidad[i][j].setOcupado("#");
                        }
                    }
                }
                
            }
           
        }
    }
}
