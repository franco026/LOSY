package Interface;

import Control.Control;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Join extends javax.swing.JFrame {

    Control control = new Control();
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

        textAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAccountActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        password.setText("Contraseña");

        remember.setText("<html><u>Recordar Contraseña<u><html>");

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
        // TODO add your handling code here:
    }//GEN-LAST:event_textAccountActionPerformed

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        //int code;
        String password;
        password = textPassword.getText();
        code = Integer.parseInt(textAccount.getText());
        //JOptionPane.showMessageDialog(null, password+ " "+ code);
        if (!control.check(password, code)) {
            JOptionPane.showMessageDialog(null, "Datos invalidos.");
            textPassword.setText("");
            textAccount.setText("");
            //JOptionPane.showMessageDialog(null, "Bienvenido a LOSY.");
            //select_interface(control.check_position(password, code));
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido a LOSY.");
            select_interface(control.check_position(password, code));   
        }
    }//GEN-LAST:event_AcceptActionPerformed

    public int getCode(){
        return code;
    }
    
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    public void select_interface(String Interface) {
        System.out.print(Interface);
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
