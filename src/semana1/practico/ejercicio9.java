/*
 19) Encontrar el mayor valor de un conjunto de n números dados.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros:");
        int n=sc.nextInt();
        
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingresa num "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        
        int may=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>may){
                may=arr[i];
            }
        }
        System.out.println("el mayor es : "+may);
    }
}
