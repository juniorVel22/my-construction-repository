/*
 33) Un negocio de copias tiene un limite de producción diaria de 10 000 copias si
el tipo de impresión es offset y de 50 000 si el tipo es estándar. Si hay una solicitud
de un el empleado tiene que verificar que las copias pendientes hasta el momento y 
las copias solicitadas no excedan del limite de producción. Si el limite de producción
se excediera el trabajo solicitado no podría ser aceptado. El empleado necesita llevar
un buen control de las copias solicitadas hasta el momento para decidir en forma rápida
si los trabajos que se soliciten en el día se deben aceptar o no.
 */
package semana1.practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ejercicio31 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int limiteO=10000;
        int limiteE=50000;
        int sumaO=0;
        int sumaE=0;
        int cantidad=0;
        int tipo;
        
        do{
            tipo= Integer.parseInt(JOptionPane.showInputDialog("INGRESE TIPO:\n"+"1:Ingrese si es offset\n"
            +"2.Ingrese si es estandar\n"+"3.Salir")); 
            
            System.out.println("ingresa cantidad de copias :");
            cantidad=sc.nextInt();
            
            switch(tipo){
                
                case 1:
                    if(limiteO>=sumaO&&(sumaO+cantidad)<=limiteO){
                        
                        sumaO+=cantidad;
                    }else{
                        System.out.println("cantidad excedida");
                    }
                    break;
                case 2:
                    
                    if(limiteE>=sumaE&&(sumaE+cantidad)<=limiteE){
                        
                        sumaE+=cantidad;
                    }else{
                        System.out.println("cantidad excedida");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcion no encontrada");
            }
        }while(limiteO>=sumaO || limiteE>=sumaE);
            
        
    }
}
