/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
 * contener como atributos, un vector con la palabra a buscar, la cantidad de
 * letras encontradas y la cantidad jugadas máximas que puede realizar el
 * usuario. Definir los siguientes métodos con los parámetros que sean
 * necesarios: • Constructores, tanto el vacío como el parametrizado. • Metodo
 * crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
 * la palabra del usuario, pone la longitud de la palabra, como la longitud del
 * vector. Después ingresa la palabra en el vector, letra por letra, quedando
 * cada letra de la palabra en un índice del vector. Y también, guarda en
 * cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en
 * 0. • Método longitud(): muestra la longitud de la palabra que se debe
 * encontrar. Nota: buscar como se usa el vector.length. • Método buscar(letra):
 * este método recibe una letra dada por el usuario y busca sila letra ingresada
 * es parte de la palabra o no. También informará si la letra estaba o no. •
 * Método encontradas(letra): que reciba una letra ingresada por el usuario y
 * muestre cuantas letras han sido encontradas y cuantas le faltan. Este método
 * además deberá devolver true si la letra estaba y false si la letra no estaba,
 * ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
 * oportunidades. • Método intentos(): para mostrar cuantas oportunidades le
 * queda al jugador. • Método juego(): el método juego se encargará de llamar
 * todos los métodos previamente mencionados e informará cuando el usuario
 * descubra toda la palabra o se quede sin intentos. Este método se llamará en
 * el main.
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = leer.next();
        int longitud = palabra.length();
        String[] vector = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            vector[i] = palabra.substring(i, i + 1);
            //System.out.print(vector[i]+", ");
        }
        System.out.println("Ingrese la cantidad maxima de intentos");
        int cantidad = leer.nextInt();

        return new Ahorcado(vector, 0, cantidad);

    }

//    • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public void longitud(String[] vector) {
        int longitud = vector.length;
        System.out.println("La palabra tiene " + longitud + " letras a adivinar");
    }

//    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public int buscar (String[] vector, String letra, int encontradas) {
        int contador=0;
        for (int i = 0; i < vector.length; i++) {
            if (letra.equals(vector[i])) {
                
                encontradas+=1;
                contador+=1;
            }
        }
        if (contador == 0) {
            System.out.println("La letra no pertenece a la palabra");
           
           
        }else{
            System.out.println("La letra pertenece a la palabra");
        }
        return encontradas;
       
    }

//    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(int AuxEncontradas, String [] vector, String letra) {
        int contador=0;
        boolean aux=false;
        System.out.println("Número de letras(encontradas, faltantes:)"+" ("+AuxEncontradas+", "+(vector.length-AuxEncontradas)+") ");
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].equals(letra)) {
                contador += 1;
                aux = true;
                return aux;
            }
        }
        return aux;
    }

//    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public int intentos(boolean aux, int maximos) {
        int auxIntentos = maximos;
        
        if (!aux) {
            auxIntentos -= 1;
            System.out.println("Número de oportunidades restantes: "+auxIntentos);
        }
        return auxIntentos;
    }
//    Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.

    public void juego(String[] vector, int maximo, Ahorcado a1) {
        int LetrasEncontradas = 0;
        String letra=""; boolean auxEncontradas = false;
        int auxIntentos=0, auxBuscar=0, auxLetras=0, auxMax = a1.getCantMax();
       
        do {
            System.out.println("Ingrese una letra");
            letra = leer.next();
            System.out.println("");
            longitud(vector);
            System.out.println("");
            auxBuscar = buscar(vector, letra, auxLetras);
            auxLetras = auxBuscar;
            System.out.println("");
            //encontradas (LetrasEncontradas, vector, letra);
            auxEncontradas = encontradas (auxLetras, vector, letra);
            //intentos (auxEncontradas, a1.getCantMax());
            auxIntentos = intentos (auxEncontradas, auxMax);
            auxMax = auxIntentos;
            System.out.println("");
        } while (auxIntentos!=0 && auxLetras!=vector.length);
        
        if (auxIntentos==0) {
            System.out.println("");
            System.out.println("Usted se ha quedado sin intentos, muchas gracias");
        }else{
            System.out.println("");
            System.out.println("FELICITACIONES! usted adivino la palabra en "+auxIntentos+" intentos");
            System.out.println("");
        }
    }
}
