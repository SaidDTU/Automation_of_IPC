import javax.swing.*;
import java.awt.*;


public class IPC {

    JPanel Jpanel = new JPanel();
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


    public IPC() {
        knapper();
        tekst();
        overskrift();
        Jpanel.setLayout(new GridBagLayout());
        GridBagConstraints s = new GridBagConstraints();

        s.weightx = 0.5;
        s.weighty = 0.5;
        s.gridx = 1;
        s.gridy = 1;
        s.fill = 1;
        Jpanel.add(ColiLab,s);

        s.weighty = 1;
        s.weightx = 1;
        s.gridx = 1;
        s.gridy = 2;
        s.gridwidth = 1;
        s.gridheight = 1;
        s.fill = GridBagConstraints.HORIZONTAL;
        Jpanel.add(ColiTekst,s);

        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 1;
        s.gridy = 3;
        Jpanel.add(InitLab,s);

        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 1;
        s.gridy = 4;
        Jpanel.add(InitTekst,s);

        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 1;
        s.gridy = 5;
        Jpanel.add(BegLab,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 1;
        s.gridy = 6;
        Jpanel.add(BegTekst,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 1;
        s.gridy = 7;
        Jpanel.add(ØvrLab,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 1;
        s.gridy = 8;
        Jpanel.add(ØvrTekst,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 2;
        s.gridy = 3;
        Jpanel.add(BatLabel,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 2;
        s.gridy = 4;
        Jpanel.add(BatTekst,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 2;
        s.gridy = 5;
        Jpanel.add(StartKnap,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 2;
        s.gridy = 6;
        Jpanel.add(PrøveKnap,s);


        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 2;
        s.gridy = 7;
        Jpanel.add(BatchKnap,s);
        

        s.weighty = 0.5;
        s.weightx = 0.5;
        s.gridx = 2;
        s.gridy = 7;
        Jpanel.add(ColiTekst,s);





    }


    public static void main(String [] args){
        IPC a = new IPC();


    }

}
