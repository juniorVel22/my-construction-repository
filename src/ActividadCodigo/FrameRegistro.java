/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadCodigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FrameRegistro extends JFrame {
    JLabel lblRegistroMascota,lblnombre,lbledad,lblraza;
    JTextField txtnombre,txtedad,txtraza;
    JButton btnregistrar;
    
    
    ArrayList<Mascota> listaMascota;
    public FrameRegistro(){
        iniciarComponentes();
        listaMascota=new ArrayList<Mascota>();
    }
    
    public void iniciarComponentes(){
        setLayout(null);
        setTitle("REGISTRO");
        setSize(350, 250);
        this.getContentPane().setBackground(Color.YELLOW);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblRegistroMascota=new JLabel("Registro de mascotas");
        lblRegistroMascota.setFont(new Font("Serif",Font.BOLD, 20));
        lblRegistroMascota.setBounds(70, 10, 180, 30);
        
        lblnombre=new JLabel("NOMBRE:");
        lblnombre.setBounds(20, 60, 70, 20);
        
        lbledad=new JLabel("EDAD:");        
        lbledad.setBounds(20, 90, 70, 20);
        
        lblraza=new JLabel("RAZA:");
        lblraza.setBounds(20, 120, 70, 20);
        
        txtnombre=new JTextField();
        txtnombre.setBounds(100, 60, 120, 20);
        
        txtedad=new JTextField();
        txtedad.setBounds(100, 90, 50, 20);
        
        txtraza=new JTextField();
        txtraza.setBounds(100, 120, 120, 20);
        
        btnregistrar=new JButton("REGISTRAR");
        btnregistrar.setFont(new Font("Serif", Font.BOLD, 18));
        btnregistrar.setBounds(100, 160, 140, 30);
        
        add(lblRegistroMascota);
        add(lblnombre);
        add(lbledad);
        add(lblraza);
        add(txtnombre);
        add(txtedad);
        add(txtraza);
        add(btnregistrar);
        
        btnregistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonRegistrarActionPerformed(e);
            }
        });
    }
    
    private void botonRegistrarActionPerformed(ActionEvent e){
        Mascota m;
        if(txtnombre.getText().isEmpty()||txtedad.getText().isEmpty()||txtraza.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "RELLENE TODOS LOS CAMPOS");
        }else{
           
            int edad=Integer.parseInt(txtedad.getText());
            m=new Mascota(txtnombre.getText(),edad, txtraza.getText());

            listaMascota.add(m);

            txtnombre.setText("");
            txtedad.setText("");
            txtraza.setText("");
            JOptionPane.showMessageDialog(null, "MASCOTA REGISTRADA");

            setVisible(false);
            this.dispose();
            
//            FrameMascota fm=new FrameMascota();
//            fm.setVisible(true);
        }
    }
    
    public String mostrar(){
        String cad="";
        for (int i = 0; i < listaMascota.size(); i++) {
            cad+=listaMascota.get(i).toString()+" \n";
        }
        return cad;
    }
    public String cantidad(){
        return String.valueOf(listaMascota.size());
    }
            
    
}
