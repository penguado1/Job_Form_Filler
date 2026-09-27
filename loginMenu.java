import java.awt.CardLayout;
import java.util.HashMap;

import javax.swing.*;

public class loginMenu extends JPanel{

    private static CardLayout cLogin;

    private signUp signUpPage;
    private signIn signInPage;

    private final String SIGNUP = "signUp";
    private final String SIGNIN = "singIn";

    private HashMap <String,String> loginInfo;

    loginMenu(HashMap <String,String> loginInfo){
        this.loginInfo = loginInfo; 
        setupPanel();
    }

    private void setupPanel(){

        cLogin = new CardLayout();

        this.setLayout(cLogin);

        signUpPage = new signUp(this, loginInfo);
        signInPage = new signIn(this, loginInfo);

        this.add(signUpPage, SIGNUP);
        this.add(signInPage, SIGNIN);

    }

    public static void showNextCard(JPanel parent){
        cLogin.next(parent);
    }
}
