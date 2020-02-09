/*
 29) En la Cámara de Diputados se levanta una encuesta con todos los integrantes
con el fin de determinar que porcentaje de los n diputados esta a favor del Tratado
de Libre Comercio, que porcentaje esta en contra y que porcentaje se abstiene de opinar.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero de diputados: ");
         int n=sc.nextInt();
        int favor=0;
        int contra=0;
        int ninguno=0;
        int votosTotales;
        
       
        for (int i = 0; i < n; i++) {
            int votos=(int)(Math.random()*(3-0)+0);
            System.out.println("diputado: "+(i+1));
            if(votos==1){
                System.out.println(" A FAVOR");
                favor+=1;
                
            }else if(votos==0){
                System.out.println("EN CONTRA");
                contra+=1;
            }else if(votos==2){
                System.out.println("NO OPINA");
                ninguno+=1;
            }
            
            
        }
        
        votosTotales=favor+contra+ninguno;
        
        float porF=(float)(favor*100)/votosTotales;
        float porC=(float)(contra*100)/votosTotales;
        float porN=(float)(ninguno*100)/votosTotales;
        
        System.out.println(porF+porC+porN);

        System.out.println("el "+porF+"%"+ " A FAVOR");
        System.out.println("el "+porC+"%"+ " EN CONTRA");
        System.out.println("el "+porN+"%"+ " NO OPINA");
    }
    
}
