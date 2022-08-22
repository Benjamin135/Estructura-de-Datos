package Presentacion;

import Negocio.Racional;
import javax.swing.JOptionPane;

public class FormRacional extends javax.swing.JFrame {

    Racional A;
    Racional B;
    Racional C;
    Boolean fa,fb,ca,cb,dp,ds;
    
    public FormRacional() {
        initComponents();
        setLocationRelativeTo(null);
        
        fa = fb = ca = cb = dp = ds = false;
        A = new Racional();
        B = new Racional();
        
        this.Numerador3.setVisible(false);
        this.Denominador3.setVisible(false);
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jSeparator4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        Numerador1 = new javax.swing.JTextField();
        Numerador2 = new javax.swing.JTextField();
        Numerador3 = new javax.swing.JTextField();
        Denominador1 = new javax.swing.JTextField();
        Denominador2 = new javax.swing.JTextField();
        Denominador3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ComboBox3 = new javax.swing.JComboBox<>();
        Igual = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        ComboBox2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir" }));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });

        Numerador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Numerador1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Numerador1KeyTyped(evt);
            }
        });

        Numerador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Numerador2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Numerador2KeyTyped(evt);
            }
        });

        Numerador3.setEditable(false);
        Numerador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numerador3.setPreferredSize(new java.awt.Dimension(24, 24));

        Denominador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Denominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Denominador1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Denominador1KeyTyped(evt);
            }
        });

        Denominador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Denominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Denominador2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Denominador2KeyTyped(evt);
            }
        });

        Denominador3.setEditable(false);
        Denominador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ComboBox3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        ComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox3ActionPerformed(evt);
            }
        });

        Igual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Igual.setText("=");
        Igual.setEnabled(false);
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("+");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("-");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Limpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OPERACIONES CON FRACCIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Numerador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Denominador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Numerador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Denominador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Igual)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Numerador3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Denominador3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Numerador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numerador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Numerador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Denominador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Denominador3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Denominador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Igual)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(78, 78, 78)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpiar)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void ComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox3ActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        ActualizarDatos();
        C = new Racional();
        String operacion = this.ComboBox2.getSelectedItem().toString();
        switch (operacion) {
            case "Sumar" -> C.Suma(A, B);
            case "Restar" -> C.Resta(A, B);
            case "Multiplicar" -> C.Multiplicacion(A, B);
            case "Dividir" -> C.Division(A, B);
        }
        Mostrar();
    }//GEN-LAST:event_IgualActionPerformed

    private void Numerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Introduzca Solo Numeros");
        }
    }//GEN-LAST:event_Numerador1KeyTyped

    private void Denominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Introduzca Solo Numeros");
        }
    }//GEN-LAST:event_Denominador1KeyTyped

    private void Numerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Introduzca Solo Numeros");
        }
    }//GEN-LAST:event_Numerador2KeyTyped

    private void Denominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Introduzca Solo Numeros");
        }
    }//GEN-LAST:event_Denominador2KeyTyped

    private void Numerador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador1KeyReleased
        fa = true;
        if (fa && fb && ca && cb){
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Numerador1KeyReleased

    private void Denominador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador1KeyReleased
        fb = true;
        if (fa && fb && ca && cb){
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Denominador1KeyReleased

    private void Numerador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador2KeyReleased
        ca = true;
        if (fa && fb && ca && cb){
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Numerador2KeyReleased

    private void Denominador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador2KeyReleased
        cb = true;
        if (fa && fb && ca && cb){
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Denominador2KeyReleased

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        this.Numerador1.setText("");
        this.Denominador1.setText("");
        this.Numerador2.setText("");
        this.Denominador2.setText("");
        this.Numerador3.setVisible(false);
        this.Denominador3.setVisible(false);
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jSeparator4.setVisible(false);
        this.Igual.setEnabled(false);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void ActualizarDatos() {
        int numerador = Integer.parseInt(this.Numerador1.getText());
        int denominador = Integer.parseInt(this.Denominador1.getText());
        char signo = this.ComboBox1.getSelectedItem().toString().charAt(0);
        if (denominador != 0) {
            A.setNumerador(numerador);
            A.setDenominador(denominador);
            A.setSigno(signo);
        } else {
            this.jLabel3.setText("Error: Denominador igual a 0");
            dp = true;
        }
        numerador = Integer.parseInt(this.Numerador2.getText());
        denominador = Integer.parseInt(this.Denominador2.getText());
        signo = this.ComboBox3.getSelectedItem().toString().charAt(0);
        if (denominador != 0) {
            B.setNumerador(numerador);
            B.setDenominador(denominador);
            B.setSigno(signo);
        } else {
            this.jLabel3.setText("Error: Denominador igual a 0");
            ds = true;
        }
    }
    
    private void Mostrar() {
        if (!dp && !ds) {
            this.Numerador3.setVisible(true);
            this.Denominador3.setVisible(true);
            this.jSeparator4.setVisible(true);
            char signo = C.getSigno();
            if (signo == '+') {
                this.jLabel1.setVisible(true);
                this.jLabel2.setVisible(false);
            } else {
                this.jLabel2.setVisible(true);
                this.jLabel1.setVisible(false);
            }
            this.Numerador3.setText(Integer.toString(C.getNumerador()));
            this.Denominador3.setText(Integer.toString(C.getDenominador()));
        } else {
            this.Numerador3.setText("");
            this.Denominador3.setText("");
            this.jLabel1.setVisible(false);
            this.jLabel2.setVisible(false);
            dp = ds = false;
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormRacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRacional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JTextField Denominador1;
    private javax.swing.JTextField Denominador2;
    private javax.swing.JTextField Denominador3;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Numerador1;
    private javax.swing.JTextField Numerador2;
    private javax.swing.JTextField Numerador3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
