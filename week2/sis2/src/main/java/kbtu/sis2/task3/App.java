package kbtu.sis2.task3;

import kbtu.sis2.task3.service.FooService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        FooService fooService = ctx.getBean(FooService.class);
        fooService.doStuff();
        System.out.println(fooService);
    }
}