package kbtu.sis2.task3.model;

import kbtu.sis2.task3.annotations.FormatterType;
import org.springframework.stereotype.Component;

@FormatterType("Bar")
@Component
public class BarFormatter implements Formatter {

    public String format() {
        return "bar";
    }

}