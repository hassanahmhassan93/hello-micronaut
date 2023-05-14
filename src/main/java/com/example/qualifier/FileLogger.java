package com.example.qualifier;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Secondary;
import jakarta.inject.Singleton;

@Singleton
//@Primary
@Secondary
public class FileLogger implements Logger {

    @Override
    public void log() {

        System.out.println("Log the message to file.");
    }
}
