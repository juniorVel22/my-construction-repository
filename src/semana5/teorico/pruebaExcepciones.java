/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5.teorico;

class miError extends Exception{
    public miError(String texto){
        super(texto);
    }   
}
public class pruebaExcepciones {
    public static void main(String[] args) {
        try{
            miError e=new miError("sin errores");
            throw e;
          
                    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
