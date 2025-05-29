package com.drishluk.courseplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.drishluk.courseplatform.model")
@SpringBootApplication
public class CoursePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursePlatformApplication.class, args);
    }

}
