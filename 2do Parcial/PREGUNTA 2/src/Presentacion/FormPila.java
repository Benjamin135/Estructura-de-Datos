
package Presentacion;

import Negocio.ColaLista;
import Negocio.PilaLista;

public class FormPila extends javax.swing.JFrame {

    PilaLista A;
    ColaLista B;
    
    public FormPila() {
        initComponents();
        this.setLocationRelativeTo(null);
        A = new PilaLista();
        B = new ColaLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_Entrada1 = new javax.swing.JTextField();
        Txt_Entrada2 = new javax.swing.JTextField();
        Bttn_Push = new javax.swing.JButton();
        Bttn_Encolar = new javax.swing.JButton();
        Bttn_Pop = new javax.swing.JButton();
        Bttn_Decolar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_Pila1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txt_Pila2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Txt_Cola1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Txt_Cola2 = new javax.swing.JTextArea();
        Bttn_Intercambiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bttn_Push.setText("PUSH");
        Bttn_Push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_PushActionPerformed(evt);
            }
        });

        Bttn_Encolar.setText("ENCOLAR");
        Bttn_Encolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_EncolarActionPerformed(evt);
            }
        });

        Bttn_Pop.setText("POP");
        Bttn_Pop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_PopActionPerformed(evt);
            }
        });

        Bttn_Decolar.setText("DECOLAR");
        Bttn_Decolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_DecolarActionPerformed(evt);
            }
        });

        jLabel1.setText("INSERTAR DATOS EN LA PILA:");

        jLabel2.setText("INSERTAR DATOS EN LA COLA:");

        Txt_Pila1.setColumns(20);
        Txt_Pila1.setRows(5);
        jScrollPane1.setViewportView(Txt_Pila1);

        Txt_Pila2.setColumns(20);
        Txt_Pila2.setRows(5);
        jScrollPane2.setViewportView(Txt_Pila2);

        Txt_Cola1.setColumns(20);
        Txt_Cola1.setRows(5);
        jScrollPane3.setViewportView(Txt_Cola1);

        Txt_Cola2.setColumns(20);
        Txt_Cola2.setRows(5);
        jScrollPane4.setViewportView(Txt_Cola2);

        Bttn_Intercambiar.setText(" INTERCAMBIAR EXTREMOS");
        Bttn_Intercambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_IntercambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Txt_Entrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bttn_Push, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bttn_Pop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Txt_Entrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bttn_Encolar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bttn_Decolar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn_Intercambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Entrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn_Push)
                    .addComponent(Bttn_Pop)
                    .addComponent(Txt_Entrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn_Encolar)
                    .addComponent(Bttn_Decolar))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Bttn_Intercambiar)))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_PushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_PushActionPerformed
        A.push(Integer.parseInt(Txt_Entrada1.getText()));
        Txt_Pila1.setText(A.toString());
    }//GEN-LAST:event_Bttn_PushActionPerformed

    private void Bttn_PopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_PopActionPerformed
        if (!A.vacia()) {
            A.pop();
            Txt_Pila1.setText(A.toString());  
        }
    }//GEN-LAST:event_Bttn_PopActionPerformed

    private void Bttn_EncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_EncolarActionPerformed
        B.Encolar(Integer.parseInt(Txt_Entrada2.getText()));
        Txt_Cola1.setText(B.toString());
    }//GEN-LAST:event_Bttn_EncolarActionPerformed

    private void Bttn_DecolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_DecolarActionPerformed
        if (!B.vacia()) {
            B.Decolar();
            Txt_Cola1.setText(B.toString());
        }
    }//GEN-LAST:event_Bttn_DecolarActionPerformed

    private void Bttn_IntercambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_IntercambiarActionPerformed
        A.IntercambiarExtremos(B);
        Txt_Pila2.setText(A.toString());
        Txt_Cola2.setText(B.toString());
    }//GEN-LAST:event_Bttn_IntercambiarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_Decolar;
    private javax.swing.JButton Bttn_Encolar;
    private javax.swing.JButton Bttn_Intercambiar;
    private javax.swing.JButton Bttn_Pop;
    private javax.swing.JButton Bttn_Push;
    private javax.swing.JTextArea Txt_Cola1;
    private javax.swing.JTextArea Txt_Cola2;
    private javax.swing.JTextField Txt_Entrada1;
    private javax.swing.JTextField Txt_Entrada2;
    private javax.swing.JTextArea Txt_Pila1;
    private javax.swing.JTextArea Txt_Pila2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
