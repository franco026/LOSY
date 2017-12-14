package Form;

import Control.ControlEquipment;
import Control.ControlLoan;
import Database_access.DaoEquipment;
import Logic.Equipment;
import Logic.Loan;
import Logic.User;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class ListEquipment extends javax.swing.JPanel {
    DaoEquipment equipmentDao = new DaoEquipment();
    ControlEquipment controlequipment = new ControlEquipment();
    ControlLoan controloan = new ControlLoan();
    String Position;
    String select;
    String opc;
    String estado;
    String nombre;
    private String motivo;
    int numEquipo;
    int marc;
    int key;
    
    public ListEquipment(int code) {
       
        this.key=code;
        this.Position=Position;
        initComponents();
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableEquipment.setModel(model);
        model.addColumn("Numero_equipo");
        model.addColumn("Nombre_equipo");
        jTableEquipment.getTableHeader().setReorderingAllowed(false);
       
        equipmentDao.consultarEquipo(model);
        jScrollPane1.setViewportView(jTableEquipment);
        listMotivo.setEnabled(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcion = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipment = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jButtonInformation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reservar = new javax.swing.JRadioButton();
        solicitar = new javax.swing.JRadioButton();
        aceptar = new javax.swing.JButton();
        renovar = new javax.swing.JRadioButton();
        listMotivo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jTableEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquipmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEquipment);

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Numero_equipo", "Nombre_equipo", "Descripcion", "Estado_actual", "Estado"
            }
        ));
        jTableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableConsulta);

        jButtonInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/information.png"))); // NOI18N
        jButtonInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Información del Equipo consultado:");

        opcion.add(reservar);
        reservar.setText("Reservar");
        reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservarMouseClicked(evt);
            }
        });
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });

        opcion.add(solicitar);
        solicitar.setText("Solicitar");
        solicitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solicitarMouseClicked(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        opcion.add(renovar);
        renovar.setText("Renovar");
        renovar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renovarMouseClicked(evt);
            }
        });
        renovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renovarActionPerformed(evt);
            }
        });

        listMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proyectos", "Trabajo de grado", "Otros" }));
        listMotivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMotivoMouseClicked(evt);
            }
        });

        jLabel2.setText("Motivo del Prestamo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solicitar)
                            .addComponent(reservar))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(renovar)
                            .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solicitar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reservar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(renovar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aceptar)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMouseClicked
        int row = jTableEquipment.rowAtPoint(evt.getPoint());
        DefaultTableModel tablaequipment = (DefaultTableModel) jTableEquipment.getModel();
        String dato=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 0));
        select = dato;
        modificar(); 
    }//GEN-LAST:event_jTableEquipmentMouseClicked

    private void modificar(){
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableConsulta.setModel(model);
        model.addColumn("Numero_equipo");
        model.addColumn("Nombre_equipo");
        model.addColumn("Marca");
        model.addColumn("Descripcion");
        model.addColumn("Estado_actual");
        model.addColumn("Estado");

        
        jTableConsulta.getTableHeader().setReorderingAllowed(false);

        DaoEquipment equipmentDao = new DaoEquipment();
        equipmentDao.consultarEquipo2(model, select);
        jScrollPane3.setViewportView(jTableConsulta);
    }
    
    private void jButtonInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformationActionPerformed
        JOptionPane.showMessageDialog(null, "Para consultar un programa simplemente seleccione un equipo de la tabla de arriba.");
    }//GEN-LAST:event_jButtonInformationActionPerformed

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservarActionPerformed
    
 
    
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        
        if(solicitar.getLabel().equals(opc)){
            if(estado.equals("Disponible")){
                estado = "Prestado";
                controlequipment.modificar_Estado(estado, numEquipo);
                controloan.DayDev(7,key,numEquipo,motivoSeleccionado());
                }else{
                 if(estado.equals("Prestado")){
                      JOptionPane.showMessageDialog(null, estado);
                      JOptionPane.showMessageDialog(null, "El equipo ya se encuentra en prestamo, proceda a reservarlo."); 
                 }else{
                        if(estado.equals("Reserva")){
                            Calendar calendario = new GregorianCalendar();
                            int dia = calendario.get(Calendar.DATE);
                            int mes = calendario.get(Calendar.MONTH)+1;
                            int año = calendario.get(Calendar.YEAR);
                            String date = dia+""+mes+""+año;


                            Loan loan = new Loan();
                            Equipment equipment = new Equipment();
                            int diap,mesp,anop,diar,mesr,anor;
                            String fechar,fechap,disponibilidad,disponilidadP;

                            equipment = equipmentDao.MostrarDatos(equipment,Integer.toString(numEquipo), nombre);

                            disponibilidad = equipment.getState();

                            JOptionPane.showMessageDialog(null,disponibilidad );

                            loan = controloan.Datos(loan, numEquipo);

                            

                            loan = controloan.mostrar_reserva(loan, numEquipo);

                            String fecha_prestamo=loan.getFechaPrestamo();
                            diap=Integer.parseInt(fecha_prestamo.substring(0,4));
                            mesp=Integer.parseInt(fecha_prestamo.substring(5,7));
                            anop=Integer.parseInt(fecha_prestamo.substring(8,10));
                            fechap=diap+""+mesp+""+anop;


                            String fecha_reserva=loan.getFechaDevolucion();

                            diar=Integer.parseInt(fecha_reserva.substring(0,4));
                            mesr=Integer.parseInt(fecha_reserva.substring(5,7));
                            anor=Integer.parseInt(fecha_reserva.substring(8,10));
                            fechar=diar+""+mesr+""+anor;
                            if((Integer.parseInt(fechar)>Integer.parseInt(date)&&Integer.parseInt(date)>Integer.parseInt(fechap)&&controloan.check_prestamo(loan.getId()))
                                ||(disponibilidad.equals("Reserva")&&controloan.check_reserva(numEquipo, key)&&controloan.check_prestamo(loan.getId()))){
                            
                            estado = "Prestado";
                            controlequipment.modificar_Estado(estado, numEquipo);
                            controloan.DayDev(7,key,numEquipo, motivoSeleccionado());
                            controloan.eliminar_reserva(numEquipo);
                                
                            }
                       JOptionPane.showMessageDialog(null, "El equipo se encuentra reservado.");//pendiente crear reservas
                    }
                }
            }
            }else{
                if(reservar.getLabel().equals(opc)){
                if(estado.equals("Prestado")){
                    String check=estado;
                    estado = "Reserva";
                    if(controloan.check_loan(check, numEquipo, key)){
                        JOptionPane.showMessageDialog(null, "Usted posee este articulo");
                        
                    }else{
                        controlequipment.modificar_Estado(estado, numEquipo);
                        controloan.eliminar_limite(numEquipo);
                        controloan.RenDayDev(10,key,numEquipo);  
                    }
                }else{
                    if(estado.equals("Disponible")){
                         JOptionPane.showMessageDialog(null, "El equipo se encuentra disponible, proceda a solicitarlo.");
                    }else{
                        if(estado.equals("Reserva")){
                            JOptionPane.showMessageDialog(null, "El equipo ya se encuentra reservado.");
                        }
                    }
                }
            }else{
                 if(renovar.getLabel().equals(opc)){
                if(estado.equals("Prestado")){
                    JOptionPane.showMessageDialog(null, "1");
                    String check=estado;
                    if(controloan.check_loan(check, numEquipo, key)){
                        JOptionPane.showMessageDialog(null, "2");
                        controloan.RenDayDev(7,key,numEquipo);
                        }
                    }else{
                          if(estado.equals("Reserva")){
                              JOptionPane.showMessageDialog(null, "Este Equipo se encuentra reservado no puedes renovar el prestamo");
                          }else{
                              JOptionPane.showMessageDialog(null, "Este Equipo esta prestado por alguien mas o esta disponible para solicitar");
                          }
                    }
                }else{
                    if(estado.equals("Disponible")){
                         JOptionPane.showMessageDialog(null, "El equipo se encuentra disponible, proceda a solicitarlo.");
                    }else{
                        if(estado.equals("Reserva")){
                            JOptionPane.showMessageDialog(null, "El equipo ya se encuentra reservado y no puedes renovar.");
                        }
                    }
                }  
            }
        }
    }//GEN-LAST:event_aceptarActionPerformed
    
    
    
 
    
    private void solicitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarMouseClicked
        opc =  solicitar.getLabel();
        listMotivo.setEnabled(true);
        
    }//GEN-LAST:event_solicitarMouseClicked

    private void reservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservarMouseClicked
        
        opc = reservar.getLabel();
        listMotivo.setEnabled(false);
    }//GEN-LAST:event_reservarMouseClicked

    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
        DefaultTableModel asd = (DefaultTableModel) jTableConsulta.getModel();
        String dato=String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 4));
        estado = dato;
        nombre = String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 1));
        numEquipo = Integer.parseInt(String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 0)));
        marc = Integer.parseInt(String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 2)));
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private String motivoSeleccionado(){
        motivo = listMotivo.getSelectedItem().toString();
        //JOptionPane.showMessageDialog(null, motivo);
        
        return motivo;
    }
    
    private void renovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renovarMouseClicked
        opc = renovar.getLabel();
        listMotivo.setEnabled(false);
    }//GEN-LAST:event_renovarMouseClicked

    private void renovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renovarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renovarActionPerformed

    private void listMotivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMotivoMouseClicked
        
    }//GEN-LAST:event_listMotivoMouseClicked
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton jButtonInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTable jTableEquipment;
    private javax.swing.JComboBox<String> listMotivo;
    private javax.swing.ButtonGroup opcion;
    private javax.swing.JRadioButton renovar;
    private javax.swing.JRadioButton reservar;
    private javax.swing.JRadioButton solicitar;
    // End of variables declaration//GEN-END:variables
}
