/*
 4) Imprimir la tabla de multiplicar del número N
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la tabla del numero que quiera");
        int num=sc.nextInt();
        //int cont=0;
        for (int i = 0; i <= 12; i++) {
            
            System.out.println(num+"*"+i+"="+num*i);
        }
        
    }
}
