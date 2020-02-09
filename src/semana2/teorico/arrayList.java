/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

import java.util.ArrayList;


public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> familia=new ArrayList<String>();
        familia.add("Elita");
        familia.add("Talia");
        familia.add("Pablo");
        familia.add("Jenny");
        familia.add("Diana");
        familia.add("Ruter");
        
        
        for (int i = 0; i < familia.size(); i++) {
            System.out.println(familia.get(i));
        }
        System.out.println(familia.size());
        
    }
}
