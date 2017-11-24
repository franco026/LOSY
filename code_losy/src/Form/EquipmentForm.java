package Form;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.Control;

public class EquipmentForm extends JInternalFrame {
    private JLabel NumberEquipment;
    private JTextField TextNumberEquipment;
    private JLabel NameEquipment;
    private JTextField TextNameEquipment;
    private JLabel SerialeU;
    private JTextField TextSerialU;
    private JLabel Description;
    private JTextArea TextDescription;
    private JLabel State;
    private JTextField TextState;
    private JButton EquipmentAdd;
    private JScrollPane Scroll;
    Control control = new Control();

    public EquipmentForm(){
        IntComponent();
    }

    private void IntComponent(){
        setVisible(true);
        setSize(692,300);
        setLayout(null);
        setResizable(false);
        setClosable(true);
        setTitle("Regristro Equipo");

        NumberEquipment = new JLabel("Numero del Equipo :");
        TextNumberEquipment = new JTextField(10);
        NameEquipment = new JLabel("Nombre del Equipo :");
        TextNameEquipment = new JTextField(10);
        SerialeU = new JLabel("Serial de la Univalle :");
        TextSerialU = new JTextField(10);
        Description = new JLabel("Descripciòn");
        TextDescription = new JTextArea();
        TextDescription.setOpaque(true);
        TextDescription.setAutoscrolls(true);
        TextDescription.setLineWrap(true);
        TextDescription.setWrapStyleWord(true);
        TextDescription.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TextDescription.setBackground(Color.white);
        TextDescription.setFont(new Font("Arial",Font.ITALIC,12));
        Scroll = new JScrollPane(TextDescription);
        EquipmentAdd= new JButton("Agregar");

        add(NumberEquipment);
        add(TextNumberEquipment);
        add(NameEquipment);
        add(TextNameEquipment);
        add(SerialeU);
        add(TextSerialU);
        add(Description);
        add(Scroll);
        add(EquipmentAdd);

        NumberEquipment.setBounds(10,10,142,26);
        TextNumberEquipment.setBounds(140,10,142,26);
        NameEquipment.setBounds(312,10,142,26);
        TextNameEquipment.setBounds(440,10,142,26);
        SerialeU.setBounds(10,60,142,26);
        TextSerialU.setBounds(140,60,200,26);
        Description.setBounds(10,110,153,26);
        Scroll.setBounds(90,110,550,100);
        EquipmentAdd.setBounds(250,230,142,26);

        EquipmentAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EquipmentAddActionPerformed(e);

            }

        });
    }

    public void EquipmentAddActionPerformed(ActionEvent event){

        int serialu, equipmentnumber;
        String equipmentname, description;

        equipmentnumber=Integer.parseInt(TextNumberEquipment.getText());
        serialu=Integer.parseInt(TextSerialU.getText());
        equipmentname=TextNameEquipment.getText();
        description=TextDescription.getText();

        int numFilas = control.insertequipment(equipmentnumber,equipmentname,serialu,description);


        System.out.println ("Filas "+ numFilas);
        if (numFilas == 1){

            JOptionPane.showMessageDialog(null, "Equipo guardado exitosamente");
        }
        else {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Equipo");
        }


    }
}
