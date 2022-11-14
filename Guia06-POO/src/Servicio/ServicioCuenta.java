/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioCuenta {
    Scanner leer = new Scanner (System.in);
    int numCuenta;
    long DNI;
    int SaldoCuenta;
    
    
    public Cuenta CrearCuenta (){
        System.out.println("Ingrese numero de cuenta");
        numCuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        DNI = leer.nextInt();
        System.out.println("Ingrese el saldo de su cuenta");
        SaldoCuenta = leer.nextInt();
        return new Cuenta (numCuenta, DNI, SaldoCuenta);
    }
    
     public void ingreso (Cuenta c1){
         int ingreso, saldo=0;
         System.out.println("Ingrese el monto a depositar");
         ingreso = leer.nextInt();
// int ing = (int) ingreso;
     
        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
       // saldoActual = saldoActual + ing;
    }
     
     public void SaldoActual(Cuenta c1) {
         System.out.println("Su saldo actual es "+c1.getSaldoActual());
    }
     
     public void retirar(Cuenta c1) {
        // int ing = (int) ingreso;
         System.out.println("Ingrese el monto a retirar");
         int retiro = leer.nextInt();
        if (c1.getSaldoActual() < retiro) {
            System.out.println("No cuenta con dinero suficiente en la cuenta");
            c1.setSaldoActual(0);
        } else {
            c1.setSaldoActual(c1.getSaldoActual()-retiro);
            // saldoActual = saldoActual + ing; 
        }

    }
     
      public void extraccionRapida(Cuenta c1) {
        // int ing = (int) ingreso;
        int retiro;
        double porcentaje = c1.getSaldoActual() * 0.2;
        System.out.println("Usted puede retirar hasta $"+porcentaje);
        System.out.println("Ingrese cuanto dinero quiere retirar");
        retiro = leer.nextInt();
          if (retiro <= porcentaje) {
              System.out.println("Retire el dinero");
              c1.setSaldoActual(c1.getSaldoActual()-retiro);
          }else{
              System.out.println("Monto no disponible para retirar");
          }
       
        // saldoActual = saldoActual + ing;

    }
     
}
