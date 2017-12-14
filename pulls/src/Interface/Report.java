/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Database_access.DaoProyect;
import Database_access.FacadeBD;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Leydi
 */
public class Report extends javax.swing.JPanel {

    /**
     * Creates new form Report
     */
    DaoProyect proyectDao = new DaoProyect();
    FacadeBD fachada;
    
    public Report() {
        initComponents();
        fachada = new FacadeBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PrestamosPorMes = new javax.swing.JButton();
        MiembrosMasEquipos = new javax.swing.JButton();
        MiembrosMasMultas = new javax.swing.JButton();
        MultasMes = new javax.swing.JButton();
        PrestamosPorProyecto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxMes = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(614, 242));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Generar Reportes");

        PrestamosPorMes.setText("Reporte de prestamos por mes");
        PrestamosPorMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamosPorMesActionPerformed(evt);
            }
        });

        MiembrosMasEquipos.setText("Miembros que más solicitan equipos");
        MiembrosMasEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiembrosMasEquiposActionPerformed(evt);
            }
        });

        MiembrosMasMultas.setText("Miembros con más multas");
        MiembrosMasMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiembrosMasMultasActionPerformed(evt);
            }
        });

        MultasMes.setText("Valor total de multas por mes");
        MultasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultasMesActionPerformed(evt);
            }
        });

        PrestamosPorProyecto.setText("Reporte de prestamos por proyecto");
        PrestamosPorProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamosPorProyectoActionPerformed(evt);
            }
        });

        jLabel2.setText("Mes:");

        ComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        ComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PrestamosPorMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MultasMes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MiembrosMasMultas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MiembrosMasEquipos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrestamosPorProyecto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel3)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PrestamosPorMes)
                .addGap(29, 29, 29)
                .addComponent(MultasMes)
                .addGap(32, 32, 32)
                .addComponent(MiembrosMasMultas)
                .addGap(35, 35, 35)
                .addComponent(MiembrosMasEquipos)
                .addGap(27, 27, 27)
                .addComponent(PrestamosPorProyecto)
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PrestamosPorMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestamosPorMesActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Desktop\\avances\\pulls\\pulls\\pulls\\src\\Reportes\\EquiposPorMes.jasper";
        try {
            Map parametro = new HashMap();

            parametro.put("mes", ComboBoxMes.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Reporte equipos por mes");
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrestamosPorMesActionPerformed

    private void MiembrosMasEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiembrosMasEquiposActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Desktop\\avances\\pulls\\pulls\\pulls\\src\\Reportes\\MiembrosMasSolicitan.jasper";
        try {
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Usuarios que más solicitan equipos");
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MiembrosMasEquiposActionPerformed

    private void MiembrosMasMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiembrosMasMultasActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Desktop\\avances\\pulls\\pulls\\pulls\\src\\Reportes\\MiembrosMasMultas.jasper";
        try {
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Reporte de miembros con más multas ");
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MiembrosMasMultasActionPerformed

    private void MultasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultasMesActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Desktop\\avances\\pulls\\pulls\\pulls\\src\\Reportes\\MultasPorMes.jasper";
        try {
            Map parametro = new HashMap();
            parametro.put("mes", ComboBoxMes.getSelectedItem().toString());
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr,parametro, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Reporte de total de multas por mes");
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MultasMesActionPerformed

    private void PrestamosPorProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestamosPorProyectoActionPerformed
        JasperReport jr = null;
        String archivo="C:\\Users\\Kevin\\Desktop\\avances\\pulls\\pulls\\pulls\\src\\Reportes\\EquiposPorProyecto.jasper";
        try {
            jr= (JasperReport) JRLoader.loadObjectFromFile(archivo);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, fachada.getConnetion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Reporte equipos por proyecto ");
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrestamosPorProyectoActionPerformed

    private void ComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMes;
    private javax.swing.JButton MiembrosMasEquipos;
    private javax.swing.JButton MiembrosMasMultas;
    private javax.swing.JButton MultasMes;
    private javax.swing.JButton PrestamosPorMes;
    private javax.swing.JButton PrestamosPorProyecto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
