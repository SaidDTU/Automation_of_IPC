package IPC;

import javax.swing.*;
import java.awt.*;

public class AndetPanel extends JPanel {
    public JButton StartKnap, PrøveKnap, BatchKnap;
    public JTextField ColiTekst, InitTekst, BegTekst, ØvrTekst, BatTekst;
    public JLabel ColiLab, InitLab, BegLab, ØvrLab, BatLabel;

    public void knapper(){
        StartKnap = new JButton("Knap1");
        PrøveKnap = new JButton("Knap2");
        BatchKnap = new JButton("Knap3");
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
        BegLab = new JLabel();
        ØvrLab = new JLabel();
        BatLabel = new JLabel();
    }
    public AndetPanel(){

        knapper();
        tekst();
        overskrift();

        Dimension size = getPreferredSize();
        size.width = 250;
        setPreferredSize(size);

        setLayout(new GridBagLayout());

        GridBagConstraints s = new GridBagConstraints();

        s.weighty = 0.5;
        s.weighty = 0.5;
        s.gridx = 1;
        s.gridy = 1;
        add(ColiLab,s);

        s.gridx = 1;
        s.gridy = 2;
        add(InitLab,s);



    }
}
