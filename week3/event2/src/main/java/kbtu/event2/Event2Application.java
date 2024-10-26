package kbtu.event2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Event2Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Event2Application.class);
        springApplication.run(args);
    }
}