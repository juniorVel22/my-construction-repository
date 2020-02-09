/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

class Rectangulo{
    private int lado1,lado2;
    
    public void asignar(int l1,int l2){
        this.lado1=l1;
        this.lado2=l2;
    }
    
    public int calcularArea(){
        return (lado1*lado2);
    }
}
class Triangulo{
    private double base,altura;
    public void asignar(int b,int h){
        this.base=b;
        this.altura=h;
       
    }
    
    public double calcularArea(){
        return (double)(base*altura)/2;
    }
}
class Cuadrado{
    private int lado;
    
    public void asignar(int l){
        this.lado=l;
       
    }
    
    public int calcularArea(){
        return lado=(int)Math.pow(lado, 2);
    }
}
public class figuras {
    public static void main(String[] args) {
        Rectangulo r1=new Rectangulo();
        r1.asignar(9, 6);
        System.out.println(r1.calcularArea());
        
        Triangulo t1=new Triangulo();
        t1.asignar(10, 9);
        System.out.println(t1.calcularArea());
        
        Cuadrado c1=new Cuadrado();
        c1.asignar(9);
        System.out.println(c1.calcularArea());
    }
}
