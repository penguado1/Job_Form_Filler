import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;

public class Login extends JPanel{
    private JPanel North;
    private JLabel label;
    private JPanel Details;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JPasswordField passField;
    private JButton signButton;
    private JSeparator loginSeparator;
    private JSeparator userNameSeparator;

    Login(){
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        North = new JPanel(new FlowLayout(FlowLayout.CENTER));
        North.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
        North.setBackground(Color.LIGHT_GRAY);
        add(North, BorderLayout.NORTH);

        label = new JLabel("Please enter your details");
        label.setFont(new Font("sans-inter", Font.BOLD, 30));
        North.add(label);
        
        signInDetials();
    }


    private void signInDetials(){

        Details = new JPanel(new MigLayout("wrap, CENTER", "[right]20[]40", "70[]10[]"));

        Border Empty = BorderFactory.createEmptyBorder(40, 140, 80, 140);
        Border Line = BorderFactory.createLineBorder(Color.GRAY, 2);
        Border compound = BorderFactory.createCompoundBorder(Empty, Line);

        Details.setBorder(compound);
        add(Details, BorderLayout.CENTER);

    }

    protected void userName(){
        userLabel = new JLabel("Username");
        userLabel.setFont(new Font("sans-serif", Font.BOLD, 18));
        userText = new JTextField(17);
        userText.setFont(new Font("sans-serif", 0, 15 ));

        Details.add(userLabel);
        Details.add(userText);

        userNameSeparator = separator();
        Details.add(userNameSeparator);
    }

    protected void passWord(){
        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("sans-serif", Font.BOLD, 18));
        passField = new JPasswordField(17);
        passField.setFont(new Font("Ariel", 0, 15));

        Details.add(passLabel, "skip 1");
        Details.add(passField);
    }

    protected void loginButton(String buttonName){
        signButton = new JButton(buttonName);
        signButton.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLoweredBevelBorder(),
            BorderFactory.createEmptyBorder(5, 15, 5, 15)));

        signButton.setFont(new Font("sans-serif", Font.BOLD, 20));
        signButton.setFocusable(false);
        signButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Details.add(signButton, "right, gapy 20, gapright 10");
    }

    protected void finalSpearator(){
        loginSeparator = separator();
        Details.add(loginSeparator, "span 2, growx, gapy 5");
    }

    protected JSeparator separator(){
        JSeparator separator = new JSeparator();
        separator.setPreferredSize(new Dimension(100, 4));
        separator.setForeground(Color.GRAY);
        
        return separator;
    }

    protected  void addComponent(JComponent component){
        addComponent(component, "");
    }

    protected void addComponent(JComponent component, String string){
        Details.add(component, string);
    }
}
