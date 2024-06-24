package org.example.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
@Scope("prototype")
public class Cat implements Animal {
    public Cat() {
        System.out.println("Cat bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Meow!");
    }
}
