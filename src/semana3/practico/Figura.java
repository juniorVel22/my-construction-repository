
package semana3.practico;

import java.util.Scanner;
import java.util.Stack;



public class Figura {
    private String nombre;
    private String color;

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Figura() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String  mostrar(){
        return "nombre: "+nombre+", color: "+color;
    }
    
    
}

class Pila{
   
    
    Figura figura[];
    int maximo;
    int top;

    public Pila(int n) {
        maximo=n;
        figura=new Figura[n];
        top=0;
    }
    
    
    public void ingresar(Figura f){
        if(top>maximo){
            figura[top]=f;
            top++;
        }
        
    }
    
    public Figura eliminar(){
        Figura temp=null;
        if(top>0){
            temp=figura[top-1];
            figura[top-1]=null;
            top--;
        }
        return temp;
    }
    
    public void mostrar(){
        for (int i =figura.length-1; i >=0; i--) {
            System.out.println(figura[i].mostrar());
        }
        
    }
    
    
}

class principal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Stack<Figura> figuras=new Stack<Figura>();
//        Figura fig;
//        
//        System.out.println("ingrese cantidad de figuras figuras:");
//        int cant=sc.nextInt();
//        for (int i = 0; i < cant; i++) {
//            System.out.println("ingrese nombre y color de la figura: "+(i+1));
//            fig=new Figura(sc.next(), sc.next());
//            figuras.push(fig);
//        }
//        while(!figuras.empty()){
//            fig=figuras.pop();
//            
//            System.out.println(fig.mostrar());
//        }
          
          Pila p=new Pila(5);
          Figura [] fig=new Figura[5];
          for (int i = 0; i < fig.length; i++) {
            fig[i]=new Figura(sc.next(), sc.next());
            p.ingresar(fig[i]);
            p.mostrar();
            
        }
        
         
          
    }
}
