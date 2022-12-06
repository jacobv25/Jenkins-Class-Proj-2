package com.example.jenkinsclassproj2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsClassProj2Application {
    private static Logger logger = Logger.getLogger(JenkinsClassProj2Application.class.getName());
    public static void main(String[] args) {
        logger.log(Level.INFO, "Oh boy! The application is starting to run...");
        SpringApplication.run(JenkinsClassProj2Application.class, args);
    }

}
