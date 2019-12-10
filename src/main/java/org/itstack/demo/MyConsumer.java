package org.itstack.demo;

import java.util.function.Consumer;

public class MyConsumer<T> {

    public void accept(T obj) {
        Person person = (Person) obj;
        System.out.println("Hello, " + person.firstName);
    }

}
