package Form;

import Database_access.DaoEquipment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListEquipment extends javax.swing.JPanel {

    public ListEquipment() {
        
        initComponents();
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableEquipment.setModel(model);
        model.addColumn("Numero_equipo");
        model.addColumn("Nombre_equipo");
        model.addColumn("Marca");
        model.addColumn("Descripcion");
        model.addColumn("Estado");

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

        setLayout(new java.awt.BorderLayout());

        jTableEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableEquipment);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEquipment;
    // End of variables declaration//GEN-END:variables
}
