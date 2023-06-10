/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dbpan
 */
public class rectangulo extends figura {
   private double largo;
   private double ancho;
   public rectangulo (){}
   public rectangulo (double largo, double ancho){
       this.largo = largo;
       this.ancho  = ancho;
   }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


   
    public double CalcularArea(){
      return (this.ancho * this.largo); 
   }
}
