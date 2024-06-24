package org.example.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

public class Config2 {
    @Bean
    @Scope("prototype")
    public Animal dogBean() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    @Primary
    public Animal parrotBean() {
        return new Parrot();
    }

    @Bean
    @Scope("prototype")
    @Qualifier("dogBean")
    public Person personBean() {
        return new Person(dogBean());
    }
}
