package com.wxz.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {

    public static void main(String[] args) {

        Logger LOGGER = LoggerFactory.getLogger(SpringBootApp.class);
        LOGGER.info("start spring boot demo.");
        SpringApplication.run(SpringBootApp.class);
        LOGGER.info("end spring boot demo.");
    }
}
