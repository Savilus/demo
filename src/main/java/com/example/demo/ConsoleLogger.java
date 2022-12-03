package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "Console Logger")
public class ConsoleLogger implements Logger{
    @Override
    public void logOut(String message) {
        System.out.println(message);
    }
}
