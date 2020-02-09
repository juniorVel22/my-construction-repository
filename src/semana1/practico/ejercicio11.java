/*
 26) Un teatro otorga descuentos según la edad del cliente. Determinar la cantidad
de dinero que el teatro deja de percibir por cada una de las categorías. Tomar en 
cuenta que los niños menores de 5 años no pueden entrar al teatro y que existe un 
precio único en los asientos. Los descuentos se hacen tomando en cuenta el siguiente cuadro:
                Edad                    Descuento
    Categoría 1     5 - 14              35 %
    Categoría 2     15 - 19             25 %
    Categoría 3     20 - 45             10 %
    Categoría 4     46 - 65             25 %
    Categoría 5     66 en adelante      35 %
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de personas: ");
        int per=sc.nextInt();
        System.out.println("ingrese precio de la entrada: ");
        int precio=sc.nextInt();
        double descuento1,descuento2,descuento3,descuento4,descuento5;
        
        double sumaDescuento=0.0;
        for (int i = 0; i < per; i++) {
            
            System.out.println("ingresa edad de la persona: ");
            int edad=sc.nextInt();
            
            if(edad<5){
                System.out.println("no puede entrar");
                
            }else if(edad>=5&&edad<=14){
                
               descuento1=precio*(0.35);
               sumaDescuento+=descuento1;
               double pagoTotal1=precio-descuento1;
               System.out.println("usted debe pagar 1 : "+pagoTotal1);
               
            }else if(edad>=15&&edad<=19){
                
                descuento2=precio*(0.25);
                sumaDescuento+=descuento2;
                double pagoTotal2=precio-descuento2;               
                System.out.println("usted debe pagar 2 : "+pagoTotal2);
            }else if(edad>=20&&edad<=45){
                
                descuento3=precio*(0.1);
                sumaDescuento+=descuento3;
                double pagoTotal3=precio-descuento3;
                System.out.println("usted debe pagar 3 : "+pagoTotal3);
                
            }else if(edad>=46&&edad<=65){
                
                descuento4=precio*(0.25);
                sumaDescuento+=descuento4;
                double pagoTotal4=precio-descuento4;
                System.out.println("usted debe pagar 4 : "+pagoTotal4);
                
            }else {
                
                descuento5=precio*(0.35);
                sumaDescuento+=descuento5;
                double pagoTotal5=precio-descuento5;
                System.out.println("usted debe pagar 5 : "+pagoTotal5);
            }
     
        }
        System.out.println("");
        System.out.println("DINERO TOTAL QUE DEJA DE PERCIBIR: "+sumaDescuento);
        
    }
}
