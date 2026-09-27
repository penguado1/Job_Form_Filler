import java.awt.BorderLayout;

import javax.swing.*;

public class Initialise{

    private static JFrame loginFrame;
    private loginMenu loginMenu;
    private IdandPasswords loginInfo;
    private static UserFrame userInterface;

    Initialise(){
        createLogin();
    }

    private void createLogin(){
        loginFrame = new JFrame("FFY");
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setSize(800, 600);

        loginInfo = new IdandPasswords();

        loginMenu = new loginMenu(loginInfo.getLogininfo());
        loginFrame.add(loginMenu, BorderLayout.CENTER);


        loginFrame.setVisible(true);
    }

    public static void userInterface(){
        userInterface = new UserFrame();
    }

    public static void disposeFrame(){
        loginFrame.dispose();
    }
}