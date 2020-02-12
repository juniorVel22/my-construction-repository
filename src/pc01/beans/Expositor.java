/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc01.beans;


public class Expositor {
    protected String codigo;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected Evento evento;
    public Expositor() {
    }
    
    
    public Expositor(String codigo, String nombre, String apellido, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    
    @Override
    public String toString() {
        return "Expositor{" + "Evento="+evento.getTitulo() + ", codigo=" + codigo + ", nombre=" + nombre +" "+ apellido + ", correo=" + correo + '}'+"\n";
    }
    
    
}
