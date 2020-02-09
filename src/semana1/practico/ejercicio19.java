/*
 5) Un número primo es una cantidad entera positiva únicamente divisible
por uno o por sí mismo. Calcular y tabular los n primeros números primos.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio19 {
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        System.out.println("ingrese cuantos numeros primos desea mostrar");
        int n = e.nextInt();
        int c = 1;
        int p = 2;
        int d = 2;
        while (c <= n) {
            if (p % d == 0) {
                if (p == d) {
                    System.out.print(p + ", ");
                    c++;
                }
                d = 2;
                p++;
            }
            else
              d++;
        }

    }
}
