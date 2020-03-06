/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class AreaTexto extends JFrame {
    public AreaTexto(){
        super("Area texto");
        setBounds(200,100 , 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea comentarios=new JTextArea(8,40);
        setLayout(new FlowLayout());
        add(comentarios);
        setVisible(true);
    }
    public static void main(String[] args) {
        AreaTexto a=new AreaTexto();
        a.setVisible(true);
    }
            
}
