package Interface;

import Form.EquipmentForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Control.Control;

public class Profile_coordinator extends JFrame {
    private JMenuBar Option;
    private JMenu Menu;
    private JMenu Help;
    private JMenuItem Signoff;
    private JMenuItem Exit;
    private JMenuItem Guide;
    private JLabel ImageProfile;
    private JButton EditProfile;
    private JButton EquipmentLoan;
    private JPanel Profile;
    private JButton Equipment;
    private JLabel Title;
    private JButton Registration;
    private JButton EditEquipment;
    private JButton Fines;
    private JButton Reports;
    private JDesktopPane InterWindows;

    EquipmentForm jifEquipment = new EquipmentForm();
    Control control = new Control();

    public Profile_coordinator() {
        IntComponent();
    }

    private void IntComponent(){

        setBounds(10, 10, 900, 450);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Perfil Coordinador");

        Icon IcoProfile = new ImageIcon(getClass().getResource("/Image/Coordinator.png"));

        Profile = new JPanel();
        ImageProfile = new JLabel(IcoProfile);
        EditProfile = new JButton("Editar Perfil");
        EquipmentLoan = new JButton("Solicitar Equipo");
        Equipment = new JButton("Equipos");
        Option = new JMenuBar();
        Menu = new JMenu("Menu");
        Help = new JMenu("Ayuda");
        Signoff = new JMenuItem("Cerrar Sesion");
        Exit = new JMenuItem("Salir");
        Guide = new JMenuItem("Guia");
        Title = new JLabel("Coordinador de equipos");
        Title.setFont(new java.awt.Font("Arial", 0, 16));
        Registration = new JButton("Registrar Equipo");
        EditEquipment = new JButton("Editar Equipos");
        Fines = new JButton("Multas");
        Reports = new JButton("Reportes");
        InterWindows = new JDesktopPane();

        Menu.add(Signoff);
        Menu.add(Exit);
        Option.add(Menu);
        Help.add(Guide);
        Option.add(Help);
        setJMenuBar(Option);

        add(Profile);
        Profile.setBounds(0, 0, 192, 388);
        Profile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Profile.setLayout(null);

        Profile.add(Equipment);
        Profile.add(ImageProfile);
        Profile.add(EditProfile);
        Profile.add(EquipmentLoan);
        Profile.add(Title);
        Profile.add(Registration);
        Profile.add(EditEquipment);
        Profile.add(Fines);
        Profile.add(Reports);


        ImageProfile.setBounds(25, 45, 143, 118);
        EditProfile.setBounds(25, 162, 142, 26);
        EquipmentLoan.setBounds(25, 209, 142, 26);
        Equipment.setBounds(25, 231, 142, 26);
        Title.setBounds(12, 5, 253, 26);
        Registration.setBounds(25, 252, 142, 26);
        EditEquipment.setBounds(25, 275, 142, 26);
        Fines.setBounds(25, 297, 142, 26);
        Reports.setBounds(25, 319, 142, 26);

        getContentPane().add(InterWindows);
        InterWindows.setBounds(192, 0, 692, 388);
        InterWindows.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        Registration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationActionPerformed(e);

            }

        });

        Signoff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignoffctionPerformed(e);

            }

        });
    }

    private void RegistrationActionPerformed(ActionEvent event){
        if(control.ALoneAWindow(jifEquipment,InterWindows)){
            InterWindows.add(jifEquipment); }
            jifEquipment.show();
    }

    private void SignoffctionPerformed(ActionEvent event){
        Join jfjoin = new Join();
        dispose();
    }
}
