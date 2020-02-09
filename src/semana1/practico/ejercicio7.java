/*
 16) Obtener el promedio de calificaciones de un grupo de n alumnos.
 */
package semana1.practico;

import java.util.Scanner;



public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de alumnos:");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        int nota1,nota2,nota3;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ingrese nombre del alumno "+(i+1)+":");
            String nombre=sc.next();
            System.out.println("ingrese notas: ");
            nota1=sc.nextInt();
            nota2=sc.nextInt();
            nota3=sc.nextInt();
            
            double promedio=(nota1+nota2+nota3)/3;
            
            System.out.println("el alumno "+nombre+" tiene un promedio de "+promedio);
            
        }
    }
}
