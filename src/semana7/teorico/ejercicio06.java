/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7.teorico;

import java.util.ArrayList;


public class ejercicio06 extends javax.swing.JFrame {

    int conta,des,apr,des1,x;
    ArrayList<Double> examen1;
    ArrayList<Double> examen2;
    ArrayList<Double> examen3;
    ArrayList<Double> promedios;
    ArrayList<Integer> pos;
    
    public ejercicio06() {
        initComponents();
        examen1=new ArrayList<Double>();
        examen2=new ArrayList<Double>();
        examen3=new ArrayList<Double>();
        promedios=new ArrayList<Double>();
        pos=new ArrayList<Integer>();
        des=0;
        apr=0;
        des1=0;
        conta=0;
        x=0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtexa1 = new javax.swing.JTextField();
        txtexa2 = new javax.swing.JTextField();
        txtexa3 = new javax.swing.JTextField();
        btngrabar = new javax.swing.JButton();
        btncalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtpromexa3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmayprom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnumest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtaprobados = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdesaprobados = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtdesexa1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de orden del estudiante:");

        jLabel2.setText("Examen 1:");

        jLabel3.setText("Examen 2:");

        jLabel4.setText("Examen 3:");

        btngrabar.setText("Grabar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("Promedio del aula examen 3:");

        jLabel6.setText("Mayor promedio:");

        jLabel7.setText("Nª de estudiante:");

        jLabel8.setText("Nª de aprobados:");

        jLabel9.setText("Nª de desaprobados:");

        jLabel10.setText("Nª de desaprobados examen 1:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtexa1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(txtexa2)
                                    .addComponent(txtexa3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btncalcular)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(197, 197, 197)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdesexa1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpromexa3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addComponent(txtmayprom)
                                .addComponent(txtnumest)
                                .addComponent(txtaprobados)
                                .addComponent(txtdesaprobados)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtexa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtexa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtexa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngrabar)
                    .addComponent(btncalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpromexa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmayprom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnumest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtdesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtdesexa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        double suma=0;
        //calcula promedios alumno por alumno
        for (int i = 0; i < conta; i++) {
            double prom=((examen1.get(i)+examen2.get(i)+examen3.get(i))/3);
            promedios.add(prom);
            suma+=examen3.get(i);
        }
        //calcula el promedio en el examen 3
        double promex3=suma/conta;  
        txtpromexa3.setText(""+promex3);
        
        //calcula el mayor de los promedios
        double mayor=0;
        for (int i = 0; i < conta; i++) {
            if(promedios.get(i)>mayor){
                mayor=promedios.get(i);
                x=i; //se guarda la posicion del mayor promedio
            }
            //calcula desaprobados y aprobados
            if(promedios.get(i)>10.5){
                apr++;
            }else{
                des++;
            }
            //calcula desaprobados en el examen 1
            if(examen1.get(i)<10.5){
                des1++;
            }
        }
        
        //muestra los resultados
        txtmayprom.setText(""+mayor);
        txtnumest.setText(""+pos.get(x));
        txtaprobados.setText(""+apr);
        txtdesaprobados.setText(""+des);
        txtdesexa1.setText(""+des1);
        
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        pos.add(conta, Integer.parseInt(txtnum.getText()));
        examen1.add(conta,Double.parseDouble(txtexa1.getText()));
        examen2.add(conta, Double.parseDouble(txtexa2.getText()));
        examen3.add(conta, Double.parseDouble(txtexa3.getText()));
        conta++;
        
        txtnum.setText("");
        txtexa1.setText("");
        txtexa2.setText("");
        txtexa3.setText("");
        txtnum.requestFocus();
    }//GEN-LAST:event_btngrabarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btngrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtaprobados;
    private javax.swing.JTextField txtdesaprobados;
    private javax.swing.JTextField txtdesexa1;
    private javax.swing.JTextField txtexa1;
    private javax.swing.JTextField txtexa2;
    private javax.swing.JTextField txtexa3;
    private javax.swing.JTextField txtmayprom;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtnumest;
    private javax.swing.JTextField txtpromexa3;
    // End of variables declaration//GEN-END:variables
}
