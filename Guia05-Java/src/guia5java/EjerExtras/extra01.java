package guia5java.EjerExtras;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float minutos, dias, horas, aux, aux1;
        int diasEntero, horasEntero;
        String texto;
        Scanner leer = new Scanner(System.in);
        do {  
            System.out.println("Ingrese la cantidad de minutos a convertir");
            minutos = leer.nextInt();
            
        } while (minutos < 1);
        
        int minutosEnteros = (int) minutos;
        horas = (minutos/60);                
        dias = (horas/24);
        aux = dias % 1; //aux = aux * 24; aux1 = aux % 1; horas = aux - aux1;
        dias = dias - aux;
        diasEntero = (int) dias;
        aux = aux * 24;
        aux1 = aux % 1;
        horas = aux - aux1;
        horasEntero = (int) horas;
        
        System.out.println("los minutos "+minutosEnteros+" es equivalente a "+diasEntero+" dias y "+horasEntero+" horas");
    }
    
}
