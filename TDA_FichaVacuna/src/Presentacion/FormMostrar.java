package Presentacion;

public class FormMostrar extends javax.swing.JFrame {

    FormFichaVacuna Datos;
    int xMouse, yMouse;
    boolean editar, noEditar;
    String Nombre;
    String Apellido;
    String Dia;
    String Mes;
    String Año;
    String Genero;
    String Edad;
    String Ficha;

    public FormMostrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Txt_Nombre.setVisible(false);
        this.Txt_Apellido.setVisible(false);
        this.Txt_Edad.setVisible(false);
        this.Cbx_Dia.setVisible(false);
        this.Cbx_Mes.setVisible(false);
        this.Cbx_Año.setVisible(false);
        this.Rbtn_Masculino.setVisible(false);
        this.Rbtn_Femenino.setVisible(false);
        this.Bttn_Guardar.setVisible(false);
        this.Bttn_Cancelar.setVisible(false);
        editar = false;
        noEditar = true;
    }

    public void habilitarEditar() {
        this.Lbl_Nombre.setVisible(false);
        this.Lbl_Apellido.setVisible(false);
        this.Lbl_Fecha.setVisible(false);
        this.Lbl_Genero.setVisible(false);
        this.Lbl_Edad.setVisible(false);
        
        this.Txt_Nombre.setVisible(true);
        this.Txt_Apellido.setVisible(true);
        this.Txt_Edad.setVisible(true);
        this.Cbx_Dia.setVisible(true);
        this.Cbx_Mes.setVisible(true);
        this.Cbx_Año.setVisible(true);
        this.Rbtn_Masculino.setVisible(true);
        this.Rbtn_Femenino.setVisible(true);
    }

    public void deshabilitar() {
        this.Txt_Nombre.setVisible(false);
        this.Txt_Apellido.setVisible(false);
        this.Txt_Edad.setVisible(false);
        this.Cbx_Dia.setVisible(false);
        this.Cbx_Mes.setVisible(false);
        this.Cbx_Año.setVisible(false);
        this.Rbtn_Masculino.setVisible(false);
        this.Rbtn_Femenino.setVisible(false);
        
        this.Lbl_Nombre.setVisible(true);
        this.Lbl_Apellido.setVisible(true);
        this.Lbl_Fecha.setVisible(true);
        this.Lbl_Genero.setVisible(true);
        this.Lbl_Edad.setVisible(true);
    }

    public void editar() {
        if (editar == false && noEditar == true) {
            habilitarEditar();
            Bttn_Guardar.setVisible(true);
            Bttn_Cancelar.setVisible(true);
            Bttn_Editar.setVisible(false);
            Bttn_Cerrar.setVisible(false);
        } else {
            deshabilitar();
            Bttn_Guardar.setVisible(false);
            Bttn_Cancelar.setVisible(false);
            Bttn_Editar.setVisible(true);
            Bttn_Cerrar.setVisible(true);
        }
        editar = !editar;
        noEditar = !noEditar;
    }
    
    public void obtenerDatos() {
        Ficha = this.Lbl_NumFicha.getText();
        Dia = this.Cbx_Dia.getSelectedItem().toString();
        Mes = this.Cbx_Mes.getSelectedItem().toString();
        Año = this.Cbx_Año.getSelectedItem().toString();
        Nombre = this.Txt_Nombre.getText();
        Apellido = this.Txt_Apellido.getText();
        if (this.Rbtn_Masculino.isSelected()) {
            Genero = "Masculino";
        } if (this.Rbtn_Femenino.isSelected()) {
            Genero = "Femenino";
        }
        Edad = this.Txt_Edad.getText();
        //Datos.actualizar(Ficha, Dia, Mes, Año, Nombre, Apellido, Genero, Edad);
    }
    
    private void llenarDatos(String ficha, String dia, String mes, String año, String nombre, String apellido, String genero, String edad) {
        this.Lbl_NumFicha.setText(ficha);
        if (Integer.parseInt(dia) <= 9 ) {
            dia = "0" + dia;
        }
        if (Integer.parseInt(mes) <= 9) {
            mes = "0" + mes;
        }
        this.Cbx_Dia.setSelectedItem(dia);
        this.Cbx_Mes.setSelectedItem(mes);
        this.Cbx_Año.setSelectedItem(año);
        this.Txt_Nombre.setText(nombre);
        this.Txt_Apellido.setText(apellido);
        if (genero.equals("Masculino")) {
            this.Rbtn_Masculino.setSelected(true);
        } if (genero.equals("Femenino")) {
            this.Rbtn_Femenino.setSelected(true);
        }
        this.Txt_Edad.setText(edad);
    }
    
    public void copiarDatos(String ficha, String dia, String mes, String año, String nombre, String apellido, String genero, String edad) {
        Ficha = ficha;
        Dia = dia;
        Mes = mes;
        Año = año;
        Nombre = nombre;
        Apellido = apellido;
        Genero = genero;
        Edad = edad;
        
        llenarDatos(ficha, dia, mes, año, nombre, apellido, genero, edad);
    }
    
    private void copiar() {
        llenarDatos(Ficha, Dia, Mes, Año, Nombre, Apellido, Genero, Edad); 
    }

    public void mostrarDatos(String ficha, String nombre, String apellido, String fecha, String genero, String edad) {
        this.Lbl_NumFicha.setText(ficha);
        this.Lbl_Nombre.setText(nombre);
        this.Lbl_Apellido.setText(apellido);
        this.Lbl_Fecha.setText(fecha);
        this.Lbl_Genero.setText(genero);
        this.Lbl_Edad.setText(edad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Lbl_NumFicha = new javax.swing.JLabel();
        Lbl_Nombre = new javax.swing.JLabel();
        Lbl_Apellido = new javax.swing.JLabel();
        Lbl_Fecha = new javax.swing.JLabel();
        Lbl_Genero = new javax.swing.JLabel();
        Lbl_Edad = new javax.swing.JLabel();
        Bttn_Cerrar = new javax.swing.JButton();
        Bttn_Editar = new javax.swing.JButton();
        Bttn_Guardar = new javax.swing.JButton();
        Bttn_Cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Edad = new javax.swing.JTextField();
        Cbx_Dia = new javax.swing.JComboBox<>();
        Cbx_Mes = new javax.swing.JComboBox<>();
        Cbx_Año = new javax.swing.JComboBox<>();
        Rbtn_Femenino = new javax.swing.JRadioButton();
        Rbtn_Masculino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 390));
        setMinimumSize(new java.awt.Dimension(430, 390));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(430, 390));
        jPanel1.setMinimumSize(new java.awt.Dimension(430, 390));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRES: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 103, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("APELLIDOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 141, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("FECHA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 176, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("GENERO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 209, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("EDAD:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 243, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel13.setText("FICHA  N°: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        Lbl_NumFicha.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        Lbl_NumFicha.setText("0");
        jPanel1.add(Lbl_NumFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 50, -1, -1));

        Lbl_Nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Nombre.setText("Nombres");
        jPanel1.add(Lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 100, 207, 28));

        Lbl_Apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Apellido.setText("Apellidos");
        jPanel1.add(Lbl_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 138, 207, 28));

        Lbl_Fecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Fecha.setText("Fecha");
        jPanel1.add(Lbl_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 173, 207, 28));

        Lbl_Genero.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Genero.setText("Genero");
        jPanel1.add(Lbl_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 206, 207, 28));

        Lbl_Edad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Edad.setText("Edad");
        jPanel1.add(Lbl_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 240, 207, 28));

        Bttn_Cerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Cerrar.setText("CERRAR");
        Bttn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 306, 120, -1));

        Bttn_Editar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Editar.setText("EDITAR");
        Bttn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 306, 120, -1));

        Bttn_Guardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Guardar.setText("GUARDAR");
        Bttn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 306, 120, -1));

        Bttn_Cancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Cancelar.setText("CANCELAR");
        Bttn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 306, 120, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        Txt_Apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        Txt_Edad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Txt_Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Cbx_Dia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Cbx_Mes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        Cbx_Año.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));

        buttonGroup1.add(Rbtn_Femenino);
        Rbtn_Femenino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Femenino.setText("F");

        buttonGroup1.add(Rbtn_Masculino);
        Rbtn_Masculino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Masculino.setText("M");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Cbx_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cbx_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cbx_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Rbtn_Masculino)
                        .addGap(4, 4, 4)
                        .addComponent(Rbtn_Femenino)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cbx_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rbtn_Masculino)
                    .addComponent(Rbtn_Femenino))
                .addGap(5, 5, 5)
                .addComponent(Txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 250, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_Bttn_CerrarActionPerformed

    private void Bttn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_EditarActionPerformed
        editar();
    }//GEN-LAST:event_Bttn_EditarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void Bttn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_GuardarActionPerformed
        Datos.actualizar();
        editar();
    }//GEN-LAST:event_Bttn_GuardarActionPerformed

    private void Bttn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CancelarActionPerformed
        editar();
        copiar();
    }//GEN-LAST:event_Bttn_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_Cancelar;
    private javax.swing.JButton Bttn_Cerrar;
    private javax.swing.JButton Bttn_Editar;
    private javax.swing.JButton Bttn_Guardar;
    private javax.swing.JComboBox<String> Cbx_Año;
    private javax.swing.JComboBox<String> Cbx_Dia;
    private javax.swing.JComboBox<String> Cbx_Mes;
    private javax.swing.JLabel Lbl_Apellido;
    private javax.swing.JLabel Lbl_Edad;
    private javax.swing.JLabel Lbl_Fecha;
    private javax.swing.JLabel Lbl_Genero;
    private javax.swing.JLabel Lbl_Nombre;
    private javax.swing.JLabel Lbl_NumFicha;
    private javax.swing.JRadioButton Rbtn_Femenino;
    private javax.swing.JRadioButton Rbtn_Masculino;
    private javax.swing.JTextField Txt_Apellido;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
