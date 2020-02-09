/*
 32) Un jefe de casilla desea determinar cuantas personas de cada una de las secciones
que componen su zona asisten el día de las votaciones. Las secciones son: norte, sur y centro.
También desea determinar cual es la sección con mayor numero de votantes.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("cantidad de personas de la zona sur: ");
        int sur=sc.nextInt();
        System.out.println("cantidad de personas de la zona norte: ");
        int norte=sc.nextInt();
        System.out.println("cantidad de personas de la zona centro: ");
        int centro=sc.nextInt();
        
        int votos;
        int sumaS=0;
        int sumaN=0;
        int sumaC=0;
        
        System.out.println("ZONA SUR:-------------------------------------------");
        for (int i = 0; i < sur; i++) {
            System.out.println("voto:"+(i+1));
            votos=(int)(Math.random()*(3-1)+1);
            if(votos==1){
                System.out.println("NO VOTÓ");  
            }else{
                System.out.println("SI VOTÓ");
                sumaS+=1;
            }
            
        }
        System.out.println("ZONA NORTE:-----------------------------------------");
        for (int i = 0; i < norte; i++) {
            System.out.println("voto:"+(i+1));
            votos=(int)(Math.random()*(3-1)+1);
            if(votos==1){
                System.out.println("NO VOTÓ");
            
            }else{
                
                System.out.println("SI VOTÓ");
                sumaN+=1;
            }
            
        }
        System.out.println("ZONA CENTRO:---------------------------------------");
        for (int i = 0; i < centro; i++) {
            System.out.println("voto:"+(i+1));
            votos=(int)(Math.random()*(3-1)+1);
            if(votos==1){
                System.out.println("NO VOTÓ");
                
            }else{
                System.out.println("SI VOTÓ");
                sumaC+=1;
            }
            
        }
        
        System.out.println("votos sur: "+sumaS);
        System.out.println("votos norte: "+sumaN);
        System.out.println("votos centro: "+sumaC);
        
        if(sumaS>sumaN && sumaS>sumaC){
            System.out.println("Zona SUR tiene mas votos");
        }else if(sumaN>sumaS && sumaN>sumaC){
            System.out.println("Zona NORTE tiene mas votos");
        }else{
            System.out.println("Zona CENTRO tiene mas votos");
        }
        
    }
}
