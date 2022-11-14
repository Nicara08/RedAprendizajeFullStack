/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Tiempo;
import java.util.Scanner;

/**
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
public class ServicioTiempo {
    Scanner leer = new Scanner (System.in);
    
    public Tiempo configurarHora (){
        int horas, minutos, segundos;
        do {
          System.out.println("Ingrese las horas"); 
          horas = leer.nextInt();
          System.out.println("Ingrese los minutos");
          minutos = leer.nextInt();
          System.out.println("Ingrese los segundos");
          segundos = leer.nextInt();
        } while (horas > 23 || minutos > 59 || segundos > 59);
        
        return new Tiempo (horas, minutos, segundos);
        
    }
    
    public void imprimirHoraCompleta (Tiempo t1){
        System.out.println("");
        System.out.println(t1.getHoras()+":"+t1.getMinutos()+":"+t1.getSegundos());
    }
    
    public void pasoDeltiempo (Tiempo t1){
        System.out.println("");
        int auxH, auxM, auxS;
        auxH=t1.getHoras(); auxM=t1.getMinutos(); auxS=t1.getSegundos();
        
        for (int i = 0; i < 86400; i++) {
            System.out.println(auxH+":"+auxM+":"+auxS);
            auxS+=1;
            if (auxS==60) {
                auxS=0;
                auxM+=1;
            }
            if (auxM==60) {
                auxM=0;
                auxH+=1;
            }
            if (auxH==24) {
                auxH=0;
            }
        }
    }
}
