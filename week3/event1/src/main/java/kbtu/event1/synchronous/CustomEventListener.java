package kbtu.event1.synchronous;

import kbtu.event1.asynchronous.AsyncCustomEvent;
import org.springframework.stereotype.Component;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

@Component
public class CustomEventListener {

    @EventListener
    public void handleCustomEvent(CustomSpringEvent event) {
        System.out.println("Received synchronous custom event - " + event.getMessage());
        simulateDelay(1000);
        System.out.println("Finished processing synchronous event - " + event.getMessage());
    }

    @EventListener
    @Async
    public void handleAsyncCustomEvent(AsyncCustomEvent event) {
        System.out.println("Received asynchronous custom event - " + event.getMessage());
        simulateDelay(2000);
        System.out.println("Finished processing asynchronous event - " + event.getMessage());
    }

    private void simulateDelay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}