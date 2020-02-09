/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

import java.util.ArrayList;


public class Doctor {
    private int id;
    private String nombre;

    public Doctor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
     
    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", nombre=" + nombre + '}';
    }
 
}

class principal{
    public static void main(String[] args) {
        ArrayList<Doctor> listaDoctor=new ArrayList<Doctor>();
        
        listaDoctor.add(new Doctor(1,"Juan"));
        listaDoctor.add(new Doctor(2,"Maria"));
        listaDoctor.add(new Doctor(3,"Pedro"));
        listaDoctor.add(new Doctor(4,"Raul"));
        listaDoctor.add(new Doctor(5,"Pablo"));
        listaDoctor.add(new Doctor(6,"Wilson"));
        
        for (Doctor doctores : listaDoctor) {
            System.out.println(doctores.toString());
        }
    }
}
