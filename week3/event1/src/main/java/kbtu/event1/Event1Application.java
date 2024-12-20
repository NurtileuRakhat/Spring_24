package kbtu.event1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Event1Application {

    public static void main(String[] args) {
        SpringApplication.run(Event1Application.class, args);
    }

}
