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
public class ejercicio10 {
    public static void main(String[] args) {
        int x=0;
        int y=5;
        try {
            int resp=x+y;
            System.out.println(resp);
        } catch (Exception e) {
        }finally{
            System.out.println("Ejecuto el Finally!!");
        }
    }
}
