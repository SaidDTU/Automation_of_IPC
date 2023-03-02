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
        JTextField Tekst = new JTextField();
        andetPanel = new AndetPanel();

        // Sætter komponenterne til panelerne
        Container c = getContentPane();
        c.add(Tekst,BorderLayout.CENTER);
        c.add(andetPanel,BorderLayout.WEST);

    }


}
