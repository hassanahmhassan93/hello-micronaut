package com.example.qualifier;

import jakarta.inject.Singleton;

@Singleton
public class ConsoleLogger implements Logger {

    @Override
    public void log() {

        System.out.println("Log the message to console.");
    }
}
