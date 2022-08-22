package Presentacion;

import Negocio.Racional;
import Negocio.RacionalEntero;
import javax.swing.JOptionPane;

public class FormRacionalEntero extends javax.swing.JFrame {

    RacionalEntero A;
    RacionalEntero B;
    RacionalEntero C;
    Boolean ea, eb, fa, fb, ca, cb, dp, ds;

    public FormRacionalEntero() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        ea = eb = fa = fb = ca = cb = dp = ds = false;
        A = new RacionalEntero();
        B = new RacionalEntero();

        this.Entero3.setVisible(false);
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
        Entero1 = new javax.swing.JTextField();
        Entero2 = new javax.swing.JTextField();
        Entero3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

        ComboBox2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir" }));

        Numerador1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Numerador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Numerador1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Numerador1KeyTyped(evt);
            }
        });

        Numerador2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        Numerador3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Numerador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numerador3.setPreferredSize(new java.awt.Dimension(24, 24));

        Denominador1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Denominador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Denominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Denominador1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Denominador1KeyTyped(evt);
            }
        });

        Denominador2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        Denominador3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Denominador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ComboBox3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

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
        jLabel4.setText("OPERACIONES CON FRACCIONES MIXTAS");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Entero1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Entero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Entero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Entero1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Entero1KeyTyped(evt);
            }
        });

        Entero2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Entero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Entero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Entero2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Entero2KeyTyped(evt);
            }
        });

        Entero3.setEditable(false);
        Entero3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Entero3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Entero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Entero3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Entero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Numerador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Denominador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(Entero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Numerador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Denominador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Igual)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Entero3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Numerador3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(Denominador3)
                            .addComponent(jSeparator4))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Numerador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numerador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Numerador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Entero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Entero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Igual)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(Entero3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpiar)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        ActualizarDatos();
        C = new RacionalEntero();
        String operacion = this.ComboBox2.getSelectedItem().toString();
        switch (operacion) {
            case "Sumar" ->
                C = C.sumar(A, B);
            case "Restar" ->
                C = C.restar(A, B);
            case "Multiplicar" ->
                C = C.multiplicar(A, B);
            case "Dividir" ->
                C = C.dividir(A, B);
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
        if (fa && fb && ca && cb && ea && eb) {
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Numerador1KeyReleased

    private void Denominador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador1KeyReleased
        fb = true;
        if (fa && fb && ca && cb && ea && eb) {
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Denominador1KeyReleased

    private void Numerador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador2KeyReleased
        ca = true;
        if (fa && fb && ca && cb && ea && eb) {
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Numerador2KeyReleased

    private void Denominador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador2KeyReleased
        cb = true;
        if (fa && fb && ca && cb && ea && eb) {
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Denominador2KeyReleased

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        this.Entero1.setText("");
        this.Entero2.setText("");
        this.Numerador1.setText("");
        this.Denominador1.setText("");
        this.Numerador2.setText("");
        this.Denominador2.setText("");
        this.Entero3.setVisible(false);
        this.Numerador3.setVisible(false);
        this.Denominador3.setVisible(false);
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jSeparator4.setVisible(false);
        this.Igual.setEnabled(false);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void Entero1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Entero1KeyReleased
        ea = true;
        if (fa && fb && ca && cb && ea && eb) {
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Entero1KeyReleased

    private void Entero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Entero1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Introduzca Solo Numeros");
        }
    }//GEN-LAST:event_Entero1KeyTyped

    private void Entero2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Entero2KeyReleased
        eb = true;
        if (fa && fb && ca && cb && ea && eb) {
            this.Igual.setEnabled(true);
        }
    }//GEN-LAST:event_Entero2KeyReleased

    private void Entero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Entero2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Introduzca Solo Numeros");
        }
    }//GEN-LAST:event_Entero2KeyTyped

    private void Entero3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Entero3KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Introduzca Solo Numeros");
        }
    }//GEN-LAST:event_Entero3KeyTyped

    private void ActualizarDatos() {
        int entero = Integer.parseInt(this.Entero1.getText());
        int numerador = Integer.parseInt(this.Numerador1.getText());
        int denominador = Integer.parseInt(this.Denominador1.getText());
        char signo = this.ComboBox1.getSelectedItem().toString().charAt(0);
        if (denominador != 0) {
            A.setEntero(entero);
            A.setNumerador(numerador);
            A.setDenominador(denominador);
            A.setSigno(signo);
        } else {
            this.jLabel3.setText("Error: Denominador igual a 0");
            dp = true;
        }
        entero = Integer.parseInt(this.Entero2.getText());
        numerador = Integer.parseInt(this.Numerador2.getText());
        denominador = Integer.parseInt(this.Denominador2.getText());
        signo = this.ComboBox3.getSelectedItem().toString().charAt(0);
        if (denominador != 0) {
            B.setEntero(entero);
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
            if (C.getNumerador() == 0 && C.getDenominador() == 1) {
                this.Entero3.setVisible(true);
                this.Numerador3.setVisible(false);
                this.Denominador3.setVisible(false);
                this.jSeparator4.setVisible(false);
                char signo = C.getSigno();
                if (signo == '+') {
                    this.jLabel1.setVisible(true);
                    this.jLabel2.setVisible(false);
                } else {
                    this.jLabel2.setVisible(true);
                    this.jLabel1.setVisible(false);
                }
                this.Entero3.setText(Integer.toString(C.getEntero()));
            } else if (C.getEntero() == 0) {
                this.Entero3.setVisible(false);
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
                this.Numerador3.setVisible(true);
                this.Denominador3.setVisible(true);
                this.Entero3.setVisible(true);
                this.jSeparator4.setVisible(true);
                char signo = C.getSigno();
                if (signo == '+') {
                    this.jLabel1.setVisible(true);
                    this.jLabel2.setVisible(false);
                } else {
                    this.jLabel2.setVisible(true);
                    this.jLabel1.setVisible(false);
                }
                this.Entero3.setText(Integer.toString(C.getEntero()));
                this.Numerador3.setText(Integer.toString(C.getNumerador()));
                this.Denominador3.setText(Integer.toString(C.getDenominador()));
            }
        } else {
            this.Numerador3.setText("");
            this.Denominador3.setText("");
            this.Entero3.setText("");
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
            java.util.logging.Logger.getLogger(FormRacionalEntero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRacionalEntero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRacionalEntero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRacionalEntero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRacionalEntero().setVisible(true);
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
    private javax.swing.JTextField Entero1;
    private javax.swing.JTextField Entero2;
    private javax.swing.JTextField Entero3;
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
