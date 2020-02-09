/*
 8) Al cerrar un expendio de naranjas, 15 clientes que aun no han pagado recibirán
un 15% de descuento si compran mas de 10 kilos. Determinar cuanto pagara cada
cliente y cuanto percibirá la tienda por esas compras.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese precio por kilo: ");
        int precio=sc.nextInt();
        int kilos;
        float pago,  descuento;
        float ingreso=0;
        for (int i = 0; i < 15; i++) {
            System.out.println("ingrese cantidad de kilos: ");
            kilos=sc.nextInt();
            
            if(kilos>10){
               pago=precio*0.15f;
                System.out.println("usted debe pagar: "+pago);
               descuento=precio-pago;
               System.out.println(descuento);
               ingreso+=pago;
            }else{
                pago=precio*kilos;
                System.out.println("ustede debe pagar: "+pago);
                ingreso+=pago;
            }
            
        }
        System.out.println("cantidad de ingresos: "+ ingreso);
    }
}
