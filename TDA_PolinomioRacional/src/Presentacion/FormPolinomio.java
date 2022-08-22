package Presentacion;

import Negocio.Monomio;
import Negocio.PolinomioBits;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FormPolinomio extends javax.swing.JFrame {

    PolinomioBits A = new PolinomioBits(5);
    PolinomioBits B = new PolinomioBits(5);
    PolinomioBits C = new PolinomioBits(5);
    boolean esValido;
    
    public FormPolinomio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void habilitarInsertar() {
        if (!Denominador1.getText().isEmpty() && !Numerador2.getText().isEmpty()) {
            this.InsertarA.setEnabled(true);
            this.InsertarB.setEnabled(true);
        } else {
            this.InsertarA.setEnabled(false);
            this.InsertarB.setEnabled(false);
        }
    }
    
    private void habilitarEvaluar() {
        if (!valorX.getText().isEmpty()) {
            this.Evaluar.setEnabled(true);
        } else {
            this.Evaluar.setEnabled(false);
        }
    }
    
    private void habilitarOperaciones() {
        if (!PolinomioA.getText().isEmpty() && !PolinomioB.getText().isEmpty()) {
            this.ComboBox3.setEnabled(true);
            this.Calcular.setEnabled(true);
        } else {
            this.ComboBox3.setEnabled(false);
            this.Calcular.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        InsertarA = new javax.swing.JButton();
        InsertarB = new javax.swing.JButton();
        Numerador2 = new javax.swing.JTextField();
        Denominador1 = new javax.swing.JTextField();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        PolinomioA = new javax.swing.JTextField();
        PolinomioB = new javax.swing.JTextField();
        PolinomioC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ComboBox3 = new javax.swing.JComboBox<>();
        Calcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        valorX = new javax.swing.JTextField();
        ComboBox4 = new javax.swing.JComboBox<>();
        Evaluar = new javax.swing.JButton();
        BorrarPolinomio = new javax.swing.JButton();
        BorrarMonomio = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Numerador1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Denominador2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("TDA POLINOMIO");

        InsertarA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        InsertarA.setText("INSERTAR EN A");
        InsertarA.setEnabled(false);
        InsertarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarAActionPerformed(evt);
            }
        });

        InsertarB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        InsertarB.setText("INSERTAR EN B");
        InsertarB.setEnabled(false);
        InsertarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarBActionPerformed(evt);
            }
        });

        Numerador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Numerador2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Numerador2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Numerador2KeyTyped(evt);
            }
        });

        Denominador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Denominador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Denominador1ActionPerformed(evt);
            }
        });
        Denominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Denominador1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Denominador1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Denominador1KeyTyped(evt);
            }
        });

        ComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

        ComboBox2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("X");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText("OPERACIONES");

        PolinomioA.setEditable(false);
        PolinomioA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PolinomioA.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PolinomioACaretUpdate(evt);
            }
        });

        PolinomioB.setEditable(false);
        PolinomioB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PolinomioB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PolinomioBCaretUpdate(evt);
            }
        });

        PolinomioC.setEditable(false);
        PolinomioC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("A :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("B :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Res :");

        ComboBox3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "x" }));
        ComboBox3.setEnabled(false);

        Calcular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Calcular.setText("CALCULAR");
        Calcular.setEnabled(false);
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("X =");

        valorX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorXKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valorXKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorXKeyTyped(evt);
            }
        });

        ComboBox4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

        Evaluar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Evaluar.setText("EVALUAR");
        Evaluar.setEnabled(false);
        Evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluarActionPerformed(evt);
            }
        });

        BorrarPolinomio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BorrarPolinomio.setText("BORRAR POLINOMIO");
        BorrarPolinomio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarPolinomioActionPerformed(evt);
            }
        });

        BorrarMonomio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BorrarMonomio.setText("BORRAR MONOMIO");
        BorrarMonomio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarMonomioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("RESULTADO:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Numerador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Numerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Numerador1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Numerador1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Numerador1KeyTyped(evt);
            }
        });

        Denominador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Denominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Denominador2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Denominador2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Denominador2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PolinomioC, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PolinomioB, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PolinomioA, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Calcular)
                                    .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valorX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Evaluar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BorrarPolinomio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BorrarMonomio))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InsertarA)
                            .addComponent(InsertarB))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Numerador1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(Denominador1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(jSeparator2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(Denominador2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Numerador2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(147, 147, 147)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(InsertarB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertarA))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(Numerador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Denominador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Numerador2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Denominador2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PolinomioA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PolinomioB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PolinomioC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Evaluar)
                        .addComponent(BorrarPolinomio)
                        .addComponent(BorrarMonomio)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numerador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador2KeyReleased
        habilitarInsertar();
    }//GEN-LAST:event_Numerador2KeyReleased

    private void Denominador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador1KeyReleased
        habilitarInsertar();
    }//GEN-LAST:event_Denominador1KeyReleased

    private void Numerador2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador2KeyPressed
        char e = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isDigit(e) || keyCode == KeyEvent.VK_BACK_SPACE)// | keyCode == KeyEvent.VK_SUBTRACT)
            esValido = true;
        else
            esValido = false;
    }//GEN-LAST:event_Numerador2KeyPressed

    private void Denominador1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador1KeyPressed
        char e = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        //JOptionPane.showMessageDialog(null, keyCode);
        if (Character.isDigit(e) || keyCode == KeyEvent.VK_BACK_SPACE)
            esValido = true;
        else
            esValido = false;
    }//GEN-LAST:event_Denominador1KeyPressed

    private void Numerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador2KeyTyped
        if (!esValido){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Introducir solo Numeros");
        }
    }//GEN-LAST:event_Numerador2KeyTyped

    private void Denominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador1KeyTyped
        if (!esValido){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Introducir solo Numeros");
        }
    }//GEN-LAST:event_Denominador1KeyTyped

    private void InsertarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarAActionPerformed
