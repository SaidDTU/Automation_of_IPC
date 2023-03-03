package IPC;

import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AndetPanel extends JPanel {
    public JButton StartKnap, PrøveKnap, BatchKnap;
    public JTextField ColiTekst, InitTekst, BegTekst, ØvrTekst, BatTekst;
    public JLabel ColiLab, InitLab, BegLab, ØvrLab, BatLabel;

    private EventListenerList ell = new EventListenerList();

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
    public AndetPanel(){

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        knapper();
        tekst();
        overskrift();

        Dimension size = getPreferredSize();
        size.width = 700;
        setPreferredSize(size);

        PrøveKnap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String init = InitTekst.getText();
                String coli = ColiTekst.getText();


                String tekst = init + date + "PP1";

                fireDetailEvent(new EventHåndtering(this, tekst));


            }
        });


        setLayout(new GridBagLayout());

        GridBagConstraints s = new GridBagConstraints();

        s.insets = new Insets(5,5,5,5);

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




    }
    public void fireDetailEvent(EventHåndtering event) {
        Object[] listeners = ell.getListenerList();

        for(int i=0; i< listeners.length; i +=2){
            if(listeners[i] == Listener.class){
                ((Listener)listeners[i+1]).detailEventOccurred(event);
            }
        }


    }


    public void addListener( Listener listener) {
        ell.add(Listener.class, listener);


    }

    public void RemoveListener( Listener listener) {
        ell.remove(Listener.class, listener);

    }
}
