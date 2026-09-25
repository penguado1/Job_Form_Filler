import java.awt.CardLayout;

import javax.swing.*;

public class loginMenu extends JPanel{

    private CardLayout cLogin;

    private signUp signUpPage;
    private signIn signInPage;

    private final String SIGNUP = "signUp";
    private final String SIGNIN = "singIn";

    loginMenu(){

        setupPanel();
    }

    private void setupPanel(){

        cLogin = new CardLayout();

        this.setLayout(cLogin);

        signUpPage = new signUp();
        signInPage = new signIn();

        this.add(signUpPage, SIGNUP);
        this.add(signInPage, SIGNIN);

    }
}
