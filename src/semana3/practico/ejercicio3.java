/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;


public class ejercicio3 {
    public static void main(String[] args) {
        DecimalFormat dt=new DecimalFormat("#.##");
        String laboral[]={"Sistemas","Administracion","Marketing"};
        String afi[]={"AFP","SNP"};
        
        People listaPersona=new People();
        Worker w1=new Worker("0434", "juan", laboral[aleatorio(0,3)], 2000, 10, afi[aleatorio(0,2)]);
        Worker w2=new Worker("2324", "maria",laboral[aleatorio(0,3)] , 3000, 9, afi[aleatorio(0,2)]);
        Worker w3=new Worker("2324", "Ana",laboral[aleatorio(0,3)] , 6000, 9, afi[aleatorio(0,2)]);
        Worker w4=new Worker("2324", "Rogelio",laboral[aleatorio(0,3)] , 4000, 9, afi[aleatorio(0,2)]);
     
        listaPersona.add(w1);
        listaPersona.add(w2);
        listaPersona.add(w3);
        listaPersona.add(w4);
        
        for (Worker w : listaPersona) {
            System.out.println(w.toString());
        }
        
        
        System.out.println("el mayor sueldo lo tiene: "+listaPersona.empleadoMayorSueldo());
        System.out.println("promedio del sueldos en en Marketing: "+
                dt.format(listaPersona.sueldoNetoAreas("Marketing")));
        System.out.println("cantidad de empleados con monto de seguro mayor a 100: "+
                listaPersona.empleadosMontoSeguroMas100());
        System.out.println("cantidad de empleados con monto de horas extras entre 500 y 800: "+
                listaPersona.horasExtrasAreas("Sistemas"));
        System.out.println("el empleado del SNP con menor monto de descuento es: "+
                listaPersona.empleadoSNPmenorMontoDes("SNP"));
        
        System.out.println("gastos de la empresa en pagos a emleados: "+
                listaPersona.gastosEmpresaPagoEmpleados());
    }
    
    static int aleatorio(int max, int min){
        int n= (int)(Math.random()*(max-min)+min);        
        return n;
    }
    
    
}

class Worker{
    private String codigo;
    private String nombre;
    private String areaLaboral;
    private double sueldo;
    private int hExtras;
    private String afiliacion;
    

    public Worker(String codigo, String nombre, String areaLaboral, double sueldo, int hExtras, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.hExtras = hExtras;
        this.afiliacion = afiliacion;
    }
    
    public double montoHextras(){
        return (sueldo*hExtras)/240;
    }
    
    public double montoSeguro(){
        if(afiliacion.equals("AFP")){
            return sueldo*0.17;
        }else{
            return sueldo*0.05;
        }
    }
    
    public double montoEsSalud(){
        return sueldo*0.03;
    }
    
    public double montoDescuento(){
        return montoSeguro()+montoEsSalud();
    }
    
    public double montoSueldoBruto(){
        return sueldo+montoHextras();
    }
    public double sueldoNeto(){
        return montoSueldoBruto()-montoDescuento();
    }
    //////////////////////////////////////////////////////

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaLaboral() {
        return areaLaboral;
    }

    public void setAreaLaboral(String areaLaboral) {
        this.areaLaboral = areaLaboral;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int gethExtras() {
        return hExtras;
    }

    public void sethExtras(int hExtras) {
        this.hExtras = hExtras;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Override
    public String toString() {
        return "Worker{" + "codigo=" + codigo + ", nombre=" + nombre +
                ", areaLaboral=" + areaLaboral + ", sueldo=" + sueldo +
                ", hExtras=" + hExtras + ", afiliacion=" + afiliacion +
                "\n horas Extras: "+montoHextras()+
                "\n monto seguro : "+montoSeguro()+
                "\n monto esSalud: "+montoEsSalud()+
                "\n monto descuento: "+montoDescuento()+
                "\n monto sueldo bruto: "+montoSueldoBruto()+
                "\n sueldo neto: "+sueldoNeto()+'}'+"\n";
    }
 
}

class People implements  Iterable<Worker>{
    ArrayList<Worker> listaWorker=new ArrayList<Worker>();

    public void add(Worker w){
        listaWorker.add(w);
    } 
    
    public String empleadoMayorSueldo(){
        String cad="";
        double sueldotemp=0.0;
        for(Worker w:listaWorker){
            if(w.sueldoNeto()>=sueldotemp){
                sueldotemp=w.sueldoNeto();
            }
        }
        for(Worker w:listaWorker){
            if(w.sueldoNeto()==sueldotemp){
                cad+=w.getNombre()+" ";
            }
        }
        return cad;
    }
    
    public double sueldoNetoAreas(String area){
        double acu=0.0;
        for(Worker w:listaWorker){
            if(w.getAreaLaboral()==area){
                acu+=w.sueldoNeto();
            }
        }
        return acu;
    }
    
    public int empleadosMontoSeguroMas100(){
        int n=0;
        for (Worker w : listaWorker) {
            if(w.montoSeguro()>100){
                n+=1;
            }
        }
        return n;
    }
    
    public int horasExtrasAreas(String area){
        int n=0;
        for (Worker w : listaWorker) {
            if(w.getAreaLaboral()==area){
                if(w.montoHextras()>=500&&w.montoHextras()<=800){
                    n+=1;
                }
            }
        }
        return n;
    }
    
    public String empleadoSNPmenorMontoDes(String afiliacion){
        
        String cad="";
        double min=9999;
        for (Worker w : listaWorker) {
            if(w.getAfiliacion()==afiliacion){
                if(w.montoDescuento()<min){
                    min=w.montoDescuento();
                }
            }
        }
        for (Worker w : listaWorker) {
            if(w.getAfiliacion()==afiliacion){
                if(w.montoDescuento()==min){
                    cad+=w.getNombre();
                }
            }
        }
        return cad;
    }
    public double gastosEmpresaPagoEmpleados(){
        double cont=0.0;
        for (Worker w : listaWorker) {
            cont+=w.sueldoNeto();
        }
        return cont;
    } 
    
    @Override
    public Iterator iterator(){
        return listaWorker.iterator();
    }
}