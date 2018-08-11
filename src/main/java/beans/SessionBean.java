package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class SessionBean {

    @PostConstruct
    public void init() {
        System.out.println("session bean init");
    }
}
