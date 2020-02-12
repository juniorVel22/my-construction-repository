
package pc02.beans;

import java.util.Scanner;


public class ejecutable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int opcion;
        do{
            //elegimo el tipo de cliente
            System.out.println("Ingrese tipo de cliente:\n"+
                    "1.Cliente Juridico\n"+"2.Cliente Natural\n"+"3.Salir");
     
            opcion=sc.nextInt();
            
            switch(opcion){
                
                case 1:
                    Pedido p1=new Pedido();
                    Cliente c=new Juridica();
                    Producto pro=new Producto();
                    
                    //INGRESAMOS DATOS DE PEDIDO
                    p1.AgregarPedido(c);
                    System.out.println();
                    
                   
                    //AGREGAMOS UN PEDIDO A CLIENTE
                    c.setPedido(p1);
                    //AGREGAMOS UN CLIENTE A PEDIDO
                    p1.setCliente(c);
    
                    //SE AGREGA UN PRODUCTO A CLIENTE
                    c.setProducto(pro);
                    
                    //INGRESAMOS DATOS DE PRODUCTO
                    System.out.println("Ingrese datos del producto: ");
                    p1.AgregarProducto(pro);
                    System.out.println();
                    //ASIGNAMOS UN PEDIDO A PRODUCTO
                    pro.setPedido(p1);
                    //AGREGAMOS UN PRODUCTO AL PEDIDO
                    p1.setProducto(pro);   
                    
                    //IMPRIME LOS DATOS DEL PEDIDO
                    System.out.println(p1.toString());
                    pro.totalPagar(p1.getCantidad());
                    break;
                    
                case 2:
                    Cliente c1=new Natural();
                    Producto pro1=new Producto();
                    Pedido p2=new Pedido();
                    
                    p2.AgregarPedido(c1);
                    System.out.println();
                    
                    
                    //ASIGNA UN PEDIDO A CLIENTE
                    c1.setPedido(p2);
                    //AGREGA UN CLIENTE A UN PEDIDO
                    p2.setCliente(c1);
                    
                    //AGREGA UN PRODUCTO A UN CLIENTE
                    c1.setProducto(pro1);
                    
                    //datos producto
                    p2.AgregarProducto(pro1);
                    System.out.println();
                    
                    //AL PRODUCTO SE LE ASIGNA UN PEDIDO
                    pro1.setPedido(p2);
                    
                    //SE ASIGNA UN PRODUCTO A PEDIDO
                    p2.setProducto(pro1);
                    
                    //IMPREME DATOS DE PEDIDO
                    System.out.println("DATOS DEL PEDIDO");
                    System.out.println(p2.toString());
                    //IMPRIME EL TOTAL A PAGAR
                    pro1.totalPagar(p2.getCantidad());
                    
                    
                    
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcion no encontrada");
            }
        }while(opcion!=3);
            
    }
}
