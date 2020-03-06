/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5.teorico;

import java.util.ArrayList;
import java.util.Iterator;

interface Impresion {

    void imprimir(Padron p);

}

class Persona {

    String nombre;
    double sueldo;

    public Persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

}

class Padron implements Iterable<Persona> {

    ArrayList<Persona> listaP = new ArrayList<Persona>();

    public ArrayList<Persona> getListaP() {
        return listaP;
    }

    public void addPersona(Persona p) {
        listaP.add(p);
    }

    public void setListaP(ArrayList<Persona> listaP) {
        this.listaP = listaP;
    }

    @Override
    public Iterator<Persona> iterator() {
        return listaP.iterator();
    }

}

class ServiceImpresion {

    Impresion impresion;

    void setIpresion(Impresion impresion) {
        this.impresion = impresion;
    }
    Impresion getImpresion(){
        return impresion;
    }

    void imprimir(Padron p) {
        for (Persona lista : p) {
            System.out.println(lista.toString());
        }
        System.out.println();
          //impresion.imprimir(p);
    }

    @Override
    public String toString() {
        if(getImpresion() instanceof Tinta){
            return "ServiceImpresion{" + "impresion= TINTA"+ '}';
        }else if(getImpresion() instanceof Laser){
            return "ServiceImpresion{" + "impresion= lASER" + '}';
        }else{
            return "ServiceImpresion{" + "impresion= TERMICA" + '}';
        }
    }

}

class Tinta implements Impresion {

    @Override
    public void imprimir(Padron p) {
        
        for (Persona lista : p) {
            System.out.println(lista.toString());
        }
        System.out.println();
    }

}

class Laser implements Impresion {

    @Override
    public void imprimir(Padron p) {
       
        for (Persona lista : p) {
            System.out.println(lista.toString());
        }
        System.out.println();
    }
}

class Termica implements Impresion {

    @Override
    public void imprimir(Padron p) {
   
        for (Persona lista : p) {
            System.out.println(lista.toString());
        }
        System.out.println();
        
    }
}

public class ejercicio2 {

    public static void main(String[] args) {

        String nombres[] = {"raul", "carmen", "diana", "paul", "lina", "dana", "julian", "manuel"};
        double sueldos[] = {2000, 3000, 3400, 2500, 6000, 5000, 3600, 1000};

        Padron p = new Padron();
        Persona p1 = new Persona(nombres[aleatorio(0, 8)], sueldos[aleatorio(0, 8)]);
        Persona p2 = new Persona(nombres[aleatorio(0, 8)], sueldos[aleatorio(0, 8)]);
        Persona p3 = new Persona(nombres[aleatorio(0, 8)], sueldos[aleatorio(0, 8)]);
        Persona p4 = new Persona(nombres[aleatorio(0, 8)], sueldos[aleatorio(0, 8)]);
        Persona p5 = new Persona(nombres[aleatorio(0, 8)], sueldos[aleatorio(0, 8)]);
        Persona p6 = new Persona(nombres[aleatorio(0, 8)], sueldos[aleatorio(0, 8)]);
        Persona p7 = new Persona(nombres[aleatorio(0, 8)], sueldos[aleatorio(0, 8)]);

        p.addPersona(p1);
        p.addPersona(p2);
        p.addPersona(p3);
        p.addPersona(p4);
        p.addPersona(p5);
        p.addPersona(p6);
        p.addPersona(p7);

        ServiceImpresion s =new ServiceImpresion();
        Impresion i=new Tinta();
        s.setIpresion(i);
        System.out.println(s.toString());
        s.imprimir(p);
        

        ServiceImpresion s1 = new ServiceImpresion();
        Impresion i1=new Laser();
        s.setIpresion(i1);
        System.out.println(s.toString());
        s1.imprimir(p);

        ServiceImpresion s2 = new ServiceImpresion();
        Impresion i2=new Termica();
        s.setIpresion(i2);
        System.out.println(s.toString());
        s2.imprimir(p);

    }

    static int aleatorio(int max, int min) {
        int n = (int) (Math.random() * (max - min) + min);
        return n;
    }
}
