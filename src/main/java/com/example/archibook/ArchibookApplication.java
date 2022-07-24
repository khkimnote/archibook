package com.example.archibook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ArchibookApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArchibookApplication.class, args);
    }
}
