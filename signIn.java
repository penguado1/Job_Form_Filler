import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;

public class signIn extends Login{
    

    signIn(){
        super();

        createSignInPage();
    }

    private void createSignInPage(){
        userName();

        passWord();

        loginButton("Sign in");
    }
}
