package Servicio;

import Entidad.Cliente;
import Entidad.Cuotas;
import Entidad.Poliza;
import Entidad.Vehiculo;
import Enum.EnumVehiculos;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a
 * contar que te ha contratado “La Tercera Seguros”, una empresa aseguradora que
 * brinda a sus clientes coberturas integrales para vehículos. Luego de un
 * pequeño relevamiento, te vamos a pasar en limpio los requerimientos del
 * sistema que quiere realizar la empresa. 12 a. Gestión Integral de clientes.
 * En este módulo vamos a registrar la información personal de cada cliente que
 * posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
 * domicilio, teléfono. b. Gestión de vehículos. Se registra la información de
 * cada vehículo asegurado. Marca, modelo, año, número de motor, chasis, color,
 * tipo (camioneta, sedán, etc.). c. Gestión de Pólizas: Se registrará una
 * póliza, donde se guardará los datos tanto de un vehículo, como los datos de
 * un solo cliente. Los datos incluidos en ella son: número de póliza, fecha de
 * inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
 * asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total,
 * contra terceros, etc.). Nota: prestar atención al principio de este enunciado
 * y pensar en las relaciones entre clases. Recuerden que pueden ser de uno a
 * uno, de uno a muchos, de muchos a uno o de muchos a muchos. d. Gestión de
 * cuotas: Se registrarán y podrán consultar las cuotas generadas en cada
 * póliza. Esas cuotas van a contener la siguiente información: número de cuota,
 * monto total de la cuota, si está o no pagada, fecha de vencimiento, forma de
 * pago (efectivo, transferencia, etc.). Debemos realizar el diagrama de clases
 * completo, teniendo en cuenta todos los requerimientos arriba descriptos.
 * Modelando clases con atributos y sus correspondientes relaciones.
 */
public class ServicioSeguros {

    Scanner leer = new Scanner(System.in);
    Cliente c1;
    Poliza p1;
    Cuotas cuo1;
    HashSet<Cliente> listaClientes = new HashSet();
    HashSet<Poliza> listaPoliza = new HashSet();
    HashSet<Vehiculo> listaVehiculos = new HashSet();

    public void menuSeguro() {
        System.out.println("--------------------------------");
        System.out.println("BIENVENIDO AL SISTEMA DE SEGUROS");
        System.out.println("--------------------------------");
        System.out.println("1. Alta de cliente");
        System.out.println("2. Consultar clientes");
        System.out.println("3. Consultar Cuotas");
        System.out.println("4. Salir");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                c1 = altaCliente();
                listaVehiculos.add(altaVehiculo());
                c1.setVehiculos(listaVehiculos);
                listaClientes.add(c1);
                break;
            case 2:
                System.out.println(c1.toString());
                break;
            case 3:
                System.out.println(c1.toString());
                break;
            case 4:
                System.out.println("");
                System.out.println("Muchas gracias!");
                System.out.println("");
        }
            if (opc!=4) {
            menuSeguro();
        }

    }

    public Cliente altaCliente() {
        System.out.println("");
        System.out.println("Ingrese su Nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Ingrese su DNI");
        String dni = leer.next();
        System.out.println("Ingrese su mail");
        String mail = leer.next();
        System.out.println("Ingrese su domicilio");
        String domicilio = leer.next();
        System.out.println("Ingrese su telefono");
        String telefono = leer.next();

        return new Cliente(nombre, apellido, dni, mail, domicilio, telefono);

    }

    public Vehiculo altaVehiculo() {
        System.out.println("");
        System.out.println("Ingrese la marca del auto");
        String marca = leer.next();
        System.out.println("Ingrese el modelo");
        String modelo = leer.next();
        System.out.println("Ingrese el año del vehiculo");
        int anio = leer.nextInt();
        System.out.println("Ingrese el numero del motor");
        String nroMotor = leer.next();
        System.out.println("Ingrese numero de chasis");
        String chasis = leer.next();
        System.out.println("Ingrese el color del vehiculo");
        String color = leer.next();
        System.out.println("Tipo de vehiculo");
        String tipo = leer.next();
        while (!tipo.equalsIgnoreCase("camioneta") && !tipo.equalsIgnoreCase("sedan") && !tipo.equalsIgnoreCase("moto")) {
            System.out.println("Tipo de vehiculo");
            tipo = leer.next();
        }
        p1 = altaPoliza();
        return new Vehiculo(marca, modelo, anio, nroMotor, chasis, color, tipo, p1);

    }

    public Poliza altaPoliza() {
        float montoGranizo = 0;
        System.out.println("Complete los datos de la poliza");
        System.out.println("Ingrese nuemero de poliza");
        int nroPoliza = leer.nextInt();
        System.out.println("Ingrese año, mes y dia de inicio");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date d1 = new Date(anio, mes - 1, dia);
        System.out.println("Ingrese la fecha de finalizacion");
        int anio2 = leer.nextInt();
        int mes2 = leer.nextInt();
        int dia2 = leer.nextInt();
        Date d2 = new Date(anio2, mes2 - 1, dia2);
        System.out.println("Ingrese forma de pagos");
        String formaPago = leer.next();
        System.out.println("Ingrese monto asegurado");
        float montoAsegurado = leer.nextFloat();
        System.out.println("Ingrese si incluye granizo. S o N");
        String granizo = leer.next();
        if (granizo.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el monto asegurado por granizo");
            montoGranizo = leer.nextFloat();
        }
        System.out.println("ingrese el tipo de cobertura. 1.Total o 2.contra tercerceros");
        String tipoCobertura = leer.next();
        while (!tipoCobertura.equalsIgnoreCase("1") && !tipoCobertura.equalsIgnoreCase("2")) {
            System.out.println("ingrese 1 o 2");
            tipoCobertura = leer.next();
        }
        cuo1 = altaCuotas();

        return new Poliza(nroPoliza, d1, d2, cuo1, formaPago, montoAsegurado, granizo, montoGranizo, tipoCobertura);
    }

    public Cuotas altaCuotas() {
        System.out.println("");
        System.out.println("Ingrese numero de cuotas");
        int nroCuotas = leer.nextInt();
        System.out.println("Ingrese el valor de la cuota");
        float montoCuota = leer.nextFloat();
        System.out.println("Año, mes y dia de vencimiento");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date d1 = new Date(anio, mes - 1, dia);
        System.out.println("Forma de pago?");
        String formaPago = leer.next();
        return new Cuotas(nroCuotas, montoCuota, formaPago, d1, formaPago);

    }
}
