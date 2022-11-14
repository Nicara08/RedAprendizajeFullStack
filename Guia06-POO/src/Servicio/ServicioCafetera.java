/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Cafetera;
import java.util.Scanner;

/**
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class ServicioCafetera {
    Scanner leer = new Scanner (System.in);
    int max, cantidadActual;
    
    public Cafetera CrearCafetera (){
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        max = leer.nextInt();
        System.out.println("Ingrese el nivel actual de la cafetera");
        cantidadActual = leer.nextInt();
        return new Cafetera (max, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera c1){
        c1.setCapacidadActual(c1.getCapacidadMaxima());
    }
    
     public void servirTaza(int taza, Cafetera c1){
        System.out.println("Aguarde unos segundos hasta que la cafetera pare");
        switch (taza) {
            case 1:
                if (50<c1.getCapacidadActual()) {
                    c1.setCapacidadActual(c1.getCapacidadActual()-50);
                }else{
                    System.out.println("Se le sirvio "+c1.getCapacidadActual()+" ml de 50ml disponible");
                    c1.setCapacidadActual(0);
                }
                break;
            case 2:
                if (100<c1.getCapacidadActual()) {
                    c1.setCapacidadActual(c1.getCapacidadActual()-100);
                }else{
                    System.out.println("Se le sirvio "+c1.getCapacidadActual()+" ml de 100ml disponible");
                    c1.setCapacidadActual(0);
                }
                break;    
            case 3:
                if (200<c1.getCapacidadActual()) {
                    c1.setCapacidadActual(c1.getCapacidadActual()-200);
                }else{
                    System.out.println("Se le sirvio "+c1.getCapacidadActual()+" ml de 200ml disponible");
                    c1.setCapacidadActual(0);
                }
                        
                break;
        }
        
    }
     public void agregarCafe(int opc, int granos, Cafetera c1){
        
        if (opc == 1) {
            System.out.println("Su cafetera ya se encuentra en el nivel maximo");
            c1.setCapacidadActual(c1.getCapacidadMaxima());
        }else{
            c1.setCapacidadActual(c1.getCapacidadActual()+granos);
            System.out.println("Su cafetera quedo con un nivel de "+c1.getCapacidadActual()+" faltando "+(c1.getCapacidadMaxima()-c1.getCapacidadActual())+" para llenarse");
        }
            
    }
     
     public void vaciarCafetera(Cafetera c1){
        c1.setCapacidadActual(0);
        System.out.println("Su cafetera ha sido vaciada");
    }
}
