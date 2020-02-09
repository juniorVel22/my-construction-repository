/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.teorico;

import java.util.Scanner;


public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese 4 numeros:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        
        int suma=num1+num2+num3+num4;
        System.out.println(suma+ " es el 100%");
        
        double num1Porcentaje=(double)(num1*100)/suma;
        double num2Porcentaje=(double)(num2*100)/suma;
        double num3Porcentaje=(double)(num3*100)/suma;
        double num4Porcentaje=(double)(num4*100)/suma;
        
        double total=num1Porcentaje+num2Porcentaje+num3Porcentaje+num4Porcentaje;
        System.out.println(total);
        System.out.println(num1Porcentaje+"% "+num2Porcentaje+"% "+num3Porcentaje+"% "+num4Porcentaje+"%");
    }
}
