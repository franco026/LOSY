package Form;

import Control.ControlEquipment;
import Control.ControlLoan;
import Database_access.DaoEquipment;
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
    int numEquipo;
    int marc;
    int key;
    int count=0;
    int countyear=0;
    boolean stop;
    
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

        jButtonInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dialog_information.png"))); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solicitar)
                            .addComponent(jLabel1)
                            .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservar)
                            .addComponent(aceptar)
                            .addComponent(renovar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(solicitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(renovar)
                .addGap(14, 14, 14)
                .addComponent(aceptar)
                .addContainerGap())
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
    
    private int daymonths(int month,int year){
       
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
               if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                   JOptionPane.showMessageDialog(null, "Feriado");
                   return 29;
               }else{
                   return 28;
                } 
            default:
                return 0;
                
        }
    }
    
    private int check_day(int month,int ano,int dev){
        if(dev>daymonths(month,ano)){
            month++;
            count++;
            int day = dev-daymonths(month,ano);
            if(month>12){
                month=0;
                day = dev-daymonths(month,ano);
                ano++;
                countyear++;
            }
            if(count>12){
                    count=0;
            }
            return check_day(month,ano,day);
        }else{
            JOptionPane.showMessageDialog(null, "Adios"+count);
            return dev;
        }
    }
    
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
       
        if(solicitar.getLabel().equals(opc)){
            if(estado.equals("Disponible")){
                JOptionPane.showMessageDialog(null, estado);
                estado = "Prestado";
                controlequipment.modificar_Estado(estado, numEquipo);
                JOptionPane.showMessageDialog(null, estado);
                DayDev();
                }else{
                 if(estado.equals("Prestado")){
                       JOptionPane.showMessageDialog(null, estado);
                      JOptionPane.showMessageDialog(null, "El equipo ya se encuentra en prestamo, proceda a reservarlo."); 
                 }else{
                        if(estado.equals("Reservado")){
                     JOptionPane.showMessageDialog(null, "El equipo se encuentra reservado.");//pendiente crear reservas
                    }
                }
            }
            }else{
                if(reservar.getLabel().equals(opc)){
                if(estado.equals("Prestado")){
                    String check=estado;
                    estado = "Reservado";
                    if(controloan.check_loan(check, numEquipo, key)){
                        JOptionPane.showMessageDialog(null, "Usted posee este articulo");
                    }else{
                       int numFilas = controlequipment.modificar_Estado(estado, marc);
                        JOptionPane.showMessageDialog(null, "Solicitud registrada.");  
                    }
                }else{
                    if(estado.equals("Disponible")){
                         JOptionPane.showMessageDialog(null, "El equipo se encuentra disponible, proceda a solicitarlo.");
                    }else{
                        if(estado.equals("Reservado")){
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
                        RenDayDev();
                        }
                    }else{
                          if(estado.equals("Reservado")){
                              JOptionPane.showMessageDialog(null, "Este Equipo se encuentra reservado no puedes renovar el prestamo");
                          }else{
                              JOptionPane.showMessageDialog(null, "Este Equipo esta prestado por alguien mas o esta disponible para solicitar");
                          }
                    }
                }else{
                    if(estado.equals("Disponible")){
                         JOptionPane.showMessageDialog(null, "El equipo se encuentra disponible, proceda a solicitarlo.");
                    }else{
                        if(estado.equals("Reservado")){
                            JOptionPane.showMessageDialog(null, "El equipo ya se encuentra reservado y no puedes renovar.");
                        }
                    }
                }  
            }
        }
        stop=false;
        count=0;
        countyear=0;
    }//GEN-LAST:event_aceptarActionPerformed
    
    
    
    private void DayDev(){
    Calendar calendario = new GregorianCalendar();
    int dia = calendario.get(Calendar.DATE);
    int mes = calendario.get(Calendar.MONTH)+1;
    int año = calendario.get(Calendar.YEAR);
    String date = dia+"-"+mes+"-"+año;
    calendario.add(Calendar.DAY_OF_MONTH, 7);
    int diaDevolucion = calendario.get(Calendar.DAY_OF_MONTH);
    String dateDev = diaDevolucion+"-"+mes+"-"+año;
    
    int numFilas2 = controloan.insertarPrestamo(key, numEquipo, marc, date, dateDev);
    System.out.println("Filas " + numFilas2);
    if (numFilas2==2) {
        JOptionPane.showMessageDialog(null, "Prestamo Guardado con Exito");
    }else{
        JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Equipo"); 
        }
    count=0;
    countyear=0;
    }
    
    private void RenDayDev(){
    Calendar calendario = new GregorianCalendar();
    User user = new User();
    int dev=0;
    int dia = calendario.get(Calendar.DATE);
    int mes = calendario.get(Calendar.MONTH)+1;
    int ano = calendario.get(Calendar.YEAR);
    String date = dia+"-"+mes+"-"+ano;
    String renovacion = ano+"-"+mes+"-"+dia;
    int limite = controloan.MostrarLimite(key, numEquipo);
    
    
    controlequipment.modificar_Estado(estado, marc);
    String fecha=controloan.Mostrarfecha(key, numEquipo);
    
    JOptionPane.showMessageDialog(null, fecha.substring(1,4)+"  "+renovacion);
    
    if(fecha.equals(renovacion))
    {
        JOptionPane.showMessageDialog(null, "No puedes renovar el mismo dia que se presto o mas de una vez por dia");
    }else{
        if(limite!=0){

        if((dia+7)>daymonths(mes,ano)){
            
            JOptionPane.showMessageDialog(null, "3");
            int dato = daymonths(mes,ano)-dia;
            dev = 7-dato;
            dev = check_day(mes,ano,dev);
            calendario.add(Calendar.MONTH, count);
            
            if((mes==12||countyear>0)&&(dia+7)>daymonths(mes,ano)){
                
                calendario.add(Calendar.YEAR,countyear);
                int mesDevolucion = calendario.get(Calendar.MONDAY)+1;
                int anoDevolucion = calendario.get(Calendar.YEAR)-1;
                String dateDev = (dev-1)+"-"+mesDevolucion+"-"+anoDevolucion;
                JOptionPane.showMessageDialog(null, dateDev);
                controloan.update_data(dateDev, numEquipo, key);
                
                limite--;
                controloan.reducirlimite(key, numEquipo, date, limite);
                JOptionPane.showMessageDialog(null, "Solicitud registrada.");
            }else{
                
                if(countyear>0){
                    
                    calendario.add(Calendar.YEAR,countyear);
                    JOptionPane.showMessageDialog(null, dev);
                    int mesDevolucion = calendario.get(Calendar.MONDAY)+1;
                    int anoDevolucion = calendario.get(Calendar.YEAR)-1;
                    String dateDev = (dev-1)+"-"+mesDevolucion+"-"+anoDevolucion;
                    JOptionPane.showMessageDialog(null, dateDev);
                    controloan.update_data(dateDev, numEquipo, key);
                    
                    limite--;
                    controloan.reducirlimite(key, numEquipo, date, limite);
                    JOptionPane.showMessageDialog(null, "Solicitud registrada.");
                    }
                }
       }else{
            
            JOptionPane.showMessageDialog(null, "3.1");
            calendario.add(Calendar.DAY_OF_MONTH, 7);
            int diaDevolucion = calendario.get(Calendar.DAY_OF_MONTH);
            String dateDev = (diaDevolucion-1)+"-"+mes+"-"+ano;
            JOptionPane.showMessageDialog(null, dateDev);
            controloan.update_data(dateDev, numEquipo, key);
            
            limite--;
            controloan.reducirlimite(key, numEquipo, date, limite);
            JOptionPane.showMessageDialog(null, "Solicitud registrada.");
            }
    }else{
          JOptionPane.showMessageDialog(null, "has superado el limite de renovacion");
    }
    }
    
    count=0;
    countyear=0;
    }
    private void solicitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarMouseClicked
        opc =  solicitar.getLabel();
        
    }//GEN-LAST:event_solicitarMouseClicked

    private void reservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservarMouseClicked
        
        opc = reservar.getLabel();
    }//GEN-LAST:event_reservarMouseClicked

    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
        DefaultTableModel asd = (DefaultTableModel) jTableConsulta.getModel();
        String dato=String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 4));
        estado = dato;
        numEquipo = Integer.parseInt(String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 0)));
        marc = Integer.parseInt(String.valueOf(asd.getValueAt(jTableConsulta.getSelectedRow(), 2)));
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void renovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renovarMouseClicked
        opc = renovar.getLabel();
    }//GEN-LAST:event_renovarMouseClicked

    private void renovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renovarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renovarActionPerformed
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton jButtonInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTable jTableEquipment;
    private javax.swing.ButtonGroup opcion;
    private javax.swing.JRadioButton renovar;
    private javax.swing.JRadioButton reservar;
    private javax.swing.JRadioButton solicitar;
    // End of variables declaration//GEN-END:variables
}
