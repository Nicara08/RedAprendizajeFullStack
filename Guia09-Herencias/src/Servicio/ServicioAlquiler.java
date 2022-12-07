package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcosMotor;
import Entidad.Velero;
import Entidad.Yate;
import Utilidad.CalculoBarcos;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * • Potencia en CV para barcos a motor. • Potencia en CV y número de camarotes
 * para yates de lujo. Un alquiler se calcula multiplicando el número de días de
 * ocupación (calculado con la fecha de alquiler y devolución), por un valor
 * módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de
 * eslora). En los barcos de tipo especial el módulo de cada barco se calcula
 * sacando el módulo normal y sumándole el atributo particular de cada barco. En
 * los veleros se suma el número de mástiles, en los barcos a motor se le suma
 * la potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 */
public class ServicioAlquiler implements CalculoBarcos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public int calculoAlquiler(Alquiler a1) {
        int meses = a1.getFechaDevolucion().get(Calendar.MONTH) - a1.getFechaAlquiler().get(Calendar.MONTH);
        System.out.println("Los meses de alquiler fueron "+meses);
        int modulo=10;
        
        if (a1.getBarco() instanceof Velero) {
            Velero velero1 = (Velero) a1.getBarco();
            modulo = velero1.getNroMastil() + modulo;
            //System.out.println("Es un velero");
        }else if (a1.getBarco() instanceof BarcosMotor) {
            BarcosMotor barcoMotor1 = (BarcosMotor) a1.getBarco();
            modulo = barcoMotor1.getCV() + modulo;
           //System.out.println("Es un barco a motor");
            
        }else if (a1.getBarco() instanceof Yate) {
            Yate yate1 = (Yate) a1.getBarco();
            modulo = yate1.getCV() + yate1.getNroCamarotes() + modulo;
            //System.out.println("Es un yate");
        }
 
        
        int montoEslora = meses * (a1.getBarco().getEslora()*modulo);
        return montoEslora;
    }

    @Override
    public Alquiler generarAlquiler() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su DNI");
        String dni = leer.next();
        System.out.println("Ingrese el año de inicio");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de inicio");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de inicio");
        int dia = leer.nextInt();
        Calendar fechaInicio = Calendar.getInstance();
        fechaInicio.set(anio, mes-1, dia);
        System.out.println("Ingrese el año de retorno");
        anio = leer.nextInt();
        System.out.println("Ingrese el mes de retorno");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia de retorno");
        dia = leer.nextInt();
        Calendar fechaDevolucion = Calendar.getInstance();
        fechaDevolucion.set(anio, mes-1, dia);
        System.out.println("Ingrese numero de amarre");
        int nroAmarre = leer.nextInt();
        Barco b1;
        b1 = crearBarco();
        return new Alquiler(nombre, dni, fechaInicio, fechaDevolucion, nroAmarre, b1);
    }

    @Override
    public Barco crearBarco() {
        int opc = 0;
        System.out.println("Ingrese la matricula del barco");
        String matricula = leer.next();
        System.out.println("Ingrese la eslora del barco");
        int eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricacion");
        int anioFabricacion = leer.nextInt();
        
        //Barco b1;
        do {
            System.out.println("Ingrese el tipo de barco");
            System.out.println("1. Velero");
            System.out.println("2. A motor");
            System.out.println("3. Yate");
            opc = excepcionIngreso();
            
        } while (opc > 3);
        Barco b1 = null;
        switch (opc) {
            case 1:
                System.out.println("Ingrese la cantidad de mastil");
                int mastil = excepcionIngreso();
                b1 = new Velero (mastil, matricula, eslora, anioFabricacion);
                break;
            case 2:
                System.out.println("Ingrese la potencia del potor en CV");
                int CV = excepcionIngreso();
                b1 = new BarcosMotor (CV, matricula, eslora, anioFabricacion);
                break;
                
            case 3:
                System.out.println("Ingrese la potencia del potor en CV");
                CV = excepcionIngreso();
                System.out.println("Ingrese nro de camarotes");
                int camarote = excepcionIngreso();
                b1 = new Yate (camarote, CV, matricula, eslora, anioFabricacion);
                break;
        }
        
        return b1;

    }
    
    public int excepcionIngreso (){
        int opc=0;
        do {
            try {
                opc = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Error de ingreso "+e.fillInStackTrace());
            }
        } while (opc < 1);
        
        return opc;
    }
}
