/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ejercicioActividad extends JFrame {

    public static void main(String[] args) {
        new ejercicioActividad();
    }

    JLabel lblTitulo, lblNombre, lblEdad, lblRaza;
    JTextField txtNombre, txtEdad, txtRaza;
    JButton btnRegistrar, btnMostrar;

    ArrayList<Mascotas> lista;
   
    public ejercicioActividad() {
        AgregarComponentes();
        lista = new ArrayList<Mascotas>();
        
    }

    public void AgregarComponentes() {

        setLayout(null);
        setTitle("REGISTRO");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        lblTitulo = new JLabel("REGISTRAR MASCOTA");
        lblTitulo.setBounds(110, 10, 130, 20);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 50, 60, 20);
        txtNombre = new JTextField();
        txtNombre.setBounds(100, 50, 90, 20);

        lblEdad = new JLabel("Edad: ");
        lblEdad.setBounds(30, 80, 50, 20);
        txtEdad = new JTextField();
        txtEdad.setBounds(100, 80, 50, 20);

        lblRaza = new JLabel("Raza");
        lblRaza.setBounds(30, 110, 50, 20);
        txtRaza = new JTextField();
        txtRaza.setBounds(100, 110, 90, 20);

        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setBounds(250, 50, 100, 20);
        btnMostrar = new JButton("VER");
        btnMostrar.setBounds(250, 80, 100, 20);

        add(lblTitulo);
        add(lblNombre);
        add(lblEdad);
        add(lblRaza);
        add(txtNombre);
        add(txtEdad);
        add(txtRaza);
        add(btnRegistrar);
        add(btnMostrar);

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonMostrarActionPerformed(e);
            }
        });

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonRegistrarActionPerformed(e);
            }
        });

    }

    private void botonMostrarActionPerformed(ActionEvent e) {

        MarcoMostrar mm = new MarcoMostrar();
        mm.setVisible(true);
        //mm.txaMostrar.setText(mostrar());
        //this.dispose();
    }

    private void botonRegistrarActionPerformed(ActionEvent e) {
        int ed = Integer.parseInt(txtEdad.getText());
        Mascotas m = new Mascotas(txtNombre.getText(), ed, txtRaza.getText());

        lista.add(m);
        
        txtNombre.setText("");
        txtEdad.setText("");
        txtRaza.setText("");

    }

    public String mostrar() {
        String cad = "";
       
        for (int i = 0; i < lista.size(); i++) {
            cad += lista.get(i).toString()+ "\n";
        }
        return cad;
    }

}

class MarcoMostrar extends JFrame {

    JLabel lblMascotas;
    JTextArea txaMostrar;
    JButton btnRegistrarMas;
    JButton btnListar;
    ejercicioActividad ej = new ejercicioActividad();
    
    public MarcoMostrar() {       
        agregarComponentes();       
    }   

    public void agregarComponentes() {
        setLayout(null);
        setTitle("MASCOTAS");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        lblMascotas = new JLabel("Lista de mascotas: ");
        lblMascotas.setBounds(20, 20, 120, 20);
        txaMostrar = new JTextArea();
        txaMostrar.setBounds(20, 60, 350, 150);
        btnRegistrarMas = new JButton("VOLVER A REGISTRAR");
        btnRegistrarMas.setBounds(20, 220, 160, 20);
        btnListar = new JButton("LISTAR");
        btnListar.setBounds(230, 220, 100, 20);
        add(lblMascotas);
        add(txaMostrar);
        add(btnRegistrarMas);
        add(btnListar);

        btnRegistrarMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonVolverActionPerformed(e);
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonListarActionPerformed(e);
            }
        });

    }

    private void botonVolverActionPerformed(ActionEvent e) {
        
        //ej.setVisible(true);
        //this.dispose();
        setVisible(false);
        this.dispose();
    }

    public void botonListarActionPerformed(ActionEvent e) {
        txaMostrar.setText(ej.mostrar());
    }

}

class Mascotas {

    private String nombre;
    private int edad;
    private String raza;

    public Mascotas(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public Mascotas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
}
