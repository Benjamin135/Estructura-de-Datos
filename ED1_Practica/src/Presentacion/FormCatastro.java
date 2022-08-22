package Presentacion;

import Negocio.Catastro;
import javax.swing.JOptionPane;

public class FormCatastro extends javax.swing.JFrame {

    Catastro A;
    int cant;

    public FormCatastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        cant = Integer.parseInt(Txt_Cant.getText());
        A = new Catastro(cant);
        Lbl_NumReg.setText(String.valueOf(A.dim + 1));
    }

    private void limpiar() {
        Txt_Nombre.setText("");
        Txt_Superficie.setText("");
        Cbbx_Zona.setSelectedItem("<SELECCIONE>");
        Txt_Uv.setText("");
        Txt_Manzano.setText("");
        Txt_Lote.setText("");
        Txt_Mostrar.setText("");
        Cbx_Pavimento.setSelected(false);
        Cbx_Luz.setSelected(false);
        Cbx_Agua.setSelected(false);
        Cbx_Alcantarillado.setSelected(false);
        Cbx_Telefono.setSelected(false);
    }

    private void desHabilitar() {
        Txt_Nombre.setEnabled(false);
        Txt_Superficie.setEnabled(false);
        Cbbx_Zona.setEnabled(false);
        Txt_Uv.setEnabled(false);
        Txt_Manzano.setEnabled(false);
        Txt_Lote.setEnabled(false);
        Cbx_Pavimento.setEnabled(false);
        Cbx_Luz.setEnabled(false);
        Cbx_Agua.setEnabled(false);
        Cbx_Alcantarillado.setEnabled(false);
        Cbx_Telefono.setEnabled(false);
        Bttn_Guardar.setEnabled(false);
        Bttn_Buscar.setEnabled(false);
        Bttn_Limpiar.setEnabled(false);
        Lbl_NumReg.setText("0");
    }

    private void habilitar() {
        Txt_Nombre.setEnabled(true);
        Txt_Superficie.setEnabled(true);
        Cbbx_Zona.setEnabled(true);
        Txt_Uv.setEnabled(true);
        Txt_Manzano.setEnabled(true);
        Txt_Lote.setEnabled(true);
        Cbx_Pavimento.setEnabled(true);
        Cbx_Luz.setEnabled(true);
        Cbx_Agua.setEnabled(true);
        Cbx_Alcantarillado.setEnabled(true);
        Cbx_Telefono.setEnabled(true);
        Bttn_Guardar.setEnabled(true);
        Bttn_Buscar.setEnabled(true);
        Bttn_Limpiar.setEnabled(true);
    }

    private boolean vacio() {
        return (Txt_Nombre.getText().isEmpty() || Txt_Superficie.getText().isEmpty()
                || Txt_Uv.getText().isEmpty() || Txt_Manzano.getText().isEmpty()
                || Txt_Lote.getText().isEmpty() || Cbbx_Zona.getSelectedItem().equals("<SELECCIONE>"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lbl_NumReg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Bttn_Crear = new javax.swing.JButton();
        Txt_Cant = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Superficie = new javax.swing.JTextField();
        Txt_Uv = new javax.swing.JTextField();
        Cbbx_Zona = new javax.swing.JComboBox<>();
        Txt_Manzano = new javax.swing.JTextField();
        Txt_Lote = new javax.swing.JTextField();
        Cbx_Pavimento = new javax.swing.JCheckBox();
        Cbx_Alcantarillado = new javax.swing.JCheckBox();
        Cbx_Luz = new javax.swing.JCheckBox();
        Cbx_Telefono = new javax.swing.JCheckBox();
        Cbx_Agua = new javax.swing.JCheckBox();
        Bttn_Guardar = new javax.swing.JButton();
        Bttn_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_Mostrar = new javax.swing.JTextArea();
        Bttn_Limpiar = new javax.swing.JButton();
        Bttn_CambiarCant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("N°");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FORMULARIO  CATASTRO");

        Lbl_NumReg.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Lbl_NumReg.setText("0");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("CANT. REGISTROS:");

        Bttn_Crear.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Crear.setText("CREAR");
        Bttn_Crear.setEnabled(false);
        Bttn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CrearActionPerformed(evt);
            }
        });

        Txt_Cant.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Cant.setText("100");
        Txt_Cant.setEnabled(false);
        Txt_Cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_CantKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("NOMBRE:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("SUPERFICIE:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("ZONA:");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("UV:");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setText("MANZANO:");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setText("LOTE:");

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setText("SERVICIOS BASICOS:");

        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyTyped(evt);
            }
        });

        Txt_Superficie.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Superficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_SuperficieKeyTyped(evt);
            }
        });

        Txt_Uv.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Uv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_UvKeyTyped(evt);
            }
        });

        Cbbx_Zona.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbbx_Zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECCIONE>", "NORTE", "SUR", "ESTE", "OESTE" }));

        Txt_Manzano.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Manzano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ManzanoKeyTyped(evt);
            }
        });

        Txt_Lote.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Lote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_LoteKeyTyped(evt);
            }
        });

        Cbx_Pavimento.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Pavimento.setText("Pavimento");

        Cbx_Alcantarillado.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Alcantarillado.setText("Alcantarillado");

        Cbx_Luz.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Luz.setText("Luz");

        Cbx_Telefono.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Telefono.setText("Telefono");

        Cbx_Agua.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Cbx_Agua.setText("Agua");

        Bttn_Guardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Guardar.setText("GUARDAR");
        Bttn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_GuardarActionPerformed(evt);
            }
        });

        Bttn_Buscar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Buscar.setText("BUSCAR");
        Bttn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_BuscarActionPerformed(evt);
            }
        });

        Txt_Mostrar.setEditable(false);
        Txt_Mostrar.setColumns(20);
        Txt_Mostrar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Mostrar.setRows(5);
        jScrollPane1.setViewportView(Txt_Mostrar);

        Bttn_Limpiar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Limpiar.setText("LIMPIAR");
        Bttn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_LimpiarActionPerformed(evt);
            }
        });

        Bttn_CambiarCant.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_CambiarCant.setText("CAMBIAR");
        Bttn_CambiarCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CambiarCantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Txt_Cant, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bttn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bttn_CambiarCant, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cbx_Alcantarillado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Bttn_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bttn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cbx_Telefono)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lbl_NumReg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cbx_Pavimento)
                                .addGap(42, 42, 42)
                                .addComponent(Cbx_Luz)
                                .addGap(40, 40, 40)
                                .addComponent(Cbx_Agua))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cbbx_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Txt_Lote))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Txt_Manzano))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Txt_Uv))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Txt_Superficie))
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bttn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Bttn_Crear)
                    .addComponent(Txt_Cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn_CambiarCant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Lbl_NumReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Txt_Superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Cbbx_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Txt_Uv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Txt_Manzano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Txt_Lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cbx_Pavimento)
                            .addComponent(Cbx_Luz)
                            .addComponent(Cbx_Agua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cbx_Alcantarillado)
                            .addComponent(Cbx_Telefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bttn_Guardar)
                            .addComponent(Bttn_Buscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bttn_Limpiar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CrearActionPerformed
        cant = Integer.parseInt(Txt_Cant.getText());
        A = new Catastro(cant);
        Lbl_NumReg.setText(String.valueOf(A.dim + 1));
        habilitar();
        Txt_Cant.setEnabled(false);
        Bttn_Crear.setEnabled(false);
        Bttn_CambiarCant.setEnabled(true);
    }//GEN-LAST:event_Bttn_CrearActionPerformed

    private void Bttn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_GuardarActionPerformed
        if (A.dim < cant) {
            if (!vacio()) {
                String nombre = Txt_Nombre.getText();
                int sup = Integer.parseInt(Txt_Superficie.getText());
                String Zona = Cbbx_Zona.getSelectedItem().toString();
                int zona = 0;
                switch (Zona) {
                    case "NORTE" ->
                        zona = 0;
                    case "SUR" ->
                        zona = 1;
                    case "ESTE" ->
                        zona = 2;
                    case "OESTE" ->
                        zona = 3;
                }
                int uv = Integer.parseInt(Txt_Uv.getText());
                int manzano = Integer.parseInt(Txt_Manzano.getText());
                int lote = Integer.parseInt(Txt_Lote.getText());
                int pavimento = (Cbx_Pavimento.isSelected()) ? 1 : 0;
                int luz = (Cbx_Luz.isSelected()) ? 1 : 0;
                int agua = (Cbx_Agua.isSelected()) ? 1 : 0;
                int alcant = (Cbx_Alcantarillado.isSelected()) ? 1 : 0;
                int telefono = (Cbx_Telefono.isSelected()) ? 1 : 0;
                if (sup >= 150 && sup <= 300 && uv >= 1 && uv <= 20 && manzano >= 1 && manzano <= 10
                        && lote >= 1 && lote <= 20) {
                    A.insertar(nombre, sup, zona, uv, manzano, lote, pavimento, luz, agua,
                            alcant, telefono);
                    JOptionPane.showMessageDialog(rootPane, "El registro ha sido guardado con exito", "Aviso:", 1);
                    limpiar();
                    Lbl_NumReg.setText(String.valueOf(A.dim + 1));
                    System.out.println(A);
                } else {
                    String aviso = "";
                    if (sup < 150 || sup > 300) {
                        aviso = aviso + "Superficie: Introducir un valor entre: 150-300\n";
                    }
                    if (uv < 1 || uv > 20) {
                        aviso = aviso + "Uv: Introducir un valor entre: 1-20\n";
                    }
                    if (manzano < 1 || manzano > 10) {
                        aviso = aviso + "Manzano: Introducir un valor entre: 1-10\n";
                    }
                    if (lote < 1 || lote > 20) {
                        aviso = aviso + "Lote: Introducir un valor entre: 1-20\n";
                    }
                    JOptionPane.showMessageDialog(rootPane, "DATOS NO VALIDOS\n\n" + aviso, "Aviso", 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca todos los datos", "Aviso", 1);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "LA CANTIDAD DE REGISTROS \nA SIDO SUPERADA", "Aviso", 1);
        }
    }//GEN-LAST:event_Bttn_GuardarActionPerformed

    private void Bttn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_BuscarActionPerformed
        String registros[] = new String[A.dim];
        if (registros.length <= cant) {
            for (int i = 0; i < registros.length; i++) {
                registros[i] = String.valueOf(i + 1);
            }
        }

        if (registros.length > 0) {
            String registro = JOptionPane.showInputDialog(rootPane, "Seleccione el N° de catastro",
                    "Mostrar Registro", JOptionPane.PLAIN_MESSAGE, null, registros, DISPOSE_ON_CLOSE).toString();
            if (registro != null) {
                Txt_Mostrar.setText(A.mostrarCatastro(Integer.parseInt(registro)));
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se ha encontrado ningún registro", "Aviso:", 1);
        }
    }//GEN-LAST:event_Bttn_BuscarActionPerformed

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_SuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_SuperficieKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_SuperficieKeyTyped

    private void Txt_UvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_UvKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_UvKeyTyped

    private void Txt_ManzanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ManzanoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_ManzanoKeyTyped

    private void Txt_LoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_LoteKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_LoteKeyTyped

    private void Txt_CantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_CantKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_CantKeyTyped

    private void Bttn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_LimpiarActionPerformed
        Txt_Mostrar.setText("");
    }//GEN-LAST:event_Bttn_LimpiarActionPerformed

    private void Bttn_CambiarCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CambiarCantActionPerformed
        desHabilitar();
        limpiar();
        Txt_Cant.setEnabled(true);
        Bttn_Crear.setEnabled(true);
        Bttn_CambiarCant.setEnabled(false);
    }//GEN-LAST:event_Bttn_CambiarCantActionPerformed

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
            java.util.logging.Logger.getLogger(FormCatastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCatastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCatastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCatastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCatastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_Buscar;
    private javax.swing.JButton Bttn_CambiarCant;
    private javax.swing.JButton Bttn_Crear;
    private javax.swing.JButton Bttn_Guardar;
    private javax.swing.JButton Bttn_Limpiar;
    private javax.swing.JComboBox<String> Cbbx_Zona;
    private javax.swing.JCheckBox Cbx_Agua;
    private javax.swing.JCheckBox Cbx_Alcantarillado;
    private javax.swing.JCheckBox Cbx_Luz;
    private javax.swing.JCheckBox Cbx_Pavimento;
    private javax.swing.JCheckBox Cbx_Telefono;
    private javax.swing.JLabel Lbl_NumReg;
    private javax.swing.JTextField Txt_Cant;
    private javax.swing.JTextField Txt_Lote;
    private javax.swing.JTextField Txt_Manzano;
    private javax.swing.JTextArea Txt_Mostrar;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Superficie;
    private javax.swing.JTextField Txt_Uv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
