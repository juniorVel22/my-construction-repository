/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5.teorico;

interface Ifigura{
    int calcularArea();
    int calcularPerimetro();
}
class cuadrado implements Ifigura{
    int lado1;
    public cuadrado(int lado1){
        this.lado1=lado1;
    }
    @Override
    public int calcularArea() {
        return (int)Math.pow(lado1, 2);
    }

    @Override
    public int calcularPerimetro() {
        return lado1*4;
    }
  
    
}
class rectangulo implements Ifigura{
    int lado1, lado2;
    public rectangulo(int lado1,int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    @Override
    public int calcularArea() {
        return lado1*lado2;
    }

    @Override
    public int calcularPerimetro() {
        return (lado1*2)+(lado2*2);
    }
    
}
public class ejercicio1 {
    public static void main(String[] args) {
        cuadrado c=new cuadrado(9);
        System.out.println("area:"+c.calcularArea()+"   perimetro:"+c.calcularPerimetro());
       
        rectangulo r=new rectangulo(6, 9);
        System.out.println("area:"+r.calcularArea()+"   perimetro:"+r.calcularPerimetro());
    }
}
