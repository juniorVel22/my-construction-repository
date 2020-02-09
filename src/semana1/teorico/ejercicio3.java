/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.teorico;

import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
//        System.out.println(34658%1000);
//        System.out.println(658%10);
//        System.out.println(8/100);



        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int num=sc.nextInt();
        int metros=num/1000;
        num=num%1000;
        int decimetros=num/100;
        num=num%100;
        int centimetros=num/10;
        num=num%10;
        int milimetros=num/1000;
        
        System.out.println(metros+"m "+decimetros+"d "+centimetros+"c "+milimetros+"m");
    }
}
