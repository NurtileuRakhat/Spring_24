package kbtu.sis2.task3.service;
import kbtu.sis2.task3.annotations.FormatterType;
import kbtu.sis2.task3.model.Formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    @Autowired
    @FormatterType("Foo")
    private Formatter formatter;

    @Autowired
    public FooService(@FormatterType("Foo") Formatter formatter) {
        this.formatter = formatter;
    }

    @Autowired
    public void setFormatter(@FormatterType("Foo") Formatter formatter) {
        this.formatter = formatter;
    }

    public String doStuff() {
        return formatter.format();
    }

}