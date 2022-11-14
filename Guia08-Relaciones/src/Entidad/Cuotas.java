/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
public class Cuotas {
    private int nroCuotas;
    private float montoCuota;
    private String pago;
    private Date fechaVencimiento;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(int nroCuotas, float montoCuota, String pago, Date fechaVencimiento, String formaPago) {
        this.nroCuotas = nroCuotas;
        this.montoCuota = montoCuota;
        this.pago = pago;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(int nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public float getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(float montoCuota) {
        this.montoCuota = montoCuota;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "nroCuotas=" + nroCuotas + ", montoCuota=" + montoCuota + ", pago=" + pago + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
    
    
}
