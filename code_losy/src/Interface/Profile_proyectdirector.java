package Interface;

import Form.ProyectForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Control.Control;

public class Profile_proyectdirector extends JFrame {
    private JMenuBar Option;
    private JMenu Menu;
    private JMenu Help;
    private JMenuItem Signoff;
    private JMenuItem Exit;
    private JMenuItem Guide;
    private JLabel ImageProfile;
    private JButton EditProfile;
    private JButton EquipmentLoan;
    private JButton Proyects;
    private JPanel Profile;
    private JButton Equipment;
    private JLabel Title;
    private JButton Registration;
    private JButton Members;
    private JButton EditProyect;
    private JButton Reports;
    private JDesktopPane InterWindows;

    ProyectForm jifProyectForm = new ProyectForm();
    Control control = new Control();

    public Profile_proyectdirector() {
        IntComponent();
    }

    private void IntComponent(){
        setBounds(10, 10, 900, 480);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Perfil Director de Proyectos");

        Icon IcoProfile = new ImageIcon(getClass().getResource("/Image/ProyectDirector.png"));

        Profile = new JPanel();
        ImageProfile = new JLabel(IcoProfile);
        Option = new JMenuBar();
        Menu = new JMenu("Menu");
        Help = new JMenu("Ayuda");
        Signoff = new JMenuItem("Cerrar Sesion");
        Exit = new JMenuItem("Salir");
        Guide = new JMenuItem("Guia");
        Title = new JLabel("Director de Proyectos");
        Title.setFont(new java.awt.Font("Arial", 0, 16));
        EditProfile = new JButton("Editar Perfil");
        EquipmentLoan = new JButton("Solicitar Equipo");
        Proyects = new JButton("Proyectos");
        Equipment = new JButton("Equipos");
        Registration = new JButton("Nuevo proyecto");
        Members = new JButton("Miembros");
        EditProyect = new JButton("Editar Proyecto");
        Reports = new JButton("Reportes");
        InterWindows = new JDesktopPane();

        Menu.add(Signoff);
        Menu.add(Exit);
        Option.add(Menu);
        Help.add(Guide);
        Option.add(Help);
        setJMenuBar(Option);

        add(Profile);
        Profile.setBounds(0, 0, 192, 418);
        Profile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Profile.setLayout(null);

        Profile.add(Equipment);
        Profile.add(ImageProfile);
        Profile.add(EditProfile);
        Profile.add(EquipmentLoan);
        Profile.add(Proyects);
        Profile.add(Title);
        Profile.add(Registration);
        Profile.add(Members);
        Profile.add(EditProyect);
        Profile.add(Reports);

        ImageProfile.setBounds(25, 45, 143, 118);
        EditProfile.setBounds(25, 162, 142, 26);
        Members.setBounds(25,209,142,26);
        Proyects.setBounds(25, 231, 142, 26);
        Equipment.setBounds(25, 253, 142, 26);
        Title.setBounds(18, 5, 252, 26);
        Registration.setBounds(25,275,142,26);
        EditProyect.setBounds(25,297,142,26);
        EquipmentLoan.setBounds(25, 319, 142, 26);
        Reports.setBounds(25,341,142,26);

        getContentPane().add(InterWindows);
        InterWindows.setBounds(192,0,692,418);
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

    };

    private void RegistrationActionPerformed(ActionEvent event){
        if(control.ALoneAWindow(jifProyectForm,InterWindows)){
            InterWindows.add(jifProyectForm); }
        jifProyectForm.show();
    }

    private void SignoffctionPerformed(ActionEvent event){
        Join jfjoin = new Join();
        dispose();
    }

}