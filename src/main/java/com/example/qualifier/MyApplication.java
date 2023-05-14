package com.example.qualifier;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class MyApplication {

    private final Logger logger;

    //public MyApplication(@Named("file") Logger logger) {
    //public MyApplication(@Console Logger logger) {
    public MyApplication(Logger logger) {
        this.logger = logger;
    }

    public void process() {

        System.out.println("Processing");

        this.logger.log();
    }
}
