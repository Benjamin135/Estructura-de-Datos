package Presentacion;

import Negocio.Calculadora;
import javax.swing.JOptionPane;

public class FormCalculadora extends javax.swing.JFrame {

    String expresion = "";
    Calculadora A;

    public FormCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
//        A = new Calculadora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bttn_Delete = new javax.swing.JButton();
        Bttn_Clear = new javax.swing.JButton();
        Bttn_Num0 = new javax.swing.JButton();
        Bttn_Num1 = new javax.swing.JButton();
        Bttn_Num2 = new javax.swing.JButton();
        Bttn_Num3 = new javax.swing.JButton();
        Bttn_Num4 = new javax.swing.JButton();
        Bttn_Num5 = new javax.swing.JButton();
        Bttn_Num6 = new javax.swing.JButton();
        Bttn_Num7 = new javax.swing.JButton();
        Bttn_Num8 = new javax.swing.JButton();
        Bttn_Num9 = new javax.swing.JButton();
        Bttn_Multiplicacion = new javax.swing.JButton();
        Bttn_Division = new javax.swing.JButton();
        Bttn_Suma = new javax.swing.JButton();
        Bttn_Resta = new javax.swing.JButton();
        Bttn_Igual = new javax.swing.JButton();
        Bttn_AbreParentesis = new javax.swing.JButton();
        Bttn_CierraParentesis = new javax.swing.JButton();
        PanelMostrar = new javax.swing.JPanel();
        Lbl_Resultado = new javax.swing.JLabel();
        Txt_Mostrar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");
        setMinimumSize(new java.awt.Dimension(380, 470));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(380, 470));
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 470));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 470));

        Bttn_Delete.setBackground(new java.awt.Color(255, 102, 0));
        Bttn_Delete.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 26)); // NOI18N
        Bttn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retroceso.png"))); // NOI18N
        Bttn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bttn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_DeleteActionPerformed(evt);
            }
        });

        Bttn_Clear.setBackground(new java.awt.Color(255, 102, 0));
        Bttn_Clear.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Bttn_Clear.setText("AC");
        Bttn_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_ClearActionPerformed(evt);
            }
        });

        Bttn_Num0.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num0.setText("0");
        Bttn_Num0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num0ActionPerformed(evt);
            }
        });

        Bttn_Num1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num1.setText("1");
        Bttn_Num1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num1ActionPerformed(evt);
            }
        });

        Bttn_Num2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num2.setText("2");
        Bttn_Num2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num2ActionPerformed(evt);
            }
        });

        Bttn_Num3.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num3.setText("3");
        Bttn_Num3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num3ActionPerformed(evt);
            }
        });

        Bttn_Num4.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num4.setText("4");
        Bttn_Num4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num4ActionPerformed(evt);
            }
        });

        Bttn_Num5.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num5.setText("5");
        Bttn_Num5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num5ActionPerformed(evt);
            }
        });

        Bttn_Num6.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num6.setText("6");
        Bttn_Num6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num6ActionPerformed(evt);
            }
        });

        Bttn_Num7.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num7.setText("7");
        Bttn_Num7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num7ActionPerformed(evt);
            }
        });

        Bttn_Num8.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num8.setText("8");
        Bttn_Num8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num8ActionPerformed(evt);
            }
        });

        Bttn_Num9.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Num9.setText("9");
        Bttn_Num9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_Num9ActionPerformed(evt);
            }
        });

        Bttn_Multiplicacion.setBackground(new java.awt.Color(255, 204, 0));
        Bttn_Multiplicacion.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Multiplicacion.setText("×");
        Bttn_Multiplicacion.setAlignmentY(0.0F);
        Bttn_Multiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bttn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_MultiplicacionActionPerformed(evt);
            }
        });

        Bttn_Division.setBackground(new java.awt.Color(255, 204, 0));
        Bttn_Division.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Division.setText("/");
        Bttn_Division.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_DivisionActionPerformed(evt);
            }
        });

        Bttn_Suma.setBackground(new java.awt.Color(255, 204, 0));
        Bttn_Suma.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Suma.setText("+");
        Bttn_Suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_SumaActionPerformed(evt);
            }
        });

        Bttn_Resta.setBackground(new java.awt.Color(255, 204, 0));
        Bttn_Resta.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Resta.setText("-");
        Bttn_Resta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bttn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_RestaActionPerformed(evt);
            }
        });

        Bttn_Igual.setBackground(new java.awt.Color(255, 204, 0));
        Bttn_Igual.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_Igual.setText("=");
        Bttn_Igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_IgualActionPerformed(evt);
            }
        });

        Bttn_AbreParentesis.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_AbreParentesis.setText("(");
        Bttn_AbreParentesis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_AbreParentesis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bttn_AbreParentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_AbreParentesisActionPerformed(evt);
            }
        });

        Bttn_CierraParentesis.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Bttn_CierraParentesis.setText(")");
        Bttn_CierraParentesis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bttn_CierraParentesis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bttn_CierraParentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CierraParentesisActionPerformed(evt);
            }
        });

        PanelMostrar.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostrar.setMaximumSize(new java.awt.Dimension(12, 98));
        PanelMostrar.setMinimumSize(new java.awt.Dimension(343, 113));
        PanelMostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Resultado.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_Resultado.setFont(new java.awt.Font("Dialog", 0, 27)); // NOI18N
        Lbl_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lbl_Resultado.setOpaque(true);
        PanelMostrar.add(Lbl_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 59, 310, 40));

        Txt_Mostrar.setEditable(false);
        Txt_Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Mostrar.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        Txt_Mostrar.setBorder(null);
        Txt_Mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PanelMostrar.add(Txt_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 14, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pantalla1.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(343, 113));
        PanelMostrar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Bttn_Num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bttn_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Bttn_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bttn_Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bttn_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Bttn_AbreParentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bttn_CierraParentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bttn_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Bttn_Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Bttn_Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bttn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(PanelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bttn_Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bttn_Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bttn_Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bttn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bttn_Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bttn_Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bttn_Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bttn_Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bttn_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bttn_Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bttn_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bttn_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bttn_Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bttn_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Bttn_Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bttn_AbreParentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bttn_CierraParentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bttn_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addComponent(Bttn_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num0ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "0";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num0ActionPerformed

    private void Bttn_Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num1ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "1";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num1ActionPerformed

    private void Bttn_Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num2ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "2";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num2ActionPerformed

    private void Bttn_Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num3ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "3";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num3ActionPerformed

    private void Bttn_Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num4ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "4";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num4ActionPerformed

    private void Bttn_Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num5ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "5";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num5ActionPerformed

    private void Bttn_Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num6ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "6";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num6ActionPerformed

    private void Bttn_Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num7ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "7";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num7ActionPerformed

    private void Bttn_Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num8ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "8";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num8ActionPerformed

    private void Bttn_Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_Num9ActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "9";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_Num9ActionPerformed

    private void Bttn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_MultiplicacionActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "×";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_MultiplicacionActionPerformed

    private void Bttn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_DivisionActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "/";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_DivisionActionPerformed

    private void Bttn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_SumaActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "+";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_SumaActionPerformed

    private void Bttn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_RestaActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "-";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_RestaActionPerformed

    private void Bttn_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_IgualActionPerformed
        A = new Calculadora(expresion);
        if (A.verificarExpresionValida()) {
            double resultado = A.resolucion();
            Lbl_Resultado.setText(String.valueOf(resultado));
            System.out.println(A.toString());
        } else if (expresion.equals("")) {
            Lbl_Resultado.setText("");
            System.out.println(A.getError());
        } else {
            //JOptionPane.showMessageDialog(rootPane, A.getError(), "AVISO", HEIGHT);
            System.out.println(A.getError());
            Lbl_Resultado.setText("Syntax ERROR");
        }
    }//GEN-LAST:event_Bttn_IgualActionPerformed

    private void Bttn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_DeleteActionPerformed
        if (expresion.length() > 0) {
            expresion = expresion.substring(0, expresion.length() - 1);
        }
        Txt_Mostrar.setText(expresion);
        Lbl_Resultado.setText("");
    }//GEN-LAST:event_Bttn_DeleteActionPerformed

    private void Bttn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_ClearActionPerformed
        expresion = "";
        Txt_Mostrar.setText(expresion);
        Lbl_Resultado.setText("");
    }//GEN-LAST:event_Bttn_ClearActionPerformed

    private void Bttn_AbreParentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_AbreParentesisActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + "(";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_AbreParentesisActionPerformed

    private void Bttn_CierraParentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CierraParentesisActionPerformed
        Lbl_Resultado.setText("");
        expresion = expresion + ")";
        Txt_Mostrar.setText(expresion);
    }//GEN-LAST:event_Bttn_CierraParentesisActionPerformed

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
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_AbreParentesis;
    private javax.swing.JButton Bttn_CierraParentesis;
    private javax.swing.JButton Bttn_Clear;
    private javax.swing.JButton Bttn_Delete;
    private javax.swing.JButton Bttn_Division;
    private javax.swing.JButton Bttn_Igual;
    private javax.swing.JButton Bttn_Multiplicacion;
    private javax.swing.JButton Bttn_Num0;
    private javax.swing.JButton Bttn_Num1;
    private javax.swing.JButton Bttn_Num2;
    private javax.swing.JButton Bttn_Num3;
    private javax.swing.JButton Bttn_Num4;
    private javax.swing.JButton Bttn_Num5;
    private javax.swing.JButton Bttn_Num6;
    private javax.swing.JButton Bttn_Num7;
    private javax.swing.JButton Bttn_Num8;
    private javax.swing.JButton Bttn_Num9;
    private javax.swing.JButton Bttn_Resta;
    private javax.swing.JButton Bttn_Suma;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JPanel PanelMostrar;
    private javax.swing.JTextField Txt_Mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
