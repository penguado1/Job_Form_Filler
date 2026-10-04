import javax.swing.*;

public class UserFrame extends JFrame {
    
    private UserMenu userMenu;

    UserFrame(){
        createFrame();
    }

    private void createFrame(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setFrameVisibility(this);

        userMenu = new UserMenu();

        this.setJMenuBar(userMenu);
    }

    private static void setFrameVisibility(JFrame frame){
        frame.setVisible(! frame.isVisible());
    }
}
