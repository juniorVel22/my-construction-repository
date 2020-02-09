/*
 38) Calcular la suma siguiente:
100 + 98 + 96 + 94 + . . . + 0 en este orden
 */
package semana1.practico;


public class ejercicio12 {
    public static void main(String[] args) {
        int suma =0;
        for (int i = 100; i > 0; i=i-2) {
            suma+=i;
        }
        System.out.println("la suma es : "+suma);
    }
}
