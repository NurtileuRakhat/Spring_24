package kbtu.event1;
import kbtu.event1.synchronous.CustomSpringEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventDemoApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(EventDemoApplication.class, args);
        CustomSpringEventPublisher publisher = context.getBean(CustomSpringEventPublisher.class);
        System.out.println("--- Testing Synchronous Event ---");
        publisher.publishCustomEvent("Sync Event");

        System.out.println("\n--- Testing Asynchronous Event ---");
        publisher.publishAsyncCustomEvent("Async Event");

        Thread.sleep(10000);

        context.close();
    }

    @Bean
    public TaskExecutor taskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
}