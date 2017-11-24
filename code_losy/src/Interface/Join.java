package Interface;

import Control.Control;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Control.Control;

public class Join extends JFrame {
    private JButton Accetp;
    private JButton Cancel;
    private JLabel Account;
    private JLabel Password;
    private JLabel Remember;
    private JLabel Logo;
    private JTextField TextAccount;
    private JPasswordField TextPassword;
    Control control = new Control();

    public Join(){
        IntComponent();
    }

    private void IntComponent(){

        setSize(530,238);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Ingreso");
        setVisible(true);

        Icon IcoLogo = new ImageIcon(getClass().getResource("/Image/Logo.png"));

        Accetp = new JButton("Aceptar");
        Cancel = new JButton("Canelar");
        Logo = new JLabel(IcoLogo);
        Remember = new JLabel("<html><u>Recordar Contraseña</u></html>!");
        Account = new JLabel("CUENTA ");
        TextAccount = new JTextField(10);
        Password = new JLabel("CONTRASEÑA");
        TextPassword = new JPasswordField(10);

        add(Accetp);
        add(Cancel);
        add(Logo);
        add(Remember);
        add(Account);
        add(TextAccount);
        add(Password);
        add(TextPassword);

        Account.setBounds(96,10,90,26);
        TextAccount.setBounds(21,32,200,26);
        TextAccount.setHorizontalAlignment(JTextField.CENTER);

        Password.setBounds(80,62,90,26);
        TextPassword.setBounds(21,86,200,26);
        TextPassword.setHorizontalAlignment(JPasswordField.CENTER);

        Remember.setBounds(98,110,131,26);

        Logo.setBounds(229,11,280,175);

        Accetp.setBounds(21,148,90,26);
        Accetp.setToolTipText("Ingresa al sistema");
        Cancel.setBounds(130,148,90,26);
        Cancel.setToolTipText("Salir del sistema");

        Accetp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccetpActionPerformed(e);

            }

        });

    }

    private void AccetpActionPerformed(ActionEvent event){

        int code;
        String password;
        password= TextPassword.getText();
        code=Integer.parseInt(TextAccount.getText());
        System.out.print(password);
        if(!control.check(password,code)){
            System.out.println("datos invalidos");
            TextPassword.setText("");
            TextAccount.setText("");
        }else{
            select_interface(control.check_position(password,code));
        }
    }

    public void select_interface(String Interface){
        System.out.print(Interface);
        switch (Interface){
            case "Miembro de laboratorio":
                Profile_member jfmember = new Profile_member();
                dispose();
                break;
            case "Director de laboratorio":
                Profile_Laboratorydirector jfLabdirector = new Profile_Laboratorydirector();
                dispose();
                break;
            case "Coordinador de Equipos":
                Profile_coordinator jfcoordinator = new Profile_coordinator();
                dispose();
                break;
            case "Director de proyectos":
                Profile_proyectdirector jfprodirector = new Profile_proyectdirector();
                dispose();
                break;
             default:
                 break;
        }

    }
}
