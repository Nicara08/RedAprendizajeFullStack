/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5java.EjerAprendizaje;

import java.util.Scanner;

/**
 *
* 
 * @author hans chang 201708
 */
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        float grados;
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("ingrese los grados centigrados");
        grados = leer.nextFloat();
        System.out.println("el equivalente en grados Fahrenheit es " + (32+((9*grados)/5)));
    }
    
}
