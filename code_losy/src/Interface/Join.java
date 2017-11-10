package Interface;

import javax.swing.*;

public class Join extends JFrame {
    private JButton Accetp;
    private JButton Cancel;
    private JLabel Account;
    private JLabel Password;
    private JLabel Remember;
    private JLabel Logo;
    private JTextField TextAccount;
    private JPasswordField TextPassword;

    public Join(){

        setVisible(true);
        setLocationRelativeTo(null);
        setSize(530,238);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Ingreso");

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
        Cancel.setBounds(130,148,90,26);


    }
}
