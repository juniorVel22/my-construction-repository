/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Botones {

    public static void main(String[] args) {
        marcoBotones mb = new marcoBotones();
        mb.setVisible(true);
        mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoBotones extends JFrame {

    JButton b1;
    JLabel fecha;

    public marcoBotones() {

        super("marco botones");
        setLayout(new BorderLayout());
        setLayout(new FlowLayout());
        setBounds(100, 200, 300, 200);
        b1 = new JButton("PLAY");
        
        fecha=new JLabel();
        fecha.setSize(20, 60);
        fecha.setFont(new Font("serif", Font.BOLD, 24));
        acciona a=new acciona();
        b1.addActionListener(a);
        add(b1);
        
        
        add(fecha);
     

    }

    private class acciona implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //String tiempo;
            // obtener fecha y hora actual
            Calendar ahora = Calendar.getInstance();
            int hora = ahora.get(Calendar.HOUR_OF_DAY);
            int minuto = ahora.get(Calendar.MINUTE);
            int mes = ahora.get(Calendar.MONTH) + 1;
            int dia = ahora.get(Calendar.DAY_OF_MONTH);
            int year = ahora.get(Calendar.YEAR);

            String nombreMes = "";
            switch (mes) {
                case (1):
                    nombreMes = "Enero";
                    break;
                case (2):
                    nombreMes = "Febrero";
                    break;
                case (3):
                    nombreMes = "Marzo";
                    break;
                case (4):
                    nombreMes = "Abril";
                    break;
                case (5):
                    nombreMes = "Mayo";
                    break;
                case (6):
                    nombreMes = "Junio";
                    break;
                case (7):
                    nombreMes = "Julio";
                    break;
                case (8):
                    nombreMes = "Agosto";
                    break;
                case (9):
                    nombreMes = "Septiembre";
                    break;
                case (10):
                    nombreMes = "Octubre";
                    break;
                case (11):
                    nombreMes = "Noviembre";
                    break;
                case (12):
                    nombreMes = "Diciembre";
            }
            fecha.setText(dia + " de " + nombreMes + " de " + year + ",  " + " Hora:  "
                    + "[" + hora + ":" + minuto + "]");
            
        }

    }
}
