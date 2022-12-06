package com.example.jenkinsclassproj2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootTest
class JenkinsClassProj2ApplicationTests {
    private Logger logger = Logger.getLogger(JenkinsClassProj2ApplicationTests.class.getName());
    @Test
    contextLoads() {
        logger.log(Level.INFO, "This test displays a log message");
    }

}
