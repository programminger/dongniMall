package com.dongni.dongnimall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DongniMallApplication {
    private static final Logger logger = LoggerFactory.getLogger(DongniMallApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DongniMallApplication.class, args);
    }
}
