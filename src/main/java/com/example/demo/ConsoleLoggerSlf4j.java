package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsoleLoggerSlf4j implements Logger {

    @Override
    public void logOut(String message) {
        log.info(message);
    }
}
