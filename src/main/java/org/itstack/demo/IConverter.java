package org.itstack.demo;

@FunctionalInterface
public interface IConverter<F, T> {

    T convert(F from);

}
