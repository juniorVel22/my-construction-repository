/*
 30) Una persona que va de compras a la tienda “Enano, S.A.”, decide llevar un control sobre 
lo que va comprando, para saber la cantidad de dinero que tendrá que pagar al llegar
a la caja. La tienda tiene una promoción del 20% de descuento sobre aquellos artículos
cuya etiqueta sea roja. Determinar la cantidad de dinero que esta persona deberá pagar.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingresar numero de productos:");
        int n=sc.nextInt();
        int cantidad;
        float precio;
        int etiqueta;
        float descuento;
        float pagoT=0;
        int i=0;
        while(n>i){
            
            System.out.println("ingrese precio del producto: "+(i+1));
            
            precio=sc.nextFloat();
            System.out.println("cantidad del producto: "+(i+1));
            cantidad=sc.nextInt();
            
            etiqueta=(int)(Math.random()*(3-1)+1);
            
            if(etiqueta==1){
                System.out.println("etiqueta roja -20%");
                descuento=(float)(precio*(0.2f))*cantidad;
                precio=(precio*cantidad)-descuento;
                pagoT+=(float)precio;
            }else{
               precio=cantidad*precio;
               pagoT+=precio;
            }
            
            i++;
        }
        
        System.out.println("pago total es:"+ pagoT+"$");
    }
}
