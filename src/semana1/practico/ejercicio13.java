/*
 1) Realizar un programa que promedie una lista indeterminada 
de números reales, hasta que se introduzca un número negativo.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, sum, elementos;
        float prom;
        System.out.println("introdusca un numero: ");
        num=sc.nextInt();
        sum=0;
        elementos=0;
        while(num>=0){
            sum+=num;
            elementos++;
            System.out.println("introduzca otro numero: ");
            num=sc.nextInt();
            
        }
        if(elementos==-1){
            System.out.println("imposible promediar");
        }else{
            prom=(float)sum/elementos;
            System.out.println("el promedio es : "+prom );
        }
    }
}
