/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
public class ServicioFraccion {
    Scanner leer = new Scanner (System.in);
    
    public Fraccion completarAtributos (){
        System.out.println("Ingrese el numerador 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el denominador 1");
        int deno1 = leer.nextInt();
        System.out.println("Ingrese el numerador 2");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el denominador 2");
        int deno2 = leer.nextInt();
        
        return new Fraccion (num1, deno1, num2, deno2);
        
    }
    
    public void operacion (Fraccion f1){
        int opc=0;
        do {
            System.out.println("");
            System.out.println("--BIENVENIDO--");
            System.out.println("--------------");
            System.out.println("1 - MOSTRAR ");
            System.out.println("2 - SUMAR");
            System.out.println("3 - RESTAR");
            System.out.println("4 - MULTIPLICAR");
            System.out.println("5 - DIVIDIR");
            System.out.println("6 - SALIR");
            System.out.println("--------------");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    mostrar (f1);
                    break;
                case 2:
                    sumar (f1);
                    break;
                case 3:
                    restar (f1);
                    break;
                case 4:
                    multiplicar (f1);
                    break;
                case 5:
                    dividir (f1);
                    break;
            }
            System.out.println("");
        } while (opc != 6);
        
          System.out.println("MUCHAS GRACIAS");
          System.out.println("");
    }
    
    public void mostrar (Fraccion f1){
        System.out.println("");
        System.out.println(f1.getNumerador1()+"    "+"  "+f1.getNumerador2());
        System.out.println("--  y  --");
        System.out.println(f1.getDenominador1()+"    "+"  "+f1.getDenominador2());
        System.out.println("");
    }
    
    public void sumar (Fraccion f1){
        int sumaNume=0, sumaDeno=0;
        sumaNume = ((f1.getNumerador1()*f1.getDenominador2())+(f1.getDenominador1()*f1.getNumerador2()));
        sumaDeno = (f1.getDenominador1()*f1.getDenominador2());
        System.out.println("");
        System.out.println("MENU SUMA");
        System.out.println("");
        System.out.println(f1.getNumerador1()+"    "+"  "+f1.getNumerador2()+"    "+sumaNume);
        System.out.println("--  +  -- = --");
        System.out.println(f1.getDenominador1()+"    "+"  "+f1.getDenominador2()+"    "+sumaDeno);
        System.out.println("");
    }
    
    public void restar (Fraccion f1){
        int restaNume=0, restaDeno=0;
        restaNume = ((f1.getNumerador1()*f1.getDenominador2())-(f1.getDenominador1()*f1.getNumerador2()));
        restaDeno = (f1.getDenominador1()*f1.getDenominador2());
        System.out.println("");
        System.out.println("MENU RESTA");
        System.out.println("");
        System.out.println(f1.getNumerador1()+"    "+"  "+f1.getNumerador2()+"    "+restaNume);
        System.out.println("--  -  -- = --");
        System.out.println(f1.getDenominador1()+"    "+"  "+f1.getDenominador2()+"    "+restaDeno);
        System.out.println("");
    }
    
    public void multiplicar (Fraccion f1){
        int multiNume=0, multiDeno=0;
        multiNume = ((f1.getNumerador1()*f1.getNumerador2()));
        multiDeno = (f1.getDenominador1()*f1.getDenominador2());
        System.out.println("");
        System.out.println("MENU MULTIPLICACION");
        System.out.println("");
        System.out.println(f1.getNumerador1()+"    "+"  "+f1.getNumerador2()+"    "+multiNume);
        System.out.println("--  x  -- = --");
        System.out.println(f1.getDenominador1()+"    "+"  "+f1.getDenominador2()+"    "+multiDeno);
        System.out.println("");
    }
    
    public void dividir (Fraccion f1){
        int divideNume=0, divideDeno=0;
        divideNume = ((f1.getNumerador1()*f1.getDenominador2()));
        divideDeno = (f1.getDenominador1()*f1.getNumerador2());
        System.out.println("");
        System.out.println("MENU MULTIPLICACION");
        System.out.println("");
        System.out.println(f1.getNumerador1()+"    "+"  "+f1.getNumerador2()+"    "+divideNume);
        System.out.println("--  %  -- = --");
        System.out.println(f1.getDenominador1()+"    "+"  "+f1.getDenominador2()+"    "+divideDeno);
        System.out.println("");
    }
}
