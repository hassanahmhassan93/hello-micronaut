package com.example.lifecycle;

import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Singleton
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    private void initialize() {

        System.out.println("This will be called after been initialization");

        this.name = "Hassan Ahmed";
    }

    @PreDestroy
    private void destroy() {

        System.out.println("This will be called before been destruction");
    }
}
