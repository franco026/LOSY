/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Control.ControlUser;
import Database_access.DaoUser;
import Logic.User;
import static java.lang.System.exit;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */

public class NewPassword extends javax.swing.JPanel {
    DaoUser userDao = new DaoUser();
    ControlUser control = new ControlUser();
    User user = new User();
    private int code;
    /**
     * Creates new form NewPassword
     */
    public NewPassword(int code) {
        this.code=code;
        userDao.MostrarDatos(code, user);
        initComponents();
        Question.setText(user.getQuestion());
        textPassword.setEnabled(false);
        textConfirm.setEnabled(false);
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Question = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textConfirm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textAnswer = new javax.swing.JTextField();
        textPassword = new javax.swing.JTextField();
        add = new javax.swing.JButton();

        Question.setBackground(new java.awt.Color(204, 204, 204));
        Question.setForeground(new java.awt.Color(255, 0, 0));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Pregunta: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Respuesta:");

        textConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConfirmActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nueva Contraseña");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Confirmar Contraseña");

        textAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAnswerActionPerformed(evt);
            }
        });
        textAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAnswerKeyReleased(evt);
            }
        });

        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add.setText("Aceptar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addComponent(add)))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConfirmActionPerformed

    private void textAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAnswerActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void textAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAnswerKeyReleased
       String answer = textAnswer.getText();
       if(answer.equals(user.getAnswer())){
           textPassword.setEnabled(true);
           textConfirm.setEnabled(true);
       }
    }//GEN-LAST:event_textAnswerKeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String password, confirm;
        if(!textPassword.getText().equals("")&&!textConfirm.getText().equals("")){
          if(textPassword.getText().equals(textConfirm.getText())){
                int opcion = JOptionPane.showConfirmDialog(Question, "Confirmar Cambio de contraseña", "Confirmar", JOptionPane.YES_NO_OPTION);
            if(opcion==0){
                 password = textPassword.getText();
                confirm = textConfirm.getText();
                int numFilas = control.Password(password,code);
                System.out.println("Filas " + numFilas);
                if (numFilas == 1) {

                    JOptionPane.showMessageDialog(null, "Programa guardado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Programa");
                }
            }
               
            }else{
                JOptionPane.showMessageDialog(null, "No coinciden los campos");
            }

       
          }else{
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            }
    }//GEN-LAST:event_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Question;
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textAnswer;
    private javax.swing.JTextField textConfirm;
    private javax.swing.JTextField textPassword;
    // End of variables declaration//GEN-END:variables
}
