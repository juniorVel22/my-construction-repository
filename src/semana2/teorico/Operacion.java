/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

/**
 *
 * @author JHUNIOR
 */
public class Operacion {
    
    
    static public int potencia (int x, int y){
        return (int)Math.pow(x, y);
    }
    
    static public int factorial(int x){
        int fact=1;
        for (int i = 1; i < x; i++) {
            fact*=i;
            
            
        }
        return fact;
    }
    static public double raiz(double x){
        return Math.sqrt(x);
        //https://github.com/juniorVel22/hola-mundo.git
    }
       
}

class Principal{
    public static void main(String[] args) {
        System.out.println(Operacion.potencia(2, 29));
        System.out.println(Operacion.factorial(29));
        System.out.println(Operacion.raiz(159));
    }
}
