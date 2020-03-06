/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cajasChequeo {

    public static void main(String[] args) {
        marcoCheck m = new marcoCheck();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class marcoCheck extends JFrame {

    public marcoCheck() {
        //setLayout(new BorderLayout());
        setLayout(new FlowLayout());
        setTitle("marco checkbox");
        setBounds(300, 200, 400, 300);

        JCheckBox cursoJava = new JCheckBox("Curso de Java",true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash",true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP",false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby",false);

//        JPanel cursos = new JPanel();
//        cursos.add(cursoJava);
//        cursos.add(cursoFlash);
//        cursos.add(cursoPHP);
//        cursos.add(cursoRuby);
//
//        add(cursos,BorderLayout.SOUTH);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(cursoJava);
        grupo.add(cursoFlash);
        grupo.add(cursoPHP);
        grupo.add(cursoRuby);
        
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);

    }
}
