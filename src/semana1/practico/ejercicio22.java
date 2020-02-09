/*
 21) En un supermercado un cajero captura los precios de los artículos que 
los clientes compran e indica a cada cliente cual es el monto de lo que deben pagar.
Al final del día le indica a su supervisor cuanto fue lo que cobro en total a todos 
los clientes que pasaron por su caja.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio22 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ingrese cantidad de clientes que pasaron durante el dia: ");
        n=sc.nextInt();
        float ingresos=0.0f;
        int i=0,cantP;
        float precioP,montoDeCompra;
        while(n>0){
            System.out.println("cliente: "+(i+1));
            System.out.println("ingresa cantidad:");
            cantP=sc.nextInt();
            System.out.println("ingresa precio $:");
            precioP=sc.nextFloat();
            montoDeCompra=cantP*precioP;
            System.out.println("usted debe pagar: "+montoDeCompra+"$");
            
            ingresos+=montoDeCompra;
            i++;
            n--;
            
   
        }
        System.out.println("los ingresos durante el dia fueron: "+ingresos+"$");
        
    }
}
