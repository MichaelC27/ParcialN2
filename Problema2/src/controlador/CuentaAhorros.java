/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Date;

/**
 *
 * @author dbpan
 */
public class CuentaAhorros extends Cuenta {

    private Date fechaVencimiento;
    private double interesMensual;

    public CuentaAhorros() {
    }

    public CuentaAhorros(int NumCuenta, String NomCliente, double saldo, Date fechaVencimiento, double interesMensual) {
        super(NumCuenta, NomCliente, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.interesMensual = interesMensual;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    public void depositarIntereses() {
        double interes = interesMensual / 100;
        double intereses = getSaldo() * interes;
        depositar(intereses);
    }
}
