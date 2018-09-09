package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@ApplicationScoped
public class CounterBean {

    private long counter;

    @PostConstruct
    public void init() {
        // init
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public void plus() {
        this.counter++;
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Counter",
                String.format("Now is %s", this.counter));
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
