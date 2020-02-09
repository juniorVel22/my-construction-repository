/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vela;

import java.util.ArrayList;
import java.util.Scanner;


public class Evento {
    Scanner sc=new Scanner(System.in);
    private String titulo;
    private int duracion;
    private int horaIngreso;
    private int horaSalida;
    private boolean temporadaAlta;
    
    private Constantes constantes=new Constantes();
    
    private ArrayList<Expositor> expositores=new ArrayList<Expositor>();
    
    private ArrayList<Asistente> asistentes=new ArrayList<Asistente>();
    
    public Evento(){
        
    }
    public Evento(String titulo, int duracion, int horaIngreso, int horaSalida, boolean temporadaAlta) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.temporadaAlta = temporadaAlta;
    }
    
    public void setAsistente(Asistente asistente){
        asistentes.add(asistente);
    }
    
    public String mostrarAsistente(){
        String dato="";
        for (Asistente a : asistentes) {
            dato+=a.toString();
        }
        return dato;
    }
    public void setExpositor(Expositor expositor){
        expositores.add(expositor);
    }
    
    public String mostrarExpositor(){
        String dato="";
        for (Expositor e : expositores) {
            dato+=e.toString();
        }
        return dato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isTemporadaAlta() {
        return temporadaAlta;
    }

    public void setTemporadaAlta(boolean temporadaAlta) {
        this.temporadaAlta = temporadaAlta;
    }
    
    public void costoIngreso(int cod){
        do{
            if(cod==1){
                System.out.println("precio normal="+constantes.platinum+"$");
            }else if(cod==2){
                System.out.println("precio normal="+constantes.gold+"$");
            }else if(cod==3){
                System.out.println("precio normal="+constantes.vip+"$");
            }
        }while(cod>3);
 
    }
    
    public void masIGV(int cod){
        double igv;
        if(cod==1){   
            igv=(constantes.platinum)*0.18;
            constantes.totalPagar=(constantes.platinum)+igv;
            System.out.println(" + igv="+constantes.totalPagar+"$");
        }else if(cod==2){
            igv=(constantes.gold)*0.18;
            constantes.totalPagar=(constantes.gold)+igv;
            System.out.println("+ igv="+constantes.totalPagar+"$");
        }else if(cod==3){
            igv=(constantes.vip)*0.18;
            constantes.totalPagar=(constantes.vip)+igv;
            System.out.println("+ igv="+constantes.totalPagar+"$");
        }else {
            System.out.println("NO ESTA ENTRE LAS OPCIONES");
        }
        
    }
    
    public void descuentos(int cod){
        double des;
        if(cod==1){
            if(isTemporadaAlta()==false){
                des=constantes.platinum*0.10;
                constantes.totalPagar-=des;
                System.out.println("temporada baja -10% :"+des+"$");
                System.out.println("Su pago sera: "+constantes.totalPagar+"$");
            }else{
                des=constantes.platinum*0.05;
                constantes.totalPagar-=des;
                System.out.println("temporada alta -5% : "+des+"$");
                System.out.println("Su pago sera: "+constantes.totalPagar+"$");
            }
        }else if(cod==2){
            if(isTemporadaAlta()==false){
                des=constantes.gold*0.10;
                constantes.totalPagar-=des;
                System.out.println("temporada baja -10% : "+des+"$");
                System.out.println("Su pago sera: "+constantes.totalPagar+"$");
            }else{
                des=constantes.gold*0.05;
                constantes.totalPagar-=des;
                System.out.println("temporada alta -5% : "+des+"$");
                System.out.println("Su pago sera: "+constantes.totalPagar+"$");
            }
        }else if(cod==3){
            if(isTemporadaAlta()==false){
                des=constantes.vip*0.10;
                constantes.totalPagar-=des;
                System.out.println("temporada baja -10% : "+des+"$");
                System.out.println("Su pago sera: "+constantes.totalPagar+"$");
            }else{
                des=constantes.vip*0.05;
                constantes.totalPagar-=des;
                System.out.println("temporada alta -5% : "+des+"$");
                System.out.println("Su pago sera: "+constantes.totalPagar+"$");
            }
        }
    }
    
    public void AgregarEvento(){
        
        String t;
        int d,Hi,Hs;
        boolean temA;
        System.out.print("Ingrese titulo:");
        t=sc.nextLine();
        System.out.print("Ingrese duracion:");
        d=sc.nextInt();
        System.out.print("Ingrese hora ingreso:");
        Hi=sc.nextInt();
        System.out.print("Ingrese hora salida:");
        Hs=sc.nextInt();
        System.out.print("¿es temporada alta?: ");
        temA=sc.nextBoolean();
        
        setTitulo(t);
        setDuracion(d);
        setHoraIngreso(Hi);
        setHoraSalida(Hs);
        setTemporadaAlta(temA);
        
        getTitulo();
        getDuracion();
        getHoraIngreso();
        getHoraSalida();
        isTemporadaAlta();
                
    }
    
    public void agregarExpositor(Expositor e){
        String codE,nomE,apE,correoE;
        System.out.print("ingrese codigo:");
        codE=sc.next();
        System.out.print("ingrese nombre:");
        nomE=sc.next();
        System.out.print("ingrese apellido:");
        apE=sc.next();
        System.out.print("ingrese correo:");
        correoE=sc.next();
        e.setCodigo(codE);
        e.setNombre(nomE);
        e.setApellido(apE);
        e.setCorreo(correoE);
        
        e.getCodigo();
        e.getNombre();
        e.getApellido();
        e.getCorreo();
        
    }
    
    public void AgregarAsistente(Asistente a){
        String codA,nomA,apA,correoA,dir;
        int tel;
        System.out.print("ingrese codigo:");
        codA=sc.next();
        System.out.print("ingrese nombre:");
        nomA=sc.next();
        System.out.print("ingrese apellido:");
        apA=sc.next();
        System.out.print("ingrese correo:");
        correoA=sc.next();
        System.out.print("ingrese direccion:");
        dir=sc.next();
        System.out.print("ingrese telefeno: ");
        tel=sc.nextInt();
        
        a.setCodigo(codA);
        a.setNombre(nomA);
        a.setApellido(apA);
        a.setCorreo(correoA);
        a.setDireccion(dir);
        a.setTelefono(tel);
        
        a.getCodigo();
        a.getNombre();
        a.getApellido();
        a.getCorreo();
        a.getDireccion();
        a.getTelefono();
    }

    @Override
    public String toString() {
        return "Evento{" + "titulo=" + titulo + ", duracion=" + duracion + ", horaIngreso=" + horaIngreso + ", horaSalida=" + horaSalida + ", temporadaAlta=" + temporadaAlta + '}';
    }

   
    
    
    
}
