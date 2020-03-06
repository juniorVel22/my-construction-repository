
package ActividadCodigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author JHUNIOR
 */
public class FrameMascota extends JFrame {
    JLabel lblnombrePerrera, lbllistamascotas,lblcantidad,lblNcant;
    JButton btnagregar,btnmostrar,btnsalir;
    JTextArea txalista;
    
    FrameRegistro fr=new FrameRegistro();
    public FrameMascota(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        setLayout(null);
        setTitle("PERRERA");
        setSize(410,350);
        this.getContentPane().setBackground(Color.YELLOW);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lblnombrePerrera=new JLabel("PERRERA LOS ANGELITOS");
        lblnombrePerrera.setFont(new Font("Serif", Font.ITALIC, 24));
        lblnombrePerrera.setBounds(40, 10,310 , 30);
        
        btnagregar=new JButton("AGREGAR");
        btnagregar.setBounds(20, 50, 90, 20);
        
        btnmostrar=new JButton("MOSTRAR");
        btnmostrar.setBounds(130, 50, 95, 20);
        
        btnsalir=new JButton("SALIR");
        btnsalir.setBounds(245, 50, 90, 20);
        
        lbllistamascotas=new JLabel("Lista de mascotas: ");
        lbllistamascotas.setBounds(20,90 , 160, 20);
        
        txalista=new JTextArea();
        txalista.setFont(new Font("Serif", Font.BOLD, 14));
        txalista.setBounds(20, 130, 310, 140);
        add(txalista);
        JScrollPane sp=new JScrollPane(txalista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(20,130,310, 140);
        add(sp);
        
        lblcantidad=new JLabel("registrados:");
        lblcantidad.setBounds(20, 280, 80, 20);
        
        lblNcant=new JLabel("Nª");
        lblNcant.setFont(new Font("Serif", Font.BOLD, 14));
        lblNcant.setBounds(100, 280, 30, 20);
        
        add(lblnombrePerrera);
        add(btnagregar);
        add(btnmostrar);
        add(btnsalir);
        add(lbllistamascotas);
        
        add(lblcantidad);
        add(lblNcant);
        
        
        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonAgregarActionPerformed(e);
            }
        });
        
        btnmostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonMostrarActionPerformed(e);
            }
        });
        
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSalirActionPerformed(e);
            }
        });
    }
    
    private void botonAgregarActionPerformed(ActionEvent e){
        
        fr.setVisible(true);
    }
    
    private void botonMostrarActionPerformed(ActionEvent e){
        
        txalista.setText(fr.mostrar());
        lblNcant.setText(fr.cantidad());
    }
    
    private void botonSalirActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new FrameMascota();
    }
}
