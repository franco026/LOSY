package Interface;

import Control.Control;
import Form.ListEquipment;
import Logic.Equipment;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;

public class Profile_member extends javax.swing.JFrame {

    Control control = new Control();
    DefaultListModel modelo = new DefaultListModel();
    Equipment team = new Equipment();
    
    
    public Profile_member() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
   
        Dimension ventana = this.getSize();
        this.setLocation((pantalla.width - ventana.width) / 4 , (pantalla.height - ventana.height) / 4 ); 
        //setLocationRelativeTo(null);
        setVisible(true);
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

        panelFondo = new javax.swing.JPanel();
        logoUV = new javax.swing.JLabel();
        logoLaboratorio = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        logoUVInferior = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EditProfile = new javax.swing.JButton();
        EquipmentLoan = new javax.swing.JButton();
        Proyects = new javax.swing.JButton();
        Equipment = new javax.swing.JButton();
        panelResultOperation = new javax.swing.JPanel();
        Option = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Signoff = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        Guide = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil Miembro");

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));

        logoUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoUV3.png"))); // NOI18N

        logoLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mmvlabLogo.png"))); // NOI18N

        panelInferior.setBackground(new java.awt.Color(213, 27, 37));

        logoUVInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoInferior.PNG"))); // NOI18N

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addComponent(logoUVInferior)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoUVInferior))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Miembro.png"))); // NOI18N

        EditProfile.setText("Editar Perfil");

        EquipmentLoan.setText("Solicitar Equipo");
        EquipmentLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentLoanActionPerformed(evt);
            }
        });

        Proyects.setText("Proyectos");
        Proyects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectsActionPerformed(evt);
            }
        });

        Equipment.setText("Equipos");
        Equipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResultOperationLayout = new javax.swing.GroupLayout(panelResultOperation);
        panelResultOperation.setLayout(panelResultOperationLayout);
        panelResultOperationLayout.setHorizontalGroup(
            panelResultOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        panelResultOperationLayout.setVerticalGroup(
            panelResultOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EquipmentLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Proyects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Equipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(panelResultOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(logoUV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(logoLaboratorio)))
                .addGap(32, 32, 32))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoUV)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoLaboratorio)))
                .addGap(22, 22, 22)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(EditProfile)
                        .addGap(23, 23, 23)
                        .addComponent(EquipmentLoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Proyects)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Equipment)
                        .addGap(0, 175, Short.MAX_VALUE))
                    .addComponent(panelResultOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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

    private void EquipmentLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipmentLoanActionPerformed

    private void SignoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoffActionPerformed
        Join jfjoin = new Join(true);
        dispose();
    }//GEN-LAST:event_SignoffActionPerformed

    private void ProyectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProyectsActionPerformed

    private void EquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentActionPerformed
        ListEquipment listEqui = new ListEquipment();
        listEqui.setSize(614, 450);
        listEqui.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(listEqui, null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint();
    }//GEN-LAST:event_EquipmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditProfile;
    private javax.swing.JButton Equipment;
    private javax.swing.JButton EquipmentLoan;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Guide;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar Option;
    private javax.swing.JButton Proyects;
    private javax.swing.JMenuItem Signoff;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logoLaboratorio;
    private javax.swing.JLabel logoUV;
    private javax.swing.JLabel logoUVInferior;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelResultOperation;
    // End of variables declaration//GEN-END:variables
}
