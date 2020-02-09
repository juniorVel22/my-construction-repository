/*
 27) Determinar la cantidad semanal de dinero que recibirá cada uno de los n obreros
de una empresa. Se sabe que cuando las horas que trabajo un obrero exceden de 40, el
resto se convierte en horas extras que se pagan al doble de una hora normal, cuando 
no exceden de 8; cuando las horas extras exceden de 8 se pagan las primeras 8 al doble
de lo que se paga por una hora normal y el resto al triple.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el pago por hora: ");
        int pph=sc.nextInt();
        System.out.println("ingrese cantidad de obreros: ");
        int n=sc.nextInt();
        
        int horas,horasE,horasE1;
        float pagoH,pagoH1,pagoH2;
        int i=0;
        
        while(n>0){
            System.out.println("ingrese horas del obrero: "+(i+1));
            horas=sc.nextInt();
            if(horas<=40){
                pagoH=(float)horas*pph;
                System.out.println("Ustede gano "+pagoH);
            }
            else if(horas>40&&horas<=48){
                
                horasE=horas-40;
                pagoH1=(float)(40*pph)+(horasE*(pph*2));
                System.out.println("usted gano: "+pagoH1);
                
            }else if(horas>48){
                horasE1=horas-48;
                pagoH2=(float)(40*pph)+(8*(pph*2)+(horasE1*(pph*3)));
                System.out.println("usted gano : "+pagoH2);
            }
            i++;
            n--;
            
        }
    }
}
