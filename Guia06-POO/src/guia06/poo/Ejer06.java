/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia06.poo;
import Entidad.Cafetera;
import Servicio.ServicioCafetera;
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
public class Ejer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        ServicioCafetera sc = new ServicioCafetera ();
        Cafetera c1 = sc.CrearCafetera();
        int opc, taza, granos=0;
        
        
        do {
            System.out.println("----------------------------");
            System.out.println("BIENVENIDO AL MENU NESPRESSO");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Seleccione una opcion");
            System.out.println("1 - Ver el nivel de la cafetera");
            System.out.println("2 - Llenar cafetera");
            System.out.println("3 - Servir cafe");
            System.out.println("4 - Agregar cafe");
            System.out.println("5 - Vaciar cafetera");
            System.out.println("6 - Salir");
            opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    System.out.println("El nivel de la cafetera es de: "+c1.getCapacidadActual()+" ml");
                    break;
                case 2:
                    System.out.println("Aguarde unos segundos, la cafetera se esta llenando");
                    sc.llenarCafetera(c1);
                    System.out.println("El nivel de la cafetera ahora es de "+c1.getCapacidadActual()+" ml");
                    break;
                case 3:
                    System.out.println("Ingrese la taza a llenar");
                    System.out.println("1 - Pocillo; 2 - Taza mediana; 3 - Taza grande");
                    taza = leer.nextInt();
                    while (taza < 1 || taza > 3) {
                        System.out.println("Opcion ingresada incorrecta, vuelva a intentar");
                        taza = leer.nextInt();
                    }
                    sc.servirTaza(taza, c1);  
                    break;  
                case 4:
                    System.out.println("Ingrese la cantidad de gramos de cafe de "+(c1.capacidadMaxima-c1.capacidadActual));
                    System.out.println("Ingrese 1 si ingreso la cantidad requerida o 2 en el caso contrario");
                    opc = leer.nextInt();
                    if (opc==1) {
                        System.out.println("Aguarde un momento");
                        sc.agregarCafe(opc, granos, c1);
                    }else{
                        System.out.println("Ingrese la cantidad de gramos que le agrego");
                        granos=leer.nextInt();
                        sc.agregarCafe(opc, granos, c1);
                    }
                    break; 
                case 5:
                    System.out.println("Aguarde unos segundos");
                    sc.vaciarCafetera(c1);
                    
                    break; 
                
            }
                       
            
        } while (opc !=6);
        System.out.println("MUCHAS GRACIAS");
        System.out.println("");
    }
    
}
