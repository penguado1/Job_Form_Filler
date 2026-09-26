import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signIn extends Login implements ActionListener{
    
    private JButton havAccountButton;
    private JButton createAccount;

    private JPanel parent;

    signIn(JPanel parent){
        super();

        this.parent = parent;
        createSignInPage();
    }

    private void createSignInPage(){
        setRowCon("80[]15[]");

        setColCons("[center]20[]40");

        userName();

        passWord();

        finalSpearator();

        createAnAccount();

        loginButton("Sign in");
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

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == createAccount){
            loginMenu.showNextCard(parent);
       }
    } 
}
