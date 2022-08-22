package ListaDirectorio;

import javax.swing.JOptionPane;

public class FormDirectorio extends javax.swing.JFrame {

    ListaG A;

    public FormDirectorio() {
        initComponents();
        this.setLocationRelativeTo(null);
        A = new ListaG<Directorio>();
    }

    private boolean verificarDatosValidos() {
        return (!Txt_Nombre.getText().isEmpty() && !Txt_Numero.getText().isEmpty()
                && ((!Rbttn_Movil.isSelected() && Rbttn_Fijo.isSelected())
                || (Rbttn_Movil.isSelected() && !Rbttn_Fijo.isSelected()))
                && ((!Rbttn_Vip.isSelected() && !Rbttn_Amigos.isSelected() && Rbttn_Familia.isSelected())
                || (!Rbttn_Vip.isSelected() && Rbttn_Amigos.isSelected() && !Rbttn_Familia.isSelected())
                || (Rbttn_Vip.isSelected() && !Rbttn_Amigos.isSelected() && !Rbttn_Familia.isSelected()))
                && !Cbx_Dia.getSelectedItem().toString().equals("Dia")
                && !Cbx_Mes.getSelectedItem().toString().equals("Mes")
                && !Cbx_Año.getSelectedItem().toString().equals("Año"));
    }
    
    private void limpiar() {
        Txt_Nombre.setText("");
        Txt_Numero.setText("");
        Bttn_Grupo1.clearSelection();
        Cbx_Dia.setSelectedItem("Dia");
        Cbx_Mes.setSelectedItem("Mes");
        Cbx_Año.setSelectedItem("Año");
        Bttn_Grupo2.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bttn_Grupo1 = new javax.swing.ButtonGroup();
        Bttn_Grupo2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Numero = new javax.swing.JTextField();
        Rbttn_Movil = new javax.swing.JRadioButton();
        Rbttn_Fijo = new javax.swing.JRadioButton();
        Cbx_Dia = new javax.swing.JComboBox<>();
        Cbx_Mes = new javax.swing.JComboBox<>();
        Cbx_Año = new javax.swing.JComboBox<>();
        Rbttn_Vip = new javax.swing.JRadioButton();
        Rbttn_Amigos = new javax.swing.JRadioButton();
        Rbttn_Familia = new javax.swing.JRadioButton();
        Bttn_Insertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_Mostrar = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rolling No One", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE DIRECTORIOS");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Nombre completo:");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("N° de telefono:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Tipo de telefono:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Grupo:");

        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyTyped(evt);
            }
        });

        Txt_Numero.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NumeroKeyTyped(evt);
            }
        });

        Bttn_Grupo1.add(Rbttn_Movil);
        Rbttn_Movil.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbttn_Movil.setText("Movil");

        Bttn_Grupo1.add(Rbttn_Fijo);
        Rbttn_Fijo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbttn_Fijo.setText("Fijo");

        Cbx_Dia.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Cbx_Mes.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        Cbx_Año.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        Bttn_Grupo2.add(Rbttn_Vip);
        Rbttn_Vip.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbttn_Vip.setText("VIP");

        Bttn_Grupo2.add(Rbttn_Amigos);
        Rbttn_Amigos.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbttn_Amigos.setText("Amigos");

        Bttn_Grupo2.add(Rbttn_Familia);
        Rbttn_Familia.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbttn_Familia.setText("Familia");

        Bttn_Insertar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Bttn_Insertar.setText("GUARDAR DIRECTORIO");
        Bttn_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_InsertarActionPerformed(evt);
            }
        });

        Txt_Mostrar.setEditable(false);
        Txt_Mostrar.setColumns(20);
        Txt_Mostrar.setRows(5);
        jScrollPane1.setViewportView(Txt_Mostrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Bttn_Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(156, 156, 156))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Rbttn_Movil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Rbttn_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Cbx_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Cbx_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Cbx_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Txt_Numero)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Rbttn_Vip, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Rbttn_Amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Rbttn_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Txt_Nombre))
                                    .addGap(60, 60, 60)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Rbttn_Movil)
                            .addComponent(Rbttn_Fijo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Cbx_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbx_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbx_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Rbttn_Vip)
                            .addComponent(Rbttn_Amigos)
                            .addComponent(Rbttn_Familia))
                        .addGap(46, 46, 46)
                        .addComponent(Bttn_Insertar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_InsertarActionPerformed
        if (verificarDatosValidos()) {
                String nombre = Txt_Nombre.getText();
                int numero = Integer.parseInt(Txt_Numero.getText());
                int tipoNumero = 0;
                if (Rbttn_Movil.isSelected()) {
                    tipoNumero = 0;
                } else if (Rbttn_Fijo.isSelected()) {
                    tipoNumero = 1;
                }
                int dia = Integer.parseInt(Cbx_Dia.getSelectedItem().toString());
                int mes = Integer.parseInt(Cbx_Mes.getSelectedItem().toString());
                int año = Integer.parseInt(Cbx_Año.getSelectedItem().toString());
                int grupo = 0;
                if (Rbttn_Vip.isSelected()) {
                    grupo = 0;
                } else if (Rbttn_Amigos.isSelected()) {
                    grupo = 1;
                } else if (Rbttn_Familia.isSelected()) {
                    grupo = 2;
                }
                Directorio B = new Directorio(1);
                B.insertar(nombre, numero, tipoNumero, dia, mes, año, grupo);
                A.Insertar(B);
                Txt_Mostrar.setText(A.toString());
                limpiar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los datos", "Aviso:", 1);
        }
    }//GEN-LAST:event_Bttn_InsertarActionPerformed

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras", "Aviso:", 1);
        }
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_NumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NumeroKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros", "Aviso:", 1);
        }
    }//GEN-LAST:event_Txt_NumeroKeyTyped

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
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDirectorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Bttn_Grupo1;
    private javax.swing.ButtonGroup Bttn_Grupo2;
    private javax.swing.JButton Bttn_Insertar;
    private javax.swing.JComboBox<String> Cbx_Año;
    private javax.swing.JComboBox<String> Cbx_Dia;
    private javax.swing.JComboBox<String> Cbx_Mes;
    private javax.swing.JRadioButton Rbttn_Amigos;
    private javax.swing.JRadioButton Rbttn_Familia;
    private javax.swing.JRadioButton Rbttn_Fijo;
    private javax.swing.JRadioButton Rbttn_Movil;
    private javax.swing.JRadioButton Rbttn_Vip;
    private javax.swing.JTextArea Txt_Mostrar;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Numero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
