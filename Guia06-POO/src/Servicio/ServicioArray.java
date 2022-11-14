/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Array;
import java.util.Scanner;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que
 * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
 * hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
 * ejecución del programa podría ser este: Adivine el mes secreto. Introduzca el
 * nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo
 * introduciendo otro mes: agosto ¡Ha acertado!
 */
public class ServicioArray {

    Scanner leer = new Scanner(System.in);

    public void adivinaMes(Array a1) {
        boolean aux = false;
        String mes;
        do {
            System.out.println("Ingrese un mes");
            mes = leer.next().toLowerCase();

            if (a1.getMesSecreto().equals(mes)) {
                System.out.println("Ha acertado el mes " + a1.getMesSecreto());
                aux = true;
            } else{           
       
                System.out.println("No ha acertado al mes");
            }

        } while (!aux);

    }
}