//        int coeficiente = Integer.parseInt(Denominador1.getText());
//        int exponente = Integer.parseInt(Numerador2.getText());
//        Monomio M;
//        if (ComboBox1.getSelectedItem().equals("+")) {
//            M = new Monomio('+', coeficiente, exponente);
//        } else {
//            M = new Monomio('-', coeficiente, exponente);
//        }
//        if (!ComboBox2.getSelectedItem().equals("+")) {
//            M.setExponente(-exponente);
//        }
//        A.Insertar(M);
//        PolinomioA.setText(A.toString());
    }//GEN-LAST:event_InsertarAActionPerformed

    private void InsertarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarBActionPerformed
//        int coeficiente = Integer.parseInt(Denominador1.getText());
//        int exponente = Integer.parseInt(Numerador2.getText());
//        Monomio M;
//        if (ComboBox1.getSelectedItem().equals("+")) {
//            M = new Monomio('+', coeficiente, exponente);
//        } else {
//            M = new Monomio('-', coeficiente, exponente);
//        }
//        if (!ComboBox2.getSelectedItem().equals("+")) {
//            M.setExponente(-exponente);
//        }
//        B.Insertar(M);
//        PolinomioB.setText(B.toString());
    }//GEN-LAST:event_InsertarBActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        //C = new PolinomioBits();
//        if (ComboBox3.getSelectedItem().equals("+")) {
//            C.Sumar(A, B);
//        } else if (ComboBox3.getSelectedItem().equals("-")) {
//            C.Restar(A, B);
//        } else if (ComboBox3.getSelectedItem().equals("x")) {
//            C.Multiplicar(A, B);
//        }
//        PolinomioC.setText(C.toString());
    }//GEN-LAST:event_CalcularActionPerformed

    private void BorrarPolinomioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarPolinomioActionPerformed
        String options[] = {"A", "B"};
        int option = JOptionPane.showOptionDialog(null, "Polinomio del que desea borrar", "Borrar Polinomio", 0, JOptionPane.QUESTION_MESSAGE, null, options, null);
        if (option == 0){
            //A = new PolinomioBits();
            PolinomioA.setText(A.toString());
        }
        else if (option == 1){
            //B = new PolinomioBits();
            PolinomioB.setText(B.toString());
        }
    }//GEN-LAST:event_BorrarPolinomioActionPerformed

    private void BorrarMonomioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarMonomioActionPerformed
        String options[] = {"A", "B"};
