package Interface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Form.EquipmentForm;
import Form.UserForm;
import Control.Control;

public class Profile_Laboratorydirector extends JFrame  {
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
    private JButton EditEquipment;
    private JButton Newmember;
    private JButton Members;
    private JButton EditMembers;
    private JDesktopPane InterWindows;

    UserForm jifUserForm = new UserForm();
    EquipmentForm jifEquipmentForm = new EquipmentForm();
    Control control = new Control();

    public Profile_Laboratorydirector() {
       intComponent();

    }

    private void intComponent(){
        setBounds(10, 10, 900, 480);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Perfil Director de laboratorio");

        Icon IcoProfile = new ImageIcon(getClass().getResource("/Image/Laboratory Director.png"));

        Profile = new JPanel();
        ImageProfile = new JLabel(IcoProfile);
        EditProfile = new JButton("Editar Perfil");
        EquipmentLoan = new JButton("Solicitar Equipo");
        Proyects = new JButton("Proyectos");
        Equipment = new JButton("Equipos");
        Option = new JMenuBar();
        Menu = new JMenu("Menu");
        Help = new JMenu("Ayuda");
        Signoff = new JMenuItem("Cerrar Sesion");
        Exit = new JMenuItem("Salir");
        Guide = new JMenuItem("Guia");
        Title = new JLabel("Director de laboratorio");
        Title.setFont(new java.awt.Font("Arial", 0, 16));
        Registration = new JButton("Registrar Equipo");
        EditEquipment = new JButton("Editar Equipos");
        Newmember = new JButton( "Nuevo Miembro");
        Members = new JButton("Miembros");
        EditMembers = new JButton("Editar Miembros");
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
        Profile.add(EditEquipment);
        Profile.add(Newmember);
        Profile.add(Members);
        Profile.add(Newmember);
        Profile.add(EditMembers);


        ImageProfile.setBounds(25, 45, 143, 118);
        EditProfile.setBounds(25, 162, 142, 26);
        EquipmentLoan.setBounds(25, 209, 142, 26);
        Proyects.setBounds(25, 231, 142, 26);
        Equipment.setBounds(25, 253, 142, 26);
        Title.setBounds(12, 5, 252, 26);
        Registration.setBounds(25,275,142,26);
        EditEquipment.setBounds(25,297,142,26);
        Newmember.setBounds(25,319,142,26);
        Members.setBounds(25,343,142,26);
        EditMembers.setBounds(25,367,142,26);

        getContentPane().add(InterWindows);
        InterWindows.setBounds(192,0,692,418);
        InterWindows.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        Newmember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewmemberActionPerformed(e);

            }

        });

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

    private void NewmemberActionPerformed(ActionEvent event){
        if(control.ALoneAWindow(jifUserForm,InterWindows)){
            InterWindows.add(jifUserForm); }
            jifUserForm.show();
    }

    private void RegistrationActionPerformed(ActionEvent event){
        if(control.ALoneAWindow(jifEquipmentForm,InterWindows)){
            InterWindows.add(jifEquipmentForm); }
            jifEquipmentForm.show();

    }

    private void SignoffctionPerformed(ActionEvent event){
        Join jfjoin = new Join();
        dispose();
    }

}

