/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;

public class ejercicioP03 {
    public static void main(String[] args) {
        CuentaW c1=new CuentaW("all we need is love");
        System.out.println(c1.getTexto());
        c1.numeroLetras();
        c1.numeroPalabras();
        c1.cantidadRepeticiones('e');
    }
}

class CuentaW{
    String texto;

    public CuentaW(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void numeroLetras(){
        int espacios=0;
        for (int i = 0; i < this.texto.length(); i++) {
            if(texto.charAt(i)==' '){
                espacios++;
            }
        }
        int letras=texto.length()-espacios;
        System.out.println("cantidad de letras: "+letras);
    }
    
    public void numeroPalabras(){
        int cont=1, pos;
        texto.trim(); //elimina posibles espacios en blanco al inicio y al final
        
        if(this.texto.isEmpty()){//verifica si la cadena esta vacia
            cont=0;
        }else{
            pos=this.texto.indexOf(" ");//busca primer espacio en blanco
            while(pos!=-1){
                cont++;
                pos=this.texto.indexOf(" ", pos+1);
            }
        }
        System.out.println("cantidad de palabras: "+cont);
                    
    }
    
    public void cantidadRepeticiones(char caracter){
        int pos, cont=0;
        pos=this.texto.indexOf(caracter);
        while(pos!=-1){
            cont++;
            pos=this.texto.indexOf(caracter, pos+1);
        }
        System.out.println("el caracter "+ "'"+caracter+"'"+" aparece "+cont+" veces");
    }
}