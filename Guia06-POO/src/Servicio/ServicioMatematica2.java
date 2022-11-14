
package Servicio;

import Entidad.Matematica2;
import java.util.Scanner;

/**
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ServicioMatematica2 {
    Scanner leer = new Scanner (System.in);
    double num1, num2;
    
    public Matematica2 CrearNumeros (){
        num1 = (Math.random()*10);
        System.out.println("el primer numero aleatorio es "+num1);
        num2 = (Math.random()*10);
        System.out.println("el segundo numero aleatorio es "+num2);
        
        return new Matematica2 (num1, num2);
    }
    
     public void devolverMayor (Matematica2 m1){
         System.out.println("");
        if (m1.getNum1() < m1.getNum2()) {
            System.out.println("El numero 2 "+m1.getNum2()+" es mayor al numero 1 "+m1.getNum1());
        }else {
            System.out.println("El numero 1 "+m1.getNum1()+" es mayor al numero 2 "+m1.getNum2()); 
        }
    }
     
      public void calcularPotencia (Matematica2 m1){
       int aux1, aux2;
       double resultado;
          System.out.println("");
        if (m1.getNum1() < m1.getNum2()) {
            aux1 = (int) m1.getNum1();
            aux2 = (int) m1.getNum2();
            resultado = Math.pow(aux2, aux1);
            System.out.println("El numero 2: "+aux2+" elevado al numero 1: "+aux1+" es igual a "+resultado);
        }else {
            aux1 = (int) m1.getNum1();
            aux2 = (int) m1.getNum2();
            resultado = Math.pow(aux1, aux2);
            System.out.println("El numero 1: "+aux1+" elevado al numero 2: "+aux2+" es igual a "+resultado);
        }
    }
      
      public void calcularRaiz (Matematica2 m1){
        int aux1, aux2;
       double resultado;
          System.out.println("");
        if (m1.getNum1() < m1.getNum2()) {
            aux1 = (int) m1.getNum1();
            aux2 = (int) m1.getNum2();
            resultado = Math.sqrt(aux1);
            System.out.println("La raiz cuadrada del numero mas chico siendo el numero 1: "+aux1+" con resultado = "+resultado);
        }else {
            aux1 = (int) m1.getNum1();
            aux2 = (int) m1.getNum2();
            resultado = Math.sqrt(aux2);
            System.out.println("La raiz cuadrada del numero mas chico siendo el numero 2: "+aux2+" con resultado = "+resultado);
        }
          System.out.println("");
    }
}
