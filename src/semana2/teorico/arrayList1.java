/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

import java.util.ArrayList;
import java.util.Iterator;


public class arrayList1 {
    
    public static void main(String[] args) {
        ArrayList<String> familia=new ArrayList<String>();
        familia.add("Elita");
        familia.add("Talia");
        familia.add("Pablo");
        familia.add("Jenny");
        familia.add("Diana");
        familia.add("Ruter");
        
        iterador(familia);
        System.out.println();
        forEach(familia);
     
    }
    
    static public void iterador(ArrayList<String> familia){
        Iterator i=familia.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    public static void forEach(ArrayList<String> familia){
        for (String aux : familia) {
            System.out.println(aux);
        }
    }
}
