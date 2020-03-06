/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6.teorico;

/**
 *
 * @author JHUNIOR
 */
public class ejercicio7 {
    public static void main(String[] args) throws Exception{
        int x=15;
        int y=0;
        try{
            //int resp=x/y;
            //System.out.println("Dividir X/Y"+resp);
            String name=null;
            name.equals("QQQ");
        }catch(ArithmeticException e){
            System.out.println("no se puede dividir en Cero");
        }catch(Exception e){
            System.out.println("El objeto de error: "+e);
        }
        
        
        
    }
}
