/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CampoTexto {
    public static void main(String[] args) {
        marcoCampoTexto mar=new marcoCampoTexto();
        mar.setVisible(true);
        mar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class marcoCampoTexto extends JFrame{
    public marcoCampoTexto(){
        super("campo texto");
        setLayout(new FlowLayout());
        setBounds(300, 200, 400, 300);
        setBackground(Color.yellow);
        JLabel etiquetaPagina = new JLabel("Dirección página web: ");
        JTextField direccionPagina = new JTextField("Escribe aquí", 30);
        add(etiquetaPagina);
        add(direccionPagina);
        
    }
    
}
