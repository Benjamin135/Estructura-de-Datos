package Presentacion;

import Negocio.Conjunto;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormConjunto extends javax.swing.JFrame {

    Conjunto A;
    Conjunto B;
    Conjunto C;
    boolean esValido;
    
    public FormConjunto() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        A = new Conjunto();
        B = new Conjunto();
    }
    
    private void habilitarInsertar() {
        if (!txt_EntradaB.getText().isEmpty()) {
            this.bttn_InsertarB.setEnabled(true);
        } else {
            this.bttn_InsertarB.setEnabled(false);
        }
        if (!txt_EntradaA.getText().isEmpty()) {
            this.bttn_InsertarA.setEnabled(true);
        } else {
            this.bttn_InsertarA.setEnabled(false);
        }
    }
    
    private void habilitarBorrar() {
        if (!txt_ConjuntoA.getText().isEmpty() || !txt_ConjuntoB.getText().isEmpty()) {
            this.bttn_Borrar.setEnabled(true);
        } else {
            this.bttn_Borrar.setEnabled(false);
        }
    }
    
    private void habilitarOperaciones() {
        if (!txt_ConjuntoA.getText().isEmpty() && !txt_ConjuntoB.getText().isEmpty()) {
            this.bttn_Calcular.setEnabled(true);
        } else {
            this.bttn_Calcular.setEnabled(false);
        }
    }
    
    private void limpiar() {
        txt_ConjuntoA.setText("");
        txt_ConjuntoB.setText("");
        txt_ConjuntoC.setText("");
        txt_EntradaA.setText("");
        txt_EntradaB.setText("");
        cbx_InsertarA.setSelectedItem("INSERTAR  EN  A");
        cbx_InsertarB.setSelectedItem("INSERTAR  EN  B");
        cbx_Operaciones.setSelectedItem("UNION");
        cbx_Borrar.setSelectedItem("BORRAR  A");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbx_InsertarA = new javax.swing.JComboBox<>();
        cbx_InsertarB = new javax.swing.JComboBox<>();
        bttn_InsertarA = new javax.swing.JButton();
        bttn_InsertarB = new javax.swing.JButton();
        txt_EntradaB = new javax.swing.JTextField();
        txt_EntradaA = new javax.swing.JTextField();
        txt_ConjuntoA = new javax.swing.JTextField();
        txt_ConjuntoB = new javax.swing.JTextField();
        txt_ConjuntoC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbx_Borrar = new javax.swing.JComboBox<>();
        cbx_Operaciones = new javax.swing.JComboBox<>();
        bttn_Calcular = new javax.swing.JButton();
        bttn_Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" TDA CONJUNTO ");

        cbx_InsertarA.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cbx_InsertarA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSERTAR  EN  A", "ELIMINAR  EN  A" }));
        cbx_InsertarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_InsertarAActionPerformed(evt);
            }
        });

        cbx_InsertarB.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cbx_InsertarB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSERTAR  EN  B", "ELIMINAR  EN  B" }));
        cbx_InsertarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_InsertarBActionPerformed(evt);
            }
        });

        bttn_InsertarA.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        bttn_InsertarA.setText("INSERTAR");
        bttn_InsertarA.setEnabled(false);
        bttn_InsertarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_InsertarAActionPerformed(evt);
            }
        });

        bttn_InsertarB.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        bttn_InsertarB.setText("INSERTAR");
        bttn_InsertarB.setEnabled(false);
        bttn_InsertarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_InsertarBActionPerformed(evt);
            }
        });

        txt_EntradaB.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txt_EntradaB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EntradaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_EntradaBKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_EntradaBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EntradaBKeyTyped(evt);
            }
        });

        txt_EntradaA.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txt_EntradaA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EntradaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_EntradaAKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_EntradaAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EntradaAKeyTyped(evt);
            }
        });

        txt_ConjuntoA.setEditable(false);
        txt_ConjuntoA.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txt_ConjuntoA.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_ConjuntoACaretUpdate(evt);
            }
        });
        txt_ConjuntoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ConjuntoAKeyReleased(evt);
            }
        });

        txt_ConjuntoB.setEditable(false);
        txt_ConjuntoB.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txt_ConjuntoB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_ConjuntoBCaretUpdate(evt);
            }
        });
        txt_ConjuntoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ConjuntoBKeyReleased(evt);
            }
        });

        txt_ConjuntoC.setEditable(false);
        txt_ConjuntoC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setText("A =");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setText("B =");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setText("C =");

        cbx_Borrar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cbx_Borrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BORRAR  A", "BORRAR  B", "BORRAR  C", "BORRAR  TODO" }));

        cbx_Operaciones.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cbx_Operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNION", "INTERSECCION", "DIFERENCIA", "DIFERENCIA SIMETRICA", "SUBCONJUNTO" }));

        bttn_Calcular.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        bttn_Calcular.setText("CALCULAR");
        bttn_Calcular.setEnabled(false);
        bttn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_CalcularActionPerformed(evt);
            }
        });

        bttn_Borrar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        bttn_Borrar.setText("BORRAR");
        bttn_Borrar.setEnabled(false);
        bttn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ConjuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ConjuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ConjuntoC, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbx_Borrar, 0, 144, Short.MAX_VALUE)
                                    .addComponent(bttn_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbx_Operaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bttn_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbx_InsertarB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(bttn_InsertarB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbx_InsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(bttn_InsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_EntradaA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_EntradaB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_InsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_InsertarA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_EntradaA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_InsertarB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_InsertarB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_EntradaB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ConjuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ConjuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ConjuntoC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_InsertarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_InsertarAActionPerformed
        if (cbx_InsertarA.getSelectedItem().equals("ELIMINAR  EN  A")) {
            bttn_InsertarA.setText("ELIMINAR");
        } else {
            bttn_InsertarA.setText("INSERTAR");
        }
    }//GEN-LAST:event_cbx_InsertarAActionPerformed

    private void cbx_InsertarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_InsertarBActionPerformed
        if (cbx_InsertarB.getSelectedItem().equals("ELIMINAR  EN  B")) {
            bttn_InsertarB.setText("ELIMINAR");
        } else {
            bttn_InsertarB.setText("INSERTAR");
        }
    }//GEN-LAST:event_cbx_InsertarBActionPerformed

    private void bttn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_CalcularActionPerformed
        String operacion = cbx_Operaciones.getSelectedItem().toString();
        String resultado = "";
        C = new Conjunto();
        switch(operacion) {
            case "UNION" -> C.union(A, B);
            case "INTERSECCION" -> C.interseccion(A, B);
            case "DIFERENCIA" -> {
                String options[] = {"A - B", "B - A"};
                int option = JOptionPane.showOptionDialog(null, "Elija una opción:", 
                "Diferencia de Conjuntos", 0, JOptionPane.QUESTION_MESSAGE, null, options, null);
                if (option == 0) {
                    C.diferencia(A, B);
                } else if (option == 1) {
                    C.diferencia(B, A);
                }
            }
            case "DIFERENCIA SIMETRICA" -> C.diferenciaSimetrica(A, B);
            case "SUBCONJUNTO" -> {
                String options[] = {"A \u2286 B", "B \u2286 A"};
                boolean result;
                int option = JOptionPane.showOptionDialog(null, "Elija una opción:", 
                "Subconjunto", 0, JOptionPane.QUESTION_MESSAGE, null, options, null);
                if (option == 0) {
                    result = C.subconjunto(A, B);
                    if (result) {
                        resultado = "A es subconjunto de B";
                    } else {
                        resultado = "A no es subconjunto de B";
                    }
                } else if (option == 1) {
                    result = C.subconjunto(B, A);
                    if (result) {
                        resultado = "B es subconjunto de A";
                    } else {
                        resultado = "B no es subconjunto de A";
                    }
                }
            }
        }
        if ("SUBCONJUNTO".equals(operacion)) {
            txt_ConjuntoC.setText(resultado);
        } else {
            txt_ConjuntoC.setText(C.toString());
        }
    }//GEN-LAST:event_bttn_CalcularActionPerformed

    private void bttn_InsertarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_InsertarBActionPerformed
        String operacion = bttn_InsertarB.getText();
        int valor = Integer.parseInt(txt_EntradaB.getText());
        switch(operacion) {
            case "INSERTAR" -> B.insertar(valor);
            case "ELIMINAR" -> B.eliminar(valor);
        }
        txt_ConjuntoB.setText(B.toString());
    }//GEN-LAST:event_bttn_InsertarBActionPerformed

    private void bttn_InsertarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_InsertarAActionPerformed
        String operacion = bttn_InsertarA.getText();
        int valor = Integer.parseInt(txt_EntradaA.getText());
        switch(operacion) {
            case "INSERTAR" -> A.insertar(valor);
            case "ELIMINAR" -> A.eliminar(valor);
        }
        txt_ConjuntoA.setText(A.toString()); 
    }//GEN-LAST:event_bttn_InsertarAActionPerformed

    private void txt_EntradaAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EntradaAKeyTyped
        if (!esValido){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Introducir solo Numeros");
        }
    }//GEN-LAST:event_txt_EntradaAKeyTyped

    private void txt_EntradaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EntradaBKeyTyped
        if (!esValido){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Introducir solo Numeros");
        }
    }//GEN-LAST:event_txt_EntradaBKeyTyped

    private void txt_EntradaAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EntradaAKeyPressed
        char e = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isDigit(e) | keyCode == KeyEvent.VK_BACK_SPACE)
            esValido = true;
        else
            esValido = false;
    }//GEN-LAST:event_txt_EntradaAKeyPressed

    private void txt_EntradaBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EntradaBKeyPressed
        char e = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isDigit(e) | keyCode == KeyEvent.VK_BACK_SPACE)
            esValido = true;
        else
            esValido = false;
    }//GEN-LAST:event_txt_EntradaBKeyPressed

    private void txt_EntradaAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EntradaAKeyReleased
        habilitarInsertar();
    }//GEN-LAST:event_txt_EntradaAKeyReleased

    private void txt_EntradaBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EntradaBKeyReleased
        habilitarInsertar();
    }//GEN-LAST:event_txt_EntradaBKeyReleased

    private void txt_ConjuntoAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ConjuntoAKeyReleased
       // habilitarOperaciones();
    }//GEN-LAST:event_txt_ConjuntoAKeyReleased

    private void txt_ConjuntoBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ConjuntoBKeyReleased
       // habilitarOperaciones();
    }//GEN-LAST:event_txt_ConjuntoBKeyReleased

    private void txt_ConjuntoACaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_ConjuntoACaretUpdate
        habilitarOperaciones();
        habilitarBorrar();
    }//GEN-LAST:event_txt_ConjuntoACaretUpdate

    private void txt_ConjuntoBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_ConjuntoBCaretUpdate
        habilitarOperaciones();
        habilitarBorrar();
    }//GEN-LAST:event_txt_ConjuntoBCaretUpdate

    private void bttn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_BorrarActionPerformed
        String operacion = cbx_Borrar.getSelectedItem().toString();
        switch(operacion) {
            case "BORRAR  A" -> {
                A = new Conjunto();
                txt_ConjuntoA.setText("");
            }
            case "BORRAR  B" -> {
                B = new Conjunto();
                txt_ConjuntoB.setText("");
            }
            case "BORRAR  C" -> {
                C = new Conjunto();
                txt_ConjuntoC.setText("");
            }
            case "BORRAR  TODO" -> {
                A = new Conjunto();
                B = new Conjunto();
                C = new Conjunto();
                limpiar();
            }
        }
    }//GEN-LAST:event_bttn_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(FormConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConjunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_Borrar;
    private javax.swing.JButton bttn_Calcular;
    private javax.swing.JButton bttn_InsertarA;
    private javax.swing.JButton bttn_InsertarB;
    private javax.swing.JComboBox<String> cbx_Borrar;
    private javax.swing.JComboBox<String> cbx_InsertarA;
    private javax.swing.JComboBox<String> cbx_InsertarB;
    private javax.swing.JComboBox<String> cbx_Operaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_ConjuntoA;
    private javax.swing.JTextField txt_ConjuntoB;
    private javax.swing.JTextField txt_ConjuntoC;
    private javax.swing.JTextField txt_EntradaA;
    private javax.swing.JTextField txt_EntradaB;
    // End of variables declaration//GEN-END:variables
}
