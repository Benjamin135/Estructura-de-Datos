package Presentacion;

import Negocio.FormularioCovid;
import Negocio.TextPrompt;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FormCovid extends javax.swing.JFrame {

    FormularioCovid A = new FormularioCovid();
    int xMouse, yMouse;

    public FormCovid() {
        initComponents();
        this.setLocationRelativeTo(null);
        FormMostrar.setLocationRelativeTo(null);
        TextPrompt placeholder = new TextPrompt("Escribe tu nombre", Txt_Nombre);
        placeholder = new TextPrompt("00.0", Txt_Peso);
        placeholder.setHorizontalAlignment(JLabel.CENTER);
        Lbl_NumFicha.setText(String.valueOf(A.dim + 1));
    }

    private void limpiar() {
        Txt_Nombre.setText("");
        Txt_Edad.setText("");
        Bttn_Grupo.clearSelection();
        Txt_Peso.setText("");
        Cbx_Cabeza.setSelected(false);
        Cbx_Gusto.setSelected(false);
        Cbx_Muscular.setSelected(false);
        Cbx_Olfato.setSelected(false);
        Cbx_Garganta.setSelected(false);
        Cbx_Respiracion.setSelected(false);
        Cbx_Diarrea.setSelected(false);
        Cbx_Tos.setSelected(false);
        Cbx_Fiebre.setSelected(false);
    }
    
    private boolean verificarVacio() {
        return (!Txt_Nombre.getText().isEmpty() && !Txt_Edad.getText().isEmpty()
                && !Txt_Peso.getText().isEmpty() && ((!Rbtn_Masculino.isSelected()
                && Rbtn_Femenino.isSelected()) || (Rbtn_Masculino.isSelected()
                && !Rbtn_Femenino.isSelected())));
    }

    private void mostrar(int pos) {
        Lbl_NumFicha1.setText(String.valueOf(pos));
        Lbl_nombre.setText(A.getNombre(pos));
        Lbl_edad.setText(String.valueOf(A.getEdad(pos)) + "  años");
        String sexo = (A.getSexo(pos) == 1)? "Masculino": "Femenino";
        Lbl_sexo.setText(sexo);
        String peso = "" + A.getPesoEnt(pos) + "." + A.getPesoDec(pos);
        Lbl_peso.setText(peso + "  Kg");
        boolean sintoma;
        boolean noSintoma = false;
        Cbx_Fiebre1.setForeground(Color.gray);
        Cbx_Diarrea1.setForeground(Color.gray);
        Cbx_Cabeza1.setForeground(Color.gray);
        Cbx_Muscular1.setForeground(Color.gray);
        Cbx_Garganta1.setForeground(Color.gray);
        Cbx_Gusto1.setForeground(Color.gray);
        Cbx_Olfato1.setForeground(Color.gray);
        Cbx_Respiracion1.setForeground(Color.gray);
        Cbx_Tos1.setForeground(Color.gray);
        sintoma = (A.getFiebre(pos) == 1)? true : noSintoma;
        Cbx_Fiebre1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Fiebre1.setForeground(Color.black);}
        sintoma = (A.getDiarrea(pos) == 1)? true : noSintoma;
        Cbx_Diarrea1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Diarrea1.setForeground(Color.black);}
        sintoma = (A.getCabeza(pos) == 1)? true : noSintoma;
        Cbx_Cabeza1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Cabeza1.setForeground(Color.black);}
        sintoma = (A.getMuscular(pos) == 1)? true : noSintoma;
        Cbx_Muscular1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Muscular1.setForeground(Color.black);}
        sintoma = (A.getGarganta(pos) == 1)? true : noSintoma;
        Cbx_Garganta1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Garganta1.setForeground(Color.black);}
        sintoma = (A.getGusto(pos) == 1)? true : noSintoma;
        Cbx_Gusto1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Gusto1.setForeground(Color.black);}
        sintoma = (A.getOlfato(pos) == 1)? true : noSintoma;
        Cbx_Olfato1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Olfato1.setForeground(Color.black);}
        sintoma = (A.getRespiracion(pos) == 1)? true : noSintoma;
        Cbx_Respiracion1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Respiracion1.setForeground(Color.black);}
        sintoma = (A.getTos(pos) == 1)? true : noSintoma;
        Cbx_Tos1.setSelected(sintoma);
        if (sintoma == true) {Cbx_Tos1.setForeground(Color.black);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bttn_Grupo = new javax.swing.ButtonGroup();
        FormMostrar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        Lbl_NumFicha1 = new javax.swing.JLabel();
        Lbl_Numero1 = new javax.swing.JLabel();
        Lbl_Nombre1 = new javax.swing.JLabel();
        Lbl_Edad1 = new javax.swing.JLabel();
        Lbl_Sexo1 = new javax.swing.JLabel();
        Lbl_Peso1 = new javax.swing.JLabel();
        Lbl_Sintomas1 = new javax.swing.JLabel();
        Lbl_nombre = new javax.swing.JLabel();
        Lbl_edad = new javax.swing.JLabel();
        Lbl_sexo = new javax.swing.JLabel();
        Lbl_peso = new javax.swing.JLabel();
        Cbx_Cabeza1 = new javax.swing.JCheckBox();
        Cbx_Muscular1 = new javax.swing.JCheckBox();
        Cbx_Garganta1 = new javax.swing.JCheckBox();
        Cbx_Diarrea1 = new javax.swing.JCheckBox();
        Cbx_Fiebre1 = new javax.swing.JCheckBox();
        Cbx_Tos1 = new javax.swing.JCheckBox();
        Cbx_Respiracion1 = new javax.swing.JCheckBox();
        Cbx_Olfato1 = new javax.swing.JCheckBox();
        Cbx_Gusto1 = new javax.swing.JCheckBox();
        Bttn_Cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Lbl_Titulo2 = new javax.swing.JLabel();
        Lbl_Titulo1 = new javax.swing.JLabel();
        Lbl_Numero = new javax.swing.JLabel();
        Lbl_NumFicha = new javax.swing.JLabel();
        Lbl_Edad = new javax.swing.JLabel();
        Lbl_Nombre = new javax.swing.JLabel();
        Lbl_Sexo = new javax.swing.JLabel();
        Lbl_Kg = new javax.swing.JLabel();
        Lbl_Sintomas = new javax.swing.JLabel();
        Lbl_TextoSintomas = new javax.swing.JLabel();
        Cbx_Gusto = new javax.swing.JCheckBox();
        Cbx_Fiebre = new javax.swing.JCheckBox();
        Cbx_Tos = new javax.swing.JCheckBox();
        Cbx_Diarrea = new javax.swing.JCheckBox();
        Cbx_Cabeza = new javax.swing.JCheckBox();
        Cbx_Muscular = new javax.swing.JCheckBox();
        Cbx_Garganta = new javax.swing.JCheckBox();
        Cbx_Respiracion = new javax.swing.JCheckBox();
        Cbx_Olfato = new javax.swing.JCheckBox();
        Txt_Peso = new javax.swing.JTextField();
        Txt_Nombre = new javax.swing.JTextField();
        Rbtn_Femenino = new javax.swing.JRadioButton();
        Rbtn_Masculino = new javax.swing.JRadioButton();
        Txt_Edad = new javax.swing.JTextField();
        Bttn_Guardar = new javax.swing.JButton();
        Bttn_Buscar = new javax.swing.JButton();
        Lbl_Peso = new javax.swing.JLabel();

        FormMostrar.setMinimumSize(new java.awt.Dimension(370, 357));
        FormMostrar.setUndecorated(true);
        FormMostrar.setPreferredSize(new java.awt.Dimension(370, 357));
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
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true));
        jPanel2.setMinimumSize(new java.awt.Dimension(370, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(370, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_NumFicha1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        Lbl_NumFicha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_NumFicha1.setText("0");
        jPanel2.add(Lbl_NumFicha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 20, 30));

        Lbl_Numero1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        Lbl_Numero1.setText("N°");
        jPanel2.add(Lbl_Numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        Lbl_Nombre1.setFont(new java.awt.Font("Roboto Bk", 1, 16)); // NOI18N
        Lbl_Nombre1.setText("NOMBRE:");
        jPanel2.add(Lbl_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 20));

        Lbl_Edad1.setFont(new java.awt.Font("Roboto Bk", 1, 16)); // NOI18N
        Lbl_Edad1.setText("EDAD:");
        jPanel2.add(Lbl_Edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 20));

        Lbl_Sexo1.setFont(new java.awt.Font("Roboto Bk", 1, 16)); // NOI18N
        Lbl_Sexo1.setText("SEXO:");
        jPanel2.add(Lbl_Sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 20));

        Lbl_Peso1.setFont(new java.awt.Font("Roboto Bk", 1, 16)); // NOI18N
        Lbl_Peso1.setText("PESO:");
        jPanel2.add(Lbl_Peso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 20));

        Lbl_Sintomas1.setFont(new java.awt.Font("Roboto Bk", 1, 16)); // NOI18N
        Lbl_Sintomas1.setText("SINTOMAS:");
        jPanel2.add(Lbl_Sintomas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 20));

        Lbl_nombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Lbl_nombre.setText("Nombre");
        jPanel2.add(Lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, 20));

        Lbl_edad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Lbl_edad.setText("Edad");
        jPanel2.add(Lbl_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 70, 20));

        Lbl_sexo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Lbl_sexo.setText("Sexo");
        jPanel2.add(Lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, 20));

        Lbl_peso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Lbl_peso.setText("Peso");
        jPanel2.add(Lbl_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 20));

        Cbx_Cabeza1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Cabeza1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Cabeza1.setText("Dolor de cabeza");
        Cbx_Cabeza1.setEnabled(false);
        jPanel2.add(Cbx_Cabeza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        Cbx_Muscular1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Muscular1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Muscular1.setText("Dolor muscular");
        Cbx_Muscular1.setEnabled(false);
        jPanel2.add(Cbx_Muscular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 195, 150, -1));

        Cbx_Garganta1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Garganta1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Garganta1.setText("Dolor de garganta");
        Cbx_Garganta1.setEnabled(false);
        jPanel2.add(Cbx_Garganta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        Cbx_Diarrea1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Diarrea1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Diarrea1.setText("Diarrea");
        Cbx_Diarrea1.setEnabled(false);
        jPanel2.add(Cbx_Diarrea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, 78, -1));

        Cbx_Fiebre1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Fiebre1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Fiebre1.setText("Fiebre");
        Cbx_Fiebre1.setEnabled(false);
        jPanel2.add(Cbx_Fiebre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 245, 70, -1));

        Cbx_Tos1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Tos1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Tos1.setText("Tos");
        Cbx_Tos1.setEnabled(false);
        jPanel2.add(Cbx_Tos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 245, 60, -1));

        Cbx_Respiracion1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Respiracion1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Respiracion1.setText("Falta de respiración");
        Cbx_Respiracion1.setEnabled(false);
        jPanel2.add(Cbx_Respiracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 220, 160, -1));

        Cbx_Olfato1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Olfato1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Olfato1.setText("Perdida del olfato");
        Cbx_Olfato1.setEnabled(false);
        jPanel2.add(Cbx_Olfato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 195, 160, -1));

        Cbx_Gusto1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Gusto1.setForeground(new java.awt.Color(204, 204, 204));
        Cbx_Gusto1.setText("Perdida del gusto");
        Cbx_Gusto1.setEnabled(false);
        jPanel2.add(Cbx_Gusto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 170, 160, -1));

        Bttn_Cerrar.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Bttn_Cerrar.setText("CERRAR");
        Bttn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_CerrarActionPerformed(evt);
            }
        });
        jPanel2.add(Bttn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, -1));

        FormMostrar.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 357));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(411, 542));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(411, 542));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Titulo2.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        Lbl_Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Titulo2.setText("DE COVID");
        jPanel1.add(Lbl_Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 430, 30));

        Lbl_Titulo1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        Lbl_Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Titulo1.setText("FORMULARIO DE ANALISIS");
        jPanel1.add(Lbl_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, 30));

        Lbl_Numero.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        Lbl_Numero.setText("N°");
        jPanel1.add(Lbl_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, 30));

        Lbl_NumFicha.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        Lbl_NumFicha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_NumFicha.setText("0");
        jPanel1.add(Lbl_NumFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 20, 30));

        Lbl_Edad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Lbl_Edad.setText("EDAD:");
        jPanel1.add(Lbl_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, 30));

        Lbl_Nombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Lbl_Nombre.setText("NOMBRE:");
        jPanel1.add(Lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        Lbl_Sexo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Lbl_Sexo.setText("SEXO:");
        jPanel1.add(Lbl_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, 30));

        Lbl_Kg.setBackground(new java.awt.Color(204, 204, 204));
        Lbl_Kg.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Lbl_Kg.setForeground(new java.awt.Color(153, 153, 153));
        Lbl_Kg.setText("Kg");
        jPanel1.add(Lbl_Kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 230, 30, 30));

        Lbl_Sintomas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Lbl_Sintomas.setText("SINTOMAS:");
        jPanel1.add(Lbl_Sintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 30));

        Lbl_TextoSintomas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Lbl_TextoSintomas.setText("Seleccione si tiene uno de los siguientes síntomas");
        jPanel1.add(Lbl_TextoSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 30));

        Cbx_Gusto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Gusto.setText("Perdida del gusto");
        jPanel1.add(Cbx_Gusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 180, -1));

        Cbx_Fiebre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Fiebre.setText("Fiebre");
        jPanel1.add(Cbx_Fiebre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 395, 70, -1));

        Cbx_Tos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Tos.setText("Tos");
        jPanel1.add(Cbx_Tos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 395, 60, -1));

        Cbx_Diarrea.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Diarrea.setText("Diarrea");
        jPanel1.add(Cbx_Diarrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 395, 80, -1));

        Cbx_Cabeza.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Cabeza.setText("Dolor de cabeza");
        jPanel1.add(Cbx_Cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, -1));

        Cbx_Muscular.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Muscular.setText("Dolor muscular");
        jPanel1.add(Cbx_Muscular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 345, 160, -1));

        Cbx_Garganta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Garganta.setText("Dolor de garganta");
        jPanel1.add(Cbx_Garganta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 160, -1));

        Cbx_Respiracion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Respiracion.setText("Falta de respiración");
        jPanel1.add(Cbx_Respiracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 180, -1));

        Cbx_Olfato.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbx_Olfato.setText("Perdida del olfato");
        jPanel1.add(Cbx_Olfato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 345, 180, -1));

        Txt_Peso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_PesoKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 60, -1));

        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 260, -1));

        Bttn_Grupo.add(Rbtn_Femenino);
        Rbtn_Femenino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Femenino.setText("F");
        jPanel1.add(Rbtn_Femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 205, 50, -1));

        Bttn_Grupo.add(Rbtn_Masculino);
        Rbtn_Masculino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Rbtn_Masculino.setText("M");
        jPanel1.add(Rbtn_Masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 205, 50, -1));

        Txt_Edad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Txt_Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_EdadKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 60, -1));

        Bttn_Guardar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Bttn_Guardar.setText("GUARDAR");
        Bttn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, -1));

        Bttn_Buscar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Bttn_Buscar.setText("BUSCAR");
        Bttn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Bttn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, -1));

        Lbl_Peso.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Lbl_Peso.setText("PESO:");
        jPanel1.add(Lbl_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_EdadKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
        if (Txt_Edad.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_EdadKeyTyped

    private void Txt_PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_PesoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
        if (Txt_Peso.getText().length() >= 5) {
            evt.consume();
        }
        if (!Character.isDigit(validar) && validar != '.') {
            evt.consume();
        }
        if (validar == '.' && Txt_Peso.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_PesoKeyTyped

    private void Bttn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_GuardarActionPerformed
        if (verificarVacio()) {
            String nombre = Txt_Nombre.getText();
            int edad = Integer.parseInt(Txt_Edad.getText());
            int sexo = 0;
            if (Rbtn_Masculino.isSelected()) {
                sexo = 1;
            } else if (Rbtn_Femenino.isSelected()) {
                sexo = 0;
            }
            String peso = Txt_Peso.getText();
            int pos = peso.indexOf(".");
            int pesoEnt;
            int pesoDec;
            if (pos >= 0) {
                pesoEnt = Integer.parseInt(peso.substring(0, pos));
                pesoDec = Integer.parseInt(peso.substring(pos + 1, peso.length()));
            } else {
                pesoEnt = Integer.parseInt(peso);
                pesoDec = 0;
            }
            int fiebre = (Cbx_Fiebre.isSelected()) ? 1 : 0;
            int tos = (Cbx_Tos.isSelected()) ? 1 : 0;
            int garganta = (Cbx_Garganta.isSelected()) ? 1 : 0;
            int cabeza = (Cbx_Cabeza.isSelected()) ? 1 : 0;
            int respiracion = (Cbx_Respiracion.isSelected()) ? 1 : 0;
            int diarrea = (Cbx_Diarrea.isSelected()) ? 1 : 0;
            int muscular = (Cbx_Muscular.isSelected()) ? 1 : 0;
            int olfato = (Cbx_Olfato.isSelected()) ? 1 : 0;
            int gusto = (Cbx_Gusto.isSelected()) ? 1 : 0;

            A.insertar(nombre, edad, sexo, pesoEnt, pesoDec, fiebre, tos, garganta,
                    cabeza, respiracion, diarrea, muscular, olfato, gusto);
            JOptionPane.showMessageDialog(rootPane, "El registro ha sido guardado con exito", "Aviso:", 1);
            limpiar();
            Lbl_NumFicha.setText(String.valueOf(A.dim + 1));
            System.out.println(A);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los datos", "Aviso:", 1);
        }

    }//GEN-LAST:event_Bttn_GuardarActionPerformed

    private void Bttn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_BuscarActionPerformed
        String Fichas[] = new String[A.dim];
        if (Fichas.length <= A.cant) {
            for (int i = 0; i < Fichas.length; i++) {
                Fichas[i] = String.valueOf(i + 1);
            }
        }

        if (Fichas.length > 0) {
            String fichas = (JOptionPane.showInputDialog(rootPane, "Seleccione el N° de registro que desea ver", "Mostrar Registro", JOptionPane.PLAIN_MESSAGE, null, Fichas, DISPOSE_ON_CLOSE)).toString();
            if (fichas != null) {
                mostrar(Integer.parseInt(fichas));
                FormMostrar.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se ha encontrado ningún registro", "Aviso:", 1);
        }

    }//GEN-LAST:event_Bttn_BuscarActionPerformed

    private void Bttn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn_CerrarActionPerformed
        FormMostrar.dispose();
    }//GEN-LAST:event_Bttn_CerrarActionPerformed

    private void FormMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMostrarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FormMostrarMousePressed

    private void FormMostrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMostrarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        FormMostrar.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FormMostrarMouseDragged

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
            java.util.logging.Logger.getLogger(FormCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCovid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn_Buscar;
    private javax.swing.JButton Bttn_Cerrar;
    private javax.swing.ButtonGroup Bttn_Grupo;
    private javax.swing.JButton Bttn_Guardar;
    private javax.swing.JCheckBox Cbx_Cabeza;
    private javax.swing.JCheckBox Cbx_Cabeza1;
    private javax.swing.JCheckBox Cbx_Diarrea;
    private javax.swing.JCheckBox Cbx_Diarrea1;
    private javax.swing.JCheckBox Cbx_Fiebre;
    private javax.swing.JCheckBox Cbx_Fiebre1;
    private javax.swing.JCheckBox Cbx_Garganta;
    private javax.swing.JCheckBox Cbx_Garganta1;
    private javax.swing.JCheckBox Cbx_Gusto;
    private javax.swing.JCheckBox Cbx_Gusto1;
    private javax.swing.JCheckBox Cbx_Muscular;
    private javax.swing.JCheckBox Cbx_Muscular1;
    private javax.swing.JCheckBox Cbx_Olfato;
    private javax.swing.JCheckBox Cbx_Olfato1;
    private javax.swing.JCheckBox Cbx_Respiracion;
    private javax.swing.JCheckBox Cbx_Respiracion1;
    private javax.swing.JCheckBox Cbx_Tos;
    private javax.swing.JCheckBox Cbx_Tos1;
    private javax.swing.JFrame FormMostrar;
    private javax.swing.JLabel Lbl_Edad;
    private javax.swing.JLabel Lbl_Edad1;
    private javax.swing.JLabel Lbl_Kg;
    private javax.swing.JLabel Lbl_Nombre;
    private javax.swing.JLabel Lbl_Nombre1;
    private javax.swing.JLabel Lbl_NumFicha;
    private javax.swing.JLabel Lbl_NumFicha1;
    private javax.swing.JLabel Lbl_Numero;
    private javax.swing.JLabel Lbl_Numero1;
    private javax.swing.JLabel Lbl_Peso;
    private javax.swing.JLabel Lbl_Peso1;
    private javax.swing.JLabel Lbl_Sexo;
    private javax.swing.JLabel Lbl_Sexo1;
    private javax.swing.JLabel Lbl_Sintomas;
    private javax.swing.JLabel Lbl_Sintomas1;
    private javax.swing.JLabel Lbl_TextoSintomas;
    private javax.swing.JLabel Lbl_Titulo1;
    private javax.swing.JLabel Lbl_Titulo2;
    private javax.swing.JLabel Lbl_edad;
    private javax.swing.JLabel Lbl_nombre;
    private javax.swing.JLabel Lbl_peso;
    private javax.swing.JLabel Lbl_sexo;
    private javax.swing.JRadioButton Rbtn_Femenino;
    private javax.swing.JRadioButton Rbtn_Masculino;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Peso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
