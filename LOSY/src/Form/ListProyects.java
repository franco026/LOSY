package Form;


import Database_access.DaoProyect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListProyects extends javax.swing.JPanel {

    String select;
    String opc;
    int estado;
    int key;
    
    public ListProyects() {
        initComponents();
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableProyects.setModel(model);
        model.addColumn("ID_Proyecto");
        model.addColumn("Nombre_Proyecto");
        //model.addColumn("Marca");
        //model.addColumn("Descripcion");
        //model.addColumn("Estado");

        //jTableEquipment.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableProyects.getTableHeader().setReorderingAllowed(false);

        DaoProyect proyectDao = new DaoProyect();
        proyectDao.consultarProyecto(model);
        jScrollPane1.setViewportView(jTableProyects);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProyects = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jButtonInformation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reservar = new javax.swing.JRadioButton();
        solicitar = new javax.swing.JRadioButton();
        aceptar = new javax.swing.JButton();

        jTableProyects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableProyects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProyectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProyects);

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id_Proyecto", "Nombre_proyecto", "Descripcion", "Codigo_director"
            }
        ));
        jTableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableConsulta);

        jButtonInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dialog_information.png"))); // NOI18N
        jButtonInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Información del Proyecto consultado:");

        reservar.setText("Reservar");
        reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservarMouseClicked(evt);
            }
        });
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });

        solicitar.setText("Solicitar");
        solicitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solicitarMouseClicked(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solicitar)
                            .addComponent(jLabel1)
                            .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservar)
                            .addComponent(aceptar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(solicitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservar)
                .addGap(18, 18, 18)
                .addComponent(aceptar)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProyectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProyectsMouseClicked
        int row = jTableProyects.rowAtPoint(evt.getPoint());
        DefaultTableModel asd = (DefaultTableModel) jTableProyects.getModel();
        String dato=String.valueOf(asd.getValueAt(jTableProyects.getSelectedRow(), 0));
        select = dato;
        //select = Integer.toString(row+1);

        //JOptionPane.showMessageDialog(null, dato);
        //select = (String)jTableEquipment.getValueAt(row, 1);
        //select = (String)jTableEquipment.getValueAt(row, 0);
        modificar();
    }//GEN-LAST:event_jTableProyectsMouseClicked

    private void modificar(){
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableConsulta.setModel(model);
        model.addColumn("ID_Proyecto");
        model.addColumn("Nombre_Proyecto");
        model.addColumn("Descripcion");
        model.addColumn("Codigo_Director");

        //jTableEquipment.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableConsulta.getTableHeader().setReorderingAllowed(false);

        DaoProyect proyectDao = new DaoProyect();
        proyectDao.consultarProyecto2(model, select);
        jScrollPane3.setViewportView(jTableConsulta);
    }
    
    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked

        /*DefaultTableModel asd = (DefaultTableModel) jTableConsulta.getModel();
        String dato=String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 4));
        estado = Integer.parseInt(dato);
        JOptionPane.showMessageDialog(null, estado);*/
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void jButtonInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformationActionPerformed
        JOptionPane.showMessageDialog(null, "Para consultar un proyecto simplemente seleccione uno de la tabla de arriba.");
    }//GEN-LAST:event_jButtonInformationActionPerformed

    private void reservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservarMouseClicked
        opc = reservar.getLabel();
    }//GEN-LAST:event_reservarMouseClicked

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservarActionPerformed

    private void solicitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarMouseClicked
        opc = solicitar.getLabel();
        
    }//GEN-LAST:event_solicitarMouseClicked

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        //DaoEquipment equipmentDao = new DaoEquipment();
        if(opc == solicitar.getLabel()){
            if(estado == 0){
                int pp = 1;
                //equipmentDao.editarEquipo(pp, select);
            }else{
                if(estado == 1){
                    JOptionPane.showMessageDialog(null, "El equipo ya se encuentra en prestamo, proceda a reservarlo.");
                }else{
                    if(estado == 2){
                        JOptionPane.showMessageDialog(null, "El equipo se encuentra reservado.");
                    }
                }
            }
        }else{
            if(opc == reservar.getLabel()){
                if(estado == 1){
                    int pp = 2;
                  //  equipmentDao.editarEquipo(pp, select);
                }else{
                    if(estado == 0){
                        JOptionPane.showMessageDialog(null, "El equipo se encuentra disponible, proceda a solicitarlo.");
                    }else{
                        if(estado == 2){
                            JOptionPane.showMessageDialog(null, "El equipo ya se encuentra reservado.");
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton jButtonInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTable jTableProyects;
    private javax.swing.JRadioButton reservar;
    private javax.swing.JRadioButton solicitar;
    // End of variables declaration//GEN-END:variables
}
