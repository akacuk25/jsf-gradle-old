package beans;

import org.primefaces.component.menubar.Menubar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import java.util.Iterator;
import java.util.Map;

@ManagedBean
@SessionScoped
public class AuthBean {

    private String login;
    private String pass;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public String getWelcome() {
        return login == null || login.isEmpty() ? "Viewer" : login;
    }
}

