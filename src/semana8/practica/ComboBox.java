/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class ComboBox {
    public static void main(String[] args) {
        MarcoComboBox mcb=new MarcoComboBox();
        mcb.setVisible(true);
        mcb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoComboBox extends JFrame{
    public MarcoComboBox(){
        super("marco comboBox");
        setLayout(new FlowLayout());
        setBounds(300, 200, 400, 300);
        JComboBox curso = new JComboBox();
        
        curso.addItem("Curso de Java");
        curso.addItem("Curso de C++");
        curso.addItem("Curso de PHP");
        curso.addItem("Curso de Flash");
        curso.addItem("Curso de JavaScript");
        curso.addItem("Curso de Java");
       
        add(curso);
    }
}