
package vela;

import java.util.Scanner;



public class principal {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Evento e1=new Evento();
        System.out.println("AGREGA UN EVENTO");
        e1.AgregarEvento();
        System.out.println(e1.toString());
        System.out.println();
     
        int opciones;
        do{
           
            System.out.println("Ingrese una opcion:\n"+"1.Agregar expositores\n"+
                    "2.Agregar asistentes\n"+
                    "3.Eliminar expositor\n"+
                    "4.Eliminar asistente\n"+
                    "5.Mostrar Expositores\n"+
                    "6.Mostrar asistentes\n"+"7.Salir");
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
                    String codDelE;
                    System.out.print("Ingrese el codigo del Expositor que va a eliminar: ");
                    codDelE=sc.next();
                    e1.EliminarExpositor(codDelE);
                    break;
                case 4:
                    String codDelA;
                    System.out.print("Ingrese el codigo del Asistente que va a eliminar: ");
                    codDelA=sc.next();
                    e1.EliminarAsistente(codDelA);
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Expositores:");
                    System.out.println(e1.mostrarExpositor());
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Asistentes al evento:");
                    System.out.println(e1.mostrarAsistente());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("opcion no encontrada");
                    
            }
        }while(opciones!=7);
        
    }
}
