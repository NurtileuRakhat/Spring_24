package kbtu.sis2.task3.model;

import kbtu.sis2.task3.annotations.FormatterType;
import org.springframework.stereotype.Component;

@FormatterType("Foo")
@Component
public class FooFormatter implements Formatter {

    public String format() {
        return "foo";
    }

}