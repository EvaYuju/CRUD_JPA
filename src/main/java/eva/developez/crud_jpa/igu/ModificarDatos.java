package eva.developez.crud_jpa.igu;

import eva.developez.crud_jpa.logic.Controller;
import eva.developez.crud_jpa.logic.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author aquas
 */
public class ModificarDatos extends javax.swing.JFrame {
    
    Controller control = null;
    int num_cliente; // Vbla global que reciba
    Mascota mascota;


    public ModificarDatos(int num_cliente) {
        control = new Controller(); 
        //this.num_cliente = num_cliente; // Obtenemos el dato de la vble
        initComponents();
        // Cargar datos
        cargarDatos(num_cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitleModif = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        panelBtnPpal = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panelFormulario = new javax.swing.JPanel();
        lblTit1 = new javax.swing.JLabel();
        lblNomMasc = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAlergia = new javax.swing.JLabel();
        lblAtEsp = new javax.swing.JLabel();
        lblTit2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNomDuenio = new javax.swing.JLabel();
        lblTlf = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        txtNomMascota = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNomDuenio = new javax.swing.JTextField();
        txtTlf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObserv = new javax.swing.JTextArea();
        cmbAlerg = new javax.swing.JComboBox<>();
        cmbAtEsp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitleModif.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitleModif.setText("Modificar Datos");

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\aquas\\Escritorio\\TRAINNING JAVA\\imgs\\kiriXS.png")); // NOI18N
        lblImagen.setText("jLabel1");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\aquas\\Escritorio\\TRAINNING JAVA\\imgs\\logoEliminar.png")); // NOI18N
        btnLimpiar.setText("  Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\aquas\\Escritorio\\TRAINNING JAVA\\imgs\\logoGuardar.png")); // NOI18N
        btnGuardar.setText("  Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnPpalLayout = new javax.swing.GroupLayout(panelBtnPpal);
        panelBtnPpal.setLayout(panelBtnPpalLayout);
        panelBtnPpalLayout.setHorizontalGroup(
            panelBtnPpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnPpalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panelBtnPpalLayout.setVerticalGroup(
            panelBtnPpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnPpalLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelBtnPpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        lblTit1.setText("Datos Mascota");

        lblNomMasc.setText("Nombre:");

        lblRaza.setText("Raza:");

        lblColor.setText("Color:");

        lblAlergia.setText("Alérgico:");

        lblAtEsp.setText("Atención Especial:");

        lblTit2.setText("Datos Dueño");

        lblNomDuenio.setText("Nombre:");

        lblTlf.setText("Teléfono:");

        lblObs.setText("Observaciones:");

        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });

        txtObserv.setColumns(20);
        txtObserv.setRows(5);
        jScrollPane1.setViewportView(txtObserv);

        cmbAlerg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        cmbAtEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTit1)
                .addGap(136, 136, 136))
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomMasc)
                                    .addComponent(lblRaza)
                                    .addComponent(lblColor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelFormularioLayout.createSequentialGroup()
                                    .addComponent(lblAtEsp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbAtEsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelFormularioLayout.createSequentialGroup()
                                    .addComponent(lblAlergia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbAlerg, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblTit2))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(lblNomDuenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(lblTlf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblObs)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTit1)
                .addGap(7, 7, 7)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomMasc)
                    .addComponent(txtNomMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergia)
                    .addComponent(cmbAlerg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtEsp)
                            .addComponent(cmbAtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTit2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomDuenio)
                            .addComponent(txtNomDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblTlf))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(lblObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(lblTitleModif)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnPpal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitleModif)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelBtnPpal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Limpiar campos formulario
        txtNomMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        txtNomDuenio.setText("");
        txtTlf.setText("");
        txtObserv.setText("");
        cmbAlerg.setSelectedIndex(0);
        cmbAtEsp.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Vbles auxiliares (más fácil)
        //Datos Mascota y Dueño
        String nomMascota = txtNomMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String alergico = (String) cmbAlerg.getSelectedItem();
        String atEsp = (String) cmbAtEsp.getSelectedItem();
        
        String nomDuenio = txtNomDuenio.getText();
        String tlf = txtTlf.getText();
        String observ = txtObserv.getText(); //++orden igual que tabla!

        //control.guardar(*nomMascota,raza,color,alergico,atEsp,nomDuenio,tlf,observ); 
        // * Ahora hay que hacerla para mascota y dueño (2 tablas) ++//orden igual que tabla!
        control.modificarMascota(mascota , nomMascota,raza,color,alergico,atEsp,nomDuenio,tlf,observ); 
       
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
         
        // Crear mensaje 
        
        this.dispose(); // cierra la ventana de edicion
        //VerDatos.cargarTabla();
        mostrarMensaje("Edición realizada correctamente", "Info", "Edición correcta");
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlerg;
    private javax.swing.JComboBox<String> cmbAtEsp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAlergia;
    private javax.swing.JLabel lblAtEsp;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNomDuenio;
    private javax.swing.JLabel lblNomMasc;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTit1;
    private javax.swing.JLabel lblTit2;
    private javax.swing.JLabel lblTitleModif;
    private javax.swing.JLabel lblTlf;
    private javax.swing.JPanel panelBtnPpal;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNomDuenio;
    private javax.swing.JTextField txtNomMascota;
    private javax.swing.JTextArea txtObserv;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTlf;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {
        
        this.mascota = control.cargarMascota(num_cliente);
        // Setear datos en la interfaz
        txtNomMascota.setText(mascota.getNombreMascota());
        txtRaza.setText(mascota.getRaza());
        txtColor.setText(mascota.getColor());
        txtNomDuenio.setText(mascota.getUnDuenio().getNombreDuenio());
        txtTlf.setText(mascota.getUnDuenio().getTelefono());
        txtObserv.setText(mascota.getObservaciones());
        // combobox 
        if(mascota.getAlergico().equals("SI")) {
            cmbAlerg.setSelectedIndex(1);
        } else { 
            if(mascota.getAlergico().equals("NO"))
            cmbAlerg.setSelectedIndex(2);
        }
        
        if(mascota.getAtencion_especial().equals("SI")) {
            cmbAtEsp.setSelectedIndex(1);
        } else { 
            if(mascota.getAtencion_especial().equals("NO"))
            cmbAtEsp.setSelectedIndex(2);
        }

    }
    
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
    // Crear mensaje 
    JOptionPane optionPane = new JOptionPane(mensaje);
    if (tipo.equals("Info")) {
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    } else if (tipo.equals("Error")) {
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
    }
    JDialog dialog = optionPane.createDialog(titulo);
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
    }
}
