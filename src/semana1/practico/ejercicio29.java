/*
 42) Leer los 250,000 votos otorgados a los 3 candidatos a gobernador e imprimir 
el numero del candidato ganador y su cantidad de votos.
 */
package semana1.practico;


public class ejercicio29 {
    public static void main(String[] args) {
        int n=0;
        int candidato1=0;
        int candidato2=0;
        int candidato3=0;
        int votos;
        do{
           votos=(int)(Math.random()*(4-1)+1);
            if(votos==1){
                System.out.println("voto para : 1");
                candidato1+=1;
            }else if(votos==2){
                System.out.println("voto para: 2");
                candidato2+=1;
            }else{
                System.out.println("voto para 3");
                candidato3+=1;
            }
            n++;
        }while(250000>n);
        System.out.println("candidato 1= "+candidato1+" votos");
        System.out.println("candidato 2= "+candidato2+" votos");
        System.out.println("candidato 3= "+candidato3+" votos");
        System.out.println();
        
        if(candidato1>candidato2 && candidato1>candidato3){
            System.out.println("ganador: candidato 1 con "+candidato1+" votos");
        }else if(candidato2>candidato1 && candidato2>candidato3){
            System.out.println("ganador: candidato 2 con "+candidato2+" votos");
        }else{
            System.out.println("ganador: candidato 3 con "+candidato3+" votos");
        }
    }
}
