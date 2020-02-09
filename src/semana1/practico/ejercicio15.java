/*
 9) En un centro de verificación de automóviles se desea saber el promedio
de puntos contaminantes de los primeros 25 automóviles que lleguen. Asimismo
se desea saber los puntos contaminantes del carro que menos contamino y del
que mas contamino.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[25];
        int suma=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ingrese puntos de contaminacion de vehiculo "+(i+1));
            arr[i]=sc.nextInt();
            suma+=arr[i];
        }
        int men,may;
        may=men=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>may){
                may=arr[i];
            }else if(arr[i]<men){
            
                men=arr[i];
            }
        }
        System.out.println("el promedio de contaminacion es "+suma/25);
        System.out.println("el que mas contamino es: "+may);
        System.out.println("el que menos contamino es: "+men);
    }
}
