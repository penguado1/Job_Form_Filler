import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class signUp extends Login implements ActionListener{
    private JLabel repeatLabel;
    private JPasswordField repeatPassword;
    private JSeparator passWordSeparator;
    private JButton havAccountButton;
    
    private JPanel parent;

    private HashMap <String,String> loginInfo;

    signUp(JPanel parent, HashMap <String,String> loginInfo){
        super();

        this.loginInfo = loginInfo;

        this.parent = parent;
        this.createSignUpPage();
    }

    private void createSignUpPage(){
        userName();

        passWord();
        passWordSeparator = separator();
        this.addComponent(passWordSeparator);

        repeatPassWord();

        finalSpearator();

        alreadyHavAccount();

        loginButton("Sign up");
    }

    private void repeatPassWord(){
        repeatLabel = new JLabel("Repeat Password");
        repeatLabel.setFont(new Font("sans-serif", Font.BOLD, 18));
        repeatPassword = new JPasswordField(17);
        repeatPassword.setFont(new Font("Ariel", 0, 15));

        addComponent(repeatLabel, "skip 1");
        addComponent(repeatPassword);
    }
 
     private void alreadyHavAccount(){
        havAccountButton = new JButton("Already have an account?");
        havAccountButton.setFont(new Font("Ariel", Font.ITALIC, 13));
        havAccountButton.setForeground(Color.BLUE);
        havAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        havAccountButton.setBorderPainted(false);
        havAccountButton.setContentAreaFilled(false);
        havAccountButton.setFocusPainted(false);
        havAccountButton.setOpaque(false);

        addComponent(havAccountButton);
        havAccountButton.addActionListener(this);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == havAccountButton){
            loginMenu.showNextCard(parent);
        }
        
    }
}
