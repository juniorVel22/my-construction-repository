/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

/**
 *
 * @author JHUNIOR
 */
public class Juridica extends Cliente {
    private String ruc;
    
    public Juridica(){
        
    }
    public Juridica(String ruc, String nombre, String direccion, String correo, String telefono) {
        super(nombre, direccion, correo, telefono);
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @Override
    public String toString() {
        return "Juridica{" + "ruc=" + ruc+"," ;
    }

    
    
}
