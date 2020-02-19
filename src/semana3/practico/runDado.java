
package semana3.practico;

import java.util.Scanner;


public class runDado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Elige:\n"+"1.To play\n"+"2.Exit");
            opcion=sc.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1:
                    Juego j=new Juego();
                    Dado dados[]=new Dado[3];
                    for (int i = 0; i < dados.length; i++) {
                        dados[i]=new Dado();
                        System.out.print(dados[i].valorDado()+" ");
                    }
                    System.out.println();
                    j.tirar(dados);
                    
                    System.out.println();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("ingrese otra opcion");
            }
            
        }while(opcion!=2);
        
    }
}

class Dado{
    private int valor;

    public Dado() {
    }
    
    
    public Dado(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int valorDado(){
        valor=(int)(Math.random()*(7-1)+1);
        return valor;
    }
    
    @Override
    public String toString() {
        return "Dado{" + "valor=" + valor + '}';
    }
    
}

class Juego{
    Dado dados[];

    public Juego() {
    }

    public Dado[] getDados() {
        return dados;
    }

    public void setDados(Dado[] dados) {
        this.dados = dados;
    }


    public void tirar(Dado[] d){
       
        if(d[0].getValor()==d[1].getValor()){
            if(d[1].getValor()==d[2].getValor()){
                System.out.println("Gano");
            }else{
                System.out.println("Perdio");
            }
        }else if(d[0].getValor()!=d[1].getValor()){
            if(d[1].getValor()!=d[2].getValor()){
                System.out.println("Perdio");
            }else{
                System.out.println("Perdio");
            }
        }
        else{
            System.out.println("Perdio");
        }
        
    }

    @Override
    public String toString() {
        return "Juego{" + "dados=" + dados + '}';
    }
  
}
