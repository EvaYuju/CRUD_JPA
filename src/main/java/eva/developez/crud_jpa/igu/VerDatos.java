package eva.developez.crud_jpa.igu;

import eva.developez.crud_jpa.logic.Controller;
import eva.developez.crud_jpa.logic.Mascota;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aquas
 */
public class VerDatos extends javax.swing.JFrame {
    
    Controller control; // = null; vbles globales inicializado para evitar problemas

    public VerDatos() {
        control = new Controller();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblVerDatosTitle = new javax.swing.JLabel();
        panelTablaMascotas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMascotas = new javax.swing.JTable();
        lblTabla = new javax.swing.JLabel();
        panelBtnAcciones = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblVerDatosTitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblVerDatosTitle.setText("Visualización de Datos");

        panelTablaMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMascotas);

        lblTabla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTabla.setText("Datos de mascotas:");

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\aquas\\Escritorio\\TRAINNING JAVA\\imgs\\eliminarbig.png")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\aquas\\Escritorio\\TRAINNING JAVA\\imgs\\logoEdit.png")); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnAccionesLayout = new javax.swing.GroupLayout(panelBtnAcciones);
        panelBtnAcciones.setLayout(panelBtnAccionesLayout);
        panelBtnAccionesLayout.setHorizontalGroup(
            panelBtnAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBtnAccionesLayout.setVerticalGroup(
            panelBtnAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnAccionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTablaMascotasLayout = new javax.swing.GroupLayout(panelTablaMascotas);
        panelTablaMascotas.setLayout(panelTablaMascotasLayout);
        panelTablaMascotasLayout.setHorizontalGroup(
            panelTablaMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaMascotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTabla)
                    .addGroup(panelTablaMascotasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBtnAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelTablaMascotasLayout.setVerticalGroup(
            panelTablaMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaMascotasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTabla)
                .addGap(18, 18, 18)
                .addGroup(panelTablaMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtnAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelTablaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVerDatosTitle)
                .addGap(240, 240, 240))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblVerDatosTitle)
                .addGap(26, 26, 26)
                .addComponent(panelTablaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JLabel lblVerDatosTitle;
    private javax.swing.JPanel panelBtnAcciones;
    private javax.swing.JPanel panelTablaMascotas;
    private javax.swing.JTable tableMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        // Definir el modelo que queremos que tenga la tabla
        DefaultTableModel tabla = new DefaultTableModel() {
            // Hacer no editables filas y columnas
            @Override // Importante previene fallo carga tabla +++
            public boolean isCellEditable (int row, int column){
                return false;
            }       
        }; // parte de la instancia
        
        /* Nombres de columnas [vector]**************************************************************/
        String titulos[] = {"Nº","Nombre","Raza","Color","Alérg","At. Esp","Observ.","Dueño","Tlf."};
        tabla.setColumnIdentifiers(titulos);
        
        // Carga dedatos desde BD
        List <Mascota> listaMascotas = control.cargarDatosTabla();
        
        // Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if(listaMascotas!=null){
            for (Mascota mascota : listaMascotas) {
                Object[] obj = {
                    mascota.getNum_cliente(),
                    mascota.getNombreMascota(),
                    mascota.getRaza(), 
                    mascota.getColor(), 
                    mascota.getAlergico(),
                    mascota.getAtencion_especial(),
                    mascota.getObservaciones(),
                    mascota.getUnDuenio().getNombreDuenio(),
                    mascota.getUnDuenio().getTelefono()
                };
                
                tabla.addRow(obj);
            }
        }
        // Asignación modelo de la tabla a la igu
        tableMascotas.setModel(tabla);
        
    }
}
