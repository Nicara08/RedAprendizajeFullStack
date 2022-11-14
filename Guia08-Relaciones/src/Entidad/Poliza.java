
package Entidad;

import java.util.Date;

/**
 Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
12
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */
public class Poliza {
    private int nroPoliza;
    private Date fechaInicio;
    private Date fechaFinal;
    private Cuotas infoCuotas;
    private String formaPago;
    private float montoAsegurado;
    private String granizo;
    private float montoGranizo;
    private String tipoCobertura;
    

    public Poliza() {
    }

    public Poliza(int nroPoliza, Date fechaInicio, Date fechaFinal, Cuotas infoCuotas, String formaPago, float montoAsegurado, String granizo, float montoGranizo, String tipoCobertura) {
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.infoCuotas = infoCuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

 
    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Cuotas getCantCuotas() {
        return infoCuotas;
    }

    public void setCantCuotas(Cuotas cantCuotas) {
        this.infoCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public float getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(float montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public String getGranizo() {
        return granizo;
    }

    public void setGranizo(String granizo) {
        this.granizo = granizo;
    }

    public float getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(float montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }


    @Override
    public String toString() {
        return "Poliza{" + "nroPoliza=" + nroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", cantCuotas=" + infoCuotas + ", formaPago=" + formaPago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    

    
    
}
