/*
 3) Calcular la suma de 1+ 1/(2!) + 1/(3!) + 1/(4!) + .... + 1/(n!) para un n dado.
Escriba el programa de tres formas diferentes: usando Repita mientras, Repita hasta y Repita para.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio18 {
    static Scanner sc=new Scanner(System.in);
    static public void factorial(int n){
        int fac=1;
        float suma=0.0f;        
        for(int i=1;i<=n;i++){     
            
            fac*=i;              
            suma+=(float)(1/fac);                       
        }                        
        System.out.println("Rpta: "+fac);                
        System.out.println("La suma es: " + suma);
    }
                  
    public static void main(String[] args) {
        System.out.println("ingrese n: ");
        int n=sc.nextInt();
        factorial(n);
    }
    
}
