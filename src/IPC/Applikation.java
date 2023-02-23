package IPC;

import javax.swing.*;

public class Applikation {
    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame vindue = new MainVindue("IPC");
                vindue.setSize(500,500);
                vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vindue.setVisible(true);
            }
        });



    }


}
