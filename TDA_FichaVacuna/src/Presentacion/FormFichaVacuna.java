package Presentacion;

import Negocio.FichaVacuna;
import javax.swing.JOptionPane;

public class FormFichaVacuna extends javax.swing.JFrame {

    int xMouse, yMouse;
    boolean editar, noEditar;

    public FichaVacuna A;
    public FormMostrar datos = new FormMostrar();
    public String nombre;
    public String apellido;
    public String dia;
    public String mes;
    public String año;
    public String fecha;
    public String genero;
    public String edad;
    public String ficha;
    int cant = 0;

    public FormFichaVacuna() {
        initComponents();
        this.setLocationRelativeTo(null);
        FormMostrar.setLocationRelativeTo(null);
        this.Txt_Nombre1.setVisible(false);
        this.Txt_Apellido1.setVisible(false);
        this.Txt_Edad1.setVisible(false);
        this.Cbx_Dia1.setVisible(false);
        this.Cbx_Mes1.setVisible(false);
        this.Cbx_Año1.setVisible(false);
        this.Rbtn_Masculino1.setVisible(false);
        this.Rbtn_Femenino1.setVisible(false);
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

        this.Txt_Nombre1.setVisible(true);
        this.Txt_Apellido1.setVisible(true);
        this.Txt_Edad1.setVisible(true);
        this.Cbx_Dia1.setVisible(true);
        this.Cbx_Mes1.setVisible(true);
        this.Cbx_Año1.setVisible(true);
        this.Rbtn_Masculino1.setVisible(true);
        this.Rbtn_Femenino1.setVisible(true);
    }

