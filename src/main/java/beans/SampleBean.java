package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.Map;

@ManagedBean
@ViewScoped
public class SampleBean {

    public String getWelcome() {
        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        return "";
    }

    public void doIt() {

    }
}

