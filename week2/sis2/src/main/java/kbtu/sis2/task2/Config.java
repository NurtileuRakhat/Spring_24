package kbtu.sis2.task2;

import kbtu.sis2.task2.model.Engine;
import kbtu.sis2.task2.model.Transmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kbtu.sis2.task2")
public class Config {

    @Bean
    public Engine engine() {
        return new Engine("v8", 5);
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("sliding");
    }
}