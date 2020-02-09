/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.teorico;

import java.util.Scanner;


public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese una cantidad en grados fahrenheit: ");
        float fa=sc.nextFloat();
        
        float celsius=(fa-32)*0.56f;
        
        System.out.println(fa+" grados fahrenheit es: "+celsius+" grados celsius");
       
    }
}
