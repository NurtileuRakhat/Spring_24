package kbtu.event1.synchronous;

import kbtu.event1.asynchronous.AsyncCustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public CustomSpringEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishCustomEvent(String message) {
        System.out.println("Publishing synchronous custom event. ");
        CustomSpringEvent customEvent = new CustomSpringEvent(this, message);
        eventPublisher.publishEvent(customEvent);
    }

    public void publishAsyncCustomEvent(String message) {
        System.out.println("Publishing asynchronous custom event. ");
        AsyncCustomEvent asyncCustomEvent = new AsyncCustomEvent(this, message);
        eventPublisher.publishEvent(asyncCustomEvent);
    }
}