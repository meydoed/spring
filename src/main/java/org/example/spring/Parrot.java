package org.example.spring;

public class Parrot implements Animal {
    public Parrot() {
        System.out.println("Parrot bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Hello world!");
    }
}
