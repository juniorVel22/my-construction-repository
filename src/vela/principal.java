/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vela;

import java.util.Scanner;


public class principal {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cod;
        System.out.println("codigo: ");
        
        cod=sc.next();
  
        Evento e1=new Evento("congreso sistemas", 2, 7, 9, false);
        System.out.println(e1.toString());
        e1.costoIngreso(cod);
        e1.descuentos(cod);
        e1.totalPagar(cod);

	System.out.println("continuaremos mas tarde");
        
    }
}
