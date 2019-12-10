package org.itstack.demo;

@FunctionalInterface
public interface IPersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}
