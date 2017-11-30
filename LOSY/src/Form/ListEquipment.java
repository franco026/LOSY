package Form;

import Database_access.DaoEquipment;
import Logic.Equipment;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListEquipment extends javax.swing.JPanel {
    
    String select;
    int key;

    public ListEquipment() {
        
        initComponents();
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableEquipment.setModel(model);
        model.addColumn("Numero_equipo");
        model.addColumn("Nombre_equipo");
        //model.addColumn("Marca");
        //model.addColumn("Descripcion");
        //model.addColumn("Estado");

        //jTableEquipment.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableEquipment.getTableHeader().setReorderingAllowed(false);

        DaoEquipment equipmentDao = new DaoEquipment();
        equipmentDao.consultarEquipo(model);
        jScrollPane1.setViewportView(jTableEquipment);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipment = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonInformation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTableEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquipmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEquipment);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Numero_equipo", "Nombre_equipo", "Descripcion", "Estado"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButtonInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dialog_information.png"))); // NOI18N
        jButtonInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Información del Equipo consultado:");

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
                            .addComponent(jLabel1)
                            .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMouseClicked
        int row = jTableEquipment.rowAtPoint(evt.getPoint());
        select = Integer.toString(row+1);
        //select = (String)jTableEquipment.getValueAt(row, 1);
        //select = (String)jTableEquipment.getValueAt(row, 0);
        modificar(); 
    }//GEN-LAST:event_jTableEquipmentMouseClicked

    private void modificar(){
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Numero_equipo");
        model.addColumn("Nombre_equipo");
        model.addColumn("Marca");
        model.addColumn("Descripcion");
        model.addColumn("Estado");

        //jTableEquipment.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setReorderingAllowed(false);

        DaoEquipment equipmentDao = new DaoEquipment();
        equipmentDao.consultarEquipo2(model, select);
        jScrollPane3.setViewportView(jTable1);
    }
    private void jButtonInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformationActionPerformed
        JOptionPane.showMessageDialog(null, "Para consultar un programa simplemente seleccione un equipo de la tabla.");
    }//GEN-LAST:event_jButtonInformationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEquipment;
    // End of variables declaration//GEN-END:variables
}