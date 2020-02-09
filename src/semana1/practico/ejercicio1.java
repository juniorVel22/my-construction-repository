
package semana1.practico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ejercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        
        int opciones;
        do{
            opciones=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"+ "1.saludo utilizando Scanner\n"+
                    "2.suma dos numeros utilizando Scanner\n"+"3.saludo utilizando Bufferedreader\n"+
                    "4.suma dos numeros utilizando Bufferedreader"));
            
            switch(opciones){
                case 1:
                    System.out.println("nombre:");
                    String nombre=sc.nextLine();
                    System.out.println("hola mi nombre es "+ nombre);
                    break;
                case 2:
                    int num1, num2;
                    System.out.println("ingrese numero 1: ");
                    num1=sc.nextInt();
                    System.out.println("ingrese numero 2: ");
                    num2=sc.nextInt();
                    System.out.println("resultado= "+(num1+num2));
                    break;
                case 3:
                    
                    System.out.println("ingrese su nombre: ");
                    String nom=bf.readLine();
                    System.out.println("hola mi nombre es "+nom);
                    break;
                case 4:
                    System.out.println("ingrese numero 1: ");
                    int numero1=Integer.parseInt(bf.readLine());
                    System.out.println("ingrese numero 2: ");
                    int numero2=Integer.parseInt(bf.readLine());
                    System.out.println("resultado= "+(numero1+numero2));
                    break;
                default:
                    System.out.println("opcion no encontrada");
            }
            
        }while(opciones!=4);
 
    }
    
}
