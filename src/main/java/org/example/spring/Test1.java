package org.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config1.class);

        Person person = context.getBean("person", Person.class);
        person.getPet().say();
    }
}
