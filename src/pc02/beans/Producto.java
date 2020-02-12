/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;


public class Producto {
    private int codido;
    private String tipo;
    private String descripcion;
    private double precio;
    private int stock;
    private String unidadMedida;
    private Pedido pedido;

    public Producto() {
    }
    
    
    public Producto(int codido, String tipo, String descripcion, double precio, int stock, String unidadMedida) {
        this.codido = codido;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.unidadMedida = unidadMedida;
    }

    
    

    public int getCodido() {
        return codido;
    }

    public void setCodido(int codido) {
        this.codido = codido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void totalPagar(int cantidad){
        double total;
        if(getCodido()==1){
            precio=10;
            total=cantidad*precio;
            System.out.println("pago= "+total);
        }else if(getCodido()==2){
            precio=8;
            total=cantidad*precio;
            System.out.println("pago= "+total);
        }else if(getCodido()==3){
            precio=3;
            total=cantidad*precio;
            System.out.println("pago= "+total);
        }
    }

    @Override
    public String toString() {
        
        if(getCodido()==1){
            return "Producto{" + "codido=" + codido + ", tipo=Queso" + ", descripcion=" + descripcion + ", precio= 10.00$"+ ", stock=" + stock + ", unidadMedida=" + unidadMedida + '}';
        }else if(getCodido()==2){
            return "Producto{" + "codido=" + codido + ", tipo=Leche"  + ", descripcion=" + descripcion + ", precio= 8.00$" + ", stock=" + stock + ", unidadMedida=" + unidadMedida + '}';
        }else{
            return "Producto{" + "codido=" + codido + ", tipo=Mantequilla"+ ", descripcion=" + descripcion + ", precio= 3.00$"+ ", stock=" + stock + ", unidadMedida=" + unidadMedida + '}';
        }
        
    }
    
    
    
    
    
}
