/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

/**
 *
 * Se deberá en métodos independientes: • Verificar que el año ingresado por el
 * usuario este entre 1900 y 2021, caso contrario, el año tomara el valor por
 * defecto. • Conocer la cantidad de días totales que tiene el mes elegido por
 * el usuario. EJ: USTED INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días • Mostrar
 * día anterior a la fecha ingresada (Hay que considerar que sucede con inicio
 * de cada mes) • Mostrar día posterior a la fecha ingresada (Hay que considerar
 * que sucede con fin de cada mes) • Crear un método para verificar si el año
 * ingresado es bisiesto
 */
public class ServicioFecha {

    Scanner leer = new Scanner(System.in);
    int anio, mes, dia;

    public void ingresoFecha(Fecha f1) {
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        if (anio >= 1900 && anio <= 2021) {
            f1.setAnio(anio);
        }
        System.out.println("");
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.println("");
            System.out.println("Mes ingresado incorrecto, vuelva a intentar");
            mes = leer.nextInt();
        }
        f1.setMes(mes);
        switch (mes) {
            case 1:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de enero y tiene 31 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 31 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 2:
                if (anioBisiesto(f1) == true) {
                    System.out.println("");
                    System.out.println("El mes " + mes + " corresponde al mes de febrero y tiene 29 dias por ser año bisiesto\n");
                    System.out.println("Ingrese un dia");
                    dia = leer.nextInt();
                    while (dia > 29 && dia < 1) {
                        System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                        dia = leer.nextInt();
                    }
                    f1.setDia(dia);
                    break;
                } else {
                    System.out.println("");
                    System.out.println("El mes " + mes + " corresponde al mes de febrero y tiene 28 dias\n");
                    System.out.println("Ingrese un dia");
                    dia = leer.nextInt();
                    while (dia > 28 && dia < 1) {
                        System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                        dia = leer.nextInt();
                    }
                    f1.setDia(dia);
                    break;
                }
            case 3:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de marzo y tiene 31 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 31 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 4:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de abril y tiene 30 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 30 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 5:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de mayo y tiene 31 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 31 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 6:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de junio y tiene 30 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 30 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 7:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de julio y tiene 31 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 31 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 8:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de agosto y tiene 31 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 31 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 9:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de septiembre y tiene 30 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 30 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 10:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de octubre y tiene 31 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 31 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 11:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de noviembre y tiene 30 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 30 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
            case 12:
                System.out.println("");
                System.out.println("El mes " + mes + " corresponde al mes de diciembre y tiene 31 dias\n");
                System.out.println("Ingrese un dia");
                dia = leer.nextInt();
                while (dia > 31 && dia < 1) {
                    System.out.println("Dia ingresado incorrecto, vuelva a intentar");
                    dia = leer.nextInt();
                }
                f1.setDia(dia);
                break;
        }

    }

    public boolean anioBisiesto(Fecha f1) {
        if (f1.getAnio() % 4 == 0) {
            if (f1.getAnio() % 100 == 0) {
                if (f1.getAnio() % 400 == 0) {
                    System.out.println("");
                    System.out.println("El año ingresado " + f1.getAnio() + " es bisiesto");
                    return true;
                } else {
                    System.out.println("");
                    System.out.println("El año ingresado " + f1.getAnio() + " no es bisiesto");
                    return false;
                }
            } else {
                System.out.println("");
                System.out.println("El año ingresado " + f1.getAnio() + " es bisiesto");
                return true;
            }
        } else {
            System.out.println("");
            System.out.println("El año ingresado " + f1.getAnio() + " no es bisiesto");
            return false;
        }

    }

    public void fechaAnterior(Fecha f1) {
        int dia;
        System.out.println("");
        System.out.println("La fecha ingresada fue " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio() + "\n");
        if (f1.getDia() > 1) {
            System.out.println("La fecha anterior es " + (f1.getDia() - 1) + "/" + f1.getMes() + "/" + f1.getAnio() + "\n");
        } else if (f1.getMes() > 1) {
            dia = diasMes(f1.getMes(), f1);
            System.out.println("La fecha anterior es " + dia + "/" + (f1.getMes() - 1) + "/" + f1.getAnio() + "\n");
        } else {
            dia = diasMes(f1.getMes(), f1);
            System.out.println("La fecha anterior es " + dia + "/" + 12 + "/" + (f1.getAnio() - 1) + "\n");
        }

    }

    public void fechaPosterior(Fecha f1) {
        int dias;
        System.out.println("");
        System.out.println("La fecha ingresada fue " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio() + "\n");
        dias = diasMes(f1.getMes(), f1);
        if (f1.getDia() == dias & f1.getMes() < 12) {
            System.out.println("La fecha posterior es " + 1 + "/" + (f1.getMes() + 1) + "/" + f1.getAnio() + "\n");
        } else if (f1.getDia() == dias & f1.getMes() == 12) {
            System.out.println("La fecha posterior es " + 1 + "/" + 1 + "/" + (f1.getAnio()+1) + "\n");
        } else{
            System.out.println("La fecha posterior es " + (f1.getDia()+1) + "/" + f1.getMes() + "/" + f1.getAnio() + "\n");
        }
    }

    public int diasMes(int mes, Fecha f1) {
        int aux = 0;
        switch (mes) {
            case 1:
                return 31;
            case 2:
                if (anioBisiesto(f1) == true) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return aux;
    }
}
