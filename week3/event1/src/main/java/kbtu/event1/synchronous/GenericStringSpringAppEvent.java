package kbtu.event1.synchronous;

public class GenericStringSpringAppEvent extends GenericSpringAppEvent<String> {
    GenericStringSpringAppEvent(final Object source, final String what) {
        super(source, what);
    }
}
