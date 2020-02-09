/*
 24) En una tienda de descuento las personas que van a pagar el importe de su 
compra llegan a la caja y sacan una bolita de color, que les dirá que descuento
tendrán sobre el total de su compra. Determinar la cantidad que pagara cada cliente
desde que la tienda abre hasta que cierra. Se sabe que si el color de la bolita
es roja el cliente obtendrá un 40% de descuento; si es amarilla un 25% y si es 
blanca no obtendrá descuento.
 */
package semana1.practico;

import java.util.Scanner;




public class ejercicio24 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ingresa cantidad de clientes que pasaron durante el dia: ");
        int n=sc.nextInt();
        float importe,des,des1,pago1,pago2;
        float suma=0;
        while(n>0){
            System.out.println("ingrese importe de compra: ");
            importe=sc.nextFloat();
            int descuento=(int)((Math.random()*(3-1))+1);//(max - min)) + min);
            
            if(descuento==1){
                System.out.println("le toco bola AMARILLA -25%");
                des=importe*(0.25f);
                pago1=importe-des;
                suma+=pago1;
                System.out.println("debe pagar: "+pago1+"$");
            }else if(descuento==2){
                System.out.println("le toco bola ROJA -50%");
                des1=importe*(0.5f);
                pago2=importe-des1;
                suma+=pago2;
                System.out.println("debe pagar: "+pago2+"$");
            }
            
            n--;
        }
        
        System.out.println("el total de ingresos es: "+suma+"$");
        
    }
}
