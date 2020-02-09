/*
 13) En una empresa se requiere calcular el salario semanal de cada uno de los n
obreros que laboran en ella. El salario se obtiene de la sig. forma:
Si el obrero trabaja 40 horas o menos se le paga $20 por hora
Si trabaja mas de 40 horas se le paga $20 por cada una de las primeras 
40 horas y $25 por cada hora extra.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de obreros:");
        int n=sc.nextInt();
        int obreros[]=new int[n];

        for (int i = 0; i < obreros.length; i++) {
           
            System.out.println("ingrese nombre del obrero");
            String nom=sc.next();
            System.out.println("ingrese horas:");
            int horas=sc.nextInt();
            if(horas<=40){
                int pago=20*horas;
                System.out.println("el pago del señor "+nom+" es:"+pago);
            }else{
                
                int horasExtra=horas-40;
                int pago2=(40*20)+(horasExtra*25);
                System.out.println("el pago del señor: "+nom+" es:"+pago2);
            }
        }
    }
}
