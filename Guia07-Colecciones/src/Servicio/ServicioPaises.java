
package Servicio;

import Entidad.Paises;
import Utilidad.ComparadorPaises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
public class ServicioPaises {
    Scanner leer = new Scanner (System.in);
    HashSet <Paises> hashPaises = new HashSet <> ();
    //creo el arraylist con el hashset dentro, pasando de conjunto a lista
    
  
   public Paises crearPais (String opc){
       
       //     
       System.out.println("Ingrese el nombre del pais"+"\n");
       String pais = leer.next();
       System.out.println("");
       
       return new Paises (pais);
       }   
   
  public void rellenarHash (){
        String opc;
      
                
       do {
           System.out.println("Quiere ingresar un pais? S o N");
           opc = leer.next();
           if (opc.equalsIgnoreCase("S")) {
               hashPaises.add(crearPais(opc));
               
           }else if (!opc.equalsIgnoreCase("N")) {
               System.out.println("Opcion incorrecta");
           }
          
       } while (!opc.equalsIgnoreCase("N"));
        System.out.println("");
       
   }
   
   public void mostrarPaises (){
       System.out.println("");
       System.out.println("Los paises son"+"\n");
       for (Paises aux : hashPaises) {
           System.out.println(aux.getPais());
       }
       System.out.println("");
       /* for (Paises aux : p1.getPais()) {
           System.out.println(aux.getPais());
           
       }
       System.out.println("");*/
       /*for (int i = 0; i < p1.pais.size(); i++) {
           System.out.println(p1.getPais().toString());
       }*/
       /*System.out.println("");
       for (String aux : p1.pais) {
           System.out.println(aux);
       }
       System.out.println("");*/
   }
   
   public void mostrarOrdenado (){
       System.out.println("");
       System.out.println("Los paises ordenados son: "+"\n");
       ArrayList <Paises> arrayPaises = new ArrayList (hashPaises);
       Collections.sort(arrayPaises, ComparadorPaises.Comparador);
       
       for (Paises aux : arrayPaises) {
           System.out.println(aux.getPais());
       }
       System.out.println("");
   }
   
   public void eliminarPais (){
       System.out.println("Ingrese el pais a eliminar");
       String pais = leer.next();
       Paises pa = new Paises (pais);
       ArrayList <Paises> arrayPaises = new ArrayList (hashPaises);
       
       Iterator <Paises> it = hashPaises.iterator();
       
       while (it.hasNext()) {
           
           if (it.next().equals(pa)) {
               it.remove();
           }
       }
       System.out.println("");
       mostrarPaises();
       
   }
   
   public void eliminarPaises2 (){
       
   }
   
}