    public void deshabilitar() {
        this.Txt_Nombre1.setVisible(false);
        this.Txt_Apellido1.setVisible(false);
        this.Txt_Edad1.setVisible(false);
        this.Cbx_Dia1.setVisible(false);
        this.Cbx_Mes1.setVisible(false);
        this.Cbx_Año1.setVisible(false);
        this.Rbtn_Masculino1.setVisible(false);
        this.Rbtn_Femenino1.setVisible(false);

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

    private void limpiar() {
        Txt_Nombre.setText("");
        Txt_Apellido.setText("");
        Cbx_Dia.setSelectedItem("01");
        Cbx_Mes.setSelectedItem("01");
        Cbx_Año.setSelectedItem("2020");
        Bttn_Grupo.clearSelection();
        Txt_Edad.setText("");
    }

    private void mostrar(int num) {
        ficha = "" + num;
        nombre = "" + A.getNombre(num);
        apellido = "" + A.getApellido(num);
        if (A.getDia(num) <= 9 || A.getMes(num) <= 9) {
            if (A.getDia(num) <= 9) {
                fecha = "0" + A.getDia(num) + "/";
            } else {
                fecha = "" + A.getDia(num) + "/";
            }
            if (A.getMes(num) <= 9) {
                fecha = fecha + "0" + A.getMes(num) + "/" + A.getAño(num);
            } else {
                fecha = fecha + A.getMes(num) + "/" + A.getAño(num);
            }
        } else {
            fecha = "" + A.getDia(num) + "/" + A.getMes(num) + "/" + A.getAño(num);
        }
        genero = (A.getGenero(num) == 1) ? "Masculino" : "Femenino";
        edad = "" + A.getEdad(num);
        String Edad = "" + A.getEdad(num) + " años";
        dia = "" + A.getDia(num);
        mes = "" + A.getMes(num);
        año = "" + A.getAño(num);

        this.Lbl_NumFicha1.setText(ficha);
        this.Lbl_Nombre.setText(nombre);
        this.Lbl_Apellido.setText(apellido);
        this.Lbl_Fecha.setText(fecha);
        this.Lbl_Genero.setText(genero);
        this.Lbl_Edad.setText(Edad);

        llenarDatos();
    }

    private void llenarDatos() {
        this.Lbl_NumFicha1.setText(ficha);
        if (Integer.parseInt(dia) <= 9) {
            dia = "0" + dia;
        }
        if (Integer.parseInt(mes) <= 9) {
            mes = "0" + mes;
        }
        this.Cbx_Dia1.setSelectedItem(dia);
        this.Cbx_Mes1.setSelectedItem(mes);
        this.Cbx_Año1.setSelectedItem(año);
        this.Txt_Nombre1.setText(nombre);
        this.Txt_Apellido1.setText(apellido);
        if (genero.equals("Masculino")) {
            this.Rbtn_Masculino1.setSelected(true);
        }
        if (genero.equals("Femenino")) {
            this.Rbtn_Femenino1.setSelected(true);
        }
        this.Txt_Edad1.setText(edad);
    }

    public void actualizar() {
        int num = Integer.parseInt(this.Lbl_NumFicha1.getText());
        A.setDia(num, Integer.parseInt(this.Cbx_Dia1.getSelectedItem().toString()));
        A.setMes(num, Integer.parseInt(this.Cbx_Mes1.getSelectedItem().toString()));
        A.setAño(num, Integer.parseInt(this.Cbx_Año1.getSelectedItem().toString()));
        A.setNombre(num, this.Txt_Nombre1.getText());
        A.setApellido(num, this.Txt_Apellido1.getText());
        if (this.Rbtn_Masculino1.isSelected()) {
            A.setGenero(num, 1);
        }
        if (this.Rbtn_Femenino1.isSelected()) {
            A.setGenero(num, 0);
        }
        A.setEdad(num, Integer.parseInt(this.Txt_Edad1.getText()));
        mostrar(num);
    }

    private void habilitar() {
        Txt_Nombre.setEnabled(true);
        Txt_Apellido.setEnabled(true);
        Txt_Edad.setEnabled(true);
        Cbx_Dia.setEnabled(true);
        Cbx_Mes.setEnabled(true);
        Cbx_Año.setEnabled(true);
        Rbtn_Masculino.setEnabled(true);
        Rbtn_Femenino.setEnabled(true);
        Bttn_Insertar.setEnabled(true);
        Bttn_Mostrar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bttn_Grupo = new javax.swing.ButtonGroup();
        FormMostrar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Lbl_NumFicha1 = new javax.swing.JLabel();
        Lbl_Nombre = new javax.swing.JLabel();
        Lbl_Apellido = new javax.swing.JLabel();
        Lbl_Fecha = new javax.swing.JLabel();
        Lbl_Genero = new javax.swing.JLabel();
        Lbl_Edad = new javax.swing.JLabel();
        Bttn_Cerrar = new javax.swing.JButton();
        Bttn_Editar = new javax.swing.JButton();
        Bttn_Guardar = new javax.swing.JButton();
        Bttn_Cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Txt_Nombre1 = new javax.swing.JTextField();
        Txt_Apellido1 = new javax.swing.JTextField();
        Txt_Edad1 = new javax.swing.JTextField();
        Cbx_Dia1 = new javax.swing.JComboBox<>();
        Cbx_Mes1 = new javax.swing.JComboBox<>();
        Cbx_Año1 = new javax.swing.JComboBox<>();
        Rbtn_Femenino1 = new javax.swing.JRadioButton();
        Rbtn_Masculino1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txt_Apellido = new javax.swing.JTextField();
        Cbx_Dia = new javax.swing.JComboBox<>();
        Cbx_Mes = new javax.swing.JComboBox<>();
        Cbx_Año = new javax.swing.JComboBox<>();
        Rbtn_Masculino = new javax.swing.JRadioButton();
        Rbtn_Femenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        Lbl_NumFicha = new javax.swing.JLabel();
        Txt_Edad = new javax.swing.JTextField();
        Bttn_Insertar = new javax.swing.JButton();
        Bttn_Mostrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Txt_CantFichas = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Bttn_CantFichas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        FormMostrar.setMinimumSize(new java.awt.Dimension(430, 390));
        FormMostrar.setUndecorated(true);
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setMaximumSize(new java.awt.Dimension(430, 390));
        jPanel2.setMinimumSize(new java.awt.Dimension(430, 390));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setText("NOMBRES: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 103, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setText("APELLIDOS:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 141, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setText("FECHA:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 176, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setText("GENERO:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 209, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setText("EDAD:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 243, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel14.setText("FICHA  N°: ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        Lbl_NumFicha1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        Lbl_NumFicha1.setText("0");
        jPanel2.add(Lbl_NumFicha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 50, -1, -1));

        Lbl_Nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Nombre.setText("Nombres");
        jPanel2.add(Lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 100, 207, 28));

        Lbl_Apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Apellido.setText("Apellidos");
        jPanel2.add(Lbl_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 138, 207, 28));

        Lbl_Fecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Fecha.setText("Fecha");
        jPanel2.add(Lbl_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 173, 207, 28));

        Lbl_Genero.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Genero.setText("Genero");
        jPanel2.add(Lbl_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 206, 207, 28));

