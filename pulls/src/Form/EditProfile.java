/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;
import Control.ControlUser;
import Logic.User;
import Control.ControlProyect;
import javax.swing.JOptionPane;
import Control.Validation;
import Database_access.DaoProyect;
import Database_access.DaoUser;
import java.awt.Color;

/**
 *
 * @author Kevin
 */
public class EditProfile extends javax.swing.JPanel {
    ControlUser control = new ControlUser();
    ControlProyect controlproyect = new ControlProyect();
    Validation validation = new Validation();
    DaoProyect proyectDao = new DaoProyect();
    User  user = new User();
    DaoUser userDao= new DaoUser();
    private int Code;
    
    /**
     * Creates new form EditProfile
     */

    public EditProfile(int Code) {
        initComponents();
        this.Code=Code;
        userDao.MostrarDatos(Code,user);
        this.listproyect.setModel(proyectDao.getValue());
        deshabiliti_Fields(user.getPosition());
        
    }
    
     public EditProfile(int Code,String position) {
        initComponents();
        this.Code=Code;
        userDao.MostrarDatos(Code,user);
        this.listproyect.setModel(proyectDao.getValue());
        deshabiliti_Fields(position);
        
    }
    
    private void deshabiliti_Fields(String Position){
            if(Position.equals("Miembro de laboratorio")||Position.equals("Coordinador de Equipos")
               ||Position.equals("Director de proyectos")){
                textName.setText(user.getName());
                textName.setEnabled(false);
                textLastName.setText(user.getLastName());
                textLastName.setEnabled(false);
                textEmail.setText(user.getEmail());
                textEmail.setEnabled(false);
                textCode.setText(Integer.toString(user.getCode()));
                textCode.setEnabled(false);
                textDocument.setText(Integer.toString(user.getDocument()));
                textPhone.setText(Integer.toString(user.getPhone()));
                textPassword.setText(user.getPassword());
                
                for(int i=0;i<listQuestion.getItemCount();i++){
                    if(listQuestion.getItemAt(i).equals(user.getQuestion())){
                        listQuestion.setSelectedIndex(i);
                    }
                }
                
                for(int i=0;i<liststate.getItemCount();i++){
                    if(liststate.getItemAt(i).equals(user.getState())){
                        liststate.setSelectedIndex(i);
                    }
                }
                liststate.setEnabled(false);
                
                for(int i=0;i<listproyect.getItemCount();i++){
                    if(listproyect.getItemAt(i).equals(user.getProyect())){
                        listproyect.setSelectedIndex(i);
                    }
                }
                listproyect.setEnabled(false);
                for(int i=0;i<textPosition.getItemCount();i++){
                    if(textPosition.getItemAt(i).equals(user.getPosition())){
                        textPosition.setSelectedIndex(i);
                    }
                }
                textPosition.setEnabled(false);
                textAnswer.setText(user.getAnswer());
            }else{
                if(Position.equals("Director de laboratorio")){
                    textName.setText(user.getName());
                    textLastName.setText(user.getLastName());
                    textEmail.setText(user.getEmail());
                    textCode.setText(Integer.toString(user.getCode()));
                    textCode.setEnabled(false);
                    textDocument.setText(Integer.toString(user.getDocument()));
                    textPhone.setText(Integer.toString(user.getPhone()));
                    textPassword.setText(user.getPassword());
                    
                    for(int i=0;i<listQuestion.getItemCount();i++){
                    if(listQuestion.getItemAt(i).equals(user.getQuestion())){
                        listQuestion.setSelectedIndex(i);
                    }
                     }
                
                    
                    for(int i=0;i<liststate.getItemCount();i++){
                    if(liststate.getItemAt(i).equals(user.getState())){
                        liststate.setSelectedIndex(i);
                    }
                }
                    
                    for(int i=0;i<listproyect.getItemCount();i++){
                        if(listproyect.getItemAt(i).equals(user.getProyect())){
                        listproyect.setSelectedIndex(i);
                        }
                    }
                    
                    for(int i=0;i<textPosition.getItemCount();i++){
                        if(textPosition.getItemAt(i).equals(user.getPosition())){
                        textPosition.setSelectedIndex(i);
                        }
                    }
                    textAnswer.setText(user.getAnswer());
                }
            }
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUser1 = new javax.swing.JButton();
        textName = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        listQuestion = new javax.swing.JComboBox<>();
        textEmail = new javax.swing.JTextField();
        textCode = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        textPosition = new javax.swing.JComboBox<>();
        proyect = new javax.swing.JLabel();
        document = new javax.swing.JLabel();
        textDocument = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        textPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addphoto = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        textPassword = new javax.swing.JTextField();
        email2 = new javax.swing.JLabel();
        email3 = new javax.swing.JLabel();
        textAnswer = new javax.swing.JTextField();
        email4 = new javax.swing.JLabel();
        listproyect = new javax.swing.JComboBox<>();
        email5 = new javax.swing.JLabel();
        liststate = new javax.swing.JComboBox<>();

        addUser1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addUser1.setText("Cambiar Foto");
        addUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUser1ActionPerformed(evt);
            }
        });

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

        phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phone.setText("Telefono:");

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

        listQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Comida Preferida?", "¿Nombre de tu madre?", "¿Nombre de tu mascota?", "¿Bebida Favorita?", "¿Videosjuego Favorito?" }));
        listQuestion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listQuestionItemStateChanged(evt);
            }
        });
        listQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listQuestionActionPerformed(evt);
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

        textCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodeActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setText("Correo:");

        email1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email1.setText("Codigo");

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

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setText("Nombres:");

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Miembro.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addphoto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addphoto.setText("Cambiar Foto");
        addphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addphotoActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Update.setText("Aceptar");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        email2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email2.setText("Contraseña");

        email3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email3.setText("Pregunta Secreta");

        textAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAnswerActionPerformed(evt);
            }
        });

        email4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email4.setText("Respuesta Secreta");

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

        email5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email5.setText("Estado");

        liststate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", " " }));
        liststate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                liststateItemStateChanged(evt);
            }
        });
        liststate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liststateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(proyect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listproyect, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastName)
                                        .addComponent(email))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textLastName)
                                        .addComponent(textName)
                                        .addComponent(textEmail)
                                        .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(email1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(position)
                                    .addGap(62, 62, 62)
                                    .addComponent(textPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(email3)
                            .addGap(28, 28, 28)
                            .addComponent(listQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email4)
                        .addGap(18, 18, 18)
                        .addComponent(textAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email2)
                            .addComponent(email5))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPassword)
                            .addComponent(liststate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textDocument, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                    .addComponent(document)
                                    .addComponent(phone))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
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
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(position))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proyect)
                            .addComponent(listproyect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phone)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email3)
                            .addComponent(listQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(document)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email4)
                    .addComponent(textAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email2)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(liststate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textNameComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameComponentAdded

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed

    }//GEN-LAST:event_textNameActionPerformed

    private void textNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyTyped

        if(validation.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textNameKeyTyped

    private void textLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLastNameActionPerformed

    private void textLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLastNameKeyTyped
        if(validation.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textLastNameKeyTyped

    private void listQuestionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listQuestionItemStateChanged

    }//GEN-LAST:event_listQuestionItemStateChanged

    private void listQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listQuestionActionPerformed

    }//GEN-LAST:event_listQuestionActionPerformed

    private void textEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEmailFocusLost
        if(validation.isEmail(textEmail.getText())){
            textEmail.setToolTipText("");
            textEmail.setBackground(Color.white);
        }else{
            textEmail.setToolTipText("Email invalido");
            textEmail.setBackground(Color.pink);
        }
    }//GEN-LAST:event_textEmailFocusLost

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed

    }//GEN-LAST:event_textEmailActionPerformed

    private void textEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEmailKeyTyped

    }//GEN-LAST:event_textEmailKeyTyped

    private void textCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodeActionPerformed

    private void textDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDocumentActionPerformed

    private void textDocumentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDocumentKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textDocumentKeyTyped

    private void textPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPhoneFocusLost
        if(validation.Isphone(textPhone.getText())){
            textPhone.setToolTipText("");
            textPhone.setBackground(Color.white);
        }else{
            textPhone.setToolTipText("el numero telefonico es de 7 o 10 digitos o deja vacio ");
            textPhone.setBackground(Color.pink);
        }
    }//GEN-LAST:event_textPhoneFocusLost

    private void textPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneActionPerformed

    private void textPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPhoneKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textPhoneKeyTyped

    private void addphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addphotoActionPerformed

    }//GEN-LAST:event_addphotoActionPerformed

    private void addUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUser1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
    String name, lastname, email, position, proyect, password,answer,state,question;
    int code, phone, document;
        if(textAnswer.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Escribe tu respuesta secreta");
        }else{
            if(validation.Isphone(textPhone.getText())){
                name = textName.getText();
                lastname = textLastName.getText();
                code = Integer.parseInt(textCode.getText());
                email = textEmail.getText();
                position = textPosition.getSelectedItem().toString();
                proyect = listproyect.getSelectedItem().toString();
                document = validation.Isnullfileds(textDocument.getText());
                answer = textAnswer.getText();
                phone = validation.Isnullfileds(textPhone.getText());
                state=liststate.getSelectedItem().toString();
                question=listQuestion.getSelectedItem().toString();
                
                password =textPassword.getText();
                //System.out.println(password);
                int numFilas = control.editmember(name, lastname, code, email, 
                        position, proyect, document, state, phone,answer,question,password,Code);
                
                //int numFilas2 = control.insertAccount(code, password);
                System.out.println("Filas " + numFilas);
                if (numFilas>0) {

                    JOptionPane.showMessageDialog(null, "Programa guardado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Programa");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Falta completar el campo de email o el campo de telefono esta mal");
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void textAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAnswerActionPerformed

    private void listproyectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listproyectItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listproyectItemStateChanged

    private void listproyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listproyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listproyectActionPerformed

    private void liststateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_liststateItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_liststateItemStateChanged

    private void liststateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liststateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liststateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton addUser1;
    private javax.swing.JButton addphoto;
    private javax.swing.JLabel document;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel email2;
    private javax.swing.JLabel email3;
    private javax.swing.JLabel email4;
    private javax.swing.JLabel email5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastName;
    private javax.swing.JComboBox<String> listQuestion;
    private javax.swing.JComboBox<String> listproyect;
    private javax.swing.JComboBox<String> liststate;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel position;
    private javax.swing.JLabel proyect;
    private javax.swing.JTextField textAnswer;
    private javax.swing.JTextField textCode;
    private javax.swing.JTextField textDocument;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textPhone;
    private javax.swing.JComboBox<String> textPosition;
    // End of variables declaration//GEN-END:variables
}
