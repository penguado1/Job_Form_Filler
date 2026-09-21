import java.awt.BorderLayout;

import javax.swing.*;

public class Initialise{

    private JFrame frame1;
    private signIn signInPage;
    Initialise(){
        frame1 = new JFrame("FFY");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(800, 600);

        signInPage = new signIn();
        frame1.add(signInPage, BorderLayout.CENTER);


        frame1.setVisible(true);
    }

}