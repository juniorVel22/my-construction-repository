/*
 31) Un censador recopila ciertos datos aplicando encuestas para el ultimo Censo 
Nacional de Población y Vivienda. Desea obtener de todas las personas que alcance
a encuestar en un día, que porcentaje tiene estudios de primaria, secundaria,
carrera técnica, estudios profesionales y estudios de posgrado.
 */
package semana1.practico;

import java.util.Scanner;


public class ejercicio33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingresa cantidad de personas encuestadas");
        int n=sc.nextInt();
        int encuesta;
        int pri=0;
        int sec=0;
        int CT=0;
        int CP=0;
        int posG=0;
        
        int soloP=0;
        int soloS=0;
        int soloCT=0;
        int soloCP=0;
        int soloEP=0;
        //int total;
        float porP,porS,porCT,porCP,porPG;
        float minP,minS,minCT,minCP,minPG;
        int i=0;
        while(n>i){
            System.out.println("encuestado: "+(i+1));
            encuesta=(int)(Math.random()*(6-1)+1);
            if(encuesta>1){
                
                if(encuesta==2){
                    System.out.println("P y S");
                    pri+=1;
                    sec+=1;
                    soloS+=1;
                }else if(encuesta==3){
                    System.out.println("P, S y CT");
                    pri+=1;
                    sec+=1;
                    CT+=1;
                    soloCT+=1;
                }else if(encuesta==4){
                    System.out.println("P, S y CP");
                    pri+=1;
                    sec+=1;
                    CP+=1;
                    soloCP+=1;
                }else if(encuesta==5){
                    System.out.println("P, S, CP, EP");
                    pri+=1;
                    sec+=1;
                    CP+=1;
                    posG+=1;
                    soloEP+=1;
                }
            }
            
            if(encuesta==1){
                System.out.println(" solo primarios");
                pri+=1;
                soloP+=1;
            }
            
            i++;
            
        }
        System.out.println();
        System.out.println("primaria: "+soloP);
        System.out.println("secundaria: "+soloS);
        System.out.println("carrera tecnica: "+soloCT);
        System.out.println("carrera profecional: "+soloCP);
        System.out.println("posgrado: "+soloEP);
        
        //total=pri+sec+CT+CP+posG;
        
        porP=(float)(soloP*100)/n;
        porS=(float)(soloS*100)/n;
        porCT=(float)(soloCT*100)/n;
        porCP=(float)(soloCP*100)/n;
        porPG=(float)(soloEP*100)/n;
        
        minP=(float)(pri*100)/n;
        minS=(float)(sec*100)/n;
        minCT=(float)(CT*100)/n;
        minCP=(float)(CP*100)/n;
        minPG=(float)(posG*100)/n;
        
        System.out.println();
        System.out.println("primaria: "+porP+"%");
        System.out.println("secundaria: "+porS+"%");
        System.out.println("carrera tecnica: "+porCT+"%");
        System.out.println("carrera profecional: "+porCP+"%");
        System.out.println("posgrado: "+porPG+"%");
        System.out.println();
        System.out.println("minimo primaria: "+minP+"%");
        System.out.println("minimo secundaria: "+minS+"%");
        System.out.println("minimo carrera tecnica: "+minCT+"%");
        System.out.println("minimo carrera profecional: "+minCP+"%");
        System.out.println("minimo posgrado: "+minPG+"%");
        System.out.println();
        
       
        
    }
}
