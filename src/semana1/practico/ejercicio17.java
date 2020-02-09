/*
 17) Una persona desea invertir su dinero en un banco, el cual le otorga un 2% de interés.
Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si la ganancia
de cada mes es reinvertida?.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ejercicio17 ej = new ejercicio17();
        System.out.println("ingresa cuanto desea invertir: ");
        double inver=sc.nextDouble();
        ej.inversion(inver);
    }
    public void inversion(double inversion){
        
        double interes = 0.02;        
        double gananciaMensual=0;
        double gananciaAnual=0;
        double nuevoMonto=inversion;
        for(int i=0;i<12;i++){            
            gananciaMensual+=(nuevoMonto*interes);
            gananciaAnual+=gananciaMensual;
            nuevoMonto+=gananciaAnual;
        }        
        System.out.println("La ganancia Anual será: "+gananciaAnual);        
    }
}
