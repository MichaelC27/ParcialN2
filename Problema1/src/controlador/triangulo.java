/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dbpan
 */
public class triangulo extends figura {
    private double altura;
    private double ancho;
   public triangulo (){}
   public triangulo (double altura, double ancho){
       this.altura = altura;
       this.ancho  = ancho;
   }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    
   public double CalcularArea(){
      return (this.ancho * this.altura) / 2; 
   }
}
