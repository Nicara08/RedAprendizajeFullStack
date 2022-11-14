
package Servicio;

import Entidad.Matematica;
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
public class ServicioMatematica {
    Scanner leer = new Scanner (System.in);
    double num1, num2;
    
    public Matematica completarNumeros (){
        System.out.println("Ingrese el valor de numero 1");
        num1 = Math.random()*100;
        System.out.println("Ingrese el valor de numero 2");
        num2 = Math.random()*100;
        
        return new Matematica (num1, num2);
    }
    
   // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor

    public boolean devolverMayor (Matematica m1){
//        System.out.println(m1.getNum1());
//        System.out.println("Modifique numero 1");
//        double num1 = leer.nextDouble();
//        m1.setNum1(num1);
//        System.out.println(m1.getNum1());
        boolean aux=false;
        if (m1.getNum1()<m1.getNum2()) {
            System.out.println("El numero 2 "+m1.getNum2()+" es mayor al numero 1 "+m1.getNum1());
            return false;
        }else{
            System.out.println("El numero 1 "+m1.getNum1()+" es mayor al numero 2 "+m1.getNum2());
            return true;
        }
    }
    
//    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.


public void calcularPotencia (Matematica m1){
    boolean aux;
    double resultado=0;
    
    aux = devolverMayor (m1);
    
    if (aux=true) {
        resultado = Math.pow(m1.getNum1(), m1.getNum2());
        System.out.println("La potencia de "+m1.getNum1()+" elevado a "+m1.getNum2()+" es igual a "+resultado);
    }else{
        resultado = Math.pow(m1.getNum2(), m1.getNum1());
        System.out.println("La potencia de "+m1.getNum2()+" elevado a "+m1.getNum1()+" es igual a "+resultado);
    }
}

//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public void calcularRaiz (Matematica m1){
        boolean aux;
        double absoluto, resultado;
        aux = devolverMayor (m1);
        
        if (aux=true) {
            if (m1.getNum2()<0) {
                absoluto = m1.getNum2()*-1;
                resultado = Math.sqrt(absoluto);
                System.out.println("La raiz cuadrada del numero 2 con valor "+absoluto+" es igual a "+resultado);
            }else{
                
                resultado = Math.sqrt(m1.getNum2());
                System.out.println("La raiz cuadrada del numero 2 con valor "+m1.getNum2()+" es igual a "+resultado);
            }
        }else{
            if (m1.getNum1()<0) {
                absoluto = m1.getNum1()*-1;
                resultado = Math.sqrt(absoluto);
                System.out.println("La raiz cuadrada del numero 2 con valor "+absoluto+" es igual a "+resultado);
            }else{
                
                resultado = Math.sqrt(m1.getNum1());
                System.out.println("La raiz cuadrada del numero 2 con valor "+m1.getNum1()+" es igual a "+resultado);
            }
        }
    }
}
