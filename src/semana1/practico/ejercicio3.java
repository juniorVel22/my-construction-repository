/*
 6) Los surtidores de una gasolinera registran las ventas por galones, pero el 
precio de la gasolina está fijada en litros. El programa debe calcular lo que los
clientes deben pagar y el total recaudado por la gasolinera, tomando en cuenta lo siguiente:
    • Cada galón tiene 3,785 litros
    • El precio del litro es para el Tipo A 50 Soles, para el Tipo B 55 Soles y para el Tipo C 60 Soles.
    • El programa finaliza cuando se introduce una D como tipo de gasolina.
 */
package semana1.practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        String opciones;      
 
        double total=0.0;
        
        do{
            opciones=JOptionPane.showInputDialog("A.TIPO A \n"+"B.TIPO B \n"+"C.TIPO C");
            
            switch(opciones){
            
               
            
                case "a":
                    System.out.println("ingrese cantidad de galones: ");
                    int galonesA=sc.nextInt();
                    double litrosA=galonesA*3.785;
                    double precioA=litrosA*50;
                    System.out.println("total a pagar: "+precioA);
                    total+=precioA;
                    break;
                case "b":
                    System.out.println("ingrese cantidad de galones: ");
                    int galonesB=sc.nextInt();
                    double litrosB=galonesB*3.785;
                    double precioB=litrosB*55;
                    System.out.println("total a pagar: "+precioB);
                    total+=precioB;
                    break;
                case "c":
                    System.out.println("ingrese cantidad de galones: ");
                    int galonesC=sc.nextInt();
                    double litrosC=galonesC*3.785;
                    double precioC=litrosC*60;
                    System.out.println("total a pagar: "+precioC);
                    total+=precioC;
                    break;
                default:
                    break;
            }
        }while(!opciones.equalsIgnoreCase("D"));
    
        System.out.println("INGRESO TOTAL DE VENTAS: "+total);

        
    }
}
