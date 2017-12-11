package Interface;

import Control.ControlUser;
import Database_access.DaoUser;
import Form.NewPassword;
import Logic.User;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.CANCEL_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

public class Join extends javax.swing.JFrame {

    ControlUser control = new ControlUser();
    DaoUser userDao= new DaoUser();
    int code;
    public Join() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();
        this.setLocation((pantalla.width - ventana.width) / 4 , (pantalla.height - ventana.height) / 4 ); 
        this.setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        logoLOSY = new javax.swing.JLabel();
        account = new javax.swing.JLabel();
        textAccount = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        remember = new javax.swing.JLabel();
        Accept = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        textPassword = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ingreso");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));

        logoLOSY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N

        account.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        account.setText("Cuenta");
        account.setMaximumSize(new java.awt.Dimension(40, 14));
        account.setMinimumSize(new java.awt.Dimension(40, 14));
        account.setPreferredSize(new java.awt.Dimension(40, 20));

        textAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAccountActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        password.setText("Contraseña");

        remember.setText("<html><u>Recordar Contraseña<u><html>");
        remember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rememberMouseClicked(evt);
            }
        });

        Accept.setText("Aceptar");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        Cancel.setText("Cancelar");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(password))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(remember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addComponent(logoLOSY)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(logoLOSY)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(remember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAccountActionPerformed

    }//GEN-LAST:event_textAccountActionPerformed
     
   
    
    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        String account = textAccount.getText();
        String password;
        password = textPassword.getText();
        try{
            code=Integer.parseInt(textAccount.getText());
        }catch(Exception e){
            code=control.return_code(account);
        }
            //JOptionPane.showMessageDialog(null, password+ " "+ code);
        if (!control.check(password,account)) {
            JOptionPane.showMessageDialog(null, "Datos invalidos.");
            textPassword.setText("");
            textAccount.setText("");
            //JOptionPane.showMessageDialog(null, "Bienvenido a LOSY.");
            //select_interface(control.check_position(password, code));
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido a LOSY.");
            select_interface(control.check_position(account));
            
        }
        
        
    }//GEN-LAST:event_AcceptActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void rememberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMouseClicked
        String text =JOptionPane.showInputDialog(null,"Introdusca el codigo","Nueva Contraseña",JOptionPane.YES_NO_CANCEL_OPTION); 
        int code;
        User user = new User();
        if(!text.equals("")){
          try{
            code=Integer.parseInt(text);
           if(control.NewPassword(code)){
               
               userDao.MostrarDatos(code, user);
               
               if(!user.getQuestion().equals("")){
                    JOptionPane.showMessageDialog(null, "Codigo correcto");
                    JFrame Password = new JFrame();
                    Password.setVisible(true);
                    Password.setSize(450, 350);
                    Password.setResizable(false);
                    Password.setLocationRelativeTo(null);
                    NewPassword newpassword = new NewPassword(code);
                    newpassword.setBounds(0, 0, 615, 450);
                    Password.getContentPane().add(newpassword,null);
               }
               
           }
            
        }
          catch(Exception e){JOptionPane.showMessageDialog(null, "Codigo invalido o no posees pregunta secreta");}

        }
    }//GEN-LAST:event_rememberMouseClicked

    public void select_interface(String Interface) {
         switch (Interface) {
            case "Miembro de laboratorio":
                Profile_member jfmember = new Profile_member(code);
                dispose();
                break;
            case "Director de laboratorio":
                Profile_Laboratorydirector jfLabdirector = new Profile_Laboratorydirector(code);
                dispose();
                break;
            case "Coordinador de Equipos":
                Profile_coordinator jfcoordinator = new Profile_coordinator(code);
                dispose();
                break;
            case "Director de proyectos":
                Profile_proyectdirector jfprodirector = new Profile_proyectdirector(code);
                dispose();
                break;
            default:
                break;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel account;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLOSY;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel password;
    private javax.swing.JLabel remember;
    private javax.swing.JTextField textAccount;
    private javax.swing.JPasswordField textPassword;
    // End of variables declaration//GEN-END:variables
}
