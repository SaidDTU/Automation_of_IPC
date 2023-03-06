package IPC;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;


public class MainVindue extends JFrame {

        private AndetPanel andetPanel;
    public MainVindue(String titel){
        super(titel);


        //Opsætter layout manager
        setLayout(new BorderLayout());


        //Opretter swing komponenterr
        final JTextArea TekstOM = new JTextArea();
        andetPanel = new AndetPanel();

        andetPanel.addListener( new DetailListener() {
            @Override
            public void detailEventOccurred(EventHåndtering event) {
                String text = event.getText();

                TekstOM.append(text);

            }
        });

        // Sætter komponenterne til panelerne
        Container c = getContentPane();
        c.add(TekstOM,BorderLayout.CENTER);
        c.add(andetPanel,BorderLayout.WEST);

    }


}
