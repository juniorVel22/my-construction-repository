/*
 25) En un supermercado una ama de casa pone en su carrito los artículos que va tomando
de los estantes. La señora quiere asegurarse de que el cajero le cobre bien lo que ella
ha comprado, por lo que cada vez que toma un articulo anota su precio junto con la cantidad
de artículos iguales que ha tomado y determina cuanto dinero gastara en ese articulo; a esto
le suma lo que ira gastando en los demás artículos, hasta que decide que ya tomo todo lo que
necesitaba. Ayúdale a esta señora a obtener el total de sus compras.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de productos:");
        int cant=sc.nextInt();
        double total=0;
        for (int i = 0; i < cant; i++) {
            System.out.println("ingrese precio del producto "+(i+1));
            double precio=sc.nextDouble();
            System.out.println("ingrese cantidad del producto "+(i+1));
            int can=sc.nextInt();
            total+=(double)can*precio;
        }
        System.out.println("el total a pagar es :"+total);
    }
}
