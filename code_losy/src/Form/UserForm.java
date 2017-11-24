package Form;

import Control.Control;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends JInternalFrame {
    private JTextField TextName;
    private JLabel Name;
    private JTextField TextLastName;
    private JLabel LastName;
    private JTextField TextCode;
    private JLabel Code;
    private JTextField TextEmail;
    private JLabel Email;
    private JComboBox TextPosition;
    private JLabel Position;
    private JTextField TextProyect;
    private JLabel Proyect;
    private JTextField TextDocument;
    private JLabel Document;
    private JTextField TextPhone;
    private JLabel Phone;
    private JButton Add;

    Control control = new Control();

    public UserForm(){
       IntComponent();
    }

    private void IntComponent(){
        setVisible(true);
        setSize(692,280);
        setLayout(null);
        setResizable(false);
        setClosable(true);
        setTitle("Regristro Usuario");
        TextName = new JTextField(10);
        Name = new JLabel("Nombres :");
        TextLastName = new JTextField(10);
        LastName = new JLabel("Apellidos :");
        TextCode = new JTextField(10);
        Code = new JLabel("Codigo :");
        TextEmail = new JTextField(10);
        Email = new JLabel("Correo :");
        TextPosition = new JComboBox();
        TextPosition.addItem("Miembro de laboratorio");
        TextPosition.addItem("Director de laboratorio");
        TextPosition.addItem("Coordinador de Equipos");
        TextPosition.addItem("Director de proyectos");
        Position = new JLabel("Cargo :");
        TextProyect = new JTextField(10);
        Proyect = new JLabel("A que proyecto Pertenece :");
        TextDocument = new JTextField(10);
        Document = new JLabel("Cedula :");
        TextPhone = new JTextField(10);
        Phone = new JLabel("Telefono :");
        Add = new JButton("Agregar");

        add(Name);
        add(TextName);
        add(LastName);
        add(TextLastName);
        add(Code);
        add(TextCode);
        add(Email);
        add(TextEmail);
        add(Position);
        add(TextPosition);
        add(Proyect);
        add(TextProyect);
        add(Document);
        add(TextDocument);
        add(Phone);
        add(TextPhone);
        add(Add);

        Name.setBounds(10,10,142,26);
        TextName.setBounds(80,10,142,26);
        LastName.setBounds(240,10,142,26);
        TextLastName.setBounds(310,10,142,26);
        Code.setBounds(470,10,142,26);
        TextCode.setBounds(530,10,142,26);
        Email.setBounds(10,60,142,26);
        TextEmail.setBounds(70,60,200,26);
        Position.setBounds(290,60,142,26);
        TextPosition.setBounds(340,60,162,26);
        Proyect.setBounds(10,110,153,26);
        TextProyect.setBounds(170,110,200,26);
        Document.setBounds(390,110,142,26);
        TextDocument.setBounds(450,110,142,26);
        Phone.setBounds(10,160,142,26);
        TextPhone.setBounds(80,160,142,26);
        Add.setBounds(250,200,142,26);

        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddActionPerformed(e);
            }

        });
    }

    private void AddActionPerformed(ActionEvent event){

        String name, lastname, email,position,proyect,password;
        int code,phone,document;

        name=TextName.getText();
        lastname=TextLastName.getText();
        code=Integer.parseInt(TextCode.getText());
        email=TextEmail.getText();
        position=TextPosition.getSelectedItem().toString();
        proyect=TextProyect.getText();
        document=Integer.parseInt(TextDocument.getText());
        phone=Integer.parseInt(TextPhone.getText());

        password=PasswordDefault(name,lastname,TextCode.getText());
        System.out.println(password);

        int numFilas = control.insertmember(name,lastname,code,email,position,proyect,document,phone);
        int numFilas2= control.insertAccount(code,password);

        System.out.println ("Filas "+ numFilas);
        if (numFilas == 1 && numFilas2== 1){

            JOptionPane.showMessageDialog(null, "Programa guardado exitosamente");
        }
        else {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Programa");
        }
    }


    public String PasswordDefault(String Name,String LastName,String Code){

        String Password,NameMajuscule,LastNameMajuscule;

        char[] charactersName,charactersLastName;

        NameMajuscule= Name.toUpperCase();
        LastNameMajuscule=LastName.toUpperCase();
        charactersName=NameMajuscule.toCharArray();
        charactersLastName=LastNameMajuscule.toCharArray();

        Password=charactersName[0]+Code+charactersLastName[0];

        return Password;
    }
}
