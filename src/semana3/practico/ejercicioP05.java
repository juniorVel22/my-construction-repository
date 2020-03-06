/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;

import java.util.ArrayList;

public class ejercicioP05 {//LAVIDESMCOB

    public static void main(String[] args) {
        PaLinea p = new PaLinea("antes que te vayas vete hacia alla");
        p.letrasQueAparecen();
        p.palabrasOrden();
    }

}

class PaLinea {

    String texto;

    public PaLinea(String texto) {
        this.texto = texto;
    }

    public void letrasQueAparecen() {
        
        ArrayList<Character> list = new ArrayList<Character>();
     
        for (int i = 0; i < texto.length(); i++) {

            list.add(texto.charAt(i));
        }

        try{
            for (int i = 0; i < list.size(); i++) {
                                                           //0
                for (int j = 1; j < list.size(); j++) {//cara de caca
                    
                    if(i!=j){
                        if(list.get(j)==' '){
                            list.remove(j);
                        }
                        else if (list.get(i) == list.get(j)) {
                            list.remove(j);
                        }
                        
                    }
                }
            }
        }catch(IndexOutOfBoundsException e){
            
        }
        System.out.println("LETRAS UNICAS QUE APARECEN EN LA CADENA: ");
        for (Character c : list) {
            System.out.print(c.toString()+" ");
            
        }
        System.out.println();
   
    }
    
    public void palabrasOrden(){
        
        ArrayList<String> pal=new ArrayList<>();
        for (String s : texto.split(" ")) {
            pal.add(s);
        }
        System.out.println("PALABRAS EN EL ORDEN QUE SE ESCRIBIERON");
        for (String s : pal) {
            System.out.println(s.toString());
        }
        
//        String palabras[]=texto.split(" ");
//        int cantidad=palabras.length;
//        System.out.println("PALABRAS EN EL ORDEN QUE SE ESCRIBIERON: ");
//        for (int i = 0; i < cantidad; i++) {
//            System.out.println(palabras[i]);
//        }
        
    }
}
