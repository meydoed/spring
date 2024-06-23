package org.example.spring;

public class Dog implements Animal {
    public Dog() {
        System.out.println("Dog bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Wof!");
    }
}
