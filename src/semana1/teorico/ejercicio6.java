
package semana1.teorico;

import java.util.Scanner;


public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad de horas: ");
        int horas=sc.nextInt();
        int minutos=horas*60;
        int segudos=minutos*60;
        
        System.out.println(horas+" horas="+ minutos+"min "+segudos+"seg");
    }
}
