/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dbpan
 */
public class CuentaCheques extends Cuenta {

    private double comisionChequera;
    private double comisionSaldoInsuficiente;

    public CuentaCheques() {
    }

    public CuentaCheques(int NumCuenta, String NomCliente, double saldo, double comisionChequera, double comisionSaldoInsuficiente) {
        super(NumCuenta, NomCliente, saldo);
        this.comisionChequera = comisionChequera;
        this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
    }

    public double getComisionChequera() {
        return comisionChequera;
    }

    public void setComisionChequera(double comisionChequera) {
        this.comisionChequera = comisionChequera;
    }

    public double getComisionSaldoInsuficiente() {
        return comisionSaldoInsuficiente;
    }

    public void setComisionSaldoInsuficiente(double comisionSaldoInsuficiente) {
        this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
    }

    public void retiroChequera(double monto) {
        double comiSal = 0;
        double comiRet = 0;
        if (monto > getSaldo()) {
            comiSal = monto * (this.comisionSaldoInsuficiente / 100);
            setSaldo(getSaldo() - comiSal);
            JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente. No se puede realizar el retiro " + "\n"
                    + " Se le desconto: " + comiSal + " por emisión de cheques sin saldo insuficiente");
        } else {
            comiRet = monto * (this.comisionChequera / 100);
            setSaldo(getSaldo() - comiRet);
            JOptionPane.showMessageDialog(rootPane, "Se desconto: " + comiRet + " por uso de chequera");
        }

    }

}
