import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUp extends Login implements ActionListener{
    private JLabel repeatLabel;
    private JPasswordField repeatPassword;
    private JSeparator passWordSeparator;
    private JButton createAccount;

    signUp(){
        super();

        this.createSignUpPage();
    }

    private void createSignUpPage(){
        userName();

        passWord();
        passWordSeparator = separator();
        this.addComponent(passWordSeparator);

        repeatPassWord();

        finalSpearator();

        createAnAccount();

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

    private void createAnAccount(){
        createAccount = new JButton("Already have an account?");
        createAccount.setFont(new Font("Ariel", Font.ITALIC, 13));
        createAccount.setForeground(Color.BLUE);
        createAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        createAccount.setBorderPainted(false);
        createAccount.setContentAreaFilled(false);
        createAccount.setFocusPainted(false);
        createAccount.setOpaque(false);

        addComponent(createAccount);
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
