package Form;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

import Control.Control;
import Database_access.DaoEquipment;

public class EquipmentView extends JFrame {

    private JComboBox equipments;
    private JRadioButton Loan;
    private JRadioButton Reserve;
    private ButtonGroup group;
    private JButton Accept;
    private JTable List;
    private JScrollPane Scroll;
    private JComboBox TextReason;
    private JLabel Reason;
    private Vector<String> listcombo;

    DaoEquipment dao = new DaoEquipment();

    public EquipmentView() {
        IntComponent();
    }

    private void IntComponent() {
        setTitle("Equipos");
        setForeground(Color.RED);
        setBackground(Color.WHITE);
        getContentPane().setForeground(Color.BLACK);
        setVisible(true);
        setSize(450, 300);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipments = new JComboBox();
        equipments.addItem("Seleccion....");
        Loan = new JRadioButton("Solicitar");
        Loan.setBackground(Color.WHITE);
        Loan.setForeground(Color.BLACK);
        Reserve = new JRadioButton("Reservar");
        Reserve.setForeground(Color.BLACK);
        Reserve.setBackground(Color.WHITE);
        group = new ButtonGroup();
        group.add(Loan);
        group.add(Reserve);
        Accept = new JButton("Aceptar");
        List = new JTable();
        Scroll = new JScrollPane(List);
        TextReason = new JComboBox();
        TextReason.addItem("Proyecto de grado");
        TextReason.addItem("Proyecto de investigacion");
        TextReason.addItem("Deber Academico");
        TextReason.addItem("Otro");
        Reason = new JLabel("Motivo Prestamo");

        // add(control.fill());
        add(Loan);
        add(Reserve);
        add(Accept);
        add(Reason);
        add(TextReason);
        add(Scroll);

        // control.fill().setBounds(12,12,142,26);
        Scroll.setBounds(12, 42, 400, 180);
        Loan.setBounds(210, 12, 80, 26);
        Reserve.setBounds(316, 12, 132, 26);
        Reason.setBounds(12, 230, 142, 26);
        TextReason.setBounds(120, 230, 142, 26);
        Accept.setBounds(280, 230, 142, 26);

    }

}
