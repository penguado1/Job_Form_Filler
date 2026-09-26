import java.awt.BorderLayout;

import javax.swing.*;

public class Initialise{

    private JFrame frame1;
    private loginMenu loginMenu;

    Initialise(){
        frame1 = new JFrame("FFY");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(800, 600);

        loginMenu = new loginMenu(frame1);
        frame1.add(loginMenu, BorderLayout.CENTER);


        frame1.setVisible(true);
    }

}