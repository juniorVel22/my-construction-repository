/*
 14) Determinar cuantos hombres y cuantas mujeres se encuentran en un grupo
de n personas, suponiendo que los datos son extraídos alumno por alumno.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma, diferencia;
        suma=0;
        diferencia=0;
        String sexo;
        
        System.out.println("ingrese el numero de personas: ");
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("escriba 'M' si es varon, '' si es mujer: ");
            sexo=sc.next();
            
            if(sexo.equalsIgnoreCase("M")){
                suma+=1;
            }else if(sexo.equalsIgnoreCase("F")){
                diferencia+=1;
            }else if(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")){
                System.out.println("sexo no valido");
                n++;
            }
            
            
            
        }
        System.out.println("hay : "+suma+" varones ");
        System.out.println("hay : "+diferencia+" mujeres");
    }
}
