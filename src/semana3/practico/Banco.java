/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.practico;

import java.util.Scanner;

public class Banco {

    Scanner sc = new Scanner(System.in);
    Cliente cliente[];

    public Banco() {
        cliente = new Cliente[3];
    }

    public void operar(Cliente c) {

        System.out.println("ingrese cantidad a depositar");
        double cant = sc.nextDouble();
        c.depositar(cant);

    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public double depositos(Cliente[] c) {
        double t = c[0].getDeposito() + c[1].getDeposito() + c[2].getDeposito();
        return t;
        //System.out.println("cantidad total de dinero depositado: "+t+"$");
    }

    public double extracciones(Cliente[] c) {
        double e = c[0].getExtraccion() + c[1].getExtraccion() + c[2].getExtraccion();
        return e;
    }

    @Override
    public String toString() {
        return "Banco{" + "cliente=" + cliente + '}';
    }

}

class Cliente {

    private String nombre;
    private double deposito;
    private double extraccion;

    public Cliente(String nombre) {
        this.nombre = nombre;

    }

    public double depositar(double monto) {
        return deposito += monto;
    }

    public double sacar(double monto) {
        return deposito -= monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getExtraccion() {
        return extraccion;
    }

    public void setExtraccion(double extraccion) {
        this.extraccion = extraccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", deposito=" + deposito + ", extraccion=" + extraccion + '}';
    }

}

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] c = new Cliente[3];
        Banco b = new Banco();
        for (int i = 0; i < c.length; i++) {
            System.out.println("ingrese nombre:" + (i + 1));
            String nom = sc.nextLine();
            c[i] = new Cliente(nom);
            b.operar(c[i]);
            c[i].setExtraccion(200);
            System.out.println(c[i].toString());

        }
        
        
        System.out.println("cantidad total depositada de los 3 clientes: " + (b.depositos(c) - b.extracciones(c)));

    }
}
