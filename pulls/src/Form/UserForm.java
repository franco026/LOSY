package Form;

import Control.ControlUser;
import Control.ControlProyect;
import javax.swing.JOptionPane;
import Control.Validation;
import Database_access.DaoProyect;
import Database_access.DaoUser;
import java.awt.Color;

public class UserForm extends javax.swing.JPanel {

    ControlUser control = new ControlUser();
    ControlProyect controlproyect = new ControlProyect();
    Validation validation = new Validation();
    DaoProyect proyectDao = new DaoProyect();
    DaoUser userDao= new DaoUser();
    private String potision;
    
    public UserForm() {
        initComponents();
        this.listproyect.setModel(proyectDao.getValue());
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        lastName = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        textPosition = new javax.swing.JComboBox<>();
        proyect = new javax.swing.JLabel();
        document = new javax.swing.JLabel();
        textDocument = new javax.swing.JTextField();
        textPhone = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        listproyect = new javax.swing.JComboBox<>();
        textCode = new javax.swing.JTextField();
        email1 = new javax.swing.JLabel();

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setText("Nombres:");

        textName.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textNameComponentAdded(evt);
            }
        });
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNameKeyTyped(evt);
            }
        });

        lastName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastName.setText("Apellidos:");

        textLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLastNameActionPerformed(evt);
            }
        });
        textLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textLastNameKeyTyped(evt);
            }
        });

        textEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textEmailFocusLost(evt);
            }
        });
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        textEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEmailKeyTyped(evt);
            }
        });

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
        textDocument.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDocumentKeyTyped(evt);
            }
        });

        textPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textPhoneFocusLost(evt);
            }
        });
        textPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneActionPerformed(evt);
            }
        });
        textPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPhoneKeyTyped(evt);
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

        listproyect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listproyectItemStateChanged(evt);
            }
        });
        listproyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listproyectActionPerformed(evt);
            }
        });

        textCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodeActionPerformed(evt);
            }
        });

        email1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email1.setText("Codigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName)
                            .addComponent(email))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(textName)
                            .addComponent(textEmail)
                            .addComponent(textCode)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(proyect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listproyect, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(document)
                                    .addComponent(phone))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPhone)
                                    .addComponent(textDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(email1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(position)
                                .addGap(62, 62, 62)
                                .addComponent(textPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(119, Short.MAX_VALUE))
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
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proyect)
                    .addComponent(listproyect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(document)
                    .addComponent(textDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        proyect.getAccessibleContext().setAccessibleName("A que proyecto\npertenece:");
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed

        String name, lastname, email, position, proyect, password;
        int code, phone, document;
        if(textName.getText().equals("")||textLastName.getText().equals("")||textEmail.getText().equals("")
                || textCode.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
        }else{
            if(validation.isEmail(textEmail.getText())&&validation.Isphone(textPhone.getText())){
                name = textName.getText();
                lastname = textLastName.getText();
                code = Integer.parseInt(textCode.getText());
                email = textEmail.getText();
                position = textPosition.getSelectedItem().toString();
                proyect = listproyect.getSelectedItem().toString();
                document = validation.Isnullfileds(textDocument.getText());
                phone = validation.Isnullfileds(textPhone.getText());

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
            }else{
                JOptionPane.showMessageDialog(null, "Falta completar el campo de email o el campo de telefono esta mal");
            }

        }
    }//GEN-LAST:event_addUserActionPerformed

    private void textEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEmailKeyTyped

    }//GEN-LAST:event_textEmailKeyTyped

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed

    }//GEN-LAST:event_textEmailActionPerformed

    private void textEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEmailFocusLost
        if(validation.isEmail(textEmail.getText())){
            textEmail.setToolTipText("");
            textEmail.setBackground(Color.white);
        }else{
            textEmail.setToolTipText("Email invalido");
            textEmail.setBackground(Color.pink);
        }
    }//GEN-LAST:event_textEmailFocusLost

    private void listproyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listproyectActionPerformed

    }//GEN-LAST:event_listproyectActionPerformed

    private void listproyectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listproyectItemStateChanged

    }//GEN-LAST:event_listproyectItemStateChanged

    private void textLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLastNameKeyTyped
        if(validation.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textLastNameKeyTyped

    private void textLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLastNameActionPerformed

    private void textNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyTyped

        if(validation.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textNameKeyTyped

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed

    }//GEN-LAST:event_textNameActionPerformed

    private void textNameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textNameComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameComponentAdded

    private void textPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPhoneKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textPhoneKeyTyped

    private void textPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneActionPerformed

    private void textPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPhoneFocusLost
        if(validation.Isphone(textPhone.getText())){
            textPhone.setToolTipText("");
            textPhone.setBackground(Color.white);
        }else{
            textPhone.setToolTipText("el numero telefonico es de 7 o 10 digitos o deja vacio ");
            textPhone.setBackground(Color.pink);
        }
    }//GEN-LAST:event_textPhoneFocusLost

    private void textDocumentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDocumentKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textDocumentKeyTyped

    private void textDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDocumentActionPerformed

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
    private javax.swing.JLabel document;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel lastName;
    private javax.swing.JComboBox<String> listproyect;
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
    // End of variables declaration//GEN-END:variables
}
