/*
 18) Calcular el promedio de edades de hombres, mujeres y de todo un grupo de alumnos.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de personas");
        int n=sc.nextInt();
        int edad,edadH,edadM,cantH,cantM;
        int promH, promM;
        String sexo;
        edadH=0;
        edadM=0;
        cantH=0;
        cantM=0;
        
        while(n>0){
            System.out.println("Escribe 'H' si es varon y 'M' si es mujer: ");
            sexo=sc.next();
            System.out.println("ingresa edad: ");
            edad=sc.nextInt();
            
            if(sexo.equalsIgnoreCase("H")){
                edadH+=edad;
                cantH+=1;
            }else if(sexo.equalsIgnoreCase("M")){
                edadM+=edad;
                cantM+=1;
            }else{
                System.out.println("letra incorrecta ingrese correctamente: ");
                n++;
            }
            n--;
        }
        promM=edadM/cantM;
        promH=edadH/cantH;
        
        System.out.println("hay "+cantH+" hombres, el promedio de la edad de los hombres es: " +promH+" años");
        System.out.println("hay "+cantM+" mujeres, el promedio de la edad de las mujeres es: " +promM+" años");
    }
}
