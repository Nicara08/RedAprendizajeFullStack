
package Entidad;

import Enum.EnumVehiculos;

/**
 Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.)
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String nroMotor;
    private String chasis;
    private String color;
    private EnumVehiculos tipo;
    private Poliza poliza;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String nroMotor, String chasis, String color, EnumVehiculos tipo, Poliza poliza) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nroMotor = nroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", nroMotor=" + nroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", poliza=" + poliza + '}';
    }
    
    
}
