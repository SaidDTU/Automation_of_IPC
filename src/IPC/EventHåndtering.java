package IPC;

import java.util.EventObject;

public class EventHåndtering extends EventObject {

    private String tekst;
    public EventHåndtering(Object source, String tekst){
        super(source);

        this.tekst = this.tekst;
    }

    public String getText(){
        return tekst;

    }
}
