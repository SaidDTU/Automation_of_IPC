import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Main implements ActionListener {

    private int count = 0;
    private JLabel Tekst;// Vi sætter dem her da disse objecter er tilgængelige overalt.
    private JFrame Vindue;
    private JButton Knap;
    private JPanel panel;
    private JTextField Information;
    private JTextField Information2;
    private JTextField Information3;
    //setLayout(new GridBagLayout());





    public Main() {



        Knap = new JButton("Prøveudtagelse");
        Information = new JTextField(24);
        Information2 = new JTextField(24);
        Information3 = new JTextField(24);
        Knap.addActionListener(this);

        GridBagConstraints g = new GridBagConstraints();





        Information2.setEditable(false);
        Information2.setPreferredSize(new Dimension(500,500));



        Information.setText("");
        Information.setEditable(true);
        Information.setPreferredSize(new Dimension(500,500));
        Information.getText();

        Information3.setText("");
        Information3.setEditable(true);
        Information3.setPreferredSize(new Dimension(500,500));
        Information3.getText();







    } // Implementere konstruktor
    public static void main(String[] args) {
     new Main(); //Constructor
    }



    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==Knap){
    String Info = Information.getText();
    String Info2 = Information3.getText();
    Information2.setText(Info+Info2);


    }

    }
}