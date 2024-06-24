package org.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config2.class);

        Person person = context.getBean("personBean", Person.class);
        person.getPet().say();

    }
}
