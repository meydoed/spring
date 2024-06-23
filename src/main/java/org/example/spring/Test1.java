package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        Person person = context.getBean("person", Person.class);
        person.getPet().say();
        context.close();
    }
}
