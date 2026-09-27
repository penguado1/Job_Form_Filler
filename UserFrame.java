import javax.swing.*;

public class UserFrame extends JFrame {
    
    UserFrame(){
        createFrame();
    }

    private void createFrame(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);

        setFrameVisibility(this);
    }

    private static void setFrameVisibility(JFrame frame){
        frame.setVisible(! frame.isVisible());
    }
}
