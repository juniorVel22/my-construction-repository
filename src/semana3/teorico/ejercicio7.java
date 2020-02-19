/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.teorico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JHUNIOR
 */

public class ejercicio7 {
    public static void main(String[] args) {
        Bolsa b=new Bolsa(5);
        Chocolatina c1=new Chocolatina("kik");
        Chocolatina c2=new Chocolatina("kik");
        Chocolatina c3=new Chocolatina("kik");
        Golosina g1=new Golosina("chicle");
        Golosina g2=new Golosina("chiso");
        
        b.add(c1);
        b.add(c2);
        b.add(c3);
        b.add(g1);
        b.add(g2);
        
        for(Object ob:b){
            if(ob instanceof Chocolatina){
                System.out.println("chocolatina: "+((Chocolatina) ob).getNombre());
            }else if(ob instanceof Golosina){
                System.out.println("golosina: "+((Golosina) ob).getMarca());
            }
        }
        
    }
}
class Bolsa implements Iterable{
    private ArrayList lista= new ArrayList();
    private int tope;
    public Bolsa(int tope) {
        super();
        this.tope = tope;
    }
    public void add(Object objeto ) {
        if (lista.size()<=tope) {
            lista.add(objeto);
        }else {
            throw new RuntimeException("no caben mas");
        }
    }
    @Override
    public Iterator iterator() {
        return lista.iterator();
    }
}

class Golosina{
    private String marca;

    public Golosina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}

class Chocolatina{
    private String nombre;
    public Chocolatina(String nombre) {
       
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}