package kbtu.sis2.task4.model;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(final String name, final int age) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}