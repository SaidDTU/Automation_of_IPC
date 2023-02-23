import java.awt.*;
import javax.swing.*;

public class Grid extends JFrame {
    public JButton k1,k2,k3,k4,k5;
    public JTextField t1,t2,t3,t4,t5,t6;

    public void knapper(){
        k1 = new JButton("Knap1");
        k2 = new JButton("Knap2");
        k3 = new JButton("Knap3");

    }
    public void tekst(){
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();

        
    }

 public Grid (){

        knapper();
        tekst();
        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx=0;
        g.gridy=0;
        add(k1,g);
        g.gridx=1;
        g.gridy=1;
        add(k2,g);
        g.gridx=2;
        g.gridy=2;
        g.gridwidth=500;
        add(k3,g);

        g.gridx=5;
        g.gridy=5;
        add(t1,g);
        g.gridwidth=5;
        t1.setPreferredSize(new Dimension(50000,50000));


        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 }
 public static void main(String [] args){
Grid t= new Grid();

 }

    }
