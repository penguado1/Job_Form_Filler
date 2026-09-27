import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class signIn extends Login implements ActionListener{
    private JButton createAccount;

    private JPanel parent;

    private HashMap <String,String> loginInfo;

    private JLabel messageLabel;

    signIn(JPanel parent, HashMap <String,String> loginInfo){
        super();

        this.loginInfo = loginInfo;

        this.parent = parent;
        createSignInPage();
    }

    private void createSignInPage(){
        setRowCon("50[]15[]");

        setColCons("[center]20[]40");

        createMessageLabel();

        userName();

        passWord();

        finalSpearator();

        createAnAccount();

        loginButton("Sign in");
        signButton.addActionListener(this);
    }

    private void createAnAccount(){
        createAccount = new JButton("Dont have an Account?");
        createAccount.setFont(new Font("Ariel", Font.ITALIC, 13));
        createAccount.setForeground(Color.BLUE);
        createAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        createAccount.setBorderPainted(false);
        createAccount.setContentAreaFilled(false);
        createAccount.setFocusPainted(false);
        createAccount.setOpaque(false);

        addComponent(createAccount);
        createAccount.addActionListener(this);
    }

    private void createMessageLabel(){
        messageLabel = new JLabel("hello");
        messageLabel.setVisible(false);
        messageLabel.setOpaque(true);
        messageLabel.setFont(new Font("sans-serif", 0, 20));
        messageLabel.setBorder(BorderFactory.createEmptyBorder(3, 6, 3, 6));

        addComponent(messageLabel, "span 2, center, gapbottom 10");
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == createAccount){
            loginMenu.showNextCard(parent);
       }

       if(e.getSource() == signButton){

            String userName = getUserName();
            String passWord = getUserPass();

            if(! loginInfo.containsKey(userName)){
                messageLabel.setVisible(true);
                messageLabel.setBackground(Color.pink);
                messageLabel.setForeground(Color.darkGray);
                messageLabel.setText("Error: username not found");
            }

            if(loginInfo.get(userName).equals(passWord)){
                messageLabel.setText("Login succesful");
                Initialise.disposeFrame();
                Initialise.userInterface();
            }
            else{
                messageLabel.setVisible(true);
                messageLabel.setBackground(Color.pink);
                messageLabel.setForeground(Color.darkGray);
                messageLabel.setText("Error: Wrong Password");
            }
       }
    } 
}
