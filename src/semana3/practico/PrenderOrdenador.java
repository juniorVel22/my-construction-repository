/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;


public class PrenderOrdenador {
    public static void main(String[] args) {
        
        CPU c=new CPU("40MHz");
        Pantalla p=new Pantalla("hd");
        Teclado t=new Teclado("grande");
        Raton r=new Raton("sdsd");
        
        Ordenador o=new Ordenador("sjdhbsk");
        o.armarOrdenador(c, p, t, r);
        System.out.println(o.toString());
        
        
        
        
    }
}

class Ordenador{
    private String marca;
    private CPU cpu;
    private Pantalla pantalla;
    private Teclado teclado;
    private Raton raton;

    public Ordenador(String marca) {
        this.marca = marca;
    }
    
    

    public Ordenador(String marca, CPU cpu, Pantalla pantalla, Teclado teclado, Raton raton) {
        this.marca = marca;
        this.cpu = cpu;
        this.pantalla = pantalla;
        this.teclado = teclado;
        this.raton = raton;
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    public void armarOrdenador(CPU c,Pantalla p,Teclado t,Raton r){
        setCpu(cpu);
        setPantalla(p);
        setTeclado(t);
        setRaton(r);
        
        getCpu();
        getPantalla();
        getTeclado();
        getRaton();
    }

    @Override
    public String toString() {
        return "Ordenador{" + "marca=" + marca + ", cpu=" + cpu + ", pantalla=" + pantalla + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
}

class CPU{
    private String velocidad;

    public CPU(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "CPU{" + "velocidad=" + velocidad + '}';
    }
}
class Pantalla{
    private String resolucion;

    public Pantalla(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "resolucion=" + resolucion + '}';
    }
}

class Teclado{
    
    private String descripcion;

    public Teclado(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Teclado{" + "descripcion=" + descripcion + '}';
    }
    
}

class Raton{
    private String modelo;

    public Raton(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Raton{" + "modelo=" + modelo + '}';
    }
}