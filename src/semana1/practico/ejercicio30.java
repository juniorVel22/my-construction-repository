/*
 40) Leer por cada alumno de Diseño estructurado de algoritmos su numero de control
y su calificación en cada una de las 5 unidades de la materia. Al final que escriba
el numero de control del alumno que obtuvo mayor promedio. Suponga que los alumnos 
tienen diferentes promedios.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de alumnos: ");
        int n=sc.nextInt();
        
        int Ncontrol,calificaciones; 
        int sumaCal=0;
        float promedio[]=new float[n];
        
        float may=0.0f;
        
        int controlMayor=0;
        
        int cont=0;
        while(cont<n){
            System.out.println("ingrese numero de control: ");
            Ncontrol=sc.nextInt();
            
            for (int i = 0; i < 5; i++) {
                calificaciones=(int)(Math.random()*(21-0)+0);
                System.out.println(calificaciones);
                sumaCal+=calificaciones;
            }
            
            promedio[cont]=sumaCal/5;
            System.out.println("promedio= "+promedio[cont]);
            
            if(promedio[cont]>may){
                may=promedio[cont];
                controlMayor=Ncontrol;
            }
            
            sumaCal=0;
            cont++;
        }
        
        System.out.println("numero de control: "+controlMayor+" promedio mayor es : "+ may);
        
    }
}
