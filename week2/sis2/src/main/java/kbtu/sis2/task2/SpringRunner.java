package kbtu.sis2.task2;


import kbtu.sis2.task2.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        Car toyota = getCarFromXml();
        System.out.println(toyota);
        toyota = getCarFromJavaConfig();

        System.out.println(toyota);
    }

    private static Car getCarFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(Car.class);
    }

    private static Car getCarFromXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("task2.xml");

        return context.getBean(Car.class);
    }
}