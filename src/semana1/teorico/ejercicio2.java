/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.teorico;


import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("igrese un numero");
        int num=sc.nextInt();
        int resultado=0;
        int aux=num;
        while(num > 0) {

            resultado += num % 10;

            num = num/ 10;

        }
        System.out.println("la suma de "+aux+" es "+resultado);
       
        
    }
}
