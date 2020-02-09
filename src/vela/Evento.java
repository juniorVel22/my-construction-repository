/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vela;

import java.util.ArrayList;


public class Evento {
    private String titulo;
    private int duracion;
    private int horaIngreso;
    private int horaSalida;
    private boolean temporadaAlta;
    
    private Constantes constantes=new Constantes();
    
    private ArrayList<Expositor> expositores=new ArrayList<Expositor>();
    
    private ArrayList<Asistente> asistentes=new ArrayList<Asistente>();

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
    
    public void costoIngreso(String cod){
        if(cod.equalsIgnoreCase("P")){
            System.out.println("precio="+constantes.platinum);
        }else if(cod.equalsIgnoreCase("G")){
            System.out.println("precio="+constantes.gold);
        }else if(cod.equalsIgnoreCase("V")){
            System.out.println("precio="+constantes.vip);
        }else {
            System.out.println("NO ESTA ENTRE LAS OPCIONES");
        }
        
    }
    
    public void totalPagar(String cod){
        double igv;
        if(cod.equalsIgnoreCase("P")){   
            igv=(constantes.platinum)*0.18;
            constantes.totalPagar=(constantes.platinum)+igv;
            System.out.println("total="+constantes.totalPagar);
        }else if(cod.equalsIgnoreCase("G")){
            igv=(constantes.gold)*0.18;
            constantes.totalPagar=(constantes.gold)+igv;
            System.out.println("total="+constantes.totalPagar);
        }else if(cod.equalsIgnoreCase("V")){
            igv=(constantes.vip)*0.18;
            constantes.totalPagar=(constantes.vip)+igv;
            System.out.println("total="+constantes.totalPagar);
        }else {
            System.out.println("NO ESTA ENTRE LAS OPCIONES");
        }
        
    }
    
    public void descuentos(String cod){
        double des;
        if(cod.equalsIgnoreCase("P")){
            if(isTemporadaAlta()==false){
                des=constantes.platinum*0.10;
                System.out.println("su descuento es :"+des);
            }else{
                des=constantes.platinum*0.05;
                System.out.println("su descuento es: "+des);
            }
        }else if(cod.equalsIgnoreCase("G")){
            if(isTemporadaAlta()==false){
                des=constantes.gold*0.10;
                System.out.println("su descuento es: "+des);
            }else{
                des=constantes.gold*0.05;
                System.out.println("su descuento es: "+des);
            }
        }else if(cod.equalsIgnoreCase("V")){
            if(isTemporadaAlta()==false){
                des=constantes.vip*0.10;
                System.out.println("su descuento es: "+des);
            }else{
                des=constantes.vip*0.05;
                System.out.println("su descuento es: "+des);
            }
        }
    }

    @Override
    public String toString() {
        return "Evento{" + "titulo=" + titulo + ", duracion=" + duracion + ", horaIngreso=" + horaIngreso + ", horaSalida=" + horaSalida + ", temporadaAlta=" + temporadaAlta + '}';
    }

   
    
    
    
}
