/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.TreeSet;


/**
 *
 * @author JHUNIOR
 */
public class ejercicioP06 {
    public static void main(String[] args) {
       
        Palabra p=new Palabra("carmen");
        Palabra p2=new Palabra("corazon");
        Palabra p3=new Palabra("auxilio");
        Palabra p4=new Palabra("perdon");
        Palabra p5=new Palabra("arandano");
        
        Palabras ps=new Palabras();
        ps.add(p);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);
        ps.add(p5);
        
        
        ps.mostrar();
        System.out.println("PALABRAS ORDENADAD ALFABETICAMENTE:");
        ps.mostrarOrden();
     
    }
}

class Palabra implements Comparator<Palabra>{
    String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;
      
    }
    public Palabra(){
        
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    

    @Override
    public String toString() {
        return "Palabra{"  + palabra +"->"+palabra.length()+ '}';
    }
    
    public String mostrar(){
        return "Palabra{"  + palabra + '}';
    }

    
    @Override
    public int compare(Palabra o1, Palabra o2) {
        String palabraA=o1.getPalabra();
        String palabraB=o2.getPalabra();
        return palabraA.compareTo(palabraB);
    }

    
 
}

class Palabras{
    ArrayList<Palabra> lista=new ArrayList<Palabra>();
    
    void add(Palabra p){
        lista.add(p);
    }
    
    void mostrar(){
        for (Palabra p : lista) {
            System.out.println(p.toString());
        }
    }
    
    void mostrarOrden(){
        Palabra compar=new Palabra();
        TreeSet<Palabra> lista1=new TreeSet<Palabra>(compar);
        for (Palabra pa : lista) {
            lista1.add(pa);
           
        }
        for (Palabra p : lista1) {
            System.out.println(p.mostrar());
        }
  
    }
}

