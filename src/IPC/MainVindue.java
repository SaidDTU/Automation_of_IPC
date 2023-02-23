package IPC;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Container;


public class MainVindue extends JFrame {
    public MainVindue(String titel){
        super(titel);


        //Opsætter layout manager
        setLayout(new BorderLayout());

        //Opretter
        JTextField Tekst = new JTextField();

        Container c = getContentPane();
        c.add(Tekst,BorderLayout.CENTER);
    }


}
