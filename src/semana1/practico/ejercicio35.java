/*
 28) En una granja se requiere saber alguna información para determinar el precio
de venta por cada kilo de huevo. Es importante determinar el promedio de calidad 
de las n gallinas que hay en la granja. La calidad de cada gallina se obtiene según la formula:
    calidad = peso de la gallina * altura de la gallina
                    numero de huevos que pone
Finalmente para fijar el precio del kilo de huevo, se toma como base la siguiente tabla:
PRECIO TOTAL DE CALIDAD         PESO POR KILO DE HUEVO
mayor o igual que 15            1.2 * promedio de calidad
mayor que 8 y menor que 15      1.00 * promedio de calidad
menor o igual que 8             0.80 * promedio de calidad
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa cantidad de gallinas: ");
        int n=sc.nextInt();
        int peso,altura,cantH;
        float calidad, promC,precioK;
        float suma=0;
        int i=0;
        
        while(n>i){
            System.out.print("peso: ");
            peso=sc.nextInt();
            System.out.print("altura: ");
            altura=sc.nextInt();
            System.out.print("Huevos: ");
            cantH=sc.nextInt();
            
            calidad=(peso*altura)/cantH;
            suma+=calidad;
            i++;
        }
        
        promC=suma/n;
        System.out.println("promedio calidad: "+promC);
        if(promC==15){
            precioK=(promC)*1.2f;
            System.out.println("el precio por kilo de huevo esta: "+precioK);
        }else if(promC>8&&promC<15){
            precioK=(promC)*1.0f;
            System.out.println("el precio por kilo de huevo esta: "+precioK);
        }else if(promC<=8){
            precioK=(promC)*0.80f;
        }
        
    }
}
