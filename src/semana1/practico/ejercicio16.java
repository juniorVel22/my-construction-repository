/*
 12) Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres
ventas a la semana. Su política de pagos es que un vendedor recibe un sueldo base,
y un 10% extra por comisiones de sus ventas. El gerente de su compañía desea saber
cuanto dinero obtendrá en la semana cada vendedor por concepto de comisiones por las 
tres ventas realizadas, y cuanto tomando en cuenta su sueldo base y sus comisiones.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de vendedores: ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese sueldo de vendedor: "+(i+1));
            arr[i]=sc.nextInt();
            System.out.println("ingrese valor de las 3 ventas por semana del empleado: "+(i+1));
            int venta1=sc.nextInt();
            int venta2=sc.nextInt();
            int venta3=sc.nextInt();
            
            float extra=(venta1*0.1f)+(venta2*0.1f)+(venta3*0.1f);
            System.out.println("por concepto de comiciones tiene: "+extra);
            float sueldoTotal=arr[i]+extra;
            System.out.println("su sueldo total es: "+ sueldoTotal);
        }
    }
}
