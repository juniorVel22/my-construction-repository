/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelReloj {
    public static void main(String[] args) {
        MarcoReloj mr=new MarcoReloj();
        mr.setVisible(true);
        mr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoReloj extends JFrame{
    public MarcoReloj(){
        super("Marco reloj");
        setLayout(new FlowLayout());
        setLayout(new BorderLayout());
        setBounds(100, 200, 400, 200);
        PanelRel tiempo= new PanelRel();
        add(tiempo,BorderLayout.SOUTH);
    }
}

class PanelRel extends JPanel{
    public PanelRel(){
        super();
        String tiempoActual = getTiempo();
        JLabel tiempo = new JLabel("Fecha: ");
        JLabel actual = new JLabel(tiempoActual);
        add(tiempo);
        add(actual);
    }
    String getTiempo() {
        String tiempo;
        // obtener fecha y hora actual
        Calendar ahora = Calendar.getInstance();
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        int minuto= ahora.get(Calendar.MINUTE);
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
        tiempo = dia + " de " + nombreMes + " de "  + year + ",  " + " Hora:  "
            +"["+ hora + ":" + minuto+"]";
        return tiempo;
    }
}