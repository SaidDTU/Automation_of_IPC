package IPCC;

import java.awt.*;
import javax.swing.*;


public class Grid extends JPanel{
    JFrame frame = new JFrame();

    public JButton StartKnap, PrøveKnap, BatchKnap;
    public JTextField ColiTekst, InitTekst, BegTekst, ØvrTekst, BatTekst;
    public JLabel ColiLab, InitLab, BegLab, ØvrLab, BatLabel;


    public void knapper(){
        StartKnap = new JButton("Start Prøveudtagelse");
        PrøveKnap = new JButton("Prøveudtagelse");
        BatchKnap = new JButton("Batch er færdigt");
    }
    public void tekst(){
        ColiTekst = new JTextField();
        InitTekst = new JTextField();
        BegTekst = new JTextField();
        ØvrTekst = new JTextField();
        BatTekst = new JTextField();

    }
    public void overskrift(){
        ColiLab = new JLabel("Colikasse:");
        InitLab = new JLabel("Initialer:");
        BegLab = new JLabel("Begrundelse for overskrevet takt");
        ØvrLab = new JLabel("Øvrige bemærkninger");
        BatLabel = new JLabel("Batch ID");
    }

 public Grid (){

        frame.setTitle("a");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        knapper();
        tekst();
        overskrift();

        setLayout(new GridBagLayout());
        GridBagConstraints s = new GridBagConstraints();

     s.weightx = 0.5;
     s.weighty = 0.5;
     s.gridx = 1;
     s.gridy = 1;
     s.fill = 1;
     add(ColiLab,s);

     s.weighty = 1;
     s.weightx = 1;
     s.gridx = 1;
     s.gridy = 2;
     s.gridwidth = 1;
     s.gridheight = 1;
     s.fill = GridBagConstraints.HORIZONTAL;
     add(ColiTekst,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 1;
     s.gridy = 3;
     add(InitLab,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 1;
     s.gridy = 4;
     add(InitTekst,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 1;
     s.gridy = 5;
     add(BegLab,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 1;
     s.gridy = 6;
     add(BegTekst,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 1;
     s.gridy = 7;
     add(ØvrLab,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 1;
     s.gridy = 8;
     add(ØvrTekst,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 2;
     s.gridy = 3;
     add(BatLabel,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 2;
     s.gridy = 4;
     add(BatTekst,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 2;
     s.gridy = 5;
     add(StartKnap,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 2;
     s.gridy = 6;
     add(PrøveKnap,s);

     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 2;
     s.gridy = 7;
     add(BatchKnap,s);



     frame.add(BatchKnap);
     s.weighty = 0.5;
     s.weightx = 0.5;
     s.gridx = 2;
     s.gridy = 7;

 }
 public static void main(String [] args){


 }

    }
