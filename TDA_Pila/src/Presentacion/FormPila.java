package Presentacion;

import Negocio.Pila;
import javax.swing.JOptionPane;

public class FormPila extends javax.swing.JFrame {

    Pila A;
    
    public FormPila() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_Dimension = new javax.swing.JTextField();
        Bttn_Push = new javax.swing.JButton();
        Bttn_Pop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_Pila1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txt_Pila2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Txt_Entrada = new javax.swing.JTextField();
        Bttn_Dimension = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bttn_Push.setText("PUSH");
        Bttn_Push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_PushActionPerformed(evt);
            }
        });

        Bttn_Pop.setText("POP");
        Bttn_Pop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_PopActionPerformed(evt);
            }
        });

        Txt_Pila1.setEditable(false);
        Txt_Pila1.setColumns(20);
        Txt_Pila1.setRows(5);
        jScrollPane1.setViewportView(Txt_Pila1);

        Txt_Pila2.setEditable(false);
        Txt_Pila2.setColumns(20);
        Txt_Pila2.setRows(5);
        jScrollPane2.setViewportView(Txt_Pila2);

        jLabel1.setText("Ingrese la dimension de la pila:");

        Bttn_Dimension.setText("DIMENSIONAR");
        Bttn_Dimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_DimensionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_Dimension, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bttn_Dimension))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bttn_Push))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bttn_Pop)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Dimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Bttn_Dimension))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn_Push)
                    .addComponent(Bttn_Pop))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_PushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_PushActionPerformed
        if (!A.llena()) {
            A.push(Integer.parseInt(Txt_Entrada.getText()));
            Txt_Pila1.setText(A.toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "La pila esta llena", "AVISO", 1);
        }
    }//GEN-LAST:event_Bttn_PushActionPerformed

    private void Bttn_PopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_PopActionPerformed
        if (!A.vacia()) {
            A.pop();
            Txt_Pila1.setText(A.toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "La pila esta vacia", "AVISO", 1);
        }
    }//GEN-LAST:event_Bttn_PopActionPerformed

    private void Bttn_DimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_DimensionActionPerformed
        A = new Pila(Integer.parseInt(Txt_Dimension.getText()));
    }//GEN-LAST:event_Bttn_DimensionActionPerformed

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
    private javax.swing.JButton Bttn_Dimension;
    private javax.swing.JButton Bttn_Pop;
    private javax.swing.JButton Bttn_Push;
    private javax.swing.JTextField Txt_Dimension;
    private javax.swing.JTextField Txt_Entrada;
    private javax.swing.JTextArea Txt_Pila1;
    private javax.swing.JTextArea Txt_Pila2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
