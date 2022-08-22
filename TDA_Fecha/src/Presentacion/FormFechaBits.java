package Presentacion;

import Negocio.FechaBits;
import javax.swing.JOptionPane;

public class FormFechaBits extends javax.swing.JFrame {

    FechaBits A = new FechaBits();
    int xMouse, yMouse;
    boolean editar;
    String cambiarFecha;
    String dia;
    String mes;
    String año;
    String Fechas[];

    public FormFechaBits() {
        initComponents();
        this.setLocationRelativeTo(null);
        FormMostrar.setLocationRelativeTo(null);
        this.Bttn_Guardar.setVisible(false);
        this.Bttn_Cancelar.setVisible(false);
        editar = false;
    }
    
    private boolean verificarVacio() {
        return (Txt_Dia.getText().isEmpty() || Txt_Mes.getText().isEmpty() || Txt_Año.getText().isEmpty());
    }

    private void mostrar(int pos) {
        dia = "" + A.getDia(pos);
        mes = "" + A.getMes(pos);
        año = "" + A.getAño(pos);

//        Txt_Dia1.setText(dia);
//        Txt_Mes1.setText(mes);
//        Txt_Año1.setText(año);
//        Lbl_Fecha.setText(A.fechaLiteral(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(año)));

        llenarDatos();
    }

    private void llenarDatos() {
        Txt_Dia1.setText(dia);
        Txt_Mes1.setText(mes);
        Txt_Año1.setText(año);
        Lbl_Fecha.setText(A.fechaLiteral(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(año)));
    }

    private void cambiarFecha() {
        int Dia = Integer.parseInt(Txt_Dia1.getText());
        int Mes = Integer.parseInt(Txt_Mes1.getText());
        int Año = Integer.parseInt(Txt_Año1.getText());
        if (cambiarFecha.equals("siguiente")) {
            if (Dia >= 1 && Dia < 30) {
                Dia++;
            } else if (Dia >= 30 && Mes < 12) {
                Dia = 1;
                Mes++;
            } else if (Dia >= 30 && Mes >= 12) {
                Dia = 1;
                Mes = 1;
                Año++;
            }
        }
        if (cambiarFecha.equals("anterior")) {
            if (Dia > 1 && Dia <= 30) {
                Dia--;
            } else if (Dia == 1 && Mes > 1 && Mes <= 12) {
                Dia = 30;
                Mes--;
            } else if (Dia == 1 && Mes == 1) {
                Dia = 30;
                Mes = 12;
                Año--;
            }
        }
        
        String fecha = A.fechaLiteral(Dia, Mes, Año);
        
        Txt_Dia1.setText("" + Dia);
        Txt_Mes1.setText("" + Mes);
        Txt_Año1.setText("" + Año);
        Lbl_Fecha.setText(fecha);
    }

    public String obtenerFecha(int Dia, int Mes, int Año) {
        String fecha;
        if (Dia <= 9 || Mes <= 9) {
            if (Dia <= 9) {
                fecha = "0" + Dia + " / ";
            } else {
                fecha = "" + Dia + " / ";
            }
            if (Mes <= 9) {
                fecha = fecha + "0" + Mes + " / " + Año;
            } else {
                fecha = fecha + Mes + " / " + Año;
            }
        } else {
            fecha = "" + Dia + " / " + Mes + " / " + Año;
        }
        return fecha;
    }

    private int obtenerPosicion() {
        int pos = 0;
        String fecha = obtenerFecha(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(año));
        for (int i = 0; i < Fechas.length; i++) {
            if (Fechas[i].equals(fecha)) {
                pos = i;
            }
        }
        return pos + 1;
    }

    private void actualizar() {
        int pos = obtenerPosicion();
        A.setDia(pos, Integer.parseInt(Txt_Dia1.getText()));
        A.setMes(pos, Integer.parseInt(Txt_Mes1.getText()));
        A.setAño(pos, Integer.parseInt(Txt_Año1.getText()));
        mostrar(pos);
        Fechas[pos - 1] = obtenerFecha(Integer.parseInt(Txt_Dia1.getText()),Integer.parseInt(Txt_Mes1.getText()),Integer.parseInt(Txt_Año1.getText()));
    }

