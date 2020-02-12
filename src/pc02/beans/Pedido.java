/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

import java.util.Calendar;
import java.util.Scanner;


public class Pedido {
    Scanner sc=new Scanner(System.in);
    private int nroPdedido;
    private Calendar fecha=Calendar.getInstance();
    private int cantidad;
    private Cliente cliente;
    private Producto producto;

    public Pedido() {
    }

   
    public Pedido(int nroPdedido, int cantidad) {
        this.nroPdedido = nroPdedido;
        this.cantidad = cantidad;
        
    }

    public int getNroPdedido() {
        return nroPdedido;
    }

    public void setNroPdedido(int nroPdedido) {
        this.nroPdedido = nroPdedido;
    }

    public String getFecha() {
        String dato;
        int dia=fecha.get(fecha.DAY_OF_MONTH);
        int mes=fecha.get(fecha.MONTH);
        int anio=fecha.get(fecha.YEAR);
        dato=(dia)+"/"+(mes+1)+"/"+anio;
        return dato;
    }

    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public void AgregarPedido(Cliente c){
        System.out.println("INGRESE DATOS DEL PEDIDO:");
        System.out.print("ingrese numero de pedido:");
        nroPdedido=sc.nextInt();
        System.out.print("ingrese cantidad:");
        cantidad=sc.nextInt();
        System.out.println();
        
        setNroPdedido(nroPdedido);
        setCantidad(cantidad);
        
        getNroPdedido();
        getCantidad();
        
        if(c instanceof Juridica){
            if(getCantidad()%100==0){
                System.out.println("INGRESA DATOS DEL CLIENTE");
                AgregarCliente(c);
                System.out.println();
            }else if(getCantidad()%100!=0){
                System.out.println("Pedido no ejecutado usted debe comprar en catidades multiplos de 100, VUELVA A REALIZAR PEDIDO");
                AgregarPedido(c);
            }
        }else if(c instanceof Natural){
            if(getCantidad()<100){
                System.out.println("INGRESE DATOS DEL CLIENTE:");
                AgregarCliente(c);
                System.out.println();
            }else if(getCantidad()>100){
                System.out.println("Pedido no ejecutado, usted no debe comprar cantidades mayores a 100, VUELVA A REALIZAR PEDIDO");
                AgregarPedido(c);
            }
        }
        
    }
    
    public void AgregarCliente(Cliente c){
        String nom,dir,correo,tel;
        if(c instanceof Juridica){
            String ruc;
            System.out.print("ingrese ruc:");
            ruc=sc.next();
            System.out.print("ingrese nombre de la tienda:");
            nom=sc.next();
            System.out.print("ingrese direccion:");
            dir=sc.next();
            System.out.print("ingrese correo:");
            correo=sc.next();
            System.out.print("ingrese telefono:");
            tel=sc.next();
            
            ((Juridica) c).setRuc(ruc);
            c.setNombre(nom);
            c.setDireccion(dir);
            c.setCorreo(correo);
            c.setTelefono(tel);  
            
            ((Juridica) c).getRuc();
            c.getNombre();
            c.getDireccion();
            c.getCorreo();
            c.getTelefono();
        }else if(c instanceof Natural){
            String dni,paterno,materno;
            System.out.print("ingrese nombre:");
            nom=sc.next();
            System.out.print("ingrese apellido parterno:");
            paterno=sc.next();
            System.out.print("ingrese apellido materno:");
            materno=sc.next();
            System.out.print("ingrese dni:");
            dni=sc.next();           
            System.out.print("ingrese direccion:");
            dir=sc.next();
            System.out.print("ingrese correo:");
            correo=sc.next();
            System.out.print("ingrese telefono:");
            tel=sc.next();
            
            c.setNombre(nom);
            ((Natural) c).setApaterno(paterno);
            ((Natural) c).setAmaterno(materno);
            ((Natural) c).setDni(dni);
            c.setDireccion(dir);
            c.setCorreo(correo);
            c.setTelefono(materno);
            
        }
    }
    
    public void AgregarProducto(Producto p){
        int cod,stock;
        
        String descripcion,uniMedida;
        
        System.out.print("ingresa codigo de producto:\n"+"1.Queso\n"+"2.leche\n"+"3.Mantequilla\n");
        cod=sc.nextInt();
        
        if(cod==1){
            System.out.println("INGRESA DATOS DEL PRODUCTO:");
            System.out.print("ingresa descripcion:");
            descripcion=sc.next();
            System.out.print("ingresa unidad de medida:");
            uniMedida=sc.next();
 
            stock=800;
            stock-=getCantidad();
            
            p.setCodido(cod);
            p.setStock(stock);
            p.setDescripcion(descripcion);
            p.setUnidadMedida(uniMedida);
            
            p.getCodido();
            p.getStock();
            p.getDescripcion();
            p.getUnidadMedida();
            
        }else if(cod==2){
            System.out.println("INGRESA DATOS DEL PRODUCTO:");
            System.out.print("ingresa descripcion:");
            descripcion=sc.next();
            System.out.print("ingresa unidad de medida:");
            uniMedida=sc.next();
            
            
            stock=10200;
            stock-=getCantidad();
            
            p.setCodido(cod);
            p.setStock(stock);
            p.setDescripcion(descripcion);
            p.setUnidadMedida(uniMedida);
   
            
            p.getCodido();
            p.getStock();
            p.getDescripcion();
            p.getUnidadMedida();
       
        }else if(cod==3){
            
            System.out.print("ingresa descripcion:");
            descripcion=sc.next();
            System.out.print("ingresa unidad de medida:");
            uniMedida=sc.next();
            
            stock=12000;
            stock-=getCantidad();
                        
            p.setCodido(cod);
            p.setStock(stock);
            p.setDescripcion(descripcion);
            p.setUnidadMedida(uniMedida);
            
            
            p.getCodido();
            p.getStock();
            p.getDescripcion();
            p.getUnidadMedida();
        }
        
        
        
        
    }

    @Override
    public String toString() {
        String dato=" nombre: "+cliente.getNombre()+", direccion:"+cliente.getDireccion()+", correo:"+cliente.getCorreo()+", telefono:"+cliente.getTelefono()+'}';
        if(cliente instanceof Juridica){
            return "PEDIDO{ "+ "nroPdedido=" + nroPdedido + ", fecha=" + getFecha() + ", cantidad=" + cantidad + ", CLIENTE =" + cliente+dato + ", PRODUCTO=" + producto + '}';
        }else if(cliente instanceof Natural){
            return "PEDIDO{ "+ "nroPdedido=" + nroPdedido + ", fecha=" + getFecha() + ", cantidad=" + cantidad + ", CLIENTE=" + cliente+dato + ", PRODUCTO=" + producto + '}';
        }
        return dato;
    }
    
    
    
    
    
}
