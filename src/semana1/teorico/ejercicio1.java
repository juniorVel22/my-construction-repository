/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.teorico;

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero");
        String num=sc.nextLine();
        int result=0;
        for (int i = 0; i <num.length(); i++) {
           result+=Character.getNumericValue(num.charAt(i));
        }
        System.out.println("la suma de "+num+ " es "+result);
        
    }
}
