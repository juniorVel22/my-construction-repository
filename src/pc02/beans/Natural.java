/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;


public class Natural extends Cliente {
    private String dni;
    private String Apaterno;
    private String Amaterno;
    
    public Natural(){
        
    }
    public Natural(String dni, String Apaterno, String Amaterno, String nombre, String direccion, String correo, String telefono) {
        super(nombre, direccion, correo, telefono);
        this.dni = dni;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    @Override
    public String toString() {
        return "Natural{" + "dni=" + dni + ", Apaterno=" + Apaterno + ", Amaterno=" + Amaterno+",";
    }
    
     
  
}
