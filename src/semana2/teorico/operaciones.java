/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

class Suma{
    private int a,b;
    
    public void asignar(int a,int b){
        this.a=a;
        this.b=b;
    }
    
    public int calcular(){
        return (a+b);
    }
}
class Multiplicacion{
    private int a,b;
    public void asignar(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int calcular(){
        return (a*b);
    }
}
class Divicion{
    private double a,b;
    
    public void asignar(int a,int b){
        this.a=a;
        this.b=b;
    }
    public double calcular(){
        return (double)(a/b);
    }
}

public class operaciones {
    public static void main(String[] args) {
        Suma s1=new Suma();
        s1.asignar(20, 45);
        System.out.println(s1.calcular());
        
        Multiplicacion m1=new Multiplicacion();
        m1.asignar(5, 9);
        System.out.println(m1.calcular());
        
        Divicion d1=new Divicion();
        d1.asignar(65, 3);
        System.out.println(d1.calcular());
    }
}
