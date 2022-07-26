package com.example.archibook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ArchibookApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchibookApplication.class, args);
        log.info("#### Archibook Service Start. ####");
    }

}
