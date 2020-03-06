/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4.teorico;


public class Humano {
    protected String nombre;
    protected String apellido;

    public Humano(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public String nombreCompleto(){
        return this.nombre+this.apellido;
    }
    
    public String identificacion(){
        return nombreCompleto();
    }   


    public String toStringPadre() {
        return "Humano{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}

class Ciudadano extends Humano{
    private String documento;

    public Ciudadano(String documento, String nombre, String apellido) {
        super(nombre, apellido);
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return toStringPadre()+", Ciudadano{" + "documento=" + documento + '}';
    }
    
}
class run{
    public static void main(String[] args) {
        Ciudadano c=new Ciudadano("1134322", "juan", "vela");
        System.out.println(c.toString());
        c.toString();
    }
}
