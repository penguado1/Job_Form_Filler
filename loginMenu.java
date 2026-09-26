import java.awt.CardLayout;

import javax.swing.*;

public class loginMenu extends JPanel{

    private static CardLayout cLogin;

    private signUp signUpPage;
    private signIn signInPage;

    private final String SIGNUP = "signUp";
    private final String SIGNIN = "singIn";

    loginMenu(JFrame frame){
        setupPanel();
    }

    private void setupPanel(){

        cLogin = new CardLayout();

        this.setLayout(cLogin);

        signUpPage = new signUp(this);
        signInPage = new signIn(this);

        this.add(signUpPage, SIGNUP);
        this.add(signInPage, SIGNIN);

    }

    public static void showNextCard(JPanel parent){
        cLogin.next(parent);
    }
}
