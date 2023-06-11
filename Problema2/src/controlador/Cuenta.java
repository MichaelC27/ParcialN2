/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author dbpan
 */
public class Cuenta {
    private int NumCuenta;
    private String NomCliente;
    private double saldo;
    public Cuenta (){}
    public Cuenta (int NumCuenta,String NomCliente, double saldo){
       this.NumCuenta = NumCuenta;
       this.NomCliente = NomCliente;
       this.saldo = saldo;
   }
    Component rootPane = null;

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double monto) {
        this.saldo = monto + this.saldo;
    }
    public void consultarDatos() {
       
       JOptionPane.showMessageDialog(rootPane, "El Nombre del cliente es: "+ this.NomCliente + "\n"+"El numero de cuenta es: "+this.NumCuenta+"\n"+"El saldo es: "+this.saldo);
    }
    
   
    
    public void retirar(double monto) {
       if (monto > this.saldo){
           JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente. No se puede realizar el retiro");
       }else{
           this.saldo =  this.saldo - monto;
           JOptionPane.showMessageDialog(rootPane, "Retiro realizado con éxito");
       }
    }

}
