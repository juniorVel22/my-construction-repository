/*
 15) El Depto. de Seguridad Publica y Transito del D.F. desea saber, de los n autos
que entran a la ciudad de México, cuantos entran con calcomanía de cada color. Conociendo
el ultimo dígito de la placa de cada automóvil se puede determinar el color de la calcomanía
utilizando la sig. relación:
    DÍGITO      COLOR
    1 o 2       amarilla
    3 o 4       rosa
    5 o 6       roja
    7 o 8       verde
    9 o 0       azul
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de autos:");
        int n=sc.nextInt();
        int autos[]=new int[n];
        
        for (int i = 0; i < autos.length; i++) {
            System.out.println("ingrese el utilo digito de la placa: ");
            int digito=sc.nextInt();
            if(digito==1 || digito==2){
                System.out.println("calcomania AMARILLO");
            }else if(digito==3 || digito==4){
                System.out.println("calcomania ROSA");
            }else if(digito==5 || digito==6){
                System.out.println("calcomania ROJA");
            }else if(digito==7 || digito==8){
                System.out.println("calcomania VERDE");
            }else if(digito==9 || digito==0){
                System.out.println("calcomania AZUL");
            }
        }
    }
}
