/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author famil
 */
public class ProyectForm extends javax.swing.JPanel {

    public ProyectForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameProyect = new javax.swing.JLabel();
        textNameProyect = new javax.swing.JTextField();
        idProyect = new javax.swing.JLabel();
        textIdProyect = new javax.swing.JTextField();
        codeDirector = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        textCodeDirector = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextArea();
        addProyect = new javax.swing.JButton();

        nameProyect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameProyect.setText("Nombre del proyecto:");

        textNameProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameProyectActionPerformed(evt);
            }
        });

        idProyect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idProyect.setText("Id del proyecto:");

        textIdProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdProyectActionPerformed(evt);
            }
        });

        codeDirector.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codeDirector.setText("Codigo del director:");

        description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        description.setText("Descripcion:");

        textCodeDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodeDirectorActionPerformed(evt);
            }
        });

        textDescription.setColumns(20);
        textDescription.setRows(5);
        jScrollPane1.setViewportView(textDescription);

        addProyect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addProyect.setText("Agregar");
        addProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProyectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameProyect)
                                    .addComponent(idProyect)
                                    .addComponent(codeDirector))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCodeDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIdProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNameProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nameProyect))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textNameProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textIdProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProyect))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeDirector)
                    .addComponent(textCodeDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addProyect, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNameProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameProyectActionPerformed

    private void textIdProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdProyectActionPerformed

    private void textCodeDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodeDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodeDirectorActionPerformed

    private void addProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProyectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProyect;
    private javax.swing.JLabel codeDirector;
    private javax.swing.JLabel description;
    private javax.swing.JLabel idProyect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameProyect;
    private javax.swing.JTextField textCodeDirector;
    private javax.swing.JTextArea textDescription;
    private javax.swing.JTextField textIdProyect;
    private javax.swing.JTextField textNameProyect;
    // End of variables declaration//GEN-END:variables
}