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
public class ejercicio9 {
    public static void main(String[] args) {
        padrino p=new padrino();
        p.b();
    }
}
class padrino{
    void a(){
        
    }
    void b() {
        throw new RuntimeException("Metodo vacio!!");
    }
    void c()throws Exception{
        throw new Exception("Metodo fuera de linea!!");
    }
}