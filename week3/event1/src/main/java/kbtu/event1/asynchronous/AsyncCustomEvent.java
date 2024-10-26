package kbtu.event1.asynchronous;


import org.springframework.context.ApplicationEvent;

public class AsyncCustomEvent extends ApplicationEvent {
    private String message;

    public AsyncCustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}