/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.Color;
import javax.swing.JFrame;


public class DosMarcos {
    public static void main(String[] args) {
        Marco1 m1=new Marco1();
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Marco1 extends JFrame{
    public Marco1(){
        super("primer marco");
        setBounds(200, 100, 400, 500);
        setBackground(Color.yellow);
        setVisible(true);
        Marco2 m2=new Marco2();
        m2.setVisible(true);
        
    }
}
class Marco2 extends JFrame{
    public Marco2(){
        super("primer marco");
        setBounds(200, 100, 300, 400);
        //setVisible(true);
    }
            
}