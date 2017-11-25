package Interface;

import Control.Control;
import Form.ProyectForm;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

public class Profile_proyectdirector extends javax.swing.JFrame {

    ProyectForm jifProyectForm = new ProyectForm();
    Control control = new Control();
    private JDesktopPane InterWindows;
    
    public Profile_proyectdirector() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();
        this.setLocation((pantalla.width - ventana.width) / 4 , (pantalla.height - ventana.height) / 4 ); 
        setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        logoUV = new javax.swing.JLabel();
        logoLaboratorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        logoUVInferior = new javax.swing.JLabel();
        EditProfile = new javax.swing.JButton();
        Members = new javax.swing.JButton();
        Proyects = new javax.swing.JButton();
        Equipment = new javax.swing.JButton();
        Registration = new javax.swing.JButton();
        EditProyect = new javax.swing.JButton();
        EquipmentLoan = new javax.swing.JButton();
        Reports = new javax.swing.JButton();
        panelResultOperation = new javax.swing.JPanel();
        Option = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Signoff = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        Guide = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil Director de Proyectos");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));

        logoUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoUV3.png"))); // NOI18N

        logoLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mmvlabLogo.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProyectDirector.png"))); // NOI18N

        panelInferior.setBackground(new java.awt.Color(213, 27, 37));

        logoUVInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoInferior.PNG"))); // NOI18N

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addComponent(logoUVInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoUVInferior))
        );

        EditProfile.setText("Editar Perfil");
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });

        Members.setText("Miembros");

        Proyects.setText("Proyectos");

        Equipment.setText("Equipos");

        Registration.setText("Nuevo Proyecto");
        Registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationActionPerformed(evt);
            }
        });

        EditProyect.setText("Editar Proyecto");

        EquipmentLoan.setText("Solicitar Equipo");

        Reports.setText("Reportes");

        javax.swing.GroupLayout panelResultOperationLayout = new javax.swing.GroupLayout(panelResultOperation);
        panelResultOperation.setLayout(panelResultOperationLayout);
        panelResultOperationLayout.setHorizontalGroup(
            panelResultOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelResultOperationLayout.setVerticalGroup(
            panelResultOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Members, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Proyects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Equipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Registration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditProyect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EquipmentLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addComponent(panelResultOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                        .addComponent(logoUV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addComponent(logoLaboratorio)))
                .addGap(36, 36, 36))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoUV)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoLaboratorio)))
                .addGap(34, 34, 34)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(EditProfile)
                        .addGap(26, 26, 26)
                        .addComponent(Members)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Proyects)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Equipment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditProyect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EquipmentLoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reports)
                        .addGap(51, 51, 51))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(panelResultOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.setText("Menu");

        Signoff.setText("Cerrar sesion");
        Signoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoffActionPerformed(evt);
            }
        });
        Menu.add(Signoff);

        Exit.setText("Salir");
        Menu.add(Exit);

        Option.add(Menu);

        Help.setText("Ayuda");

        Guide.setText("Guia");
        Help.add(Guide);

        Option.add(Help);

        setJMenuBar(Option);

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

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditProfileActionPerformed

    private void RegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationActionPerformed
        if (control.ALoneAWindow(jifProyectForm, InterWindows)) {
            InterWindows.add(jifProyectForm);
        }
        jifProyectForm.show();
    }//GEN-LAST:event_RegistrationActionPerformed

    private void SignoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoffActionPerformed
        Join joifn = new Join(true);
        dispose();
    }//GEN-LAST:event_SignoffActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditProfile;
    private javax.swing.JButton EditProyect;
    private javax.swing.JButton Equipment;
    private javax.swing.JButton EquipmentLoan;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Guide;
    private javax.swing.JMenu Help;
    private javax.swing.JButton Members;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar Option;
    private javax.swing.JButton Proyects;
    private javax.swing.JButton Registration;
    private javax.swing.JButton Reports;
    private javax.swing.JMenuItem Signoff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLaboratorio;
    private javax.swing.JLabel logoUV;
    private javax.swing.JLabel logoUVInferior;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelResultOperation;
    // End of variables declaration//GEN-END:variables
}
