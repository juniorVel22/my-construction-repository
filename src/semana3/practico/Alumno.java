/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;

import java.util.Scanner;


public class Alumno {
    private String nombre;
    private String edad;

    public Alumno(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}

class Cola{
    private class NodoProceso{
        public Alumno alumno;
        public NodoProceso siguiente;

        public NodoProceso(Alumno alumno) {
            this.alumno=alumno;
        }

        public NodoProceso() {
        }
        
       
    }
    
    private NodoProceso cabeza,ultimo;
    
    public void ingresar(Alumno a){
        NodoProceso nuevoNodo=new NodoProceso(a);
        if(cabeza==null){
            cabeza =nuevoNodo;
        }else{
            ultimo.siguiente=nuevoNodo;
        }
        ultimo=nuevoNodo;
    }
    
    public void eliminar(){
        if(cabeza!=null){
            NodoProceso eliminar=cabeza;
            cabeza=cabeza.siguiente;
            eliminar.siguiente=null;
            if(cabeza==null){
                ultimo=null;
            }
        }
    }
    
    public Alumno obtener(){
        if(cabeza==null){
            return null;
        }else{
            return cabeza.alumno;
        }
    }
}

class run{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cola c=new Cola();
        
        int opcion;
        do{
            System.out.println("ingrese:\n"+"1.Ingresar\n"+"2.elimina\n"+"3.obtener\n"+"4.salir");
            opcion=sc.nextInt();
            
            switch(opcion){
                case 1:
                    Alumno a=new Alumno(sc.next(), sc.next());
                    c.ingresar(a);
                    break;
                case 2:
                    c.eliminar();
                    break;
                case 3:
                    System.out.println(c.obtener());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no encontrada");
            }
        }while(opcion!=4);
    }
}