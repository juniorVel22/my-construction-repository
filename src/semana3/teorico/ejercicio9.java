/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.teorico;

import java.util.ArrayList;
import java.util.Iterator;


public class ejercicio9  {
    public static void main(String[] args) {
        Operacion o=new Operacion(3);
        Operacion<operacionFloat> operacion=new Operacion<operacionFloat>();
        operacionFloat op=new operacionFloat(5, 6);
        op.operarSuma();
        op.operarResta();
        op.operarProducto();
        operacionFloat op1=new operacionFloat(6, 7);
        op1.operarSuma();
        op1.operarResta();
        op1.operarProducto();
        operacionFloat op2=new operacionFloat(8, 9);
        op2.operarSuma();
        op2.operarResta();
        op2.operarProducto();
        
        OperacionInt opi1=new OperacionInt(6, 7);
        opi1.operarSuma();
        opi1.operarResta();
        opi1.operarProducto();
        OperacionInt opi2=new OperacionInt(6, 7);
        opi2.operarSuma();
        opi2.operarResta();
        opi2.operarProducto();
        
        operacion.add(op);
        operacion.add(op1);
        operacion.add(op2);
       
        for(operacionFloat opf:operacion){
            System.out.println(opf.operarSuma());
            System.out.println(opf.operarResta());
            System.out.println(opf.operarProducto());
        }
        
                
                
    }
}

class Operacion <T> implements Iterable<T>{
    private ArrayList<T> lista=new ArrayList<T>();
    
    private int tope;
    
    public Operacion(int tope) {
        super();
        this.tope = tope;
    }

    public Operacion() {
    }
    
    
    public void add(T objeto ) {
        if (lista.size()<=tope) {
            lista.add(objeto);
        }else {
            throw new RuntimeException("no caben mas");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}

class operacionFloat{
    private float a,b;
    
    
    public operacionFloat(float a, float b) {
        this.a = a;
        this.b = b;
       
    }
    
    public float operarSuma(){
        return a+b;
    }
    public float operarResta(){
        return a-b;
    }
    public float operarProducto(){
        return a*b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

   
}

class OperacionInt{
    private int a,b;

    public OperacionInt(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int operarSuma(){
        return a+b;
    }
    public int operarResta(){
        return a-b;
    }
    public int operarProducto(){
        return a*b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
}