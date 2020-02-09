/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vela;

import java.util.Scanner;



public class principal {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Evento e1=new Evento();
        e1.AgregarEvento();
        System.out.println(e1.toString());
          
     
        int opciones;
        do{
           
            System.out.println("Ingrese:\n"+"1.Agregar expositores\n"+"2.Agregar asistentes\n"+"3.Salir");
            opciones=sc.nextInt();
           
            
            
            switch(opciones){
                case 1:
                    Expositor e=new Expositor();
                    e1.agregarExpositor(e);
                    e.setEvento(e1);
                    e1.setExpositor(e);
                    System.out.println("Expositor agregado correctamente al evento: "+e1.getTitulo());
                    System.out.println(e.toString());
                    System.out.println(); 
                    break;
                case 2:
                    Asistente a=new Asistente();
                    e1.AgregarAsistente(a);
                    int cod;
                    do{
                        System.out.println("Ingrese ubicacion:\n"+"1 = platinum\n"
                                +"2 = Glod\n"+"3 = Vip\n");  
                        cod=sc.nextInt();
                    }while(cod>3);
                    //agregamos asistente al avento
                    a.setEvento(e1);
                    e1.setAsistente(a);
                    System.out.println("Asistente agregado correctamente al evento: "+e1.getTitulo());
                    System.out.println(a.toString());;
                    e1.costoIngreso(cod);
                    e1.masIGV(cod);
                    e1.descuentos(cod);
                    
                    System.out.println();
                    
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcion no encontrada");
                    
            }
        }while(opciones!=3);
        
    }
}
