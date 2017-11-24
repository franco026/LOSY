package Interface;

import Control.Control;
import Form.EquipmentView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile_member extends JFrame {
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
    private JDesktopPane InterWindows;

    EquipmentView JifEquipment  = new EquipmentView();
    Control control = new Control();

    public Profile_member(){
        intComponent();
    }

    private void intComponent(){
        setBounds(10,10,900,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Perfil Miembro");

        Icon IcoProfile = new ImageIcon(getClass().getResource("/Image/Miembro.png"));


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
        Title = new JLabel("Miembro de laboratorio");
        Title.setFont(new java.awt.Font("Arial", 0, 16));
        InterWindows = new JDesktopPane();

        Menu.add(Signoff);
        Menu.add(Exit);
        Option.add(Menu);
        Help.add(Guide);
        Option.add(Help);
        setJMenuBar(Option);

        add(Profile);
        Profile.setBounds(0,0,192,338);
        Profile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Profile.setLayout(null);

        Profile.add(Equipment);
        Profile.add(ImageProfile);
        Profile.add(EditProfile);
        Profile.add(EquipmentLoan);
        Profile.add(Proyects);
        Profile.add(Title);


        ImageProfile.setBounds(25,45,143,118);
        EditProfile.setBounds(25,162,142,26);
        EquipmentLoan.setBounds(25,209,142,26);
        Proyects.setBounds(25,231,142,26);
        Equipment.setBounds(25,253,142,26);
        Title.setBounds(15,5,252,26);

        getContentPane().add(InterWindows);
        InterWindows.setBounds(192,0,692,338);
        InterWindows.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        Signoff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignoffactionPerformed(e);

            }

        });

        Equipment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EquipmentactionPerformed(e);

            }

        });
    }

    private void SignoffactionPerformed(ActionEvent event){
        Join jfjoin = new Join();
        dispose();
    }

    private void EquipmentactionPerformed(ActionEvent event){
        if(control.ALoneAWindow(JifEquipment,InterWindows)){
            InterWindows.add(JifEquipment); }
            JifEquipment.show();;
    }

}
