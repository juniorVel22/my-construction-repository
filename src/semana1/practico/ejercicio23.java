/*
 22) Cinco miembros de un club contra la obesidad desean saber cuanto han bajado o subido
de peso desde la ultima vez que se reunieron. Para esto se debe realizar un ritual de 
pesaje en donde cada uno se pesa en diez básculas distintas para así tener el promedio
mas exacto de su peso. Si existe diferencia positiva entre este promedio de peso y el 
peso de la ultima vez que se reunieron, significa que subieron de peso. Pero si la 
diferencia es negativa, significa que bajaron. Lo que el problema requiere es que por
cada persona se imprima un letrero que diga: “SUBIO” o “BAJO” y la cantidad de kilos 
que subió o bajo de peso.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int peso[]=new int[10];
        float sumaP=0;
        float promP;
        float diferencia;
        
        while(n<5){
            
            for (int i = 0; i < peso.length; i++) {
                System.out.println("ingresa peso numero "+(i+1)+" de la persona "+(n+1));
                peso[i]=sc.nextInt();
                sumaP+=peso[i];
                
            }
            
            promP=sumaP/10;
            
            diferencia=promP-peso[9];
            
            if(diferencia>0){
                System.out.println("LA PERSONA "+(n+1)+" SUBIO "+diferencia+" kilos");
            }else if(diferencia<0){
                System.out.println("LA PERSONA "+(n+1)+" BAJO "+ diferencia+" kilos");
            } 
            
            sumaP=0;
            
            n++;
        }
    }
}
