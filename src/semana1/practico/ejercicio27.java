/*
2) Suponga que se piden X soles prestados a un banco, con el acuerdo de devolver
Y soles cada mes hasta devolver el préstamo completo. Parte del pago mensual serán
intereses, calculados como el i por ciento del capital por devolver en ese momento.
El resto del pago mensual se aplica a reducir el capital a devolver. El programa debe determinar:
a.- La cantidad de intereses pagada cada mes.
b.- La cantidad de dinero aplicada cada mes al capital por devolver
c.- La cantidad acumulada de intereses pagados al final de cada mes.
d.- La cantidad del préstamo aún pendiente al final de cada mes.
e.- El número necesario de pagos mensuales para devolver el préstamo completo.
f.- La cantidad del último pago (probablemente menor que Y)
Compruebe el programa usando los siguientes datos: X = 7.200.000, Y = 360.000, i= 1%
*/
package semana1.practico;

import java.util.Scanner;


public class ejercicio27 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad del prestamo");
        int prestamo=sc.nextInt();
        System.out.println("ingrese la cantidad a devolver mensualmente");
        int pagoMensual=sc.nextInt();    
        System.out.println("ingrese intereses: ");
        float intereses=sc.nextFloat();
        
        float valorInteres;
       
        float pendiente=0;
        float pagoAcumulado=0.0f;
        
        float valorAcumuladoIntereses=0.0f;
        int cont=0;
        
        while(pagoAcumulado<prestamo){
            
            System.out.println("CUOTA "+(cont+1+":"));
            
            valorInteres=(pagoMensual)*(intereses/100);
            
            pagoMensual-=valorInteres;
            
            pagoAcumulado+=pagoMensual;
            valorAcumuladoIntereses+=valorInteres;
            pendiente=prestamo-pagoAcumulado;
            
            
            if(pendiente<0){
                System.out.println("Total intereses: "+(valorAcumuladoIntereses-valorInteres)+"$");
                System.out.println("Tu ultimo pago es:"+(pagoMensual+pendiente)+"$");
                System.out.println("Tu pago acumulado es: "+(pagoAcumulado+pendiente)+"$"+"/"+prestamo+"S");
                System.out.println("cantidad pendiente por pagar: "+((pagoAcumulado+pendiente)-(prestamo)+"$"));
            }else{
                System.out.println("Se a cobrado "+intereses+"% de intereses de tu pago mensual: "+valorInteres+"$");
                System.out.println("Has pagado "+pagoMensual+"$");
                System.out.println("Suma de intereses acumulados: "+valorAcumuladoIntereses+"$");
                System.out.println("Tu pago acumulado es: "+pagoAcumulado+"$"+"/"+prestamo+"$");
                System.out.println("Cantidad aun pendiente por pagar: "+pendiente+"$");
            }
    
            pagoMensual+=valorInteres;
            cont++;
            System.out.println();
        }
        System.out.println();
        System.out.println("Cantidad de pagos mensuales: "+cont);
        
    }
}
