/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Sopa;
import java.util.Scanner;
import java.util.Random;

/**
 * Crear una clase Sopa de letras que contenga un atributo matriz, y otro
 * palabra a encontrar. Llenar una matriz de 10x10 con palabras de 5 caracteres
 * (todas de forma horizontal, en orden) inicializándola por defecto con
 * “palabras preestablecidas”. Crear métodos: • Que el usuario ingrese una
 * palabra y la busque en la matriz. Deberá retornar en que posición de la
 * matriz inicia la palabra. • Imprimir la sopa de letras en pantalla • Que el
 * usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada
 * (Es decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a
 * polo). Para realizar esta gestión, el método recibirá la palabra a buscar y a
 * reemplazar sus datos • Imprimir la sopa de letras, invertida (es decir, filas
 * por columnas)
 */
public class ServicioSopa {

    Scanner leer = new Scanner(System.in);
    String[][] matriz = new String[10][10];
    String[] vector = new String[10];

    int x = 0;

    public void completarSopa(Sopa s1) {
        vector[0] = "BOLSA";
        vector[1] = "AHORA";
        vector[2] = "PIZZA";
        vector[3] = "JAULA";
        vector[4] = "CABLE";
        vector[5] = "PINZA";
        vector[6] = "PALOS";
        vector[7] = "CARTAS";
        vector[8] = "ENTRE";
        vector[9] = "LETRA";
        for (int i = 0; i < s1.getMatriz().length; i++) {

            int posicion = (int) (Math.random() * (5 - 1 + 1) + 1);
            posicion -= 1;
            System.out.println(posicion);

//            String palabra = leer.next().toUpperCase();
//
//            while (palabra.length() != 5) {
//                System.out.println("palabra invalida, ingrese nuevamente");
//                palabra = leer.next().toUpperCase();
//            }
            for (int j = 0; j < s1.getMatriz()[0].length; j++) {
                char letra = (char) (Math.random() * 26 + 'a');
                String letras = String.valueOf(letra).toUpperCase();
                matriz[i][j] = letras;
                s1.setMatriz(matriz);
                //System.out.print(s1.getMatriz()[i][j]+"  ");
                if (x < 5 && j >= posicion && j <= posicion + 5) {
                    letras = vector[i].substring(x, x + 1);
                    matriz[i][j] = letras;
                    s1.setMatriz(matriz);
                    //System.out.print(s1.getMatriz()[i][j]);
                    x += 1;
                }
//               

                //System.out.print(s1.getMatriz()[i][j]+"  ");
            }
            System.out.println("");
            x = 0;
        }
    }

    public void mostrarSopa(Sopa s1) {

        for (int i = 0; i < s1.getMatriz().length; i++) {
            for (int j = 0; j < s1.getMatriz()[0].length; j++) {
                System.out.print(s1.getMatriz()[i][j] + "  ");
            }
            System.out.println("");
        }
    }

//    Crear métodos: • Que el usuario ingrese una
// * palabra y la busque en la matriz. Deberá retornar en que posición de la
// * matriz inicia la palabra
    public void buscaPalabra(Sopa s1) {
        int x = 0, aux = 0, contador = 0, auxI = 0, auxJ = 0;
        String letra = "";
        System.out.println("");
        System.out.println("Ingrese una palabra para buscar en la sopa de letras");
        String palabra = leer.next().toUpperCase();
        while (palabra.length() != 5) {
            System.out.println("Debe ingresar una palabra de 5 caracteres, vuelva a intentar");
            palabra = leer.next().toUpperCase();
        }
        for (int i = 0; i < s1.getMatriz().length; i++) {
            for (int j = 0; j < s1.getMatriz()[0].length; j++) {

                if (palabra.substring(x, x + 1).equals(matriz[i][j]) && x == 0) {
                    x += 1;
                    contador += 1;
                    auxI = i;
                    auxJ = j;
                } else if (palabra.substring(x, x + 1).equals(matriz[i][j]) && x != 0) {
                    x += 1;
                    contador += 1;
                }
                //System.out.print(contador+", ");
                if (contador == 5) {
                    System.out.println("La palabra " + palabra + " se encuentra en la fila " + (auxI + 1) + " columna " + (auxJ + 1));

                }

            }
            System.out.println("");
            x = 0;
            aux = 0;
            contador = 0;
            auxI = 0;
            auxJ = 0;
        }
    }
}