//        int option = JOptionPane.showOptionDialog(null, "PolinomioBits del que desea borrar", "Borrar Monomio", 0, JOptionPane.QUESTION_MESSAGE, null, options, null);
//        
//        String monA[] = new String[A.getExponentes().length];
//        for (int i=0; i < monA.length; i++){
//            monA[i] = String.valueOf(A.getExponentes()[i]);
//        } 
//        String monB[] = new String[B.getExponentes().length];
//        for (int i=0; i < monB.length; i++){
//            monB[i] = String.valueOf(B.getExponentes()[i]);
//        }
//        
//        if (option == 0){    
//            String exp = (JOptionPane.showInputDialog(null,"Seleccionar el exponente del monomio a eliminar","Borrar Monomio",JOptionPane.PLAIN_MESSAGE,null,monA,null)).toString();
//            if (exp != null){
//                A.Eliminar(Integer.parseInt(exp));
//                PolinomioA.setText(A.toString());
//            }
//        }
//        else if (option == 1){
//            String exp = (JOptionPane.showInputDialog(null,"Seleccionar el exponente del monomio a eliminar","Borrar Monomio",JOptionPane.PLAIN_MESSAGE,null,monB,null)).toString();
//            if (exp != null){
//                B.Eliminar(Integer.parseInt(exp));
//                PolinomioB.setText(B.toString());
//            }
//        }
    }//GEN-LAST:event_BorrarMonomioActionPerformed

    private void EvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvaluarActionPerformed
        int x = Integer.parseInt(valorX.getText());
        if (ComboBox4.getSelectedItem().equals("-"))
            x = -x;
    
//        String opciones[] = {"A", "B", "Res"};
//        int option = JOptionPane.showOptionDialog(null, "PolinomioBits del que desea borrar", "Borrar PolinomioBits", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
//        
//        if (opciones[option].equals("A")){
//            jLabel9.setText("A(x = "+ x +") = "+ A.Evaluar(x));
//        }
//        else if (opciones[option].equals("B")){
//            jLabel9.setText("B(x = "+ x +") = "+ B.Evaluar(x));
//        }
//        else{
//            jLabel9.setText("Res(x = "+ x +") = "+ C.Evaluar(x));
//        }
    }//GEN-LAST:event_EvaluarActionPerformed

    private void valorXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorXKeyPressed
        char e = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isDigit(e) | keyCode == KeyEvent.VK_BACK_SPACE)
            esValido = true;
        else
            esValido = false;
    }//GEN-LAST:event_valorXKeyPressed

    private void valorXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorXKeyReleased
        habilitarEvaluar();
    }//GEN-LAST:event_valorXKeyReleased

    private void valorXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorXKeyTyped
        if (!esValido){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Introducir solo Numeros");
        }
    }//GEN-LAST:event_valorXKeyTyped

    private void PolinomioACaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PolinomioACaretUpdate
        habilitarOperaciones();
    }//GEN-LAST:event_PolinomioACaretUpdate

    private void PolinomioBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PolinomioBCaretUpdate
        habilitarOperaciones();
    }//GEN-LAST:event_PolinomioBCaretUpdate

    private void Numerador1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numerador1KeyPressed

    private void Numerador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Numerador1KeyReleased

    private void Numerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Numerador1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Numerador1KeyTyped

    private void Denominador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Denominador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Denominador1ActionPerformed

    private void Denominador2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Denominador2KeyPressed

    private void Denominador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Denominador2KeyReleased

    private void Denominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Denominador2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Denominador2KeyTyped

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
            java.util.logging.Logger.getLogger(FormPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPolinomio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarMonomio;
    private javax.swing.JButton BorrarPolinomio;
    private javax.swing.JButton Calcular;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JComboBox<String> ComboBox4;
    private javax.swing.JTextField Denominador1;
    private javax.swing.JTextField Denominador2;
    private javax.swing.JButton Evaluar;
    private javax.swing.JButton InsertarA;
    private javax.swing.JButton InsertarB;
    private javax.swing.JTextField Numerador1;
    private javax.swing.JTextField Numerador2;
    private javax.swing.JTextField PolinomioA;
    private javax.swing.JTextField PolinomioB;
    private javax.swing.JTextField PolinomioC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField valorX;
    // End of variables declaration//GEN-END:variables
}
