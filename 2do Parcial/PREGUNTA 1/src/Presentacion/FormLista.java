package Presentacion;

import Negocio.Lista;

public class FormLista extends javax.swing.JFrame {

    Lista A;
    
    public FormLista() {
        initComponents();
        this.setLocationRelativeTo(null);
        A = new Lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_entrada = new javax.swing.JTextField();
        Bttn_Insertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_Lista = new javax.swing.JTextArea();
        Bttn_Volcar = new javax.swing.JButton();
        Bttn_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bttn_Insertar.setText("INSERTAR");
        Bttn_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_InsertarActionPerformed(evt);
            }
        });

        Txt_Lista.setColumns(20);
        Txt_Lista.setRows(5);
        jScrollPane1.setViewportView(Txt_Lista);

        Bttn_Volcar.setText("VOLCAR DE A 2");
        Bttn_Volcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_VolcarActionPerformed(evt);
            }
        });

        Bttn_Eliminar.setText("ELIMINAR");
        Bttn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Txt_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Bttn_Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bttn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Bttn_Volcar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn_Insertar)
                    .addComponent(Bttn_Eliminar))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Bttn_Volcar)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_InsertarActionPerformed
        A.insertar(Integer.parseInt(Txt_entrada.getText()));
        Txt_Lista.setText(A.toString());
    }//GEN-LAST:event_Bttn_InsertarActionPerformed

    private void Bttn_VolcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_VolcarActionPerformed
        A.volcar2();
        Txt_Lista.setText(A.toString());
    }//GEN-LAST:event_Bttn_VolcarActionPerformed

    private void Bttn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_EliminarActionPerformed
        A.eliminar(Integer.parseInt(Txt_entrada.getText()));
        Txt_Lista.setText(A.toString());
    }//GEN-LAST:event_Bttn_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_Eliminar;
    private javax.swing.JButton Bttn_Insertar;
    private javax.swing.JButton Bttn_Volcar;
    private javax.swing.JTextArea Txt_Lista;
    private javax.swing.JTextField Txt_entrada;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
