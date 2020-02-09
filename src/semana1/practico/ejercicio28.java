/*
 41) El profesor de una materia desea conocer la cantidad de sus alumnos que no tienen derecho al examen de nivelación.
Diseñe un algoritmo que lea las calificaciones obtenidas en las 5 unidades por cada
uno de los 40 alumnos y escriba la cantidad de ellos que no tienen derecho al examen de nivelación.
 */
package semana1.practico;

//import java.util.Scanner;


public class ejercicio28 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int calificacion[]=new int[5];
        float sumaCal=0;
        float promedio;
        int noExamen=0;
        int SiEexamen=0;
        int n=0;
        while(n<40){
            System.out.println("ALUMNO: "+(n+1));
            System.out.println("calificaciones :");
            for (int i = 0; i < calificacion.length; i++) {
                
                
                calificacion[i]=(int)(Math.random()*(21-0)+0);
                System.out.println(calificacion[i]);
                sumaCal+=calificacion[i];
            }
            promedio=(float)(sumaCal/5);
            System.out.println("promedio: "+promedio);
            if(promedio<9){
                System.out.println("No tiene derecho");
                SiEexamen+=1;
            }else{
                System.out.println("Tiene derecho");
                noExamen+=1;
            }
            System.out.println();
            sumaCal=0;
            n++;
            
        }
        System.out.println("Alumnos que no tienen derecho al examen de nivelacion: "+noExamen);
        System.out.println("Alumnos que tienen derecho al examen de nivelacion: "+SiEexamen);
    }
}
