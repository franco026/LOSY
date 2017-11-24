package Form;

import javax.swing.*;
import java.awt.*;

public class ProyectForm extends JInternalFrame {
    private JLabel NameProyect;
    private JTextField TextNameProyect;
    private  JLabel Description;
    private JTextArea TextDescription;
    private JLabel IdProyect;
    private JTextField TextIdProyect;
    private JLabel CodeDirector;
    private JTextField TextCodeDirector;
    private JScrollPane Scroll;
    private JButton Add;

    public ProyectForm (){
        IntComponent();
    }

    private void IntComponent(){

        setVisible(true);
        setSize(692,300);
        setLayout(null);
        setResizable(false);
        setClosable(true);
        setTitle("Regristro Proyecto");

        NameProyect = new JLabel("Nombre del proyecto :");
        TextNameProyect = new JTextField(10);
        Description = new JLabel("Descripciòn");
        TextDescription = new JTextArea();
        TextDescription = new JTextArea();
        TextDescription.setOpaque(true);
        TextDescription.setAutoscrolls(true);
        TextDescription.setLineWrap(true);
        TextDescription.setWrapStyleWord(true);
        TextDescription.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TextDescription.setBackground(Color.white);
        TextDescription.setFont(new Font("Arial",Font.ITALIC,12));
        Scroll = new JScrollPane(TextDescription);
        IdProyect = new JLabel("Id del proyecto :");
        TextIdProyect = new JTextField(10);
        CodeDirector = new JLabel("Codigo del director :");
        TextCodeDirector = new JTextField(10);
        Add = new JButton("Agregar");

        add(NameProyect);
        add(TextNameProyect);
        add(Description);
        add(Scroll);
        add(IdProyect);
        add(TextIdProyect);
        add(CodeDirector);
        add(TextCodeDirector);
        add(Add);

        NameProyect.setBounds(10,10,142,26);
        TextNameProyect.setBounds(150,10,142,26);
        IdProyect.setBounds(312,10,142,26);
        TextIdProyect.setBounds(420,10,142,26);
        CodeDirector.setBounds(10,60,142,26);
        TextCodeDirector.setBounds(140,60,200,26);
        Description.setBounds(10,110,153,26);
        Scroll.setBounds(90,110,550,100);
        Add.setBounds(250,230,142,26);



    }
}
