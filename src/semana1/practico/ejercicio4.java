/*
 7) Escriba un programa que lea un valor entero positivo y determine:
    a) Si el entero es un número primo.
    b) Si el entero es un número de Fibonacci. (Los número de Fibonacci 
    forman una secuencia en la cual cada número es igual a la suma de los 
    dos anteriores, siendo los dos primeros números iguales a 1)
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el numero:");
        int num=sc.nextInt();
        
        int num2=num-1;
        
        while((num%num2)!=0){
            num2--;
        }
        if(num2==1){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
    }
}
