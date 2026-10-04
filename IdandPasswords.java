import java.util.HashMap;

public class IdandPasswords {
    
        HashMap<String, String> logininfo = new HashMap<String,String>();

    IdandPasswords(){

        logininfo.put("Bro", "pizza");
        logininfo.put("Brometheus", "PASSWORD");
        logininfo.put("BroCode", "abc123");

    }

    protected HashMap <String,String> getLogininfo() {
        return logininfo;
    }
}