        Lbl_Edad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Edad.setText("Edad");
        jPanel2.add(Lbl_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 240, 207, 28));

        Bttn_Cerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Cerrar.setText("CERRAR");
        Bttn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CerrarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 306, 120, -1));

        Bttn_Editar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Editar.setText("EDITAR");
        Bttn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_EditarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 306, 120, -1));

        Bttn_Guardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Guardar.setText("GUARDAR");
        Bttn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 306, 120, -1));

        Bttn_Cancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Cancelar.setText("CANCELAR");
        Bttn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 306, 120, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Txt_Nombre1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        Txt_Apellido1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        Txt_Edad1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Txt_Edad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Cbx_Dia1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Dia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Cbx_Mes1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Mes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        Cbx_Año1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Año1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));

        buttonGroup1.add(Rbtn_Femenino1);
        Rbtn_Femenino1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Femenino1.setText("F");

        buttonGroup1.add(Rbtn_Masculino1);
        Rbtn_Masculino1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Masculino1.setText("M");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Cbx_Dia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cbx_Mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cbx_Año1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Rbtn_Masculino1)
                        .addGap(4, 4, 4)
                        .addComponent(Rbtn_Femenino1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Txt_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cbx_Dia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Año1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rbtn_Masculino1)
                    .addComponent(Rbtn_Femenino1))
                .addGap(5, 5, 5)
                .addComponent(Txt_Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 250, 190));

        javax.swing.GroupLayout FormMostrarLayout = new javax.swing.GroupLayout(FormMostrar.getContentPane());
        FormMostrar.getContentPane().setLayout(FormMostrarLayout);
        FormMostrarLayout.setHorizontalGroup(
            FormMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormMostrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FormMostrarLayout.setVerticalGroup(
            FormMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormMostrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(469, 525));
        setMinimumSize(new java.awt.Dimension(469, 525));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 1, 30)); // NOI18N
        jLabel1.setText("FICHA  DE  VACUNA");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRE: ");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("APELLIDO:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("FECHA:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("GENERO:");

        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Txt_Nombre.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("EDAD:");

        Txt_Apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Txt_Apellido.setEnabled(false);

        Cbx_Dia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Cbx_Dia.setEnabled(false);

        Cbx_Mes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Cbx_Mes.setEnabled(false);

        Cbx_Año.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Cbx_Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));
        Cbx_Año.setEnabled(false);

        Bttn_Grupo.add(Rbtn_Masculino);
        Rbtn_Masculino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Masculino.setText("M");
        Rbtn_Masculino.setEnabled(false);

        Bttn_Grupo.add(Rbtn_Femenino);
        Rbtn_Femenino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Femenino.setText("F");
        Rbtn_Femenino.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel7.setText("FICHA  N°: ");

        Lbl_NumFicha.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        Lbl_NumFicha.setText("0");

        Txt_Edad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Txt_Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Edad.setEnabled(false);

        Bttn_Insertar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Insertar.setText("INSERTAR");
        Bttn_Insertar.setEnabled(false);
        Bttn_Insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bttn_InsertarMouseClicked(evt);
            }
        });
        Bttn_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_InsertarActionPerformed(evt);
            }
        });

        Bttn_Mostrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_Mostrar.setText("MOSTRAR");
        Bttn_Mostrar.setEnabled(false);
        Bttn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_MostrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("CANT. FICHAS: ");

        Txt_CantFichas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Txt_CantFichas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Bttn_CantFichas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bttn_CantFichas.setText("INGRESAR CANT.");
        Bttn_CantFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CantFichasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(Lbl_NumFicha)
                                    .addGap(11, 11, 11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Rbtn_Masculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Rbtn_Femenino))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cbx_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cbx_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cbx_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(Txt_Nombre))
                                .addComponent(Txt_Edad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_CantFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bttn_CantFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bttn_Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bttn_Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Txt_CantFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn_CantFichas))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Lbl_NumFicha))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cbx_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Rbtn_Masculino)
                    .addComponent(Rbtn_Femenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bttn_Insertar)
                    .addComponent(Bttn_Mostrar))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_InsertarActionPerformed
        String nombre = Txt_Nombre.getText();
        String apellido = Txt_Apellido.getText();
        int dia = Integer.parseInt(Cbx_Dia.getSelectedItem().toString());
        int mes = Integer.parseInt(Cbx_Mes.getSelectedItem().toString());
        int año = Integer.parseInt(Cbx_Año.getSelectedItem().toString());
        int genero = 0;
        if (Rbtn_Masculino.isSelected()) {
            genero = 1;
        } else if (Rbtn_Femenino.isSelected()) {
            genero = 0;
        }
        int edad = Integer.parseInt(Txt_Edad.getText());
        if (A.dim < cant) {
            A.insertar(nombre, apellido, dia, mes, año, genero, edad);
            JOptionPane.showMessageDialog(rootPane, "Dato Guardado", "AVISO", 1);
            Lbl_NumFicha.setText(String.valueOf(A.dim + 1));
        } else {
            JOptionPane.showMessageDialog(rootPane, "El N° de Fichas supero su limite", "AVISO", 1);
        }
        limpiar();
    }//GEN-LAST:event_Bttn_InsertarActionPerformed

    private void Bttn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_MostrarActionPerformed

        String Fichas[] = new String[A.dim];
        if (Fichas.length <= cant) {
            for (int i = 0; i < Fichas.length; i++) {
                Fichas[i] = String.valueOf(i + 1);
            }
        }

        String fichas = (JOptionPane.showInputDialog(null, "Seleccionar el N° de Ficha para mostrar", "Mostrar Ficha", JOptionPane.PLAIN_MESSAGE, null, Fichas, null)).toString();
        if (fichas != null) {
            if (Integer.parseInt(fichas) <= cant) {
                mostrar(Integer.parseInt(fichas));
                FormMostrar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ficha vacia", "AVISO", 1);
            }
        }

    }//GEN-LAST:event_Bttn_MostrarActionPerformed

    private void Bttn_CantFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CantFichasActionPerformed
        cant = Integer.parseInt(Txt_CantFichas.getText());
        A = new FichaVacuna(cant + 1);
        habilitar();
        Lbl_NumFicha.setText("" + (A.dim + 1));
        Txt_CantFichas.setText("");
    }//GEN-LAST:event_Bttn_CantFichasActionPerformed

    private void Bttn_InsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bttn_InsertarMouseClicked

    }//GEN-LAST:event_Bttn_InsertarMouseClicked

    private void FormMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMostrarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FormMostrarMousePressed

    private void FormMostrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMostrarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FormMostrarMouseDragged

    private void Bttn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CerrarActionPerformed
        FormMostrar.dispose();
    }//GEN-LAST:event_Bttn_CerrarActionPerformed

    private void Bttn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_EditarActionPerformed
        editar();
        llenarDatos();
    }//GEN-LAST:event_Bttn_EditarActionPerformed

    private void Bttn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_GuardarActionPerformed
        actualizar();
        editar();
    }//GEN-LAST:event_Bttn_GuardarActionPerformed

    private void Bttn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CancelarActionPerformed
        editar();
        llenarDatos();
    }//GEN-LAST:event_Bttn_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormFichaVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFichaVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFichaVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFichaVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFichaVacuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_Cancelar;
    private javax.swing.JButton Bttn_CantFichas;
    private javax.swing.JButton Bttn_Cerrar;
    private javax.swing.JButton Bttn_Editar;
    private javax.swing.ButtonGroup Bttn_Grupo;
    private javax.swing.JButton Bttn_Guardar;
    private javax.swing.JButton Bttn_Insertar;
    private javax.swing.JButton Bttn_Mostrar;
    private javax.swing.JComboBox<String> Cbx_Año;
    private javax.swing.JComboBox<String> Cbx_Año1;
    private javax.swing.JComboBox<String> Cbx_Dia;
    private javax.swing.JComboBox<String> Cbx_Dia1;
    private javax.swing.JComboBox<String> Cbx_Mes;
    private javax.swing.JComboBox<String> Cbx_Mes1;
    private javax.swing.JFrame FormMostrar;
    private javax.swing.JLabel Lbl_Apellido;
    private javax.swing.JLabel Lbl_Edad;
    private javax.swing.JLabel Lbl_Fecha;
    private javax.swing.JLabel Lbl_Genero;
    private javax.swing.JLabel Lbl_Nombre;
    private javax.swing.JLabel Lbl_NumFicha;
    private javax.swing.JLabel Lbl_NumFicha1;
    private javax.swing.JRadioButton Rbtn_Femenino;
    private javax.swing.JRadioButton Rbtn_Femenino1;
    private javax.swing.JRadioButton Rbtn_Masculino;
    private javax.swing.JRadioButton Rbtn_Masculino1;
    private javax.swing.JTextField Txt_Apellido;
    private javax.swing.JTextField Txt_Apellido1;
    private javax.swing.JTextField Txt_CantFichas;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_Edad1;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Nombre1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
