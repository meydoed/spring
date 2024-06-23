package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {

    private Animal pet;

    public Person() {
        System.out.println("Person bean is created!");
    }

    public Person(Animal pet) {
        this.pet = pet;
        System.out.println("Person bean with a pet in constructor is created!");
    }

    @Autowired
    public void setPet(Animal pet) {
        this.pet = pet;
        System.out.println("Pet has been set");
    }

    public Animal getPet() {
        return pet;
    }
}
