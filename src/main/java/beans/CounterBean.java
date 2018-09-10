package beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.push.Push;
import javax.faces.push.PushContext;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ApplicationScoped
public class CounterBean {

    private long counter;

    @PostConstruct
    public void init() {
        // init
    }

    @Inject @Push(channel = "chat")
    private PushContext push;

    public void sendMessage(Object message) {
        push.send(message);
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
