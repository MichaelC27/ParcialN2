/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dbpan
 */
public class circunferencia extends figura {
   private double radio;
   public circunferencia (){}
   public circunferencia (double radio){
       this.radio = radio;
   }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double CalcularArea(){
     return Math.PI * Math.pow(this.radio, 2);
    }
}
