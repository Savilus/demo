package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    Logger logger;

    public LoggingService(@Qualifier(value = "Console Logger") Logger logger) {
        logger.logOut("message");
        this.logger = logger;
    }
}
