package com.coding.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableSwagger2WebMvc
@SpringBootApplication
@EnableAsync
public class DemoMailApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoMailApplication.class, args);
    }
}
