/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.teorico;

import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese a:");
        double a=sc.nextDouble();
        System.out.print("ingrese b:");
        double b=sc.nextDouble();
        
        double c=((4*Math.pow(a, 2))+(3*b*a)+(Math.pow(b, 2)))/((Math.pow(a, 2))-(Math.pow(b, 2)));
        
        double d=((3*Math.pow(c, 2)+a+b))/4;
        
        System.out.println("c= "+c+" d= "+d);
    }
}
