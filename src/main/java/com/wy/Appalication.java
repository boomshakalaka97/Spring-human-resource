package com.wy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages="com.wy" )
public class Appalication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Appalication.class, args);
    }
}