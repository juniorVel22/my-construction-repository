/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;
import java.util.List;




public class ListaNumerosAleatorios {
  
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<Integer>();
        
        llenar(lista);       
        mostrar(lista);
        System.out.println("///////////////////////");
        eliminarDuplicados(lista);
    }
    
    public static void llenar(ArrayList lista){
  
        for (int i = 0; i < 100; i++) {
            int n=(int)(Math.random()*(101-1)+1);
            lista.add(n);
        } 
    }
    
    public static void mostrar(ArrayList lista){
        Iterator it=lista.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public static void eliminarDuplicados(ArrayList lista){
        HashSet<Integer> hashset=new HashSet<>(lista);
        
        List<Integer> lista2=new ArrayList<>(hashset);
        
        for(Object item:lista2){
            System.out.println(item);
        }
       
    }
}