    private void editar() {
        if (editar == false) {
            Txt_Dia1.setEnabled(true);
            Txt_Mes1.setEnabled(true);
            Txt_Año1.setEnabled(true);
            Bttn_Cancelar.setVisible(true);
            Bttn_Guardar.setVisible(true);
            Bttn_Editar.setVisible(false);
        } else {
            Txt_Dia1.setEnabled(false);
            Txt_Mes1.setEnabled(false);
            Txt_Año1.setEnabled(false);
            Bttn_Cancelar.setVisible(false);
            Bttn_Guardar.setVisible(false);
            Bttn_Editar.setVisible(true);
        }
        editar = !editar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormMostrar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        Bttn_Anterior = new javax.swing.JButton();
        Bttn_Siguiente = new javax.swing.JButton();
        Bttn_Editar = new javax.swing.JButton();
        Bttn_Guardar = new javax.swing.JButton();
        Bttn_Cancelar = new javax.swing.JButton();
        Txt_Dia1 = new javax.swing.JTextField();
        Txt_Mes1 = new javax.swing.JTextField();
        Txt_Año1 = new javax.swing.JTextField();
        Lbl_Fecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_Año = new javax.swing.JTextField();
        Txt_Dia = new javax.swing.JTextField();
        Txt_Mes = new javax.swing.JTextField();
        Bttn_Mostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Bttn_Añadir = new javax.swing.JButton();

        FormMostrar.setMinimumSize(new java.awt.Dimension(310, 300));
        FormMostrar.setResizable(false);
        FormMostrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FormMostrarMouseDragged(evt);
            }
        });
        FormMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormMostrarMousePressed(evt);
            }
        });
        FormMostrar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(310, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(310, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(310, 300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bttn_Anterior.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Bttn_Anterior.setText("<<");
        Bttn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_AnteriorActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 58, -1));

        Bttn_Siguiente.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Bttn_Siguiente.setText(">>");
        Bttn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_SiguienteActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 140, 58, -1));

        Bttn_Editar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Editar.setText("EDITAR");
        Bttn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_EditarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 177, 120, -1));

        Bttn_Guardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Guardar.setText("GUARDAR");
        Bttn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 177, 120, -1));

        Bttn_Cancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Cancelar.setText("CANCELAR");
        Bttn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, -1));

        Txt_Dia1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Dia1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Dia1.setEnabled(false);
        Txt_Dia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Dia1KeyTyped(evt);
            }
        });
        jPanel2.add(Txt_Dia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 60, -1));

        Txt_Mes1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Mes1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Mes1.setEnabled(false);
        Txt_Mes1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Mes1KeyTyped(evt);
            }
        });
        jPanel2.add(Txt_Mes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 60, -1));

        Txt_Año1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Año1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Año1.setEnabled(false);
        Txt_Año1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Año1KeyTyped(evt);
            }
        });
        jPanel2.add(Txt_Año1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 60, -1));

        Lbl_Fecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Lbl_Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Fecha.setText("5 de junio de 2002");
        jPanel2.add(Lbl_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 105, 230, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Dia");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Mes");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 83, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Año");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 83, -1, -1));

        FormMostrar.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 290));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(370, 340));
        setMinimumSize(new java.awt.Dimension(370, 340));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(370, 340));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 340));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("AÑO:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 193, 50, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 310, 10));

        jLabel2.setFont(new java.awt.Font("Rolling No One", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TDA FECHA");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("AÑADIR  FECHA:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("MES:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 163, 50, -1));

        Txt_Año.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Año.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_AñoKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, -1));

        Txt_Dia.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DiaKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, -1));

        Txt_Mes.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_MesKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, -1));

        Bttn_Mostrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Mostrar.setText("MOSTRAR");
        Bttn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 265, 110, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("DIA:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 133, 50, -1));

        Bttn_Añadir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Añadir.setText("AÑADIR");
        Bttn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_AñadirActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_AñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_AñoKeyTyped
        if (Txt_Año.getText().length() >= 4) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_AñoKeyTyped

    private void Txt_MesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_MesKeyTyped
        if (Txt_Mes.getText().length() >= 2) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_MesKeyTyped

    private void Txt_DiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DiaKeyTyped
        if (Txt_Dia.getText().length() >= 2) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_DiaKeyTyped

    private void Bttn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_MostrarActionPerformed
        Fechas = new String[A.dim];
        if (Fechas.length <= A.dim) {
            for (int i = 0; i < Fechas.length; i++) {
                Fechas[i] = A.mostrarFecha(i + 1);
            }
        }
        
        String fechas = (JOptionPane.showInputDialog(rootPane, "Seleccionar la Fecha para mostrar", "Mostrar Fecha", JOptionPane.PLAIN_MESSAGE, null, Fechas, null)).toString();
        if (fechas != null) {
            for (int i = 0; i < Fechas.length; i++) {
                if (Fechas[i].equals(fechas)) {
                    mostrar(i + 1);
                    FormMostrar.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_Bttn_MostrarActionPerformed

    private void Bttn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_AñadirActionPerformed
        if (!verificarVacio()) {
            A.insertar(Integer.parseInt(Txt_Dia.getText()), Integer.parseInt(Txt_Mes.getText()), Integer.parseInt(Txt_Año.getText()));
            JOptionPane.showMessageDialog(rootPane, "La Fecha Se Guardado Correctamente", "AVISO", 1);
            Txt_Dia.setText("");
            Txt_Mes.setText("");
            Txt_Año.setText("");
            System.out.println(A);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Todos los datos", "AVISO", 1);
        }
    }//GEN-LAST:event_Bttn_AñadirActionPerformed

    private void Bttn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_AnteriorActionPerformed
        cambiarFecha = "anterior";
        cambiarFecha();
    }//GEN-LAST:event_Bttn_AnteriorActionPerformed

    private void Bttn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_SiguienteActionPerformed
        cambiarFecha = "siguiente";
        cambiarFecha();
    }//GEN-LAST:event_Bttn_SiguienteActionPerformed

    private void FormMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMostrarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FormMostrarMousePressed

    private void FormMostrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMostrarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FormMostrarMouseDragged

    private void Txt_Dia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Dia1KeyTyped
        if (Txt_Dia1.getText().length() >= 2) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_Dia1KeyTyped

    private void Txt_Mes1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Mes1KeyTyped
        if (Txt_Mes1.getText().length() >= 2) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_Mes1KeyTyped

    private void Txt_Año1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Año1KeyTyped
        if (Txt_Año1.getText().length() >= 4) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_Año1KeyTyped

    private void Bttn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_EditarActionPerformed
        llenarDatos();
        editar();
    }//GEN-LAST:event_Bttn_EditarActionPerformed

    private void Bttn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CancelarActionPerformed
        llenarDatos();
        editar();
    }//GEN-LAST:event_Bttn_CancelarActionPerformed

    private void Bttn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_GuardarActionPerformed
        actualizar();
        editar();
    }//GEN-LAST:event_Bttn_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FormFechaBits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFechaBits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFechaBits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFechaBits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFechaBits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_Anterior;
    private javax.swing.JButton Bttn_Añadir;
    private javax.swing.JButton Bttn_Cancelar;
    private javax.swing.JButton Bttn_Editar;
    private javax.swing.JButton Bttn_Guardar;
    private javax.swing.JButton Bttn_Mostrar;
    private javax.swing.JButton Bttn_Siguiente;
    private javax.swing.JFrame FormMostrar;
    private javax.swing.JLabel Lbl_Fecha;
    private javax.swing.JTextField Txt_Año;
    private javax.swing.JTextField Txt_Año1;
    private javax.swing.JTextField Txt_Dia;
    private javax.swing.JTextField Txt_Dia1;
    private javax.swing.JTextField Txt_Mes;
    private javax.swing.JTextField Txt_Mes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
