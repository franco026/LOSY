package Form;

import Control.Control;
import javax.swing.JOptionPane;

public class UserForm extends javax.swing.JPanel {

    Control control = new Control();
    
    public UserForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        lastName = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        code = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        textPosition = new javax.swing.JComboBox<>();
        proyect = new javax.swing.JLabel();
        textProyect = new javax.swing.JTextField();
        document = new javax.swing.JLabel();
        textDocument = new javax.swing.JTextField();
        textPhone = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        textCode = new javax.swing.JTextField();

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setText("Nombres:");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        lastName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastName.setText("Apellidos:");

        textLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLastNameActionPerformed(evt);
            }
        });

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        code.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        code.setText("Codigo:");

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setText("Correo:");

        position.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        position.setText("Cargo:");

        textPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Miembro de laboratorio", "Director de laboratorio", "Coordinador de Equipos", "Director de proyectos" }));

        proyect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        proyect.setText("A que proyecto pertenece:");

        document.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        document.setText("Cedula:");

        textDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDocumentActionPerformed(evt);
            }
        });

        textPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneActionPerformed(evt);
            }
        });

        phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phone.setText("Telefono:");

        addUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addUser.setText("Agregar");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        textCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodeActionPerformed(evt);
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
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName)
                            .addComponent(code)
                            .addComponent(email)
                            .addComponent(position))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(textName)
                            .addComponent(textPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textEmail)
                            .addComponent(textCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(proyect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(document)
                            .addComponent(phone))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textDocument))))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code)
                    .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proyect)
                    .addComponent(textProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(document)
                    .addComponent(textDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        proyect.getAccessibleContext().setAccessibleName("A que proyecto\npertenece:");
    }// </editor-fold>//GEN-END:initComponents

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void textLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLastNameActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDocumentActionPerformed

    private void textPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        String name, lastname, email, position, proyect, password;
        int code, phone, document;

        name = textName.getText();
        lastname = textLastName.getText();
        code = Integer.parseInt(textCode.getText());
        email = textEmail.getText();
        position = textPosition.getSelectedItem().toString();
        proyect = textProyect.getText();
        document = Integer.parseInt(textDocument.getText());
        phone = Integer.parseInt(textPhone.getText());

        password = PasswordDefault(name, lastname, textCode.getText());
        System.out.println(password);

        int numFilas = control.insertmember(name, lastname, code, email, position, proyect, document, phone);
        int numFilas2 = control.insertAccount(code, password);

        System.out.println("Filas " + numFilas);
        if (numFilas == 1 && numFilas2 == 1) {

            JOptionPane.showMessageDialog(null, "Programa guardado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Programa");
        }
    }//GEN-LAST:event_addUserActionPerformed

    private void textCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodeActionPerformed

    public String PasswordDefault(String Name, String LastName, String Code) {

        String Password, NameMajuscule, LastNameMajuscule;

        char[] charactersName, charactersLastName;

        NameMajuscule = Name.toUpperCase();
        LastNameMajuscule = LastName.toUpperCase();
        charactersName = NameMajuscule.toCharArray();
        charactersLastName = LastNameMajuscule.toCharArray();

        Password = charactersName[0] + Code + charactersLastName[0];

        return Password;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JLabel code;
    private javax.swing.JLabel document;
    private javax.swing.JLabel email;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel position;
    private javax.swing.JLabel proyect;
    private javax.swing.JTextField textCode;
    private javax.swing.JTextField textDocument;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPhone;
    private javax.swing.JComboBox<String> textPosition;
    private javax.swing.JTextField textProyect;
    // End of variables declaration//GEN-END:variables
}
