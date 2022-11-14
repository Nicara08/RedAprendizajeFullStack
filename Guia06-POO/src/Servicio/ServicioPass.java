/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 * Crear una clase Pass, donde declaremos los siguientes atributos: • pass : Del
 * tipo String • nombre: Del tipo String • dni: Del tipo int. Métodos para
 * desarrollar: • Ingresar datos de usuarios (usando el constructor. HACER
 * INGRESO DE DATOS FIJOS (no por teclado) •  *
 * •
 * •
 */
public class ServicioPass {

    Scanner leer = new Scanner(System.in);

//    Crear un método para ingresar una contraseña (crearPass). En este método, debemos
//validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
//Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
    public void crearPass(Pass p1) {
        String pass;
        int longitud;

        do {
            System.out.println("");
            System.out.println("Ingrese contraseña nueva");
            pass = leer.next();
            longitud = pass.length();
        } while (longitud != 10);

        p1.setPass(pass);
    }

//    • Crear un método para analizar la contraseña(analizarPass). Donde:
//o SI Existe al menos una letra z : Es nivel MEDIO
//o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
//o Si ninguna condición se cumple es nivel BAJO
    public void analizarPass(Pass p1) {
        int contadorZ = 0, contadorA = 0;

        for (int i = 0; i < 10; i++) {
            if (p1.getPass().substring(i, i + 1).equals("z")) {
                contadorZ += 1;
            }
            if (p1.getPass().substring(i, i + 1).equals("a")) {
                contadorA += 1;
            }
        }
        if (contadorZ == 1 && contadorA <= 1) {
            System.out.println("el nivel de seguridad de la contraseña es MEDIA\n");
        } else if (contadorZ > 1 && contadorA >= 2) {
            System.out.println("el nivel de seguridad de la contraseña es ALTA\n");
        } else {
            System.out.println("el nivel de seguridad de la contraseña es BAJA\n");
        }

    }

//     Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
//debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
//acceso a modificar los datos.
    public void cambiarNombre(Pass p1) {
        String nombre;
        System.out.println("Ingre nombre de usario nuevo");
        nombre = leer.next();
        System.out.println("Nombre de usuario cambiado con exito\n");
        p1.setNombre(nombre);

    }

//    A través de un menú de opciones:
//o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
//contraseña valida).
//o B) Mensaje al usuario que tipo de NIVEL es su contraseña
//o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
//dar permiso
//o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
//SINO impedir cambios
//o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
//SINO impedir cambios
    public void menuOpciones(Pass p1) {
        String pass;
        String opc="";
        int DNI;

        System.out.println("---------------------");
        System.out.println("Ingrese su contraseña\n");
        pass = leer.next();

        while (!pass.equals(p1.getPass())) {
            System.out.println("");
            System.out.println("Contraseña incorrecta, vuelva a intentar\n");
            pass = leer.next();
        }
        System.out.println("Contraseña correcta!\n");        
        do {
            System.out.println("-------------------------");
            System.out.println("  BIENVENIDO AL SISTEMA");
            System.out.println("-------------------------");
            System.out.println("A. Nivel de su contraseña");
            System.out.println("B. Modificar contraseña");
            System.out.println("C. Modificar nombre");
            System.out.println("D. Modificar DNI");
            System.out.println("E. Salir del sistema");
            System.out.println("-------------------------\n");
            opc = leer.next().toUpperCase();
            while (!opc.equals("A") && !opc.equals("B") && !opc.equals("C") &&!opc.equals("D") && !opc.equals("E")) {
                System.out.println("Opcion incorrecta, vuelva a intentar\n");
                opc = leer.next();
            }
            
            switch (opc) {
                case "A":
                    System.out.println("");
                    analizarPass (p1);
                    break;
                case "B":
                    System.out.println("");
                    System.out.println("Ingrese su contraseña para poder cambiarla");
                    pass = leer.next();
                    while (!pass.equals(p1.getPass())) {
                        System.out.println("Contraseña incorrecta, vuelva a intentar");
                        pass = leer.next();
                    }
                    System.out.println("Contraseña correcta\n");
                    crearPass (p1);
                    break;
                case "C":
                    System.out.println("");
                    System.out.println("Ingrese su contraseña para poder cambiar su usuario");
                    pass = leer.next();
                    while (!pass.equals(p1.getPass())) {
                        System.out.println("Contraseña incorrecta, vuelva a intentar");
                        pass = leer.next();
                    }
                    System.out.println("Contraseña correcta\n");
                    cambiarNombre (p1);
                    break;
                case "D":
                    System.out.println("");
                    System.out.println("Ingrese su contraseña para poder cambiar su DNI");
                    pass = leer.next();
                    while (!pass.equals(p1.getPass())) {
                        System.out.println("Contraseña incorrecta, vuelva a intentar");
                        pass = leer.next();
                    }
                    System.out.println("Contraseña correcta\n");
                    System.out.println("Ingrese el cambio de DNI");
                    DNI = leer.nextInt();
                    p1.setDni(DNI);
                    break;
            }
            
        } while (!opc.equals("E"));
        System.out.println("");
        System.out.println("MUCHAS GRACIAS\n");
    }
}
